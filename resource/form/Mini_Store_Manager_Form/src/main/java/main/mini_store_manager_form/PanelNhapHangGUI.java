/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package main.mini_store_manager_form;

/**
 *
 * @author edgar
 */
public class PanelNhapHangGUI extends javax.swing.JPanel {

    /**
     * Creates new form PanelPhieuNhapGUI
     */
    public PanelNhapHangGUI() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnThongTinPhieuNhap = new javax.swing.JPanel();
        lbMaPhieuNhap = new javax.swing.JLabel();
        lbMaMatHang = new javax.swing.JLabel();
        lbSoLuongNhap = new javax.swing.JLabel();
        lbNgayNhap = new javax.swing.JLabel();
        lbNhaCungCap = new javax.swing.JLabel();
        txtMaPhieuNhap = new javax.swing.JTextField();
        txtMaMatHang = new javax.swing.JTextField();
        txtSoLuongNhap = new javax.swing.JTextField();
        txtNgayNhap = new javax.swing.JTextField();
        cbNhaCungCap = new javax.swing.JComboBox<>();
        btnLamMoi = new javax.swing.JButton();
        btnTimKiemNV = new javax.swing.JButton();
        btnThem = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        btnTangSL = new javax.swing.JButton();
        btnGiamSL = new javax.swing.JButton();
        btnHuyDonNhap = new javax.swing.JButton();
        btnXacNhanNhap = new javax.swing.JButton();
        spDanhSachMatHang = new javax.swing.JScrollPane();
        tbDanhSachMatHang = new javax.swing.JTable();
        spDanhSachMatHangNhap = new javax.swing.JScrollPane();
        tbDanhSachMatHangNhap = new javax.swing.JTable();

        pnThongTinPhieuNhap.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Thông tin phiếu nhập", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 13))); // NOI18N

        lbMaPhieuNhap.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        lbMaPhieuNhap.setText("Mã phiếu nhập:");

        lbMaMatHang.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        lbMaMatHang.setText("Mã mặt hàng:");

        lbSoLuongNhap.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        lbSoLuongNhap.setText("Số lượng nhập:");

        lbNgayNhap.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        lbNgayNhap.setText("Ngày nhập:");

        lbNhaCungCap.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        lbNhaCungCap.setText("Nhà cung cấp:");

        txtMaPhieuNhap.setEditable(false);
        txtMaPhieuNhap.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N

        txtMaMatHang.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N

        txtSoLuongNhap.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N

        txtNgayNhap.setEditable(false);
        txtNgayNhap.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N

