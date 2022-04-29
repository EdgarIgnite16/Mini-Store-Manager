package GUI;

import BUS.*;
import DTO.ChiTietHoaDonDTO;
import DTO.HoaDonDTO;
import DTO.KhachHangDTO;
import DTO.MatHangDTO;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class DialogChiTietHoaDonGUI extends javax.swing.JDialog {
    private DefaultTableModel model_table;
    private DefaultComboBoxModel model_cbKhachHang;

    /**
     * Creates new form ChiTietHoaDonDialogGUI
     */
    public DialogChiTietHoaDonGUI(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        initGioHangTable();
        initThongtin();
        initKhachHang();
    }

    public void initGioHangTable() {
        String[] columnNames = new String[]{"Mã SP", "Tên SP", "Số lượng", "Thành tiền (VNĐ)"};
        model_table = new DefaultTableModel();
        model_table.setColumnIdentifiers(columnNames);

        try {
            tbChiTietGioHang.setModel(model_table);
            tbChiTietGioHang.setFont(new Font("Segoe UI", 0, 12));
            tbChiTietGioHang.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
            for (MatHangDTO item : _SaveData.ChiTietHoaDon) {
                model_table.addRow(new Object[]{
                        item.getMaMH(),
                        item.getTenMH(),
                        item.soLuong_hientai,
                        item.thanhTien_hientai,
                });
            }
            tbChiTietGioHang.setDefaultEditor(Object.class, null);
            tbChiTietGioHang.setModel(model_table);
        } catch (Exception ex) {
            ex.printStackTrace();
            _MessageDialogHelper.showErrorDialog(this, ex.getMessage(), "Error !");
        }
    }

    public void initThongtin() {
        txtMaHoaDon.setText(_SaveData.maHD);
        txtTenNhanVien.setText(_SaveData.tenNV);
        txtNgayBan.setText(_SaveData.ngayBan);
        txtMaGiamGia.setText(_SaveData.maPhieuGiamGia);

        float tileGiam = (float) new PhieuGiamGiaBUS().getItemById(_SaveData.maPhieuGiamGia).getTiLeGiam();
        handleLoadTongTien(_SaveData.tongTien, tileGiam); // load thông tin đã được giảm giá lên ô thanh toán
    }

    public void initKhachHang() {
        model_cbKhachHang = new DefaultComboBoxModel();
        model_cbKhachHang.addElement("---");
        ArrayList<KhachHangDTO> listKhachHang = new KhachHangBUS().getData();
        for (KhachHangDTO item : listKhachHang) {
            if (!item.getMaKH().equals("---")) {
                model_cbKhachHang.addElement(String.format("%s-%s", item.getMaKH(), item.getTenKH()));
            }
        }
        cbTenKhachHang.setModel(model_cbKhachHang);
        cbTenKhachHang.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cbTenKhachHangActionListener();
            }
        });
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        pnThongTinHDChiTiet = new javax.swing.JPanel();
        lbMaHoaDon = new javax.swing.JLabel();
        lbNgayBan = new javax.swing.JLabel();
        lbTongHoaDon = new javax.swing.JLabel();
        lbTenNhanVien = new javax.swing.JLabel();
        lbTenKhachhang = new javax.swing.JLabel();
        lbMaGiamGia = new javax.swing.JLabel();
        txtMaHoaDon = new javax.swing.JTextField();
        txtNgayBan = new javax.swing.JTextField();
        txtTongHoaDon = new javax.swing.JTextField();
        cbTenKhachHang = new javax.swing.JComboBox<>();
        txtMaGiamGia = new javax.swing.JTextField();
        txtTenNhanVien = new javax.swing.JTextField();
        spChiTietGioHang = new javax.swing.JScrollPane();
        tbChiTietGioHang = new javax.swing.JTable();
        btnXacNhan = new javax.swing.JButton();
        btnThoat = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Chi tiết hoá đơn");
        setResizable(false);

        pnThongTinHDChiTiet.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Thông tin hoá đơn chi tiết", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 13))); // NOI18N

        lbMaHoaDon.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        lbMaHoaDon.setText("Mã hoá đơn");

        lbNgayBan.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        lbNgayBan.setText("Ngày bán: ");

        lbTongHoaDon.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        lbTongHoaDon.setText("Tổng hoá đơn:");

        lbTenNhanVien.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        lbTenNhanVien.setText("Tên nhân viên:");

        lbTenKhachhang.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        lbTenKhachhang.setText("Tên khách hàng:");

        lbMaGiamGia.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        lbMaGiamGia.setText("Mã giảm giá: ");

        txtMaHoaDon.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        txtMaHoaDon.setEnabled(false);

        txtNgayBan.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        txtNgayBan.setEnabled(false);

        txtTongHoaDon.setEditable(false);
        txtTongHoaDon.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N

        cbTenKhachHang.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N

        txtMaGiamGia.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        txtMaGiamGia.setEnabled(false);

        txtTenNhanVien.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        txtTenNhanVien.setEnabled(false);

        javax.swing.GroupLayout pnThongTinHDChiTietLayout = new javax.swing.GroupLayout(pnThongTinHDChiTiet);
        pnThongTinHDChiTiet.setLayout(pnThongTinHDChiTietLayout);
        pnThongTinHDChiTietLayout.setHorizontalGroup(
                pnThongTinHDChiTietLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(pnThongTinHDChiTietLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(pnThongTinHDChiTietLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(lbMaGiamGia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(lbMaHoaDon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(lbNgayBan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(pnThongTinHDChiTietLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtMaHoaDon, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                                        .addComponent(txtNgayBan)
                                        .addComponent(txtMaGiamGia, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(pnThongTinHDChiTietLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(lbTongHoaDon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(lbTenKhachhang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(lbTenNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(pnThongTinHDChiTietLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(cbTenKhachHang, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtTongHoaDon, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtTenNhanVien))
                                .addContainerGap())
        );
        pnThongTinHDChiTietLayout.setVerticalGroup(
                pnThongTinHDChiTietLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(pnThongTinHDChiTietLayout.createSequentialGroup()
                                .addGroup(pnThongTinHDChiTietLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(pnThongTinHDChiTietLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(txtMaHoaDon, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(lbMaHoaDon))
                                        .addGroup(pnThongTinHDChiTietLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(txtTenNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(lbTenNhanVien)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(pnThongTinHDChiTietLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(pnThongTinHDChiTietLayout.createSequentialGroup()
                                                .addGroup(pnThongTinHDChiTietLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(lbTenKhachhang)
                                                        .addComponent(cbTenKhachHang))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(pnThongTinHDChiTietLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(lbTongHoaDon)
                                                        .addComponent(txtTongHoaDon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(pnThongTinHDChiTietLayout.createSequentialGroup()
                                                .addGroup(pnThongTinHDChiTietLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(lbMaGiamGia)
                                                        .addComponent(txtMaGiamGia, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(pnThongTinHDChiTietLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(lbNgayBan)
                                                        .addComponent(txtNgayBan, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        spChiTietGioHang.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Chi tiết giỏ hàng", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 13))); // NOI18N
        spChiTietGioHang.setViewportView(tbChiTietGioHang);

        btnXacNhan.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        btnXacNhan.setText("Xác nhận");
        btnXacNhan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXacNhanActionPerformed(evt);
            }
        });

        btnThoat.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        btnThoat.setText("Thoát");
        btnThoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThoatActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(pnThongTinHDChiTiet, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addContainerGap())
                                        .addComponent(spChiTietGioHang, javax.swing.GroupLayout.DEFAULT_SIZE, 634, Short.MAX_VALUE)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addGap(0, 0, Short.MAX_VALUE)
                                                .addComponent(btnThoat)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(btnXacNhan)
                                                .addGap(9, 9, 9))))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(pnThongTinHDChiTiet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(spChiTietGioHang, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(btnThoat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnXacNhan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>


    private KhachHangDTO cbTenKhachHangActionListener() {
        String rawItem = (String) cbTenKhachHang.getSelectedItem();
        if (rawItem.equals("---")) { // trường hợp là khách vãng lại
            KhachHangDTO khachHangDTO = new KhachHangBUS().getItemById("---");
            return khachHangDTO;
        } else { // trường hợp là khách hàng real
            String[] Arr = rawItem.split("-");
            KhachHangDTO khachHangDTO = new KhachHangBUS().getItemById(Arr[0]);
            return khachHangDTO;
        }
    }

    private void btnThoatActionPerformed(java.awt.event.ActionEvent evt) {
        this.dispose();
    }

    private void btnXacNhanActionPerformed(java.awt.event.ActionEvent evt) {
        if (_MessageDialogHelper.showConfirmDialog(this, "Vui lòng kiểm tra lại các thông tin trong hoá đơn!\nBấm YES để tiến hành lập hoá đơn lên database.",
                "Kiểm tra thông tin hoá đơn") == JOptionPane.YES_OPTION) {

            // lấy hoá đơn
            String[] ar = txtTongHoaDon.getText().split(" ");
            HoaDonDTO hoaDonDTO = new HoaDonDTO();
            hoaDonDTO.setMaHD(_SaveData.maHD);
            hoaDonDTO.setMaNV(_SaveData.maNV);
            hoaDonDTO.setMaKH(cbTenKhachHangActionListener().getMaKH());
            hoaDonDTO.setMaGiamGia(_SaveData.maPhieuGiamGia);
            hoaDonDTO.setTongHoaDon(Float.parseFloat(ar[0]));
            hoaDonDTO.setNgayBan(_SaveData.ngayBan);
            handleHoaDon(hoaDonDTO); // gọi hàm xử lí hoá đơn

            // lấy chi tiết hoá đơn
            for (MatHangDTO item : _SaveData.ChiTietHoaDon) {
                ChiTietHoaDonDTO chiTietHoaDonDTO = new ChiTietHoaDonDTO();
                chiTietHoaDonDTO.setMaHD(_SaveData.maHD);
                chiTietHoaDonDTO.setMaMH(item.getMaMH());
                chiTietHoaDonDTO.setSoLuong(item.soLuong_hientai);
                handleChiTietHoaDon(chiTietHoaDonDTO); // gọi hàm xử lí chi tiết hoá đơn
            }

            // xử lí giảm số lượng mặt hàng trong mặt hàng tương ứng với số lượng đã bán ra
            for (MatHangDTO item : _SaveData.ChiTietHoaDon) {
                MatHangDTO matHangDTO = MatHangBUS.getItemByID(item.getMaMH());
                if (matHangDTO != null) {
                    matHangDTO.setSoLuong(matHangDTO.getSoLuong() - item.soLuong_hientai);
                    handleMatHang(matHangDTO); // gọi hàm xử lí mặt hàng
                }
            }

            // xử lí hoá đơn thanh toán thành công
            _MessageDialogHelper.showMessageDialog(this, "Lập hoá đơn thành công!", "Xử lí thành công");
            PanelBanHangGUI.hanleResetFormAndValue(); // load lại form

            // load lại các nút bấm sản phẩm & số lượng mặt hàng của mỗi mặt hàng
            PanelBanHangGUI.pnMatHang.removeAll();
            PanelBanHangGUI.pnMatHang.revalidate();
            PanelBanHangGUI.initButtonFood();
            PanelBanHangGUI.pnMatHang.repaint();
            this.dispose();
        }
    }


    //===================================================================================================//
    // hàm in số tiền đã được xử lí qua mã giảm giá
    public void handleLoadTongTien(float tongtien, float tileGiam) {
        // xử lí in ra tiền đã được xử lí qua mã giảm giá => chưa lưu thành tiền thực tế lên local
        tongtien = tongtien - (tongtien * tileGiam);
        txtTongHoaDon.setText(String.valueOf(String.format("%.2f VNĐ", tongtien))); // load lại tổng tiền thanh toán
    }

    // xử lí lưu hoá đơn lên database
    public void handleHoaDon(HoaDonDTO hoaDonDTO) {
        try {
            HoaDonBUS hoaDonBUS = new HoaDonBUS();
            hoaDonBUS.insert(hoaDonDTO);
        } catch (Exception ex) {
            String title = "Lỗi xử lí dữ liệu";
            String error = String.format("Đã có lỗi sảy ra!\nNội dung lỗi: %s", ex.getMessage());
            _MessageDialogHelper.showErrorDialog(this, error, title);
            ex.printStackTrace();
        }
    }

    // xử lí lưu chi tiết hoá đơn lên database
    public void handleChiTietHoaDon(ChiTietHoaDonDTO chiTietHoaDonDTO) {
        try {
            ChiTietHoaDonBUS chiTietHoaDonBUS = new ChiTietHoaDonBUS();
            chiTietHoaDonBUS.insert(chiTietHoaDonDTO);
        } catch (Exception ex) {
            String title = "Lỗi xử lí dữ liệu";
            String error = String.format("Đã có lỗi sảy ra!\nNội dung lỗi: %s", ex.getMessage());
            _MessageDialogHelper.showErrorDialog(this, error, title);
            ex.printStackTrace();
        }
    }

    // xử lí cập nhật số lượng mặt hàng lên database
    public void handleMatHang(MatHangDTO matHangDTO) {
        try {
            MatHangBUS matHangBUS = new MatHangBUS();
            matHangBUS.update(matHangDTO);
        } catch (Exception ex) {
            String title = "Lỗi xử lí dữ liệu";
            String error = String.format("Đã có lỗi sảy ra!\nNội dung lỗi: %s", ex.getMessage());
            _MessageDialogHelper.showErrorDialog(this, error, title);
            ex.printStackTrace();
        }
    }

    // Variables declaration - do not modify
    private javax.swing.JButton btnXacNhan;
    private javax.swing.JComboBox<String> cbTenKhachHang;
    private javax.swing.JLabel lbMaGiamGia;
    private javax.swing.JLabel lbMaHoaDon;
    private javax.swing.JLabel lbNgayBan;
    private javax.swing.JLabel lbTenKhachhang;
    private javax.swing.JLabel lbTenNhanVien;
    private javax.swing.JLabel lbTongHoaDon;
    private javax.swing.JPanel pnThongTinHDChiTiet;
    private javax.swing.JScrollPane spChiTietGioHang;
    private javax.swing.JTable tbChiTietGioHang;
    private javax.swing.JTextField txtMaGiamGia;
    private javax.swing.JTextField txtMaHoaDon;
    private javax.swing.JTextField txtNgayBan;
    private javax.swing.JTextField txtTenNhanVien;
    private javax.swing.JButton btnThoat;
    private javax.swing.JTextField txtTongHoaDon;
    // End of variables declaration
}
