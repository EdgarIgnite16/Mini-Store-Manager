/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package main.mini_store_manager_form;

/**
 *
 * @author edgar
 */
public class PanelPhieuNhapGUI extends javax.swing.JPanel {

    /**
     * Creates new form PanelPhieuNhapGUI
     */
    public PanelPhieuNhapGUI() {
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

        pnTimKiemPhieuNhap = new javax.swing.JPanel();
        lbMaPhieuNhap = new javax.swing.JLabel();
        lbNhaCungCap = new javax.swing.JLabel();
        lbNgayNhap = new javax.swing.JLabel();
        txtMaPhieuNhap = new javax.swing.JTextField();
        txtNhaCungCap = new javax.swing.JTextField();
        txtNgayNhap = new javax.swing.JTextField();
        btnLamMoi = new javax.swing.JButton();
        btnExportExcel = new javax.swing.JButton();
        btnTimKiem = new javax.swing.JButton();
        spDanhSachPhieuNhap = new javax.swing.JScrollPane();
        tbDanhSachPhieuNhap = new javax.swing.JTable();
        spChiTietPhieuNhap = new javax.swing.JScrollPane();
        tbChiTietPhieuNhap = new javax.swing.JTable();
        pnThanhToan = new javax.swing.JPanel();
        lbTongSoLuong = new javax.swing.JLabel();
        lbTongThanhTien = new javax.swing.JLabel();
        txtTongSoLuong = new javax.swing.JTextField();
        txtTongThanhTien = new javax.swing.JTextField();

        pnTimKiemPhieuNhap.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Thông tin phiếu nhập", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 13))); // NOI18N

        lbMaPhieuNhap.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        lbMaPhieuNhap.setText("Mã phiếu nhập:");

        lbNhaCungCap.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        lbNhaCungCap.setText("Nhà cung cấp:");

        lbNgayNhap.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        lbNgayNhap.setText("Ngày nhập: ");

        txtMaPhieuNhap.setEditable(false);
        txtMaPhieuNhap.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        txtMaPhieuNhap.setFocusCycleRoot(true);

        txtNhaCungCap.setEditable(false);
        txtNhaCungCap.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N

        txtNgayNhap.setEditable(false);
        txtNgayNhap.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N

        btnLamMoi.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        btnLamMoi.setText("Làm mới");
        btnLamMoi.setToolTipText("Làm mới lại form");
        btnLamMoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLamMoiActionPerformed(evt);
            }
        });

        btnExportExcel.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        btnExportExcel.setText("Export excel");
        btnExportExcel.setToolTipText("Làm mới lại form");
        btnExportExcel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExportExcelActionPerformed(evt);
            }
        });

        btnTimKiem.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        btnTimKiem.setText("Tìm kiếm");
        btnTimKiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimKiemActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnTimKiemPhieuNhapLayout = new javax.swing.GroupLayout(pnTimKiemPhieuNhap);
        pnTimKiemPhieuNhap.setLayout(pnTimKiemPhieuNhapLayout);
        pnTimKiemPhieuNhapLayout.setHorizontalGroup(
            pnTimKiemPhieuNhapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnTimKiemPhieuNhapLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnTimKiemPhieuNhapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbMaPhieuNhap, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
                    .addComponent(lbNhaCungCap, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbNgayNhap, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnTimKiemPhieuNhapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNgayNhap)
                    .addComponent(txtMaPhieuNhap, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtNhaCungCap, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnTimKiemPhieuNhapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnLamMoi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnExportExcel, javax.swing.GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE)
                    .addComponent(btnTimKiem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        pnTimKiemPhieuNhapLayout.setVerticalGroup(
            pnTimKiemPhieuNhapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnTimKiemPhieuNhapLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnTimKiemPhieuNhapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbMaPhieuNhap)
                    .addComponent(txtMaPhieuNhap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnExportExcel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnTimKiemPhieuNhapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbNhaCungCap)
                    .addComponent(txtNhaCungCap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTimKiem))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnTimKiemPhieuNhapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbNgayNhap)
                    .addComponent(txtNgayNhap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLamMoi))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        spDanhSachPhieuNhap.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Danh sách phiếu nhập", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 13))); // NOI18N

        tbDanhSachPhieuNhap.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        spDanhSachPhieuNhap.setViewportView(tbDanhSachPhieuNhap);

        spChiTietPhieuNhap.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Chi tiết phiếu nhập", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 13))); // NOI18N

        tbChiTietPhieuNhap.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        spChiTietPhieuNhap.setViewportView(tbChiTietPhieuNhap);

        pnThanhToan.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Thanh toán", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 13))); // NOI18N

        lbTongSoLuong.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        lbTongSoLuong.setText("Tổng số lượng:");

        lbTongThanhTien.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        lbTongThanhTien.setText("Tổng thành tiền:");

        txtTongSoLuong.setEditable(false);
        txtTongSoLuong.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N

        txtTongThanhTien.setEditable(false);
        txtTongThanhTien.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N

        javax.swing.GroupLayout pnThanhToanLayout = new javax.swing.GroupLayout(pnThanhToan);
        pnThanhToan.setLayout(pnThanhToanLayout);
        pnThanhToanLayout.setHorizontalGroup(
            pnThanhToanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnThanhToanLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbTongSoLuong)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtTongSoLuong)
                .addGap(18, 18, 18)
                .addComponent(lbTongThanhTien)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtTongThanhTien)
                .addContainerGap())
        );
        pnThanhToanLayout.setVerticalGroup(
            pnThanhToanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnThanhToanLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnThanhToanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbTongSoLuong)
                    .addComponent(txtTongSoLuong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTongThanhTien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbTongThanhTien))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(spDanhSachPhieuNhap, javax.swing.GroupLayout.DEFAULT_SIZE, 563, Short.MAX_VALUE)
                    .addComponent(pnTimKiemPhieuNhap, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(spChiTietPhieuNhap, javax.swing.GroupLayout.DEFAULT_SIZE, 619, Short.MAX_VALUE)
                    .addComponent(pnThanhToan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(spChiTietPhieuNhap)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pnThanhToan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(pnTimKiemPhieuNhap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(spDanhSachPhieuNhap, javax.swing.GroupLayout.DEFAULT_SIZE, 541, Short.MAX_VALUE)))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnLamMoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLamMoiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnLamMoiActionPerformed

    private void btnExportExcelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExportExcelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnExportExcelActionPerformed

    private void btnTimKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimKiemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnTimKiemActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExportExcel;
    private javax.swing.JButton btnLamMoi;
    private javax.swing.JButton btnTimKiem;
    private javax.swing.JLabel lbMaPhieuNhap;
    private javax.swing.JLabel lbNgayNhap;
    private javax.swing.JLabel lbNhaCungCap;
    private javax.swing.JLabel lbTongSoLuong;
    private javax.swing.JLabel lbTongThanhTien;
    private javax.swing.JPanel pnThanhToan;
    private javax.swing.JPanel pnTimKiemPhieuNhap;
    private javax.swing.JScrollPane spChiTietPhieuNhap;
    private javax.swing.JScrollPane spDanhSachPhieuNhap;
    private javax.swing.JTable tbChiTietPhieuNhap;
    private javax.swing.JTable tbDanhSachPhieuNhap;
    private javax.swing.JTextField txtMaPhieuNhap;
    private javax.swing.JTextField txtNgayNhap;
    private javax.swing.JTextField txtNhaCungCap;
    private javax.swing.JTextField txtTongSoLuong;
    private javax.swing.JTextField txtTongThanhTien;
    // End of variables declaration//GEN-END:variables
}
