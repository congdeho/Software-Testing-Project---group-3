/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package DemoConnectDB;

import GUI.*;
import BUS.ChucNangBUS;
import DTO.ChucNangDTO;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JLabel;

/**
 *
 * @Nhóm 13
 */
public class MainFrameGUItest extends javax.swing.JFrame {

    /**
     * Creates new form MainFrameGUI
     */
    ArrayList<JLabel> listItems = new ArrayList<>();
    Map<JLabel, Boolean> labelStates = new HashMap<>();
    
//    ChucNangBUS cnBUS = new ChucNangBUS();
//    ArrayList<ChucNangDTO> dscn = new ArrayList<>();

    public MainFrameGUItest() {
        this.setUndecorated(true);
        initComponents();
        designComp();
        this.setLocationRelativeTo(null);
    }

    void designComp() {
        spnMenu.getVerticalScrollBar().setUnitIncrement(16);

        createListItems();
        solveActionMenu();
        solveHoverMenu();
    }

    void createListItems() {
        listItems.add(lblBanHang);
        listItems.add(lblNhapHang);
        listItems.add(lblSanPham);
        listItems.add(lblHoaDon);
        listItems.add(lblPhieuNhap);
        listItems.add(lblNhanVien);
        listItems.add(lblCongTy);
        listItems.add(lblThongKe);
        listItems.add(lblTaiKhoan);
        listItems.add(lblPhanQuyen);
        
        lblSanPham.setBackground(Color.decode("#AAD8F4"));
        lblSanPham.setForeground(Color.white);
        lblSanPham.setOpaque(true);
    }

    void solveActionMenu() {
        lblBanHang.addMouseListener(new handleMouseEvent(pnContent, new BanHangGUI()));
        lblNhapHang.addMouseListener(new handleMouseEvent(pnContent, new NhapHangGUI()));
        lblSanPham.addMouseListener(new handleMouseEvent(pnContent, pnSanPham));
        lblHoaDon.addMouseListener(new handleMouseEvent(pnContent, pnHoaDon));
        lblPhieuNhap.addMouseListener(new handleMouseEvent(pnContent, pnPhieuNhap));
        lblNhanVien.addMouseListener(new handleMouseEvent(pnContent, pnNhanVien));
        lblCongTy.addMouseListener(new handleMouseEvent(pnContent, pnCongTy));
        lblTaiKhoan.addMouseListener(new handleMouseEvent(pnContent, pnTaiKhoan));
        lblPhanQuyen.addMouseListener(new handleMouseEvent(pnContent, pnPhanQuyen));
        lblThongKe.addMouseListener(new handleMouseEvent(pnContent, new ThongKeGUI()));
    }

    void solveHoverMenu() {
        for (JLabel lbl : listItems) {
            labelStates.put(lbl, false);
            lbl.addMouseListener(new MouseAdapter() {
                public void mouseEntered(MouseEvent e) {
                    lbl.setBackground(Color.decode("#AAD8F4"));
                    lbl.setForeground(Color.white);
                    lbl.setOpaque(true);
                }

                public void mouseExited(MouseEvent e) {
                    if (!labelStates.get(lbl)) {
                        lbl.setBackground(Color.decode("#87ACD9"));
                        lbl.setOpaque(false);
                    }
                }

                public void mouseClicked(MouseEvent e) {
                    for (JLabel label : labelStates.keySet()) {
                        labelStates.put(label, false);
                        label.setBackground(Color.decode("#87ACD9"));
                        label.setOpaque(false);
                    }

                    labelStates.put((JLabel) e.getSource(), true);
                    ((JLabel) e.getSource()).setBackground(Color.decode("#AAD8F4"));
                    ((JLabel) e.getSource()).setForeground(Color.white);
                    ((JLabel) e.getSource()).setOpaque(true);
                }
            });
        }
    }
    
