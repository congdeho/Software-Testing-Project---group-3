/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BUS;

import DAO.SanPhamDAO;
import DTO.SanPhamDTO;
import java.util.ArrayList;


public class SanPhamBUS {
    
    private final SanPhamDAO sanPhamDAO;
    
    public SanPhamBUS() {
        sanPhamDAO = new SanPhamDAO();
    }
    
    public ArrayList<SanPhamDTO> getAllSanPham() {
        return sanPhamDAO.selectAll();
    }
    
    public int getMaSPMax() {
        return sanPhamDAO.getMaSPMax();
    }
//    
  public SanPhamDTO getHinhAnh(int maSP) {
       return sanPhamDAO.getHinhAnh(maSP);
    }
//    
    public boolean deleteSanPhamByMaSP(int maSP) {
        return sanPhamDAO.deleteSPByMaSP(maSP);
    }
    
    public boolean addSanPham(SanPhamDTO sp) {
        return sanPhamDAO.addSanPham(sp);
    }
    
    public boolean updateSanPham(SanPhamDTO sp) {
        return sanPhamDAO.Update(sp);
    }
    
      public ArrayList<SanPhamDTO>  searchProducts(String tenSP, String theLoai, String nhaSanXuat, Double giaBatDau, Double giaKetThuc){
        return sanPhamDAO.searchProducts(tenSP, theLoai, nhaSanXuat, giaBatDau, giaKetThuc);
    }
    public ArrayList<SanPhamDTO> findSPByTenSP_or_MaSP(String temp) {
        return sanPhamDAO.findSPByTenSP_or_MaSP(temp);
    }
    
    public ArrayList<SanPhamDTO> findSPByNhaSanXuat(String NhaSanXuat) {
        return sanPhamDAO.findSPByNhaSanXuat(NhaSanXuat);
    }
    
    public ArrayList<SanPhamDTO> findSPByTenSP(String TenSP) {
        return sanPhamDAO.findSPByTenSP(TenSP);
    }

    // tìm sản phẩm dựa trên tên thể loại
    public ArrayList<SanPhamDTO> findSPByTheLoai(String TheLoai) {
        return sanPhamDAO.findSPByTheLoai(TheLoai);
    }
    
    public ArrayList<SanPhamDTO> findSPByMaSP(int MaSP) {
        return sanPhamDAO.findSPByMaSP(MaSP);
    }
    
   public SanPhamDTO getSPByMaSP(int MaSP) {
       return sanPhamDAO.getSPByMaSP(MaSP);
   }
    public boolean updateProductQuantity(int idSP, int newQuantity) {
        return sanPhamDAO.updateProductQuantity(idSP, newQuantity);
    }
}
