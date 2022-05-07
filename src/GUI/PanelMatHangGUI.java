package GUI;

import BUS.*;
import DTO.*;

import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.File;
import java.util.ArrayList;

public class PanelMatHangGUI extends javax.swing.JPanel {
    private static MainFormGUI parentForm;
    private DefaultTableModel modelTable_MH;
    private DefaultComboBoxModel modelComboBox_LMH;

    /**
     * Creates new form PanelMatHangGUI
     */
    public PanelMatHangGUI() {
        initComponents();
        initTableMatHang();
        initLoaiMatHang();
    }

    private void initTableMatHang() {
        String[] columnNames = new String[]{"Mã MH", "Mã LMH", "Tên MH", "Thành tiền", "Số lượng", "Trạng thái"};
        modelTable_MH = new DefaultTableModel();
        modelTable_MH.setColumnIdentifiers(columnNames);

        try {
            tbDanhSachMatHang.setFont(new Font("Segoe UI", 0, 12));
            tbDanhSachMatHang.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
            tbDanhSachMatHang.setModel(modelTable_MH);
            loadMatHang(new MatHangBUS().getData()); // gọi lại hàm load table nhân viên để load lại table
            tbDanhSachMatHang.setDefaultEditor(Object.class, null);
            tbDanhSachMatHang.addMouseListener(new MouseListener() {
                @Override
                public void mouseClicked(MouseEvent e) {

                }

                @Override
                public void mousePressed(MouseEvent e) {

                }

                @Override
                public void mouseReleased(MouseEvent e) {
                    tbDanhSachMatHangMouseListener();
                }

                @Override
                public void mouseEntered(MouseEvent e) {

                }

                @Override
                public void mouseExited(MouseEvent e) {

                }
            });
        } catch (Exception ex) {
            ex.printStackTrace();
            _MessageDialogHelper.showErrorDialog(this, ex.getMessage(), "Error !");
        }
    }

