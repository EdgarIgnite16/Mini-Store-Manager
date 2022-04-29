package GUI;

import BUS.HoaDonBUS;
import BUS.KhachHangBUS;
import BUS._MessageDialogHelper;
import BUS._SaveData;
import DTO.HoaDonDTO;
import DTO.KhachHangDTO;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

public class PanelKhachHangGUI extends javax.swing.JPanel {
    private DefaultTableModel modelTable_KH;
    private DefaultTableModel modelTable_HD;
    private ArrayList<HoaDonDTO> listHoaDon;

    /**
     * Creates new form PanelKhachHangGUI
     */
    public PanelKhachHangGUI() {
        initComponents();
        initTableKhachHang();
        initTableDonHang();
    }

    public void initTableKhachHang() {
        ArrayList<KhachHangDTO> listKH = new KhachHangBUS().getData();
        String[] columnNames = new String[]{"Mã KH", "Tên KH", "Số điện thoại"};
        modelTable_KH = new DefaultTableModel();
        modelTable_KH.setColumnIdentifiers(columnNames);

        try {
            tbDanhSachKhachHang.setFont(new Font("Segoe UI", 0, 12));
            tbDanhSachKhachHang.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
            for (KhachHangDTO item : listKH) {
                modelTable_KH.addRow(new Object[]{
                        item.getMaKH(),
                        item.getTenKH(),
                        item.getSdt()
                });
            }
            tbDanhSachKhachHang.setDefaultEditor(Object.class, null);
            tbDanhSachKhachHang.setModel(modelTable_KH);
        } catch (Exception ex) {
            ex.printStackTrace();
            _MessageDialogHelper.showErrorDialog(this, ex.getMessage(), "Error !");
        }
    }

