/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package main.mini_store_manager_form;

/**
 *
 * @author edgar
 */
public class PanelKhachHangGUI extends javax.swing.JPanel {

    /**
     * Creates new form PanelKhachHangGUI
     */
    public PanelKhachHangGUI() {
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

        pnThongTinKhachHang = new javax.swing.JPanel();
        lbMaKhachHang = new javax.swing.JLabel();
        lbTenKhachHang = new javax.swing.JLabel();
        lbSoDienThoai = new javax.swing.JLabel();
        txtMaKhachHang = new javax.swing.JTextField();
        txtTenKhachHang = new javax.swing.JTextField();
        txtSoDienThoai = new javax.swing.JTextField();
        btnLamMoi = new javax.swing.JButton();
        btnTimKiemHD = new javax.swing.JButton();
        btnTimKiemKH = new javax.swing.JButton();
        btnXemCTHD = new javax.swing.JButton();
        btnThem = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        spDanhSachKhachHang = new javax.swing.JScrollPane();
        tbDanhSachKhachHang = new javax.swing.JTable();
        spLichSuGiaoDich = new javax.swing.JScrollPane();
        tbLichSuGiaoDich = new javax.swing.JTable();

        pnThongTinKhachHang.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Thông tin khách hàng", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 13))); // NOI18N

        lbMaKhachHang.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        lbMaKhachHang.setText("Mã khách hàng: ");

        lbTenKhachHang.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        lbTenKhachHang.setText("Tên khách hàng");

        lbSoDienThoai.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        lbSoDienThoai.setText("Số điện thoại:");

        txtMaKhachHang.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N

        txtTenKhachHang.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N

        txtSoDienThoai.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N

        btnLamMoi.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        btnLamMoi.setText("Làm mới");
        btnLamMoi.setToolTipText("Làm mới lại form");
        btnLamMoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLamMoiActionPerformed(evt);
            }
        });

        btnTimKiemHD.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        btnTimKiemHD.setText("Tìm kiếm hoá đơn");
        btnTimKiemHD.setToolTipText("Tìm kiếm khách hàng thông qua mã khách hàng.");
        btnTimKiemHD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimKiemHDActionPerformed(evt);
            }
        });

        btnTimKiemKH.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        btnTimKiemKH.setText("Tìm kiếm khách hàng");
        btnTimKiemKH.setToolTipText("Tìm kiếm hoá đơn thông qua mã hoá đơn.");
        btnTimKiemKH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimKiemKHActionPerformed(evt);
            }
        });

        btnXemCTHD.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        btnXemCTHD.setText("Chi tiết hoá đơn");
        btnXemCTHD.setToolTipText("show chi tiết hoá đơn của hoá đơn đã chọn.");
        btnXemCTHD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXemCTHDActionPerformed(evt);
            }
        });

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

        javax.swing.GroupLayout pnThongTinKhachHangLayout = new javax.swing.GroupLayout(pnThongTinKhachHang);
        pnThongTinKhachHang.setLayout(pnThongTinKhachHangLayout);
        pnThongTinKhachHangLayout.setHorizontalGroup(
            pnThongTinKhachHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnThongTinKhachHangLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnThongTinKhachHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnThongTinKhachHangLayout.createSequentialGroup()
                        .addGroup(pnThongTinKhachHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lbMaKhachHang, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE)
                            .addComponent(lbSoDienThoai, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbTenKhachHang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(pnThongTinKhachHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtTenKhachHang, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE)
                            .addComponent(txtMaKhachHang)
                            .addComponent(txtSoDienThoai, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(18, 18, 18)
                        .addGroup(pnThongTinKhachHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnXoa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnThem, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnSua, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(pnThongTinKhachHangLayout.createSequentialGroup()
                        .addComponent(btnLamMoi, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnTimKiemKH, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnTimKiemHD, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnXemCTHD)))
                .addContainerGap())
        );
        pnThongTinKhachHangLayout.setVerticalGroup(
            pnThongTinKhachHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnThongTinKhachHangLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(pnThongTinKhachHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbMaKhachHang)
                    .addComponent(txtMaKhachHang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnThem))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnThongTinKhachHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbTenKhachHang)
                    .addComponent(txtTenKhachHang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnXoa))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnThongTinKhachHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbSoDienThoai)
                    .addComponent(txtSoDienThoai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSua))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnThongTinKhachHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnXemCTHD)
                    .addComponent(btnLamMoi)
                    .addComponent(btnTimKiemHD)
                    .addComponent(btnTimKiemKH))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        spDanhSachKhachHang.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Danh sách khách hàng", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 13))); // NOI18N

        tbDanhSachKhachHang.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        spDanhSachKhachHang.setViewportView(tbDanhSachKhachHang);

        spLichSuGiaoDich.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Lịch sử giao dịch", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 13))); // NOI18N

        tbLichSuGiaoDich.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        spLichSuGiaoDich.setViewportView(tbLichSuGiaoDich);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pnThongTinKhachHang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(spDanhSachKhachHang))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(spLichSuGiaoDich, javax.swing.GroupLayout.DEFAULT_SIZE, 619, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(pnThongTinKhachHang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(spDanhSachKhachHang, javax.swing.GroupLayout.DEFAULT_SIZE, 496, Short.MAX_VALUE))
                    .addComponent(spLichSuGiaoDich))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnXemCTHDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXemCTHDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnXemCTHDActionPerformed

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSuaActionPerformed

    private void btnLamMoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLamMoiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnLamMoiActionPerformed

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnThemActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnXoaActionPerformed

    private void btnTimKiemHDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimKiemHDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnTimKiemHDActionPerformed

    private void btnTimKiemKHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimKiemKHActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnTimKiemKHActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLamMoi;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnTimKiemHD;
    private javax.swing.JButton btnTimKiemKH;
    private javax.swing.JButton btnXemCTHD;
    private javax.swing.JButton btnXoa;
    private javax.swing.JLabel lbMaKhachHang;
    private javax.swing.JLabel lbSoDienThoai;
    private javax.swing.JLabel lbTenKhachHang;
    private javax.swing.JPanel pnThongTinKhachHang;
    private javax.swing.JScrollPane spDanhSachKhachHang;
    private javax.swing.JScrollPane spLichSuGiaoDich;
    private javax.swing.JTable tbDanhSachKhachHang;
    private javax.swing.JTable tbLichSuGiaoDich;
    private javax.swing.JTextField txtMaKhachHang;
    private javax.swing.JTextField txtSoDienThoai;
    private javax.swing.JTextField txtTenKhachHang;
    // End of variables declaration//GEN-END:variables
}
