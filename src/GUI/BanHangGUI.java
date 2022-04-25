package GUI;

import BUS.LoaiMatHangBUS;
import BUS.MatHangBUS;
import BUS.PhieuGiamGiaBUS;
import BUS._MessageDialogHelper;
import DTO.HoaDonDTO;
import DTO.LoaiMatHangDTO;
import DTO.MatHangDTO;
import DTO.PhieuGiamGiaDTO;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class BanHangGUI extends javax.swing.JPanel {
    private MainFormGUI parentForm;
    private DefaultTableModel model_table;
    private DefaultComboBoxModel model_combox_PGG;
    private DefaultComboBoxModel model_combox_LQP;

    private ArrayList<MatHangDTO> listMatHangSelected = new ArrayList<>();;

    /**
     * Creates new form BanHangGUI
     */
    public BanHangGUI() {
        initComponents();
        initButtonFood();
        initGioHangTable();
        initLoaiSanPham();
        initMaGiamGia();
    }

    public void initButtonFood() {
        ArrayList<MatHangDTO> listFood = new MatHangBUS().getData();
        int colItem = 3;
        int rowItem = listFood.size() / colItem;

        pnSanPham.setLayout(new GridLayout(rowItem, colItem, 5, 5));
        for (MatHangDTO item : listFood) {
            JButton jButton = new JButton();
            String titleBtn = String.format(
                    "<html> %s <br> %.1f VNĐ </html>",
                    item.getTenMH(), item.getThanhTien());
            jButton.setText(titleBtn);
            jButton.setIcon(new ImageIcon("resource\\icon\\defaultIcon\\icons8_hamburger_64px.png"));
            jButton.setToolTipText(String.format("%s - %.2f VNĐ ", item.getTenMH(), item.getThanhTien()));
            jButton.setFocusable(false);
            jButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
            jButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
            jButton.setFont(new Font("Segoe UI", 0, 12));
            jButton.addActionListener(new ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    handleOnClickBtn(evt);
                }
            });
            pnSanPham.add(jButton);
        }
    }

    public void initGioHangTable() {
        String[] columnNames = new String[]{"Mã", "Tên", "Số lượng", "Thành tiền", "Giảm sp", "Xoá sp"};
        model_table = new DefaultTableModel();
        model_table.setColumnIdentifiers(columnNames);

        try {
            tbGioHang.setFont(new Font("Segoe UI", 0, 12));
            tbGioHang.setModel(model_table);
        } catch (Exception ex) {
            ex.printStackTrace();
            _MessageDialogHelper.showErrorDialog(parentForm, ex.getMessage(), "Error !");
        }
    }

    public void initMaGiamGia() {
        model_combox_PGG = new DefaultComboBoxModel();
        model_combox_PGG.addElement("---");
        ArrayList<PhieuGiamGiaDTO> listPhieuGiamGia = new PhieuGiamGiaBUS().getData();
        listPhieuGiamGia.forEach(item -> {
            model_combox_PGG.addElement(item.getTenGiamGia());
        });
        cboxMaGiamGia.setModel(model_combox_PGG);
    }

    public void initLoaiSanPham() {
        model_combox_LQP = new DefaultComboBoxModel();
        model_combox_LQP.addElement("---");
        ArrayList<LoaiMatHangDTO> listLoaiSanPham = new LoaiMatHangBUS().getData();
        listLoaiSanPham.forEach(item -> {
            model_combox_LQP.addElement(item.getTenLMH());
        });
        cboxLoaiSanPham.setModel(model_combox_LQP);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */

    private void initComponents() {

        pnTimKiem = new javax.swing.JPanel();
        lbTenSanPham = new javax.swing.JLabel();
        lbLoaiSanPham = new javax.swing.JLabel();
        txtTenSanPham = new javax.swing.JTextField();
        cboxLoaiSanPham = new javax.swing.JComboBox<>();
        spSanPham = new javax.swing.JScrollPane();
        pnSanPham = new javax.swing.JPanel();
        spGioHang = new javax.swing.JScrollPane();
        tbGioHang = new javax.swing.JTable();
        pnXulyGiohang = new javax.swing.JPanel();
        lbNVLapHD = new javax.swing.JLabel();
        lbNVLapHD_Res = new javax.swing.JLabel();
        lbNgayLap = new javax.swing.JLabel();
        lbSoLuong = new javax.swing.JLabel();
        lbTongHoaDon = new javax.swing.JLabel();
        lbMaGiamGia = new javax.swing.JLabel();
        txtNgayLap = new javax.swing.JTextField();
        txtSoLuong = new javax.swing.JTextField();
        txtTongHoaDon = new javax.swing.JTextField();
        cboxMaGiamGia = new javax.swing.JComboBox<>();
        btnHuyHoaDon = new javax.swing.JButton();
        btnLaphoaDon = new javax.swing.JButton();
        btnDanhSachHoaDon = new javax.swing.JButton();

        pnTimKiem.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Tìm kiếm sản phẩm", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 13))); // NOI18N

        lbTenSanPham.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        lbTenSanPham.setText("Tên sản phẩm: ");

        lbLoaiSanPham.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        lbLoaiSanPham.setText("Loại sản phẩm:");

        txtTenSanPham.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N

        cboxLoaiSanPham.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N

        javax.swing.GroupLayout pnTimKiemLayout = new javax.swing.GroupLayout(pnTimKiem);
        pnTimKiem.setLayout(pnTimKiemLayout);
        pnTimKiemLayout.setHorizontalGroup(
                pnTimKiemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(pnTimKiemLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(lbTenSanPham, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtTenSanPham, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE)
                                .addGap(30, 30, 30)
                                .addComponent(lbLoaiSanPham, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cboxLoaiSanPham, 0, 178, Short.MAX_VALUE)
                                .addGap(12, 12, 12))
        );
        pnTimKiemLayout.setVerticalGroup(
                pnTimKiemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(pnTimKiemLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(pnTimKiemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addGroup(pnTimKiemLayout.createSequentialGroup()
                                                .addGap(3, 3, 3)
                                                .addGroup(pnTimKiemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(lbTenSanPham, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(txtTenSanPham)))
                                        .addGroup(pnTimKiemLayout.createSequentialGroup()
                                                .addGap(4, 4, 4)
                                                .addGroup(pnTimKiemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(lbLoaiSanPham, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(cboxLoaiSanPham))))
                                .addContainerGap())
        );

        spSanPham.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Danh mục sản phẩm", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 13))); // NOI18N

        spSanPham.setViewportView(pnSanPham);

        spGioHang.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Giỏ hàng", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 13))); // NOI18N

        spGioHang.setViewportView(tbGioHang);

        pnXulyGiohang.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Xử lý giỏ hàng", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 13))); // NOI18N

        lbNVLapHD.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        lbNVLapHD.setText("Nhân viên lập hoá đơn: ");

        lbNVLapHD_Res.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbNVLapHD_Res.setText("Admin");

        lbNgayLap.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        lbNgayLap.setText("Ngày lập:");

        lbSoLuong.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        lbSoLuong.setText("Số lượng:");

        lbTongHoaDon.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        lbTongHoaDon.setText("Tổng hoá đơn: ");

        lbMaGiamGia.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        lbMaGiamGia.setText("Mã giảm giá:");

        txtNgayLap.setEditable(false);
        txtNgayLap.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N

        txtSoLuong.setEditable(false);
        txtSoLuong.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N

        txtTongHoaDon.setEditable(false);
        txtTongHoaDon.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N

        cboxMaGiamGia.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        cboxMaGiamGia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"Item 1", "Item 2", "Item 3", "Item 4"}));

        btnHuyHoaDon.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        btnHuyHoaDon.setIcon(new javax.swing.ImageIcon("resource\\icon\\Actions-edit-delete-icon-16.png")); // NOI18N
        btnHuyHoaDon.setText("Huỷ hoá đơn");
        btnHuyHoaDon.setPreferredSize(new java.awt.Dimension(130, 24));
        btnHuyHoaDon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHuyHoaDonActionPerformed(evt);
            }
        });

        btnLaphoaDon.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        btnLaphoaDon.setIcon(new javax.swing.ImageIcon("resource\\icon\\icons8-paid-bill-16 (1).png")); // NOI18N
        btnLaphoaDon.setText("Lập hoá đơn");
        btnLaphoaDon.setPreferredSize(new java.awt.Dimension(130, 24));
        btnLaphoaDon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLaphoaDonActionPerformed(evt);
            }
        });

        btnDanhSachHoaDon.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        btnDanhSachHoaDon.setIcon(new javax.swing.ImageIcon("resource\\icon\\icons8_bill_16px_1.png")); // NOI18N
        btnDanhSachHoaDon.setText("Danh sách hoá đơn");
        btnDanhSachHoaDon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDanhSachHoaDonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnXulyGiohangLayout = new javax.swing.GroupLayout(pnXulyGiohang);
        pnXulyGiohang.setLayout(pnXulyGiohangLayout);
        pnXulyGiohangLayout.setHorizontalGroup(
                pnXulyGiohangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnXulyGiohangLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(pnXulyGiohangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnXulyGiohangLayout.createSequentialGroup()
                                                .addComponent(lbNVLapHD)
                                                .addGap(18, 18, 18)
                                                .addComponent(lbNVLapHD_Res, javax.swing.GroupLayout.DEFAULT_SIZE, 196, Short.MAX_VALUE))
                                        .addGroup(pnXulyGiohangLayout.createSequentialGroup()
                                                .addGap(0, 0, Short.MAX_VALUE)
                                                .addGroup(pnXulyGiohangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(btnDanhSachHoaDon, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addGroup(pnXulyGiohangLayout.createSequentialGroup()
                                                                .addComponent(btnHuyHoaDon, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(btnLaphoaDon, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnXulyGiohangLayout.createSequentialGroup()
                                                .addGroup(pnXulyGiohangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(lbSoLuong, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(lbNgayLap, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(lbTongHoaDon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(lbMaGiamGia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                .addGap(12, 12, 12)
                                                .addGroup(pnXulyGiohangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(txtNgayLap)
                                                        .addComponent(cboxMaGiamGia, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(txtTongHoaDon, javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(txtSoLuong, javax.swing.GroupLayout.Alignment.TRAILING))))
                                .addContainerGap())
        );
        pnXulyGiohangLayout.setVerticalGroup(
                pnXulyGiohangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(pnXulyGiohangLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(pnXulyGiohangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(lbNVLapHD)
                                        .addComponent(lbNVLapHD_Res))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(pnXulyGiohangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(lbNgayLap)
                                        .addComponent(txtNgayLap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(pnXulyGiohangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(lbSoLuong)
                                        .addComponent(txtSoLuong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(pnXulyGiohangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(lbTongHoaDon)
                                        .addComponent(txtTongHoaDon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(pnXulyGiohangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lbMaGiamGia)
                                        .addComponent(cboxMaGiamGia, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(pnXulyGiohangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(btnHuyHoaDon, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnLaphoaDon, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnDanhSachHoaDon, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(spSanPham)
                                        .addComponent(pnTimKiem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(pnXulyGiohang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(spGioHang, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                                .addContainerGap())
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(pnTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(spSanPham))
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(spGioHang, javax.swing.GroupLayout.DEFAULT_SIZE, 383, Short.MAX_VALUE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(pnXulyGiohang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap())
        );
    }// </editor-fold>

    private void btnHuyHoaDonActionPerformed(java.awt.event.ActionEvent evt) {
        try {
            if(_MessageDialogHelper.showConfirmDialog(parentForm,
                    "Bạn có chắc là muốn xoá đi hoá đơn đang xử lí này ?", "Xoá hoá đơn đang xử lí") == JOptionPane.YES_OPTION) {
                if(!txtSoLuong.getText().equals("") || !txtTongHoaDon.getText().equals("") || !txtNgayLap.getText().equals("")) {
                    model_table.setRowCount(0); // reset table giỏ hàng
                    listMatHangSelected.clear(); // reset arrayList giỏ hàng
                    txtTongHoaDon.setText(""); // reset field hoá đơn
                    txtSoLuong.setText(""); // reset field số lượng
                    txtNgayLap.setText(""); // reset field ngày lập
                    cboxMaGiamGia.setSelectedIndex(0); // set lại combox

                    // reset lại các thông số: Số lượng, Thành tiền của từng mặt hàng đã xét trước đó
                    for(MatHangDTO item : new MatHangBUS().getData()) {
                        item.resetSoLuong();
                        item.resetThanhTien();
                    }
                } else {
                    _MessageDialogHelper.showErrorDialog(parentForm,
                            "Không có gì để xoá !", "Lỗi quá trình");
                }
            }
        } catch (Exception ex) {
            String errorLog = String.format("Đã có lỗi sảy ra!\nMã: %s", ex.getMessage());
            _MessageDialogHelper.showErrorDialog(parentForm, errorLog, "Lỗi khởi tạo hoá đơn");
        }
    }

    private void btnLaphoaDonActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void btnDanhSachHoaDonActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void handleOnClickBtn(java.awt.event.ActionEvent evt) {
        // lấy tên sản phẩm
        String actionComand = evt.getActionCommand();
        String[] slashArr = actionComand.split(" ");
        String name = "";
        for (String item : slashArr) {
            if (item.equals("<html>")) continue;
            if (item.equals("<br>")) {
                name = name.trim();
                break;
            }
            name = name.concat(String.format("%s ", item));
        }

        // xử lí chính
        MatHangDTO matHangDTO = MatHangBUS.getItemByName(name); // lấy đối tượng được chọn thông qua tên
        if(matHangDTO != null) {
            handleArraylistGioHang(matHangDTO); // xử lý tiến trình thêm sản phẩm vào giỏ hàng
            loadGioHang(); // load table giỏ hàng
            loadHoaDon(); // load hoá đơn
        } else {
            _MessageDialogHelper.showErrorDialog(parentForm,
                    "Mặt hàng bạn chọn không tồn tại", "Mặt hàng không tồn tại");
        }
    }


    public void handleArraylistGioHang(MatHangDTO matHangDTO) {
        try {
            if(checkItemExist(matHangDTO)) { // nếu sản phẩm đã tồn tại trong giỏ hàng
                int index = getIndexOfItem(matHangDTO); // lấy vị trí của sản phẩm hiện tại trong arrayList
                matHangDTO.increaseSoLuong(); // tăng số lượng sản phẩm trong giỏ hàng
                matHangDTO.increaseThanhTien(); // tăng tổng tiền sản phẩm trong giỏ hàng
                listMatHangSelected.set(index, matHangDTO); // cập nhật lại sản phẩm trong giỏ hàng
            } else { // nếu sản phẩm chưa tồn tại trong giỏ hàng
                matHangDTO.increaseSoLuong(); // tăng số lượng sản phẩm trong giỏ hàng
                matHangDTO.increaseThanhTien(); // tăng tổng tiền sản phẩm trong giỏ hàng
                listMatHangSelected.add(matHangDTO); // thêm mới sản phẩm vào giỏ hàng
            }
        } catch (Exception ex) {
            String errorLog = String.format("Đã có lỗi sảy ra!\nMã: %s", ex.getMessage());
            _MessageDialogHelper.showErrorDialog(parentForm, errorLog, "Lỗi nhập hoá đơn !");
        }
    }

    public boolean checkItemExist(MatHangDTO matHangDTO) {
        for(MatHangDTO item : listMatHangSelected) {
            if(item.getMaMH().equals(matHangDTO.getMaMH())) {
                return true;
            }
        }
        return false;
    }

    public int getIndexOfItem(MatHangDTO matHangDTO) {
        for(int i=0;i<listMatHangSelected.size();i++) {
            if(matHangDTO.getMaMH().equals(listMatHangSelected.get(i).getMaMH())) {
                return i;
            }
        }
        return -1;
    }

    public void loadGioHang() {
        model_table.setRowCount(0);
        for(MatHangDTO item : listMatHangSelected) {
            model_table.addRow(new Object[] {
                    item.getMaMH(),
                    item.getTenMH(),
                    item.soLuong_hientai,
                    item.thanhTien_hientai,
                    "null",
                    "null"
            });
        }
    }

    public void loadHoaDon() {
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        String ngayBan = dateFormat.format(new Date());
        float tongtien = 0;
        int soLuong = 0;

        for(MatHangDTO item : listMatHangSelected) {
            tongtien += item.thanhTien_hientai;
            soLuong += item.soLuong_hientai;
        }

        txtTongHoaDon.setText(String.valueOf(String.format("%s VNĐ", tongtien)));
        txtSoLuong.setText(String.valueOf(soLuong));
        txtNgayLap.setText(ngayBan);
    }

    // Variables declaration - do not modify
    private javax.swing.JButton btnDanhSachHoaDon;
    private javax.swing.JButton btnHuyHoaDon;
    private javax.swing.JButton btnLaphoaDon;
    private javax.swing.JComboBox<String> cboxLoaiSanPham;
    private javax.swing.JComboBox<String> cboxMaGiamGia;
    private javax.swing.JLabel lbLoaiSanPham;
    private javax.swing.JLabel lbMaGiamGia;
    private javax.swing.JLabel lbNVLapHD;
    private javax.swing.JLabel lbNVLapHD_Res;
    private javax.swing.JLabel lbNgayLap;
    private javax.swing.JLabel lbSoLuong;
    private javax.swing.JLabel lbTenSanPham;
    private javax.swing.JLabel lbTongHoaDon;
    private javax.swing.JPanel pnSanPham;
    private javax.swing.JPanel pnTimKiem;
    private javax.swing.JPanel pnXulyGiohang;
    private javax.swing.JScrollPane spGioHang;
    private javax.swing.JScrollPane spSanPham;
    private javax.swing.JTable tbGioHang;
    private javax.swing.JTextField txtTenSanPham;
    private javax.swing.JTextField txtTongHoaDon;
    private javax.swing.JTextField txtNgayLap;
    private javax.swing.JTextField txtSoLuong;
    // End of variables declaration
}