    void createNewMenu(String name) {
        JLabel lbl = new JLabel();
        lbl.setFont(new java.awt.Font("Dialog", 0, 20)); // NOI18N
        lbl.setForeground(new java.awt.Color(243, 243, 244));
        lbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/icon_40px/product_2.png"))); // NOI18N
        lbl.setText("SẢN PHẨM");
        lbl.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbl.setPreferredSize(new java.awt.Dimension(260, 80));
        pnListItem.add(lblSanPham);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        puSetting = new javax.swing.JPopupMenu();
        itemChangePass = new javax.swing.JMenuItem();
        itemLogOut = new javax.swing.JMenuItem();
        pnContainer = new javax.swing.JPanel();
        pnSideBar = new javax.swing.JPanel();
        pnLogo = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        spnMenu = new javax.swing.JScrollPane();
        pnListItem = new javax.swing.JPanel();
        lblSanPham = new javax.swing.JLabel();
        lblBanHang = new javax.swing.JLabel();
        lblNhapHang = new javax.swing.JLabel();
        lblCongTy = new javax.swing.JLabel();
        lblNhanVien = new javax.swing.JLabel();
        lblHoaDon = new javax.swing.JLabel();
        lblPhieuNhap = new javax.swing.JLabel();
        lblThongKe = new javax.swing.JLabel();
        lblTaiKhoan = new javax.swing.JLabel();
        lblPhanQuyen = new javax.swing.JLabel();
        pnInfo = new Components.Jpanel();
        lblName = new javax.swing.JLabel();
        lblRole = new javax.swing.JLabel();
        lblSetting = new javax.swing.JLabel();
        pnContent = new javax.swing.JPanel();
        pnBanHang = new javax.swing.JPanel();
        pnNhapHang = new javax.swing.JPanel();
        pnCongTy = new javax.swing.JPanel();
        pnNhanVien = new javax.swing.JPanel();
        pnHoaDon = new javax.swing.JPanel();
        pnPhieuNhap = new javax.swing.JPanel();
        pnThongKe = new javax.swing.JPanel();
        pnTaiKhoan = new javax.swing.JPanel();
        pnPhanQuyen = new javax.swing.JPanel();
        pnSanPham = new javax.swing.JPanel();
        pnHeader = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        itemChangePass.setText("Đổi mật khẩu");
        puSetting.add(itemChangePass);

        itemLogOut.setText("Đăng xuất");
        puSetting.add(itemLogOut);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnContainer.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnSideBar.setBackground(new java.awt.Color(135, 172, 217));
        pnSideBar.setPreferredSize(new java.awt.Dimension(260, 750));

        pnLogo.setBackground(new java.awt.Color(135, 172, 217));
        pnLogo.setPreferredSize(new java.awt.Dimension(260, 120));

        jLabel1.setBackground(new java.awt.Color(135, 172, 217));
        jLabel1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(243, 243, 244));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/logo/main_logo.png"))); // NOI18N
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel1.setPreferredSize(new java.awt.Dimension(250, 100));
        pnLogo.add(jLabel1);

        jSeparator1.setBackground(new java.awt.Color(243, 243, 244));
        jSeparator1.setForeground(new java.awt.Color(243, 243, 244));
        jSeparator1.setPreferredSize(new java.awt.Dimension(250, 10));
        pnLogo.add(jSeparator1);

        spnMenu.setBorder(null);
        spnMenu.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        spnMenu.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        spnMenu.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        spnMenu.setPreferredSize(new java.awt.Dimension(260, 570));
        spnMenu.setRequestFocusEnabled(false);

        pnListItem.setBackground(new java.awt.Color(135, 172, 217));
        pnListItem.setAutoscrolls(true);
        pnListItem.setPreferredSize(new java.awt.Dimension(260, 850));

        lblSanPham.setFont(new java.awt.Font("Dialog", 0, 20)); // NOI18N
        lblSanPham.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/icon_40px/product_2.png"))); // NOI18N
        lblSanPham.setText("SẢN PHẨM");
        lblSanPham.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblSanPham.setPreferredSize(new java.awt.Dimension(260, 80));
        pnListItem.add(lblSanPham);

        lblBanHang.setFont(new java.awt.Font("Dialog", 0, 20)); // NOI18N
        lblBanHang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/icon_40px/cart_2.png"))); // NOI18N
        lblBanHang.setText("BÁN HÀNG");
        lblBanHang.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblBanHang.setPreferredSize(new java.awt.Dimension(260, 80));
        pnListItem.add(lblBanHang);

        lblNhapHang.setFont(new java.awt.Font("Dialog", 0, 20)); // NOI18N
        lblNhapHang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/icon_40px/pack_2.png"))); // NOI18N
        lblNhapHang.setText("NHẬP HÀNG");
        lblNhapHang.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblNhapHang.setPreferredSize(new java.awt.Dimension(260, 80));
        pnListItem.add(lblNhapHang);

        lblCongTy.setFont(new java.awt.Font("Dialog", 0, 20)); // NOI18N
        lblCongTy.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/icon_40px/emplyee_2.png"))); // NOI18N
        lblCongTy.setText("CÔNG TY XÂY DỰNG");
        lblCongTy.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblCongTy.setPreferredSize(new java.awt.Dimension(260, 80));
        pnListItem.add(lblCongTy);

