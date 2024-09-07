/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Connection.ConnectDB;
import DTO.SanPhamDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @Nhóm 13
 */
public class SanPhamDAO {

    public ArrayList<SanPhamDTO> selectAll() {
        ArrayList<SanPhamDTO> ketQua = new ArrayList<>();
        try {
            Connection c = ConnectDB.getConnection();
            String sql = "SELECT * FROM SanPham sp JOIN TheLoai tl on sp.MaTL = tl.MaTL where sp.TinhTrang = 1";
            PreparedStatement pst = c.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();

            while (rs.next()) {
                int MaSP = rs.getInt("MaSP");
                String TenTL = rs.getString("TenTL");
                String TenSP = rs.getNString("TenSP");
                String NhaSanXuat = rs.getNString("NhaSanXuat");
                String HinhAnh = rs.getString("HinhAnh");
                double DonGia = rs.getFloat("DonGia");
                int SoLuong = rs.getInt("SoLuong");
                boolean TinhTrang = rs.getBoolean("TinhTrang");

                SanPhamDTO sp = new SanPhamDTO(MaSP, TenTL, TenSP, HinhAnh, NhaSanXuat, TinhTrang, DonGia, SoLuong);
                ketQua.add(sp);
            }
            ConnectDB.closeConnection(c);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return ketQua;
    }

    public int getMaSPMax() {
        int maSP = 0;
        try {
            Connection conn = ConnectDB.getConnection();
            Statement st = conn.createStatement();
            String sql = "SELECT Max(MaSP) as MaxMaSP FROM SanPham";
            ResultSet rs = st.executeQuery(sql);
            if (rs.next()) {
                maSP = rs.getInt("MaxMaSP");
            }
            ConnectDB.closeConnection(conn);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return maSP;
    }

    public boolean deleteSPByMaSP(int maSP) {
        boolean rowDelete = false;
        try {
            Connection conn = ConnectDB.getConnection();
            String sql = "UPDATE SanPham SET TinhTrang=? WHERE MaSP=?";
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setBoolean(1, false);
            pst.setInt(2, maSP);
            rowDelete = pst.executeUpdate() > 0;
            ConnectDB.closeConnection(conn);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return rowDelete;
    }

    public boolean addSanPham(SanPhamDTO sp) {
        boolean rowInsert = false;
        try {
            Connection conn = ConnectDB.getConnection();
            String sql = "INSERT INTO SanPham( TenSP,NhaSanXuat,MaTL,HinhAnh,SoLuong,DonGia,TinhTrang) VALUES (?,?,?,?,?,?,?)";
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setString(1, sp.getTenSP());
            pst.setString(2, sp.getNhaSanXuat());
            pst.setInt(3, sp.getMaTL());
            pst.setString(4, sp.getHinhAnh());
            pst.setInt(5, sp.getSoLuong());
            pst.setDouble(6, sp.getDonGia());
            pst.setBoolean(7, sp.getTinhTrang());
            rowInsert = pst.executeUpdate() > 0;
            ConnectDB.closeConnection(conn);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return rowInsert;
    }

    public ArrayList<SanPhamDTO> findSPByTenSP_or_MaSP(String temp) {
        ArrayList<SanPhamDTO> sanPhamList = new ArrayList<>();
        String sql = "SELECT * FROM SanPham sp JOIN TheLoai tl on sp.MaTL = tl.MaTL WHERE (TenSP LIKE ? or MaSP LIKE ?) and sp.TinhTrang = 1 and tl.TinhTrang = 1 ";
        try {
            Connection conn = ConnectDB.getConnection();
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, "%" + temp + "%");
            stmt.setString(2, "%" + temp + "%");
            ResultSet resultSet = stmt.executeQuery();
            while (resultSet.next()) {
                int maSanPham = resultSet.getInt("MaSP");
                String tenSanPham = resultSet.getString("TenSP");
                String tenTheLoai = resultSet.getString("TenTL");
                String hinhAnh = resultSet.getString("HinhAnh");
                Double donGia = resultSet.getDouble("DonGia");
                int soLuong = resultSet.getInt("SoLuong");
                String nhaSanXuat = resultSet.getString("NhaSanXuat");
                Boolean tinhTrang = resultSet.getBoolean("TinhTrang");
                sanPhamList.add(new SanPhamDTO(maSanPham, tenTheLoai, tenSanPham, hinhAnh, nhaSanXuat, tinhTrang, donGia, soLuong));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return sanPhamList;
    }

    public ArrayList<SanPhamDTO> findSPByTenSP(String TenSP) {
        ArrayList<SanPhamDTO> sanPhamList = new ArrayList<>();
        String sql = "SELECT * FROM SanPham sp JOIN TheLoai tl on sp.MaTL = tl.MaTL WHERE sp.TenSP LIKE ?  and sp.TinhTrang = 1 and tl.TinhTrang = 1 ";
        try {
            Connection conn = ConnectDB.getConnection();
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, "%" + TenSP + "%");
            ResultSet resultSet = stmt.executeQuery();
            while (resultSet.next()) {
                int maSanPham = resultSet.getInt("MaSP");
                String tenSanPham = resultSet.getString("TenSP");
                String tenTheLoai = resultSet.getString("TenTL");
                String hinhAnh = resultSet.getString("HinhAnh");
                Double donGia = resultSet.getDouble("DonGia");
                int soLuong = resultSet.getInt("SoLuong");
                String nhaSanXuat = resultSet.getString("NhaSanXuat");
                Boolean tinhTrang = resultSet.getBoolean("TinhTrang");
                sanPhamList.add(new SanPhamDTO(maSanPham, tenTheLoai, tenSanPham, hinhAnh, nhaSanXuat, tinhTrang, donGia, soLuong));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return sanPhamList;
    }

    public ArrayList<SanPhamDTO> findSPByNhaSanXuat(String NhaSanXuat) {
        ArrayList<SanPhamDTO> sanPhamList = new ArrayList<>();
        String sql = "SELECT * FROM SanPham sp JOIN TheLoai tl on sp.MaTL = tl.MaTL WHERE NhaSanXuat LIKE ? and sp.TinhTrang = 1 and tl.TinhTrang = 1 ";
        try {
            Connection conn = ConnectDB.getConnection();
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, "%" + NhaSanXuat + "%");
            ResultSet resultSet = stmt.executeQuery();
            while (resultSet.next()) {
                int maSanPham = resultSet.getInt("MaSP");
                String tenSanPham = resultSet.getString("TenSP");
                String tenTheLoai = resultSet.getString("TenTL");
                String hinhAnh = resultSet.getString("HinhAnh");
                Double donGia = resultSet.getDouble("DonGia");
                int soLuong = resultSet.getInt("SoLuong");
                String nhaSanXuat = resultSet.getString("NhaSanXuat");
           
                Boolean tinhTrang = resultSet.getBoolean("TinhTrang");
                sanPhamList.add(new SanPhamDTO(maSanPham, tenTheLoai, tenSanPham, hinhAnh, nhaSanXuat, tinhTrang, donGia, soLuong));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return sanPhamList;
    }

    // tìm sản phẩm dựa trên tên thể loại
    public ArrayList<SanPhamDTO> findSPByTheLoai(String TheLoai) {
        ArrayList<SanPhamDTO> sanPhamList = new ArrayList<>();
        String sql = "SELECT * FROM SanPham sp JOIN TheLoai tl on sp.MaTL = tl.MaTL WHERE TenTL LIKE ? and sp.TinhTrang = 1 and tl.TinhTrang = 1 ";
        try {
            Connection conn = ConnectDB.getConnection();
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, "%" + TheLoai + "%");
            ResultSet resultSet = stmt.executeQuery();
            while (resultSet.next()) {
                int maSanPham = resultSet.getInt("MaSP");
                String tenSanPham = resultSet.getString("TenSP");
                String tenTheLoai = resultSet.getString("TenTL");
                String hinhAnh = resultSet.getString("HinhAnh");
                Double donGia = resultSet.getDouble("DonGia");
                int soLuong = resultSet.getInt("SoLuong");
                String nhaSanXuat = resultSet.getString("NhaSanXuat");
               
                Boolean tinhTrang = resultSet.getBoolean("TinhTrang");
                sanPhamList.add(new SanPhamDTO(maSanPham, tenTheLoai, tenSanPham, hinhAnh, nhaSanXuat, tinhTrang, donGia, soLuong));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return sanPhamList;
    }

    // tìm sản phẩm dựa trên mã sản phẩm
    public ArrayList<SanPhamDTO> findSPByMaSP(int MaSP) {
        ArrayList<SanPhamDTO> sanPhamList = new ArrayList<>();
        String sql = "SELECT * FROM SanPham sp JOIN TheLoai tl on sp.MaTL = tl.MaTL WHERE MaSP LIKE ?  and sp.TinhTrang = 1 and tl.TinhTrang = 1 ";
        try {
            Connection conn = ConnectDB.getConnection();
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, "%" + MaSP + "%");
            ResultSet resultSet = stmt.executeQuery();
            while (resultSet.next()) {
                int maSanPham = resultSet.getInt("MaSP");
                String tenSanPham = resultSet.getString("TenSP");
                String tenTheLoai = resultSet.getString("TenTL");
                String hinhAnh = resultSet.getString("HinhAnh");
                Double donGia = resultSet.getDouble("DonGia");
                int soLuong = resultSet.getInt("SoLuong");
                String nhaSanXuat = resultSet.getString("NhaSanXuat");
              
                Boolean tinhTrang = resultSet.getBoolean("TinhTrang");
                sanPhamList.add(new SanPhamDTO(maSanPham, tenTheLoai, tenSanPham, hinhAnh, nhaSanXuat, tinhTrang, donGia, soLuong));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return sanPhamList;
    }
    // lấy  sản phẩm dựa trên mã sản phẩm

    public SanPhamDTO getSPByMaSP(int MaSP) {
        String sql = "SELECT * FROM SanPham sp JOIN TheLoai tl on sp.MaTL = tl.MaTL WHERE MaSP  = ?  and sp.TinhTrang = 1 and tl.TinhTrang = 1 ";
        try {
            Connection conn = ConnectDB.getConnection();
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setInt(1, MaSP);
            ResultSet resultSet = stmt.executeQuery();
            while (resultSet.next()) {
                int maSanPham = resultSet.getInt("MaSP");
                String tenSanPham = resultSet.getString("TenSP");
                String tenTheLoai = resultSet.getString("TenTL");
                String hinhAnh = resultSet.getString("HinhAnh");
                Double donGia = resultSet.getDouble("DonGia");
                int soLuong = resultSet.getInt("SoLuong");
                String nhaSanXuat = resultSet.getString("NhaSanXuat");
             
                Boolean tinhTrang = resultSet.getBoolean("TinhTrang");
                return new SanPhamDTO(maSanPham, tenTheLoai, tenSanPham, hinhAnh, nhaSanXuat, tinhTrang, donGia, soLuong);
            }
        } catch (SQLException e) {

        }
        return null;
    }

    public SanPhamDTO getHinhAnh(int maSP) {
        SanPhamDTO sp = null;
        String sql = "SELECT HinhAnh FROM SanPham WHERE MaSP = ?";
        try {
            Connection conn = ConnectDB.getConnection();
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setInt(1, maSP);

            ResultSet resultSet = stmt.executeQuery();
            if (resultSet.next()) {
                String hinhAnh = resultSet.getString("HinhAnh");
            
                sp = new SanPhamDTO(hinhAnh);
            }

            ConnectDB.closeConnection(conn);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return sp;
    }

    public boolean Update(SanPhamDTO sp) {
        boolean rowUpdate = false;
        try {
            Connection conn = ConnectDB.getConnection();
            String sql = "UPDATE SanPham SET TenSP=?, NhaSanXuat=?, MaTL=?, SoLuong=?, DonGia=?, TinhTrang=?, HinhAnh=? WHERE MaSP=?";
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setString(1, sp.getTenSP());
            pst.setString(2, sp.getNhaSanXuat());
           
            pst.setInt(3, sp.getMaTL());
            pst.setInt(4, sp.getSoLuong());
            pst.setDouble(5, sp.getDonGia());
            pst.setBoolean(6, sp.getTinhTrang());
            pst.setString(7, sp.getHinhAnh());
            pst.setInt(8, sp.getMaSP());
            rowUpdate = pst.executeUpdate() > 0;
            ConnectDB.closeConnection(conn);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return rowUpdate;
    }

    // Hàm cập nhật số lượng sản phẩm dựa trên mã sản phẩm và số lượng mới
    public boolean updateProductQuantity(int idSP, int newQuantity) {
        // Truy vấn SQL để cập nhật số lượng
        String sql = "UPDATE SanPham SET SoLuong = SoLuong - ? WHERE MaSP = ?";
        boolean rowUpdate = false;
        try {
            Connection conn = ConnectDB.getConnection();
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setInt(1, newQuantity);
            pst.setInt(2, idSP);
            rowUpdate = pst.executeUpdate() > 0;
            ConnectDB.closeConnection(conn);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return rowUpdate;
    }

    public ArrayList<SanPhamDTO> searchProducts(String tenSP, String theLoai, String nhaSanXuat, Double giaBatDau, Double giaKetThuc) {
        // Truy vấn SQL để tìm kiếm sản phẩm với nhiều tiêu chí, bao gồm cả giá
        String sql = "SELECT sp.*, tl.TenTL "
                + "FROM SanPham sp "
                + "JOIN TheLoai tl ON sp.MaTL = tl.MaTL "
                + "WHERE (? IS NULL OR sp.TenSP LIKE ?) AND "
                + "(? IS NULL OR tl.TenTL LIKE ?) AND "
                + "(? IS NULL OR sp.NhaSanXuat LIKE ?) AND "
                + "((? IS NULL AND ? IS NULL) OR (sp.DonGia >= COALESCE(?, sp.DonGia) AND sp.DonGia <= COALESCE(?, sp.DonGia)))";

        ArrayList<SanPhamDTO> result = new ArrayList<>();

        try {
            Connection conn = ConnectDB.getConnection();
            PreparedStatement pst = conn.prepareStatement(sql);

            // Thiết lập các tham số cho câu truy vấn
            pst.setString(1, tenSP);
            pst.setString(2, "%" + tenSP + "%");

            pst.setString(3, theLoai);
            pst.setString(4, "%" + theLoai + "%");

            pst.setString(5, nhaSanXuat);
            pst.setString(6, "%" + nhaSanXuat + "%");

            pst.setDouble(7, giaBatDau);
            pst.setDouble(8, giaKetThuc);
            pst.setDouble(9, giaBatDau);
            pst.setDouble(10, giaKetThuc);

            ResultSet resultSet = pst.executeQuery();

            // Xử lý kết quả truy vấn
            while (resultSet.next()) {
                int maSanPham = resultSet.getInt("MaSP");
                String tenSanPham = resultSet.getString("TenSP");
                String tenTheLoai = resultSet.getString("TenTL");
                String hinhAnh = resultSet.getString("HinhAnh");
                Double donGia = resultSet.getDouble("DonGia");
                int soLuong = resultSet.getInt("SoLuong");
                String NhaSanXuat = resultSet.getString("NhaSanXuat");
           
                Boolean tinhTrang = resultSet.getBoolean("TinhTrang");
                result.add(new SanPhamDTO(maSanPham, tenTheLoai, tenSanPham, hinhAnh, NhaSanXuat, tinhTrang, donGia, soLuong));
            }

            ConnectDB.closeConnection(conn);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return result;
    }
}