        cbNhaCungCap.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        cbNhaCungCap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbNhaCungCapActionPerformed(evt);
            }
        });

        btnLamMoi.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        btnLamMoi.setText("Làm mới");
        btnLamMoi.setToolTipText("Làm mới lại form");
        btnLamMoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLamMoiActionPerformed(evt);
            }
        });

        btnTimKiemNV.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        btnTimKiemNV.setText("Tìm kiếm");
        btnTimKiemNV.setToolTipText("Tìm kiếm hoá đơn thông qua mã hoá đơn.");
        btnTimKiemNV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimKiemNVActionPerformed(evt);
            }
        });

        btnThem.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        btnThem.setText("Thêm mặt hàng");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        btnSua.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        btnSua.setText("Xoá mặt hàng");
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });

        btnTangSL.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        btnTangSL.setText("Tăng SL nhập");
        btnTangSL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTangSLActionPerformed(evt);
            }
        });

        btnGiamSL.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        btnGiamSL.setText("Giảm SL nhập");
        btnGiamSL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGiamSLActionPerformed(evt);
            }
        });

        btnHuyDonNhap.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        btnHuyDonNhap.setText("Huỷ đơn nhập");

        btnXacNhanNhap.setText("Xác nhận nhập");
        btnXacNhanNhap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXacNhanNhapActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnThongTinPhieuNhapLayout = new javax.swing.GroupLayout(pnThongTinPhieuNhap);
        pnThongTinPhieuNhap.setLayout(pnThongTinPhieuNhapLayout);
        pnThongTinPhieuNhapLayout.setHorizontalGroup(
            pnThongTinPhieuNhapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnThongTinPhieuNhapLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnThongTinPhieuNhapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnThongTinPhieuNhapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(lbNgayNhap, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lbSoLuongNhap, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
                        .addComponent(lbMaMatHang, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lbNhaCungCap, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lbMaPhieuNhap, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(btnLamMoi, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnThongTinPhieuNhapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnThongTinPhieuNhapLayout.createSequentialGroup()
                        .addComponent(btnHuyDonNhap, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                        .addComponent(btnXacNhanNhap, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtMaMatHang)
                    .addComponent(cbNhaCungCap, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtNgayNhap)
                    .addComponent(txtSoLuongNhap)
                    .addComponent(txtMaPhieuNhap, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnThongTinPhieuNhapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnTimKiemNV, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnThem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSua, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnTangSL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnGiamSL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        pnThongTinPhieuNhapLayout.setVerticalGroup(
            pnThongTinPhieuNhapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnThongTinPhieuNhapLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(pnThongTinPhieuNhapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbMaPhieuNhap)
                    .addComponent(txtMaPhieuNhap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnThem))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnThongTinPhieuNhapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSua)
                    .addComponent(txtMaMatHang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbMaMatHang))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnThongTinPhieuNhapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbSoLuongNhap)
                    .addComponent(txtSoLuongNhap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnThongTinPhieuNhapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbNgayNhap)
                    .addComponent(txtNgayNhap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTangSL))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnThongTinPhieuNhapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbNhaCungCap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbNhaCungCap)
                    .addComponent(btnGiamSL))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addGroup(pnThongTinPhieuNhapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnTimKiemNV)
                    .addComponent(btnLamMoi)
                    .addComponent(btnHuyDonNhap)
                    .addComponent(btnXacNhanNhap))
                .addContainerGap())
        );

        spDanhSachMatHang.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Danh sách mặt hàng", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 13))); // NOI18N

        tbDanhSachMatHang.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        spDanhSachMatHang.setViewportView(tbDanhSachMatHang);

        spDanhSachMatHangNhap.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Danh sách mặt hàng nhập", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 13))); // NOI18N

        tbDanhSachMatHangNhap.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        spDanhSachMatHangNhap.setViewportView(tbDanhSachMatHangNhap);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pnThongTinPhieuNhap, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(spDanhSachMatHang))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(spDanhSachMatHangNhap, javax.swing.GroupLayout.PREFERRED_SIZE, 613, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(spDanhSachMatHangNhap)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(pnThongTinPhieuNhap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(spDanhSachMatHang, javax.swing.GroupLayout.DEFAULT_SIZE, 424, Short.MAX_VALUE)))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnLamMoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLamMoiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnLamMoiActionPerformed

    private void btnTimKiemNVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimKiemNVActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnTimKiemNVActionPerformed

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnThemActionPerformed

    private void cbNhaCungCapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbNhaCungCapActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbNhaCungCapActionPerformed

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSuaActionPerformed

    private void btnTangSLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTangSLActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnTangSLActionPerformed

    private void btnGiamSLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGiamSLActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnGiamSLActionPerformed

    private void btnXacNhanNhapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXacNhanNhapActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnXacNhanNhapActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGiamSL;
    private javax.swing.JButton btnHuyDonNhap;
    private javax.swing.JButton btnLamMoi;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnTangSL;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnTimKiemNV;
    private javax.swing.JButton btnXacNhanNhap;
    private javax.swing.JComboBox<String> cbNhaCungCap;
    private javax.swing.JLabel lbMaMatHang;
    private javax.swing.JLabel lbMaPhieuNhap;
    private javax.swing.JLabel lbNgayNhap;
    private javax.swing.JLabel lbNhaCungCap;
    private javax.swing.JLabel lbSoLuongNhap;
    private javax.swing.JPanel pnThongTinPhieuNhap;
    private javax.swing.JScrollPane spDanhSachMatHang;
    private javax.swing.JScrollPane spDanhSachMatHangNhap;
    private javax.swing.JTable tbDanhSachMatHang;
    private javax.swing.JTable tbDanhSachMatHangNhap;
    private javax.swing.JTextField txtMaMatHang;
    private javax.swing.JTextField txtMaPhieuNhap;
    private javax.swing.JTextField txtNgayNhap;
    private javax.swing.JTextField txtSoLuongNhap;
    // End of variables declaration//GEN-END:variables
}