    private void initLoaiMatHang() {
        modelComboBox_LMH = new DefaultComboBoxModel();
        modelComboBox_LMH.addElement("---");
        for (LoaiMatHangDTO item : new LoaiMatHangBUS().getData()) {
            modelComboBox_LMH.addElement(item.getTenLMH());
        }
        cbLoaiMatHang.setModel(modelComboBox_LMH);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
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
        btnExportExcel = new javax.swing.JButton();
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

        txtSoLuong.setEditable(false);
        txtSoLuong.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N

        cbLoaiMatHang.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N

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

        btnExportExcel.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        btnExportExcel.setText("Export Excel");
        btnExportExcel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExportExcelActionPerformed(evt);
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
                                                .addGroup(pnThongTinMatHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnThongTinMatHangLayout.createSequentialGroup()
                                                                .addGroup(pnThongTinMatHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                                        .addComponent(lbLoaiMatHang, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
                                                                        .addComponent(lbSoLuong, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                                                        .addGroup(pnThongTinMatHangLayout.createSequentialGroup()
                                                                .addComponent(btnLamMoi, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                                .addGroup(pnThongTinMatHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(txtSoLuong)
                                                        .addComponent(cbLoaiMatHang, 0, 292, Short.MAX_VALUE)
                                                        .addComponent(btnExportExcel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(btnTimKiemMH, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(169, 169, 169))
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
                                                .addGroup(pnThongTinMatHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(btnXoa, javax.swing.GroupLayout.DEFAULT_SIZE, 92, Short.MAX_VALUE)
                                                        .addComponent(btnSua, javax.swing.GroupLayout.DEFAULT_SIZE, 92, Short.MAX_VALUE)
                                                        .addComponent(btnThem, javax.swing.GroupLayout.DEFAULT_SIZE, 92, Short.MAX_VALUE))
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
                                        .addComponent(btnTimKiemMH)
                                        .addComponent(btnExportExcel))
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

        lbAvatar.setIcon(new javax.swing.ImageIcon("resource\\icon\\—Pngtree—best seller banner with _4823294.png")); // NOI18N

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
    }// </editor-fold>

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {
        StringBuilder sb = new StringBuilder();
        try {
            LoaiMatHangDTO loaiMatHangDTO = new LoaiMatHangBUS().getItemByName((String) cbLoaiMatHang.getSelectedItem());

            _DataValidator.validateEmpty(txtMaMatHang, sb, "Vui lòng nhập mã mặt hàng");
            _DataValidator.validateEmpty(txtTenMatHang, sb, "Vui lòng nhập tên mặt hàng");
            _DataValidator.validateEmpty(txtThanhTien, sb, "Vui lòng nhập thành tiền của mặt hàng");

            if(loaiMatHangDTO == null) {
                sb.append("Vui lòng chọn loại mặt hàng!\n");
            }

            if(sb.length() > 0) {
                _MessageDialogHelper.showErrorDialog(parentForm, String.valueOf(sb), "Vui lòng kiểm tra lại");
            } else {
                if(_MessageDialogHelper.showConfirmDialog(parentForm,
                        "Bạn có muốn thêm mới đối tượng này không", "Thêm đối tượng") == JOptionPane.YES_OPTION) {
                    // tạo mới đối tượng
                    MatHangDTO matHangDTO = new MatHangDTO();
                    matHangDTO.setMaMH(txtMaMatHang.getText());
                    matHangDTO.setTenMH(txtTenMatHang.getText());
                    matHangDTO.setThanhTien(Float.parseFloat(txtThanhTien.getText()));
                    matHangDTO.setSoLuong(1);

                    if(loaiMatHangDTO != null) {
                        matHangDTO.setMaLMH(loaiMatHangDTO.getMaLMH());
                    }

                    MatHangBUS matHangBUS = new MatHangBUS();
                    if(matHangBUS.insertItem(matHangDTO)) {
                        refreshData(); // làm mới lại dữ liệu trên form
                        _MessageDialogHelper.showMessageDialog(parentForm, "Thêm đối tượng thành công!", "Thêm thành công");
                    } else {
                        _MessageDialogHelper.showErrorDialog(parentForm, "Đối tượng đã tồn tại trong CSDL!", "Thêm thất bại");
                    }
                }
            }
        } catch (Exception ex) {
            // trong trường hợp CSDL đã có dữ liệu của đối tượng
            // hoặc sai text field
            ex.printStackTrace();
            _MessageDialogHelper.showErrorDialog(parentForm, "Thêm đối tượng thất bại!", "Failure Query Data");
        }
    }

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {
        MatHangDTO matHangDTO = tbDanhSachMatHangMouseListener();
        if(matHangDTO != null) {
            StringBuilder sb = new StringBuilder();
            try {
                LoaiMatHangDTO loaiMatHangDTO = new LoaiMatHangBUS().getItemByName((String) cbLoaiMatHang.getSelectedItem());

                _DataValidator.validateEmpty(txtMaMatHang, sb, "Vui lòng nhập mã mặt hàng");
                _DataValidator.validateEmpty(txtTenMatHang, sb, "Vui lòng nhập tên mặt hàng");
                _DataValidator.validateEmpty(txtThanhTien, sb, "Vui lòng nhập thành tiền của mặt hàng");

                if(loaiMatHangDTO == null) {
                    sb.append("Vui lòng chọn loại mặt hàng!\n");
                }

                if(sb.length() > 0) {
                    _MessageDialogHelper.showErrorDialog(parentForm, String.valueOf(sb), "Vui lòng kiểm tra lại");
                } else {
                    if(_MessageDialogHelper.showConfirmDialog(parentForm,
                            "Bạn có muốn xoá đối tượng này không", "Xoá đối tượng") == JOptionPane.YES_OPTION) {

                        MatHangBUS matHangBUS = new MatHangBUS();
                        if(matHangBUS.deleteItem(matHangDTO)) {
                            refreshData(); // làm mới lại dữ liệu trên form
                            _MessageDialogHelper.showMessageDialog(parentForm, "Xoá đối tượng thành công!", "Xoá thành công");
                        } else {
                            _MessageDialogHelper.showErrorDialog(parentForm, "Xoá đối tượng thất bại!", "Xoá thất bại");
                        }
                    }
                }
            } catch (Exception ex) {
                // trong trường hợp CSDL đã có dữ liệu của đối tượng
                // hoặc sai text field
                ex.printStackTrace();
                _MessageDialogHelper.showErrorDialog(parentForm, "Xoá đối tượng thất bại!", "Failure Query Data");
            }
        }
    }

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {
        StringBuilder sb = new StringBuilder();
        try {
            LoaiMatHangDTO loaiMatHangDTO = new LoaiMatHangBUS().getItemByName((String) cbLoaiMatHang.getSelectedItem());

            _DataValidator.validateEmpty(txtMaMatHang, sb, "Vui lòng nhập mã mặt hàng");
            _DataValidator.validateEmpty(txtTenMatHang, sb, "Vui lòng nhập tên mặt hàng");
            _DataValidator.validateEmpty(txtThanhTien, sb, "Vui lòng nhập thành tiền của mặt hàng");

            if(loaiMatHangDTO == null) {
                sb.append("Vui lòng chọn loại mặt hàng!\n");
            }

            if(sb.length() > 0) {
                _MessageDialogHelper.showErrorDialog(parentForm, String.valueOf(sb), "Vui lòng kiểm tra lại");
            } else {
                if(_MessageDialogHelper.showConfirmDialog(parentForm,
                        "Bạn có muốn thay đổi đối tượng này không", "Sửa đối tượng") == JOptionPane.YES_OPTION) {
                    // tạo mới đối tượng
                    MatHangDTO matHangDTO = new MatHangDTO();
                    matHangDTO.setMaMH(txtMaMatHang.getText());
                    matHangDTO.setTenMH(txtTenMatHang.getText());
                    matHangDTO.setThanhTien(Float.parseFloat(txtThanhTien.getText()));
                    matHangDTO.setSoLuong(1);

                    if(loaiMatHangDTO != null) {
                        matHangDTO.setMaLMH(loaiMatHangDTO.getMaLMH());
                    }

                    MatHangBUS matHangBUS = new MatHangBUS();
                    if(matHangBUS.updateItem(matHangDTO)) {
                        refreshData(); // làm mới lại dữ liệu trên form
                        _MessageDialogHelper.showMessageDialog(parentForm, "Sửa đối tượng thành công!", "Sửa thành công");
                    } else {
                        _MessageDialogHelper.showErrorDialog(parentForm, "Đối tượng đã tồn tại trong CSDL!", "Sửa thất bại");
                    }
                }
            }
        } catch (Exception ex) {
            // trong trường hợp CSDL đã có dữ liệu của đối tượng
            // hoặc sai text field
            ex.printStackTrace();
            _MessageDialogHelper.showErrorDialog(parentForm, "Sửa đối tượng thất bại!", "Failure Query Data");
        }
    }

    private void btnLamMoiActionPerformed(java.awt.event.ActionEvent evt) {
        refreshData();
    }

    private void btnTimKiemMHActionPerformed(java.awt.event.ActionEvent evt) {
        new DialogTimKiemGUI(new Frame(), true,"MH").setVisible(true); // mở form tìm kiếm
        MatHangDTO matHangDTO = _SaveData.matHangTimThay;
        if(matHangDTO != null) {
            ArrayList<MatHangDTO> listMatHang = new ArrayList<>();
            listMatHang.add(matHangDTO);

            loadMatHang(listMatHang); // khởi tạo lại table khách hàng

            // load các thông tin của mặt hàng lên text field
            loadForm(matHangDTO); // load form mặt hàng

            // reset lại data tìm kiếm trong local
            _SaveData.khachHangTimThay = null;
        }
    }

    private void btnExportExcelActionPerformed(java.awt.event.ActionEvent evt) {
        ArrayList<MatHangDTO> listMH = new MatHangBUS().getData();
        JFileChooser fc = new JFileChooser();
        fc.setDialogTitle("Chọn file Excel");
        fc.setAcceptAllFileFilterUsed(false);
        fc.addChoosableFileFilter(new FileNameExtensionFilter(".xlsx", "Microsoft Excel Documents"));
        int returnVal = fc.showSaveDialog(parentForm);
        if(returnVal == JFileChooser.APPROVE_OPTION) {
            File file = fc.getSelectedFile();
            String path = file.getAbsolutePath().concat(".xlsx");
            _ExportExcel.ExportMatHang(listMH, path); // truyền vào hàm để sử lí xuất excel

            // xuất thông báo
            _MessageDialogHelper.showMessageDialog(parentForm,
                    "Export excel thành công!", "Export thành công");
        }
    }

    //===================================================================================================//
    private MatHangDTO tbDanhSachMatHangMouseListener() {
        try {
            int selectedRow = tbDanhSachMatHang.getSelectedRow();
            String idMH = String.valueOf(tbDanhSachMatHang.getValueAt(selectedRow, 0));
            MatHangDTO matHangDTO = MatHangBUS.getItemByID(idMH);

            if(matHangDTO != null) {
                loadForm(matHangDTO); // load form mặt hàng
                return matHangDTO; // trả về khách hàng được nhấn vào
            }
            return null;
        } catch (Exception ex) {
            _MessageDialogHelper.showErrorDialog(parentForm,
                    "Vui lòng chọn một dòng trong danh sách mặt hàng!", "Yêu cầu chọn dữ liệu");
            return null;
        }
    }

    private void loadMatHang(ArrayList<MatHangDTO> listMatHang) {
        modelTable_MH.setRowCount(0);
        for (MatHangDTO item : listMatHang) {
            modelTable_MH.addRow(new Object[]{
                    item.getMaMH(),
                    item.getMaLMH(),
                    item.getTenMH(),
                    item.getThanhTien(),
                    item.getSoLuong(),
                    item.getStatus() == 1 ? "Còn hàng" : "Đã hết"
            });
        }
    }

    private void loadForm(MatHangDTO matHangDTO) {
        ChiTietHoaDonBUS chiTietHoaDonBUS = new ChiTietHoaDonBUS();
        HoaDonBUS hoaDonBUS = new HoaDonBUS();

        // load thông tin lên field
        txtMaMatHang.setText(matHangDTO.getMaMH());
        txtTenMatHang.setText(matHangDTO.getTenMH());
        txtSoLuong.setText(String.valueOf(matHangDTO.getSoLuong()));
        txtThanhTien.setText(String.valueOf(matHangDTO.getThanhTien()));
        cbLoaiMatHang.setSelectedItem(new LoaiMatHangBUS().getItemByID(matHangDTO.getMaLMH()).getTenLMH());

        // tính các giá trị để thêm vào tổng doanh thu
        int slBan = chiTietHoaDonBUS.tinhTonhSLBan(matHangDTO.getMaMH());
        float thanhTienThu = chiTietHoaDonBUS.tinhTongThanhTien(matHangDTO.getMaMH(), matHangDTO.getThanhTien());
        float phanTramDoanhThu = thanhTienThu / hoaDonBUS.tinhTongThanhTienAll();

        txtTongSLBan.setText(String.format("%d sản phẩm.", slBan));
        txtThanhTienThu.setText(String.format("%.2f VNĐ.", thanhTienThu));
        txtPhanTramDoanhThu.setText(String.format("%.2f%s tổng doanh thu cửa hàng.", phanTramDoanhThu * 100, "%"));
    }

    private void refreshData() {
        txtMaMatHang.setText(""); // refresh form mã khách hàng
        txtTenMatHang.setText(""); // refresh form tên khách hàng
        txtThanhTien.setText(""); // refresh form số điện thoại
        txtSoLuong.setText(""); // refresh selected danh sách khách hàng
        txtPhanTramDoanhThu.setText("");
        txtThanhTienThu.setText("");
        txtTongSLBan.setText("");
        cbLoaiMatHang.setSelectedIndex(0);

        // set Background
        txtMaMatHang.setBackground(Color.WHITE);
        txtTenMatHang.setBackground(Color.WHITE);
        txtThanhTien.setBackground(Color.WHITE);

        // set Foreground
        txtMaMatHang.setForeground(Color.BLACK);
        txtTenMatHang.setForeground(Color.BLACK);
        txtThanhTien.setForeground(Color.BLACK);

        loadMatHang(new MatHangBUS().getData()); // load lại khách hàng
    }

    // Variables declaration - do not modify
    private javax.swing.JButton btnExportExcel;
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
    // End of variables declaration
}
