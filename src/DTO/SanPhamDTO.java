/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

/**
 *
 * @Nhóm 13
 */
public final class SanPhamDTO {

    private int MaSP,MaTL;
    private String TenTL, TenSP, NhaSanXuat,HinhAnh;
    private boolean TinhTrang;
    private double DonGia;
    private int SoLuong;
   

    // dùng để chứa dữ liệu sản phẩm khi truy vấn từ database đổ lên bảng sản phẩm
    public SanPhamDTO(int MaSP, String TenTL, String TenSP, String HinhAnh, String NhaSanXuat, boolean TinhTrang, double DonGia, int SoLuong) {     
        this.MaSP = MaSP;
        this.TenTL = TenTL;
        this.TenSP = TenSP;
        this.HinhAnh = HinhAnh;
        this.NhaSanXuat = NhaSanXuat;
        this.TinhTrang = TinhTrang;
        this.DonGia = DonGia;
        this.SoLuong = SoLuong;
       
    }


    // sử dụng khi cần thêm sản phẩm 
    public SanPhamDTO(int MaTL, String TenSP, String NhaSanXuat, boolean TinhTrang, double DonGia, int SoLuong, String HinhAnh) {
        this.MaTL = MaTL;
        this.TenSP = TenSP;
        this.NhaSanXuat = NhaSanXuat;
        this.TinhTrang = TinhTrang;
        this.DonGia = DonGia;
        this.SoLuong = SoLuong;
       
        this.HinhAnh = HinhAnh;
    }
    // sử dụng khi cần sửa sản phẩm 
    public SanPhamDTO(int MaSP,int MaTL, String TenSP, String NhaSanXuat, boolean TinhTrang, double DonGia, int SoLuong,  String HinhAnh) {
        this.MaSP = MaSP;
        this.MaTL = MaTL;
        this.TenSP = TenSP;
        this.NhaSanXuat = NhaSanXuat;
        this.TinhTrang = TinhTrang;
        this.DonGia = DonGia;
        this.SoLuong = SoLuong;
       
        this.HinhAnh = HinhAnh;
    }

   
    // sử dụng khi cần lấy hình ảnh và năm xuất bản
    public SanPhamDTO(String HinhAnh) {
        this.HinhAnh = HinhAnh;
       
    }



    public int getMaSP() {
        return MaSP;
    }

    public void setMaSP(int MaSP) {
        this.MaSP = MaSP;
    }

    public String getTenTL() {
        return TenTL;
    }

    public void setTenTL(String TenTL) {
        this.TenTL = TenTL;
    }

    public String getTenSP() {
        return TenSP;
    }

    public void setTenSP(String TenSP) {
        this.TenSP = TenSP;
    }

    public String getHinhAnh() {
        return HinhAnh;
    }

    public void setHinhAnh(String HinhAnh) {
        this.HinhAnh = HinhAnh;
    }

    public String getNhaSanXuat() {
        return NhaSanXuat;
    }

    public void setNhaSanXuat(String NhaSanXuat) {
        this.NhaSanXuat = NhaSanXuat;
    }

    public boolean getTinhTrang() {
        return TinhTrang;
    }

    public void setTinhTrang(boolean TinhTrang) {
        this.TinhTrang = TinhTrang;
    }

    public double getDonGia() {
        return DonGia;
    }

    public void setDonGia(double DonGia) {
        this.DonGia = DonGia;
    }

    public int getSoLuong() {
        return SoLuong;
    }

    public void setSoLuong(int SoLuong) {
        this.SoLuong = SoLuong;
    }

   

    
    public int getMaTL() {
        return MaTL;
    }

    public void setMaTL(int MaTL) {
        this.MaTL = MaTL;
    }


}