    public void initTableDonHang() {
        String[] columnNames = new String[]{"Mã HD", "Mã NV", "Mã KH", "Mã giảm giá", "Tổng hoá đơn (VNĐ)", "Ngày bán"};
        modelTable_HD = new DefaultTableModel();
        modelTable_HD.setColumnIdentifiers(columnNames);

        try {
            tbLichSuGiaoDich.setFont(new Font("Segoe UI", 0, 12));
            tbLichSuGiaoDich.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
            tbLichSuGiaoDich.setDefaultEditor(Object.class, null);
            tbLichSuGiaoDich.setModel(modelTable_HD);
        } catch (Exception ex) {
            ex.printStackTrace();
            _MessageDialogHelper.showErrorDialog(this, ex.getMessage(), "Error !");
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        pnThongTinKhachHang = new javax.swing.JPanel();
        lbMaKhachHang = new javax.swing.JLabel();
        lbTenKhachHang = new javax.swing.JLabel();
        lbSoDienThoai = new javax.swing.JLabel();
        txtMaKhachHang = new javax.swing.JTextField();
        txtTenKhachHang = new javax.swing.JTextField();
        txtSoDienThoai = new javax.swing.JTextField();
        btnLamMoi = new javax.swing.JButton();
        btnTimKiem = new javax.swing.JButton();
        btnThem = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        btnXemCTHD = new javax.swing.JButton();
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
        btnLamMoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLamMoiActionPerformed(evt);
            }
        });

        btnTimKiem.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        btnTimKiem.setText("Tìm kiếm");
        btnTimKiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimKiemActionPerformed(evt);
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

        btnXemCTHD.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        btnXemCTHD.setText("CTHĐ");
        btnXemCTHD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXemCTHDActionPerformed(evt);
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
                                                        .addComponent(lbTenKhachHang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(lbSoDienThoai, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(lbMaKhachHang, javax.swing.GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE))
                                                .addGap(18, 18, 18)
                                                .addGroup(pnThongTinKhachHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(txtSoDienThoai)
                                                        .addComponent(txtMaKhachHang)
                                                        .addComponent(txtTenKhachHang)))
                                        .addGroup(pnThongTinKhachHangLayout.createSequentialGroup()
                                                .addGap(0, 0, Short.MAX_VALUE)
                                                .addComponent(btnLamMoi)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(btnTimKiem)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(btnSua, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(btnXemCTHD)))
                                .addContainerGap())
        );
        pnThongTinKhachHangLayout.setVerticalGroup(
                pnThongTinKhachHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(pnThongTinKhachHangLayout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addGroup(pnThongTinKhachHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(lbMaKhachHang)
                                        .addComponent(txtMaKhachHang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(pnThongTinKhachHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(lbTenKhachHang)
                                        .addComponent(txtTenKhachHang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(pnThongTinKhachHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(lbSoDienThoai)
                                        .addComponent(txtSoDienThoai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(pnThongTinKhachHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(btnXemCTHD)
                                        .addComponent(btnLamMoi)
                                        .addComponent(btnThem)
                                        .addComponent(btnXoa)
                                        .addComponent(btnSua)
                                        .addComponent(btnTimKiem))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        spDanhSachKhachHang.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Danh sách khách hàng", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 13))); // NOI18N

        tbDanhSachKhachHang.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {

            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {
                tbDanhSachKhachHangMouseListener(e);
            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });
        spDanhSachKhachHang.setViewportView(tbDanhSachKhachHang);

        spLichSuGiaoDich.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Lịch sử giao dịch", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 13))); // NOI18N

        tbLichSuGiaoDich.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {

            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {
                tbLichSuGiaoDichMouseListener(e);
            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });
        spLichSuGiaoDich.setViewportView(tbLichSuGiaoDich);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(spDanhSachKhachHang, javax.swing.GroupLayout.DEFAULT_SIZE, 570, Short.MAX_VALUE)
                                        .addComponent(pnThongTinKhachHang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(spLichSuGiaoDich, javax.swing.GroupLayout.DEFAULT_SIZE, 612, Short.MAX_VALUE)
                                .addContainerGap())
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(spLichSuGiaoDich, javax.swing.GroupLayout.DEFAULT_SIZE, 680, Short.MAX_VALUE)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(pnThongTinKhachHang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(spDanhSachKhachHang)))
                                .addContainerGap())
        );
    }// </editor-fold>


    private void btnXemCTHDActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void btnLamMoiActionPerformed(java.awt.event.ActionEvent evt) {
        txtMaKhachHang.setText(""); // refresh form mã khách hàng
        txtTenKhachHang.setText(""); // refresh form tên khách hàng
        txtSoDienThoai.setText(""); // refresh form số điện thoại
        tbDanhSachKhachHang.clearSelection(); // refresh selected danh sách khách hàng

        listHoaDon.clear(); // refresh form mã khách hàng
        loadHoaDon(); // load lại hoá đơn
    }

    private void btnTimKiemActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    //===================================================================================================//
    private void tbDanhSachKhachHangMouseListener(MouseEvent e) {
        int selectedRow = tbDanhSachKhachHang.getSelectedRow();
        String idKH = String.valueOf(tbDanhSachKhachHang.getValueAt(selectedRow, 0));
        KhachHangDTO khachHangDTO = new KhachHangBUS().getItemById(idKH);

        // load thông tin lên field
        txtMaKhachHang.setText(khachHangDTO.getMaKH());
        txtTenKhachHang.setText(khachHangDTO.getTenKH());
        txtSoDienThoai.setText(khachHangDTO.getSdt());

        // load lịch sử mua sắm lên tb
        this.listHoaDon = new HoaDonBUS().fillData(idKH);
        loadHoaDon(); // gọi lại hàm load Hoá đơn để load lại lịch sử mua hàng
    }

    private void tbLichSuGiaoDichMouseListener(MouseEvent e) {
        int selectedRow = tbLichSuGiaoDich.getSelectedRow();
        String idMH = String.valueOf(tbLichSuGiaoDich.getValueAt(selectedRow, 0));
    }

    private void loadHoaDon() {
        modelTable_HD.setRowCount(0);
        for (HoaDonDTO item : listHoaDon) {
            modelTable_HD.addRow(new Object[]{
                    item.getMaHD(),
                    item.getMaNV(),
                    item.getMaKH(),
                    item.getMaGiamGia(),
                    item.getTongHoaDon(),
                    item.getNgayBan()
            });
        }
        tbLichSuGiaoDich.setDefaultEditor(Object.class, null);
        tbLichSuGiaoDich.setModel(modelTable_HD);
    }

    // Variables declaration - do not modify
    private javax.swing.JButton btnLamMoi;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnTimKiem;
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
    // End of variables declaration
}
