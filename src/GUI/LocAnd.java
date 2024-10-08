/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import BUS.SanPhamBUS;
import DTO.SanPhamDTO;
import Util.sharedFunction;
import java.awt.Cursor;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class LocAnd extends javax.swing.JFrame {

    /**
     * Creates new form LocAnd
     */
    private int check;
//    SanPhamGUI sanPhamGUI = new SanPhamGUI();
    SanPhamBUS sanPhamBUS = new SanPhamBUS();

    public LocAnd() {
        initComponents();
        sharedFunction.moveLayout(this, jPanel1);
    }

    public LocAnd(int check) {
        this.check = check;
        initComponents();
        sharedFunction.moveLayout(this, jPanel1);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtGiaKetThuc = new javax.swing.JTextField();
        txtTenSP = new javax.swing.JTextField();
        txtNhaSanXuat = new javax.swing.JTextField();
        txtTheloai = new javax.swing.JTextField();
        txtGiaBatDau = new javax.swing.JTextField();
        btnTimkiem = new Components.ButtonRadius();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        txtGiaKetThuc.setFont(new java.awt.Font("Josefin Sans Medium", 0, 14)); // NOI18N
        txtGiaKetThuc.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(135, 172, 217), 2, true), "Giá kết thúc", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Josefin Sans SemiBold", 0, 16), new java.awt.Color(135, 172, 217))); // NOI18N
        txtGiaKetThuc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtGiaKetThucActionPerformed(evt);
            }
        });

        txtTenSP.setFont(new java.awt.Font("Josefin Sans Medium", 0, 14)); // NOI18N
        txtTenSP.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(135, 172, 217), 2, true), "Tên sản phẩm", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Josefin Sans SemiBold", 0, 16), new java.awt.Color(135, 172, 217))); // NOI18N

        txtNhaSanXuat.setFont(new java.awt.Font("Josefin Sans Medium", 0, 14)); // NOI18N
        txtNhaSanXuat.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(135, 172, 217), 2, true), "Tên nhà sản xuất", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Josefin Sans SemiBold", 0, 16), new java.awt.Color(135, 172, 217))); // NOI18N

        txtTheloai.setFont(new java.awt.Font("Josefin Sans Medium", 0, 14)); // NOI18N
        txtTheloai.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(135, 172, 217), 2, true), "Thể loại", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Josefin Sans SemiBold", 0, 16), new java.awt.Color(135, 172, 217))); // NOI18N
        txtTheloai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTheloaiActionPerformed(evt);
            }
        });

        txtGiaBatDau.setFont(new java.awt.Font("Josefin Sans Medium", 0, 14)); // NOI18N
        txtGiaBatDau.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(135, 172, 217), 2, true), "Giá bắt đầu", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Josefin Sans SemiBold", 0, 16), new java.awt.Color(135, 172, 217))); // NOI18N

        btnTimkiem.setBackground(new java.awt.Color(153, 204, 255));
        btnTimkiem.setBorder(null);
        btnTimkiem.setForeground(new java.awt.Color(102, 102, 102));
        btnTimkiem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/icon_24px/search.png"))); // NOI18N
        btnTimkiem.setText("Tìm");
        btnTimkiem.setColor(new java.awt.Color(153, 204, 255));
        btnTimkiem.setFocusPainted(false);
        btnTimkiem.setFont(new java.awt.Font("Josefin Sans SemiBold", 0, 17)); // NOI18N
        btnTimkiem.setMaximumSize(new java.awt.Dimension(100, 40));
        btnTimkiem.setPreferredSize(new java.awt.Dimension(100, 40));
        btnTimkiem.setRadius(40);
        btnTimkiem.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnTimkiem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnTimkiemMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnTimkiemMouseExited(evt);
            }
        });
        btnTimkiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimkiemActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/icon_24px/close.png"))); // NOI18N
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(txtTenSP, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(txtNhaSanXuat, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(txtTheloai, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtGiaBatDau, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtGiaKetThuc, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnTimkiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnTimkiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtTenSP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtNhaSanXuat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtTheloai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtGiaBatDau, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtGiaKetThuc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtGiaKetThucActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtGiaKetThucActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtGiaKetThucActionPerformed

    private void btnTimkiemMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTimkiemMouseEntered
        // TODO add your handling code here:
        btnTimkiem.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_btnTimkiemMouseEntered

    private void btnTimkiemMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTimkiemMouseExited
        // TODO add your handling code here:
        btnTimkiem.setCursor(Cursor.getDefaultCursor());
    }//GEN-LAST:event_btnTimkiemMouseExited

    private void btnTimkiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimkiemActionPerformed
        // TODO add your handling code here:
        //        sanPhamGUI.findSanPhamByTenSP_or_MaSP(txtTimKiem.getText(), modelSanPham);
        searchSanPham();

    }//GEN-LAST:event_btnTimkiemActionPerformed
    private void searchSanPham() {
        String tenSP = txtTenSP.getText();
        String theLoai = txtTheloai.getText();
        String nhaSanXuat = txtNhaSanXuat.getText();
        Double giaBatDau = null;
        Double giaKetThuc = null;

        try {
            giaBatDau = Double.parseDouble(txtGiaBatDau.getText());
        } catch (NumberFormatException ex) {
            // Xử lý khi giá bắt đầu không phải số
        }
        try {
            giaKetThuc = Double.parseDouble(txtGiaKetThuc.getText());
        } catch (NumberFormatException ex) {

        }
        giaBatDau = giaBatDau != null ? giaBatDau : 0.0;
        giaKetThuc = giaKetThuc != null ? giaKetThuc : Double.MAX_VALUE;

        ArrayList<SanPhamDTO> result = sanPhamBUS.searchProducts(tenSP, theLoai, nhaSanXuat, giaBatDau, giaKetThuc);
        DefaultTableModel targetModel = (check == 2) ? BanHangGUI.getModelSanPham() : SanPhamGUI.getModelSanPham();

        if (!result.isEmpty()) {
            SanPhamGUI.loadTableSanPham(result, targetModel);
        } else {
            JOptionPane.showMessageDialog(this, "Không tìm thấy kết quả.", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
        }

    }
    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jLabel1MouseClicked

    private void txtTheloaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTheloaiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTheloaiActionPerformed

    public int getCheck() {
        return check;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(LocAnd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LocAnd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LocAnd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LocAnd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LocAnd().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Components.ButtonRadius btnTimkiem;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtGiaBatDau;
    private javax.swing.JTextField txtGiaKetThuc;
    private javax.swing.JTextField txtNhaSanXuat;
    private javax.swing.JTextField txtTenSP;
    private javax.swing.JTextField txtTheloai;
    // End of variables declaration//GEN-END:variables
}