        lblNhanVien.setFont(new java.awt.Font("Dialog", 0, 20)); // NOI18N
        lblNhanVien.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/icon_40px/emplyee_2.png"))); // NOI18N
        lblNhanVien.setText("NHÂN VIÊN");
        lblNhanVien.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblNhanVien.setPreferredSize(new java.awt.Dimension(260, 80));
        pnListItem.add(lblNhanVien);

        lblHoaDon.setFont(new java.awt.Font("Dialog", 0, 20)); // NOI18N
        lblHoaDon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/icon_40px/order_2.png"))); // NOI18N
        lblHoaDon.setText("HÓA ĐƠN");
        lblHoaDon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblHoaDon.setPreferredSize(new java.awt.Dimension(260, 80));
        pnListItem.add(lblHoaDon);

        lblPhieuNhap.setFont(new java.awt.Font("Dialog", 0, 20)); // NOI18N
        lblPhieuNhap.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/icon_40px/order_2.png"))); // NOI18N
        lblPhieuNhap.setText("PHIẾU NHẬP");
        lblPhieuNhap.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblPhieuNhap.setPreferredSize(new java.awt.Dimension(260, 80));
        pnListItem.add(lblPhieuNhap);

        lblThongKe.setFont(new java.awt.Font("Dialog", 0, 20)); // NOI18N
        lblThongKe.setForeground(new java.awt.Color(243, 243, 244));
        lblThongKe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/icon_40px/dashboard_2.png"))); // NOI18N
        lblThongKe.setText("THỐNG KÊ");
        lblThongKe.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblThongKe.setPreferredSize(new java.awt.Dimension(260, 80));
        pnListItem.add(lblThongKe);

        lblTaiKhoan.setFont(new java.awt.Font("Dialog", 0, 20)); // NOI18N
        lblTaiKhoan.setForeground(new java.awt.Color(243, 243, 244));
        lblTaiKhoan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/icon_40px/account_2.png"))); // NOI18N
        lblTaiKhoan.setText("TÀI KHOẢN");
        lblTaiKhoan.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblTaiKhoan.setPreferredSize(new java.awt.Dimension(260, 80));
        pnListItem.add(lblTaiKhoan);

        lblPhanQuyen.setFont(new java.awt.Font("Dialog", 0, 20)); // NOI18N
        lblPhanQuyen.setForeground(new java.awt.Color(243, 243, 244));
        lblPhanQuyen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/icon_40px/division_2.png"))); // NOI18N
        lblPhanQuyen.setText("PHÂN QUYỀN");
        lblPhanQuyen.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblPhanQuyen.setPreferredSize(new java.awt.Dimension(260, 80));
        pnListItem.add(lblPhanQuyen);

        spnMenu.setViewportView(pnListItem);

        pnInfo.setBackground(new java.awt.Color(170, 216, 244));
        pnInfo.setMinimumSize(new java.awt.Dimension(260, 60));
        pnInfo.setRoundTopLeft(50);
        pnInfo.setRoundTopRight(50);

        lblName.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        lblName.setForeground(new java.awt.Color(255, 255, 255));
        lblName.setText("Nguyễn Văn A");

        lblRole.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblRole.setForeground(new java.awt.Color(250, 232, 189));
        lblRole.setText("Admin");

        lblSetting.setText("icon");
        lblSetting.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        lblSetting.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblSettingMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pnInfoLayout = new javax.swing.GroupLayout(pnInfo);
        pnInfo.setLayout(pnInfoLayout);
        pnInfoLayout.setHorizontalGroup(
            pnInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnInfoLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(pnInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblRole, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblName, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addComponent(lblSetting, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );
        pnInfoLayout.setVerticalGroup(
            pnInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnInfoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblSetting, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pnInfoLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(lblName, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addComponent(lblRole)))
                .addContainerGap())
        );

