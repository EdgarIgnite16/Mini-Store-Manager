/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package main.mini_store_manager_form;

/**
 *
 * @author edgar
 */
public class PanelMatHangGUI extends javax.swing.JPanel {

    /**
     * Creates new form PanelMatHangGUI
     */
    public PanelMatHangGUI() {
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

        pnThongTinMatHang = new javax.swing.JPanel();
        lbMaMatHang = new javax.swing.JLabel();
        lbTenMatHang = new javax.swing.JLabel();
        lbThanhTien = new javax.swing.JLabel();
        lbSoLuong = new javax.swing.JLabel();
        lbLoaiMatHang = new javax.swing.JLabel();
        txtMaMatHang = new javax.swing.JTextField();
        txtTenMatHang = new javax.swing.JTextField();
        txtThanhTien = new javax.swing.JTextField();
        txtSoLuong = new javax.swing.JTextField();
        cbLoaiMatHang = new javax.swing.JComboBox<>();
        btnThem = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        btnLamMoi = new javax.swing.JButton();
        btnTimKiemMH = new javax.swing.JButton();
        pbThongKeBanHang = new javax.swing.JPanel();
        lbTittle = new javax.swing.JLabel();
        lbTongSLBan = new javax.swing.JLabel();
        lbThanhTienThu = new javax.swing.JLabel();
        lbPhanTramDoanhThu = new javax.swing.JLabel();
        lbAvatar = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        txtTongSLBan = new javax.swing.JTextField();
        txtThanhTienThu = new javax.swing.JTextField();
        txtPhanTramDoanhThu = new javax.swing.JTextField();
        spDanhSachMatHang = new javax.swing.JScrollPane();
        tbDanhSachMatHang = new javax.swing.JTable();

        pnThongTinMatHang.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Thông tin mặt hàng\n", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 13))); // NOI18N

        lbMaMatHang.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        lbMaMatHang.setText("Mã mặt hàng:");

        lbTenMatHang.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        lbTenMatHang.setText("Tên mặt hàng:");

        lbThanhTien.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        lbThanhTien.setText("Thành tiền");

        lbSoLuong.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        lbSoLuong.setText("Số lượng");

        lbLoaiMatHang.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        lbLoaiMatHang.setText("Loại mặt hàng:");

        txtMaMatHang.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N

        txtTenMatHang.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N

        txtThanhTien.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N

        txtSoLuong.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        txtSoLuong.setEnabled(false);

        cbLoaiMatHang.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        cbLoaiMatHang.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        btnThem.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        btnThem.setText("Thêm");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        btnXoa.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        btnXoa.setText("Xoá");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

        btnSua.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        btnSua.setText("Sửa");
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
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

        btnTimKiemMH.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        btnTimKiemMH.setText("Tìm kiếm");
        btnTimKiemMH.setToolTipText("Tìm kiếm hoá đơn thông qua mã hoá đơn.");
        btnTimKiemMH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimKiemMHActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnThongTinMatHangLayout = new javax.swing.GroupLayout(pnThongTinMatHang);
        pnThongTinMatHang.setLayout(pnThongTinMatHangLayout);
        pnThongTinMatHangLayout.setHorizontalGroup(
            pnThongTinMatHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnThongTinMatHangLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnThongTinMatHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnThongTinMatHangLayout.createSequentialGroup()
                        .addGroup(pnThongTinMatHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(pnThongTinMatHangLayout.createSequentialGroup()
                                .addGroup(pnThongTinMatHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(lbLoaiMatHang, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
                                    .addComponent(lbSoLuong, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(pnThongTinMatHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtSoLuong)
                                    .addComponent(cbLoaiMatHang, 0, 292, Short.MAX_VALUE))
                                .addGap(163, 163, 163))
                            .addComponent(btnLamMoi, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(116, 116, 116))
                    .addGroup(pnThongTinMatHangLayout.createSequentialGroup()
                        .addGroup(pnThongTinMatHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(lbThanhTien, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbTenMatHang, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
                            .addComponent(lbMaMatHang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnThongTinMatHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtMaMatHang, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 292, Short.MAX_VALUE)
                            .addComponent(txtThanhTien)
                            .addComponent(txtTenMatHang))
                        .addGap(18, 18, 18)
                        .addGroup(pnThongTinMatHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnTimKiemMH, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pnThongTinMatHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(btnXoa, javax.swing.GroupLayout.DEFAULT_SIZE, 92, Short.MAX_VALUE)
                                .addComponent(btnSua, javax.swing.GroupLayout.DEFAULT_SIZE, 92, Short.MAX_VALUE)
                                .addComponent(btnThem, javax.swing.GroupLayout.DEFAULT_SIZE, 92, Short.MAX_VALUE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        pnThongTinMatHangLayout.setVerticalGroup(
            pnThongTinMatHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnThongTinMatHangLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnThongTinMatHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbMaMatHang)
                    .addComponent(txtMaMatHang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnThem))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnThongTinMatHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbTenMatHang)
                    .addComponent(txtTenMatHang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnXoa))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnThongTinMatHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbThanhTien)
                    .addComponent(txtThanhTien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSua))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnThongTinMatHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbSoLuong)
                    .addComponent(txtSoLuong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnThongTinMatHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbLoaiMatHang)
                    .addComponent(cbLoaiMatHang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnThongTinMatHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLamMoi)
                    .addComponent(btnTimKiemMH))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pbThongKeBanHang.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Thống kế bán hàng của mặt hàng", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 13))); // NOI18N

        lbTittle.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbTittle.setText("Doanh thu tổng của mặt hàng");

        lbTongSLBan.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbTongSLBan.setText("Tổng số lượng bán ra: ");

        lbThanhTienThu.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbThanhTienThu.setText("Tổng thành tiền thu vào:");

        lbPhanTramDoanhThu.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbPhanTramDoanhThu.setText("Phần trăm doanh thu:");

        lbAvatar.setIcon(new javax.swing.ImageIcon("D:\\Workspace\\Mini-Store-Manager\\resource\\icon\\—Pngtree—best seller banner with _4823294.png")); // NOI18N

        txtTongSLBan.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtTongSLBan.setEnabled(false);

        txtThanhTienThu.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtThanhTienThu.setEnabled(false);

        txtPhanTramDoanhThu.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtPhanTramDoanhThu.setEnabled(false);

        javax.swing.GroupLayout pbThongKeBanHangLayout = new javax.swing.GroupLayout(pbThongKeBanHang);
        pbThongKeBanHang.setLayout(pbThongKeBanHangLayout);
        pbThongKeBanHangLayout.setHorizontalGroup(
            pbThongKeBanHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pbThongKeBanHangLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pbThongKeBanHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pbThongKeBanHangLayout.createSequentialGroup()
                        .addGroup(pbThongKeBanHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lbTittle, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pbThongKeBanHangLayout.createSequentialGroup()
                                .addGroup(pbThongKeBanHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(pbThongKeBanHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lbPhanTramDoanhThu, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lbThanhTienThu, javax.swing.GroupLayout.Alignment.TRAILING))
                                    .addComponent(lbTongSLBan, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(pbThongKeBanHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbAvatar)
                                    .addGroup(pbThongKeBanHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtTongSLBan, javax.swing.GroupLayout.DEFAULT_SIZE, 363, Short.MAX_VALUE)
                                        .addComponent(txtThanhTienThu)
                                        .addComponent(txtPhanTramDoanhThu)))))
                        .addGap(0, 2, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pbThongKeBanHangLayout.setVerticalGroup(
            pbThongKeBanHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pbThongKeBanHangLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbTittle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pbThongKeBanHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbTongSLBan)
                    .addComponent(txtTongSLBan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pbThongKeBanHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbThanhTienThu)
                    .addComponent(txtThanhTienThu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pbThongKeBanHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbPhanTramDoanhThu)
                    .addComponent(txtPhanTramDoanhThu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbAvatar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        spDanhSachMatHang.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Danh sách mặt hàng", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 13))); // NOI18N

        tbDanhSachMatHang.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        spDanhSachMatHang.setViewportView(tbDanhSachMatHang);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pbThongKeBanHang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnThongTinMatHang, javax.swing.GroupLayout.PREFERRED_SIZE, 563, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(spDanhSachMatHang, javax.swing.GroupLayout.DEFAULT_SIZE, 619, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(spDanhSachMatHang, javax.swing.GroupLayout.DEFAULT_SIZE, 680, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(pnThongTinMatHang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pbThongKeBanHang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnThemActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnXoaActionPerformed

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSuaActionPerformed

    private void btnLamMoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLamMoiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnLamMoiActionPerformed

    private void btnTimKiemMHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimKiemMHActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnTimKiemMHActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLamMoi;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnTimKiemMH;
    private javax.swing.JButton btnXoa;
    private javax.swing.JComboBox<String> cbLoaiMatHang;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lbAvatar;
    private javax.swing.JLabel lbLoaiMatHang;
    private javax.swing.JLabel lbMaMatHang;
    private javax.swing.JLabel lbPhanTramDoanhThu;
    private javax.swing.JLabel lbSoLuong;
    private javax.swing.JLabel lbTenMatHang;
    private javax.swing.JLabel lbThanhTien;
    private javax.swing.JLabel lbThanhTienThu;
    private javax.swing.JLabel lbTittle;
    private javax.swing.JLabel lbTongSLBan;
    private javax.swing.JPanel pbThongKeBanHang;
    private javax.swing.JPanel pnThongTinMatHang;
    private javax.swing.JScrollPane spDanhSachMatHang;
    private javax.swing.JTable tbDanhSachMatHang;
    private javax.swing.JTextField txtMaMatHang;
    private javax.swing.JTextField txtPhanTramDoanhThu;
    private javax.swing.JTextField txtSoLuong;
    private javax.swing.JTextField txtTenMatHang;
    private javax.swing.JTextField txtThanhTien;
    private javax.swing.JTextField txtThanhTienThu;
    private javax.swing.JTextField txtTongSLBan;
    // End of variables declaration//GEN-END:variables
}