        javax.swing.GroupLayout pnSideBarLayout = new javax.swing.GroupLayout(pnSideBar);
        pnSideBar.setLayout(pnSideBarLayout);
        pnSideBarLayout.setHorizontalGroup(
            pnSideBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnSideBarLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(pnLogo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61))
            .addGroup(pnSideBarLayout.createSequentialGroup()
                .addComponent(pnInfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(pnSideBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnSideBarLayout.createSequentialGroup()
                    .addGap(0, 0, 0)
                    .addComponent(spnMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(61, 61, 61)))
        );
        pnSideBarLayout.setVerticalGroup(
            pnSideBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnSideBarLayout.createSequentialGroup()
                .addComponent(pnLogo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 570, Short.MAX_VALUE)
                .addComponent(pnInfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(pnSideBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnSideBarLayout.createSequentialGroup()
                    .addGap(120, 120, 120)
                    .addComponent(spnMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(60, Short.MAX_VALUE)))
        );

        pnContainer.add(pnSideBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, -1, 750));

        pnContent.setPreferredSize(new java.awt.Dimension(1020, 750));
        pnContent.setLayout(new java.awt.CardLayout());

        pnBanHang.setBackground(new java.awt.Color(102, 102, 255));

        javax.swing.GroupLayout pnBanHangLayout = new javax.swing.GroupLayout(pnBanHang);
        pnBanHang.setLayout(pnBanHangLayout);
        pnBanHangLayout.setHorizontalGroup(
            pnBanHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1020, Short.MAX_VALUE)
        );
        pnBanHangLayout.setVerticalGroup(
            pnBanHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 750, Short.MAX_VALUE)
        );

        pnContent.add(pnBanHang, "card3");

        pnNhapHang.setBackground(new java.awt.Color(204, 153, 0));

        javax.swing.GroupLayout pnNhapHangLayout = new javax.swing.GroupLayout(pnNhapHang);
        pnNhapHang.setLayout(pnNhapHangLayout);
        pnNhapHangLayout.setHorizontalGroup(
            pnNhapHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1020, Short.MAX_VALUE)
        );
        pnNhapHangLayout.setVerticalGroup(
            pnNhapHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 750, Short.MAX_VALUE)
        );

        pnContent.add(pnNhapHang, "card4");

        pnCongTy.setBackground(new java.awt.Color(0, 204, 153));

        javax.swing.GroupLayout pnCongTyLayout = new javax.swing.GroupLayout(pnCongTy);
        pnCongTy.setLayout(pnCongTyLayout);
        pnCongTyLayout.setHorizontalGroup(
            pnCongTyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1020, Short.MAX_VALUE)
        );
        pnCongTyLayout.setVerticalGroup(
            pnCongTyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 750, Short.MAX_VALUE)
        );

        pnContent.add(pnCongTy, "card5");

        pnNhanVien.setBackground(new java.awt.Color(51, 102, 255));

        javax.swing.GroupLayout pnNhanVienLayout = new javax.swing.GroupLayout(pnNhanVien);
        pnNhanVien.setLayout(pnNhanVienLayout);
        pnNhanVienLayout.setHorizontalGroup(
            pnNhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1020, Short.MAX_VALUE)
        );
        pnNhanVienLayout.setVerticalGroup(
            pnNhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 750, Short.MAX_VALUE)
        );

        pnContent.add(pnNhanVien, "card6");

        pnHoaDon.setBackground(new java.awt.Color(153, 0, 204));

        javax.swing.GroupLayout pnHoaDonLayout = new javax.swing.GroupLayout(pnHoaDon);
        pnHoaDon.setLayout(pnHoaDonLayout);
        pnHoaDonLayout.setHorizontalGroup(
            pnHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1020, Short.MAX_VALUE)
        );
        pnHoaDonLayout.setVerticalGroup(
            pnHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 750, Short.MAX_VALUE)
        );

        pnContent.add(pnHoaDon, "card7");

        pnPhieuNhap.setBackground(new java.awt.Color(255, 153, 153));

        javax.swing.GroupLayout pnPhieuNhapLayout = new javax.swing.GroupLayout(pnPhieuNhap);
        pnPhieuNhap.setLayout(pnPhieuNhapLayout);
        pnPhieuNhapLayout.setHorizontalGroup(
            pnPhieuNhapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1020, Short.MAX_VALUE)
        );
        pnPhieuNhapLayout.setVerticalGroup(
            pnPhieuNhapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 750, Short.MAX_VALUE)
        );

        pnContent.add(pnPhieuNhap, "card8");

        pnThongKe.setBackground(new java.awt.Color(102, 153, 0));

        javax.swing.GroupLayout pnThongKeLayout = new javax.swing.GroupLayout(pnThongKe);
        pnThongKe.setLayout(pnThongKeLayout);
        pnThongKeLayout.setHorizontalGroup(
            pnThongKeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1020, Short.MAX_VALUE)
        );
        pnThongKeLayout.setVerticalGroup(
            pnThongKeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 750, Short.MAX_VALUE)
        );

        pnContent.add(pnThongKe, "card9");

        pnTaiKhoan.setBackground(new java.awt.Color(204, 255, 204));

        javax.swing.GroupLayout pnTaiKhoanLayout = new javax.swing.GroupLayout(pnTaiKhoan);
        pnTaiKhoan.setLayout(pnTaiKhoanLayout);
        pnTaiKhoanLayout.setHorizontalGroup(
            pnTaiKhoanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1020, Short.MAX_VALUE)
        );
        pnTaiKhoanLayout.setVerticalGroup(
            pnTaiKhoanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 750, Short.MAX_VALUE)
        );

        pnContent.add(pnTaiKhoan, "card10");

        pnPhanQuyen.setBackground(new java.awt.Color(51, 0, 51));

        javax.swing.GroupLayout pnPhanQuyenLayout = new javax.swing.GroupLayout(pnPhanQuyen);
        pnPhanQuyen.setLayout(pnPhanQuyenLayout);
        pnPhanQuyenLayout.setHorizontalGroup(
            pnPhanQuyenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1020, Short.MAX_VALUE)
        );
        pnPhanQuyenLayout.setVerticalGroup(
            pnPhanQuyenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 750, Short.MAX_VALUE)
        );

        pnContent.add(pnPhanQuyen, "card11");

        pnSanPham.setBackground(new java.awt.Color(153, 255, 255));

        javax.swing.GroupLayout pnSanPhamLayout = new javax.swing.GroupLayout(pnSanPham);
        pnSanPham.setLayout(pnSanPhamLayout);
        pnSanPhamLayout.setHorizontalGroup(
            pnSanPhamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1020, Short.MAX_VALUE)
        );
        pnSanPhamLayout.setVerticalGroup(
            pnSanPhamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 750, Short.MAX_VALUE)
        );

        pnContent.add(pnSanPham, "card2");

        pnContainer.add(pnContent, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 30, 1020, 750));

        pnHeader.setBackground(new java.awt.Color(51, 255, 255));
        pnHeader.setPreferredSize(new java.awt.Dimension(1280, 30));

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("store construction materials");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/icon_24px/close.png"))); // NOI18N
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel3.setPreferredSize(new java.awt.Dimension(30, 30));
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/icon_24px/minimize.png"))); // NOI18N
        jLabel4.setText("jLabel4");
        jLabel4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel4.setPreferredSize(new java.awt.Dimension(30, 30));
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pnHeaderLayout = new javax.swing.GroupLayout(pnHeader);
        pnHeader.setLayout(pnHeaderLayout);
        pnHeaderLayout.setHorizontalGroup(
            pnHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnHeaderLayout.createSequentialGroup()
                .addContainerGap(552, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(378, 378, 378)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        pnHeaderLayout.setVerticalGroup(
            pnHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(pnHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pnContainer.add(pnHeader, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnContainer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnContainer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblSettingMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSettingMouseClicked
        // TODO add your handling code here:
        puSetting.show(lblSetting, -60, -60);
    }//GEN-LAST:event_lblSettingMouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        // TODO add your handling code here:
        this.setState(this.ICONIFIED);
    }//GEN-LAST:event_jLabel4MouseClicked

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
            java.util.logging.Logger.getLogger(MainFrameGUItest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrameGUItest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrameGUItest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrameGUItest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrameGUItest().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem itemChangePass;
    private javax.swing.JMenuItem itemLogOut;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblBanHang;
    private javax.swing.JLabel lblCongTy;
    private javax.swing.JLabel lblHoaDon;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblNhanVien;
    private javax.swing.JLabel lblNhapHang;
    private javax.swing.JLabel lblPhanQuyen;
    private javax.swing.JLabel lblPhieuNhap;
    private javax.swing.JLabel lblRole;
    private javax.swing.JLabel lblSanPham;
    private javax.swing.JLabel lblSetting;
    private javax.swing.JLabel lblTaiKhoan;
    private javax.swing.JLabel lblThongKe;
    private javax.swing.JPanel pnBanHang;
    private javax.swing.JPanel pnCongTy;
    private javax.swing.JPanel pnContainer;
    private javax.swing.JPanel pnContent;
    private javax.swing.JPanel pnHeader;
    private javax.swing.JPanel pnHoaDon;
    private Components.Jpanel pnInfo;
    private javax.swing.JPanel pnListItem;
    private javax.swing.JPanel pnLogo;
    private javax.swing.JPanel pnNhanVien;
    private javax.swing.JPanel pnNhapHang;
    private javax.swing.JPanel pnPhanQuyen;
    private javax.swing.JPanel pnPhieuNhap;
    private javax.swing.JPanel pnSanPham;
    private javax.swing.JPanel pnSideBar;
    private javax.swing.JPanel pnTaiKhoan;
    private javax.swing.JPanel pnThongKe;
    private javax.swing.JPopupMenu puSetting;
    private javax.swing.JScrollPane spnMenu;
    // End of variables declaration//GEN-END:variables
}
