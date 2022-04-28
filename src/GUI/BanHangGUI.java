package GUI;

import BUS.*;
import DTO.LoaiMatHangDTO;
import DTO.MatHangDTO;
import DTO.PhieuGiamGiaDTO;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class BanHangGUI extends javax.swing.JPanel {
    private static MainFormGUI parentForm;
    private static DefaultTableModel model_table;
    private DefaultComboBoxModel model_combox_PGG;
    private DefaultComboBoxModel model_combox_LQP;

    private static String ngayBan;
    private static float tongtien;
    private static int soLuong;
    private static ArrayList<MatHangDTO> listMatHangSelected;

    /**
     * Creates new form BanHangGUI
     */
    public BanHangGUI() {
        initComponents();
        initButtonFood();
        initGioHangTable();
        initLoaiSanPham();
        initMaGiamGia();
        listMatHangSelected = new ArrayList<>();
    }

    private static void loadButton(ArrayList<MatHangDTO> listFillData) {
        int colItem = 0, rowItem = 0;
        if (listFillData.size() / 4 < 1) {
            colItem = 4;
            rowItem = listFillData.size() / colItem + 2; // tránh trường hợp row < 1
        } else {
            colItem = 4;
            rowItem = listFillData.size() / colItem + 1; // tránh trường hợp row = 1
        }

        pnMatHang.setLayout(new GridLayout(rowItem, colItem, 4, 4));
        for (MatHangDTO item : listFillData) {
            JButton jButton = new JButton();
            String titleBtn = String.format(
                    "<html> %s <br> %.1f VNĐ </html>",
                    item.getTenMH(), item.getThanhTien());
            jButton.setText(titleBtn);
            jButton.setIcon(new ImageIcon("resource\\icon\\defaultIcon\\icons8_hamburger_80px.png"));
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
            pnMatHang.add(jButton);
        }
    }

    public static void initButtonFood() {
        ArrayList<MatHangDTO> listSP = new MatHangBUS().getData();
        loadButton(listSP);
    }

    public void initGioHangTable() {
        String[] columnNames = new String[]{"Mã SP", "Tên SP", "Số lượng", "Thành tiền (VNĐ)"};
        model_table = new DefaultTableModel();
        model_table.setColumnIdentifiers(columnNames);

        try {
            tbGioHang.setModel(model_table);
            tbGioHang.setFont(new Font("Segoe UI", 0, 12));
            tbGioHang.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
            tbGioHang.addMouseListener(new MouseListener() {
                @Override
                public void mouseClicked(MouseEvent e) {
                }

                @Override
                public void mousePressed(MouseEvent e) {
                    tbGioHangMousePressed();
                }

                @Override
                public void mouseEntered(MouseEvent e) {
                }

                @Override
                public void mouseExited(MouseEvent e) {
                }

                @Override
                public void mouseReleased(MouseEvent e) {
                }
            });
        } catch (Exception ex) {
            ex.printStackTrace();
            _MessageDialogHelper.showErrorDialog(parentForm, ex.getMessage(), "Error!");
        }
    }

    public void initMaGiamGia() {
        model_combox_PGG = new DefaultComboBoxModel();
        model_combox_PGG.addElement("---");
        ArrayList<PhieuGiamGiaDTO> listPhieuGiamGia = new PhieuGiamGiaBUS().getData();
        for (PhieuGiamGiaDTO item : listPhieuGiamGia) {
            if (item.getMaGiamGia().equals("NOTSHOCK")) {
                continue;
            } else {
                model_combox_PGG.addElement(item.getTenGiamGia());
            }
        }
        cboxMaGiamGia.setModel(model_combox_PGG);
        cboxMaGiamGia.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cboxMaGiamGiaActionListener(e);
            }
        });
    }

    public void initLoaiSanPham() {
        model_combox_LQP = new DefaultComboBoxModel();
        model_combox_LQP.addElement("---");
        ArrayList<LoaiMatHangDTO> listLoaiSanPham = new LoaiMatHangBUS().getData();
        listLoaiSanPham.forEach(item -> {
            model_combox_LQP.addElement(item.getTenLMH());
        });
        cboxLoaiMatHang.setModel(model_combox_LQP);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */

    private void initComponents() {

        pnTimKiem = new javax.swing.JPanel();
        lbTenMatHang = new javax.swing.JLabel();
        lbLoaiMatHang = new javax.swing.JLabel();
        txtTenMatHang = new javax.swing.JTextField();
        cboxLoaiMatHang = new javax.swing.JComboBox<>();
        btnLamMoi = new javax.swing.JButton();
        btnTimKiem = new javax.swing.JButton();
        spMatHang = new javax.swing.JScrollPane();
        pnMatHang = new javax.swing.JPanel();
        pnGioHang = new javax.swing.JPanel();
        spGioHang = new javax.swing.JScrollPane();
        tbGioHang = new javax.swing.JTable();
        btnXoaMH = new javax.swing.JButton();
        btnGiamMH = new javax.swing.JButton();
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

        pnTimKiem.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Quản lí danh mục mặt hàng ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 13))); // NOI18N

        lbTenMatHang.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        lbTenMatHang.setText("Tên mặt hàng:");

        lbLoaiMatHang.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        lbLoaiMatHang.setText("Loại mặt hàng:");

        txtTenMatHang.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N

        cboxLoaiMatHang.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N

        btnLamMoi.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        btnLamMoi.setText("Làm mới");
        btnLamMoi.setFocusable(false);
        btnLamMoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLamMoiActionPerformed(evt);
            }
        });

        btnTimKiem.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        btnTimKiem.setText("Tìm kiếm");
        btnTimKiem.setFocusable(false);
        btnTimKiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimKiemActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnTimKiemLayout = new javax.swing.GroupLayout(pnTimKiem);
        pnTimKiem.setLayout(pnTimKiemLayout);
        pnTimKiemLayout.setHorizontalGroup(
                pnTimKiemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(pnTimKiemLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(lbTenMatHang)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtTenMatHang, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(lbLoaiMatHang)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cboxLoaiMatHang, 0, 166, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(btnTimKiem)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnLamMoi)
                                .addContainerGap())
        );
        pnTimKiemLayout.setVerticalGroup(
                pnTimKiemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(pnTimKiemLayout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addGroup(pnTimKiemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(lbTenMatHang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtTenMatHang)
                                        .addComponent(lbLoaiMatHang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(cboxLoaiMatHang)
                                        .addComponent(btnLamMoi)
                                        .addComponent(btnTimKiem))
                                .addContainerGap())
        );

        spMatHang.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Danh mục mặt hàng", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 13))); // NOI18N

        pnMatHang.setLayout(new java.awt.GridLayout(1, 0));
        spMatHang.setViewportView(pnMatHang);

        pnGioHang.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Giỏ hàng", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 13))); // NOI18N

        spGioHang.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        spGioHang.setViewportView(tbGioHang);

        btnXoaMH.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        btnXoaMH.setText("Xoá mặt hàng");
        btnXoaMH.setFocusable(false);
        btnXoaMH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaMHActionPerformed(evt);
            }
        });

        btnGiamMH.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        btnGiamMH.setText("Giảm số lượng");
        btnGiamMH.setFocusable(false);
        btnGiamMH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGiamMHActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnGioHangLayout = new javax.swing.GroupLayout(pnGioHang);
        pnGioHang.setLayout(pnGioHangLayout);
        pnGioHangLayout.setHorizontalGroup(
                pnGioHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(spGioHang, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addGroup(pnGioHangLayout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnGiamMH)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnXoaMH)
                                .addContainerGap())
        );
        pnGioHangLayout.setVerticalGroup(
                pnGioHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(pnGioHangLayout.createSequentialGroup()
                                .addComponent(spGioHang, javax.swing.GroupLayout.DEFAULT_SIZE, 322, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(pnGioHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(btnXoaMH)
                                        .addComponent(btnGiamMH))
                                .addContainerGap())
        );

        pnXulyGiohang.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Xử lý giỏ hàng", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 13))); // NOI18N

        lbNVLapHD.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        lbNVLapHD.setText("Nhân viên lập hoá đơn:");

        lbNVLapHD_Res.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbNVLapHD_Res.setText(_SaveData.userLogin);

        lbNgayLap.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        lbNgayLap.setText("Ngày lập:");

        lbSoLuong.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        lbSoLuong.setText("Số lượng:");

        lbTongHoaDon.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        lbTongHoaDon.setText("Tổng hoá đơn:");

        lbMaGiamGia.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        lbMaGiamGia.setText("Mã giảm giá:");

        txtNgayLap.setEditable(false);
        txtNgayLap.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N

        txtSoLuong.setEditable(false);
        txtSoLuong.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N

        txtTongHoaDon.setEditable(false);
        txtTongHoaDon.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N

        cboxMaGiamGia.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N

        btnHuyHoaDon.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        btnHuyHoaDon.setIcon(new javax.swing.ImageIcon("resource\\icon\\Actions-edit-delete-icon-16.png")); // NOI18N
        btnHuyHoaDon.setText("Huỷ hoá đơn");
        btnHuyHoaDon.setFocusable(false);
        btnHuyHoaDon.setPreferredSize(new java.awt.Dimension(130, 24));
        btnHuyHoaDon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHuyHoaDonActionPerformed(evt);
            }
        });

        btnLaphoaDon.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        btnLaphoaDon.setIcon(new javax.swing.ImageIcon("resource\\icon\\icons8-paid-bill-16 (1).png")); // NOI18N
        btnLaphoaDon.setText("Lập hoá đơn");
        btnLaphoaDon.setFocusable(false);
        btnLaphoaDon.setPreferredSize(new java.awt.Dimension(130, 24));
        btnLaphoaDon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLaphoaDonActionPerformed(evt);
            }
        });

        btnDanhSachHoaDon.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        btnDanhSachHoaDon.setIcon(new javax.swing.ImageIcon("resource\\icon\\icons8_bill_16px_1.png")); // NOI18N
        btnDanhSachHoaDon.setText("Danh sách hoá đơn");
        btnDanhSachHoaDon.setFocusable(false);
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
                                                .addComponent(lbNVLapHD_Res, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnXulyGiohangLayout.createSequentialGroup()
                                                .addGroup(pnXulyGiohangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(lbSoLuong, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(lbTongHoaDon, javax.swing.GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE)
                                                        .addComponent(lbMaGiamGia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(lbNgayLap, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                .addGroup(pnXulyGiohangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(pnXulyGiohangLayout.createSequentialGroup()
                                                                .addGap(18, 18, 18)
                                                                .addGroup(pnXulyGiohangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(txtTongHoaDon, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(txtSoLuong, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(txtNgayLap, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                        .addGroup(pnXulyGiohangLayout.createSequentialGroup()
                                                                .addGap(18, 18, 18)
                                                                .addComponent(cboxMaGiamGia, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnXulyGiohangLayout.createSequentialGroup()
                                                .addGap(131, 131, 131)
                                                .addGroup(pnXulyGiohangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(btnDanhSachHoaDon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addGroup(pnXulyGiohangLayout.createSequentialGroup()
                                                                .addComponent(btnHuyHoaDon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(btnLaphoaDon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
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
                                        .addComponent(spMatHang)
                                        .addComponent(pnTimKiem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(pnXulyGiohang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(pnGioHang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                                                .addComponent(spMatHang))
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(pnGioHang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(pnXulyGiohang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap())
        );
    }// </editor-fold>

    private void btnLamMoiActionPerformed(java.awt.event.ActionEvent evt) {
        txtTenMatHang.setText("");
        cboxLoaiMatHang.setSelectedIndex(0);

        pnMatHang.removeAll();
        pnMatHang.revalidate();
        initButtonFood();
        pnMatHang.repaint();
    }

    private void btnTimKiemActionPerformed(java.awt.event.ActionEvent evt) {
        LoaiMatHangDTO loaiMatHangDTO = new LoaiMatHangBUS().getItemByName(String.valueOf(cboxLoaiMatHang.getSelectedItem()));
        String nameMH = txtTenMatHang.getText();
        String maLMH = loaiMatHangDTO != null ? loaiMatHangDTO.getMaLMH() : "";
        ArrayList<MatHangDTO> listFillData = MatHangBUS.fillData(nameMH, maLMH);

        pnMatHang.removeAll();
        pnMatHang.revalidate();
        loadButton(listFillData);
        pnMatHang.repaint();
    }

    private void btnGiamMHActionPerformed(java.awt.event.ActionEvent evt) {
        MatHangDTO matHangDTO = tbGioHangMousePressed();
        if (matHangDTO != null) {
            new DialogXoaGUI(new Frame(), true, matHangDTO).setVisible(true); // tạo form nhập số lượng xoá

            int soLuongxoa = _SaveData.soLuongXoa;
            int soLuong_HienTai = matHangDTO.soLuong_hientai;

            for (int i = 1; i <= soLuongxoa; i++) {
                if (i == soLuong_HienTai) break;
                MatHangBUS.decreaseSoLuong(matHangDTO); // giảm số lượng hiện tại trong giỏ hàng
                MatHangBUS.decreaseThanhTien(matHangDTO); // giảm thành tiền hiện tại trong giỏ hàng
                loadGioHang(); // load table giỏ hàng
                loadHoaDon(); // load hoá đơn
            }

            // reset lại số lượng xoá trong local
            _SaveData.soLuongXoa = 0;
            _SaveData.soLuongXoaToiDa = 0;
        }
    }

    private void btnXoaMHActionPerformed(java.awt.event.ActionEvent evt) {
        MatHangDTO matHangDTO = tbGioHangMousePressed();
        if (matHangDTO != null) {
            listMatHangSelected.remove(matHangDTO); // xoá mặt hàng đó ra khỏi giỏ hàng
            loadGioHang(); // load table giỏ hàng
            loadHoaDon(); // load hoá đơn
        }
    }

    private void btnHuyHoaDonActionPerformed(java.awt.event.ActionEvent evt) {
        try {
            if (_MessageDialogHelper.showConfirmDialog(parentForm,
                    "Bạn có chắc là muốn xoá đi hoá đơn đang xử lí này?", "Xoá hoá đơn đang xử lí") == JOptionPane.YES_OPTION) {
                hanleResetFormAndValue();
            }
        } catch (Exception ex) {
            String errorLog = String.format("Đã có lỗi xảy ra!\nMã: %s", ex.getMessage());
            _MessageDialogHelper.showErrorDialog(parentForm, errorLog, "Lỗi khởi tạo hoá đơn");
        }
    }

    private void btnLaphoaDonActionPerformed(java.awt.event.ActionEvent evt) {
         try {
             if(listMatHangSelected.size() > 0) {
                 PhieuGiamGiaDTO phieuGiamGiaDTO = new PhieuGiamGiaBUS().getItemByName(String.valueOf(cboxMaGiamGia.getSelectedItem()));
                NhanVienBUS nhanVienBUS = new NhanVienBUS();

                 // lưu các thông tin hoá đơn lên local
                 _SaveData.maHD = handleMHD();  // lấy mã hoá đơn
                 _SaveData.maPhieuGiamGia = phieuGiamGiaDTO.getMaGiamGia();  // lấy mã giảm giá
                 _SaveData.maNV = nhanVienBUS.getItemByName(lbNVLapHD_Res.getText()).getMaNV();  // lấy mã nhân viên
                 _SaveData.tenNV = lbNVLapHD_Res.getText(); // lấy tên nhân viên
                 _SaveData.ngayBan = txtNgayLap.getText(); // lấy ngày bán
                 _SaveData.ChiTietHoaDon = listMatHangSelected; // lấy chi tiết giỏ hàng

                 new ChiTietHoaDonDialogGUI(parentForm, true).setVisible(true); // Mở form xác nhận chi tiết hoá đơn lên
             } else {
                 _MessageDialogHelper.showErrorDialog(parentForm, "Giỏ hàng trống!\nVui lòng thêm sản phẩm vào giỏ hàng.", "Giỏ hàng trống");
             }
         } catch (Exception ex) {
             _MessageDialogHelper.showErrorDialog(parentForm,
                     String.format("Đã có lỗi xảy ra!Lỗi: %s", ex.getMessage()), "Something wrong");
         }
    }

    private void btnDanhSachHoaDonActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void cboxMaGiamGiaActionListener(ActionEvent e) {
        tongtien = _SaveData.tongTien; // lấy giá trị tổng hoá đơn trong local
        String name = String.valueOf(cboxMaGiamGia.getSelectedItem());
        PhieuGiamGiaDTO phieuGiamGiaDTO = new PhieuGiamGiaBUS().getItemByName(name);
        if (phieuGiamGiaDTO != null) {
            float tileGiam = (float) phieuGiamGiaDTO.getTiLeGiam();
            handleLoadTongTien(tongtien, tileGiam);
        } else {
            loadHoaDon(); // load lại hoá đơn nếu mã chọn ko tồn tại => load lại tiền ban đầu
        }
    }

    //===================================================================================================//
    // xử lí nút bấm của mặt hàng
    private static void handleOnClickBtn(java.awt.event.ActionEvent evt) {
        // lấy tên sản phẩm
        String name = "";
        String actionComand = evt.getActionCommand(); // lấy tên của nút bấm được bấm vào
        String[] hashArr = actionComand.split(" "); // băm name Button ra thành array => Mảng kí tự
        for (String item : hashArr) {
            if (item.equals("<html>")) continue;
            if (item.equals("<br>")) {
                name = name.trim();
                break;
            }
            name = name.concat(String.format("%s ", item));
        }

        // xử lí chính
        MatHangDTO matHangDTO = MatHangBUS.getItemByName(name); // lấy đối tượng được chọn thông qua tên
        if (matHangDTO != null) {
            handleArraylistGioHang(matHangDTO); // xử lý tiến trình thêm sản phẩm vào giỏ hàng
            loadGioHang(); // load table giỏ hàng
            loadHoaDon(); // load hoá đơn
        } else {
            _MessageDialogHelper.showErrorDialog(parentForm,
                    "Mặt hàng bạn chọn không tồn tại", "Mặt hàng không tồn tại");
        }
    }

    // bắt sự kiện xử lí mặt hàng trong giỏ hàng
    public static void handleArraylistGioHang(MatHangDTO matHangDTO) {
        try {
            if (checkItemExist(matHangDTO)) { // nếu sản phẩm đã tồn tại trong giỏ hàng
                if (!MatHangBUS.isFull(matHangDTO)) {
                    int index = getIndexOfItem(matHangDTO); // lấy vị trí của sản phẩm hiện tại trong giỏ hàng
                    MatHangBUS.increaseSoLuong(matHangDTO); // tăng số lượng sản phẩm trong giỏ hàng
                    MatHangBUS.increaseThanhTien(matHangDTO); // tăng tổng tiền sản phẩm trong giỏ hàng
                    listMatHangSelected.set(index, matHangDTO); // cập nhật lại sản phẩm trong giỏ hàng
//                    MatHangBUS.getDataItem(matHangDTO); // kiểm tra thônng tin qua terminal
                } else {
                    _MessageDialogHelper.showErrorDialog(parentForm, "Sản phẩm không còn hàng trong kho!", "Hết hàng");
                }
            } else { // nếu sản phẩm chưa tồn tại trong giỏ hàng
                if (!MatHangBUS.isFull(matHangDTO)) {
                    MatHangBUS.increaseSoLuong(matHangDTO); // tăng số lượng sản phẩm trong giỏ hàng
                    MatHangBUS.increaseThanhTien(matHangDTO); // tăng tổng tiền sản phẩm trong giỏ hàng
                    listMatHangSelected.add(matHangDTO); // thêm mới sản phẩm vào giỏ hàng
//                    MatHangBUS.getDataItem(matHangDTO); // kiểm tra thônng tin qua terminal
                } else {
                    _MessageDialogHelper.showErrorDialog(parentForm, "Sản phẩm không còn hàng trong kho!", "Hết hàng");
                }
            }
        } catch (Exception ex) {
            String errorLog = String.format("Đã có lỗi xảy ra!\nMã: %s", ex.getMessage());
            _MessageDialogHelper.showErrorDialog(parentForm, errorLog, "Lỗi nhập hoá đơn!");
        }
    }

    // kiểm tra hàng có tồn tại trong danh sách hàng đã chọn
    public static boolean checkItemExist(MatHangDTO matHangDTO) {
        for (MatHangDTO item : listMatHangSelected) {
            if (item.getMaMH().equals(matHangDTO.getMaMH())) {
                return true;
            }
        }
        return false;
    }

    // lấy vị trí mặt hàng đã chọn trong danh sách mặt hàng đã chọn
    public static int getIndexOfItem(MatHangDTO matHangDTO) {
        for (int i = 0; i < listMatHangSelected.size(); i++) {
            if (matHangDTO.getMaMH().equals(listMatHangSelected.get(i).getMaMH())) {
                return i;
            }
        }
        return -1;
    }

    // thực hiện load giỏ hàng
    public static void loadGioHang() {
        model_table.setRowCount(0);
        for (MatHangDTO item : listMatHangSelected) {

            model_table.addRow(new Object[]{
                    item.getMaMH(),
                    item.getTenMH(),
                    item.soLuong_hientai,
                    item.thanhTien_hientai,
            });
        }
        tbGioHang.setDefaultEditor(Object.class, null);
        tbGioHang.setModel(model_table);
    }

    // thực hiện load hoá đơn
    public static void loadHoaDon() {
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        ngayBan = dateFormat.format(new Date());
        tongtien = 0;
        soLuong = 0;

        for (MatHangDTO item : listMatHangSelected) {
            tongtien += item.thanhTien_hientai;
            soLuong += item.soLuong_hientai;
        }

        _SaveData.tongTien = tongtien; // lưu lại giá trị trong local => tiền này chưa được xử lí qua mã giảm giá

        // cập nhật thông tin lên text field
        txtTongHoaDon.setText(String.valueOf(String.format("%.2f VNĐ", tongtien)));
        txtSoLuong.setText(String.valueOf(soLuong));
        txtNgayLap.setText(ngayBan);

        String name = String.valueOf(cboxMaGiamGia.getSelectedItem());
        PhieuGiamGiaDTO phieuGiamGiaDTO = new PhieuGiamGiaBUS().getItemByName(name);
        if (phieuGiamGiaDTO != null) {
            // cập nhật phiếu giảm giá áp dụng khi bấm nút
            handleLoadTongTien(tongtien, (float) phieuGiamGiaDTO.getTiLeGiam());
        }
    }

    // lấy đối tượng mặt hàng khi ấn vào nút
    private MatHangDTO tbGioHangMousePressed() {
        try {
            int selectedRow = tbGioHang.getSelectedRow();
            String idMH = String.valueOf(tbGioHang.getValueAt(selectedRow, 0));
            return MatHangBUS.getItemByID(idMH);
        } catch (Exception ex) {
            _MessageDialogHelper.showErrorDialog(parentForm,
                    "Vui lòng chọn một dòng trong bảng dữ liệu!", "Yêu cầu chọn dữ liệu");
            return null;
        }
    }

    // xử lí phiếu giảm giá trên hoá đơn OnTime
    public static void handleLoadTongTien(float tongtien, float tileGiam) {
        // xử lí in ra tiền đã được xử lí qua mã giảm giá => chưa lưu thành tiền thực tế lên local
        tongtien = tongtien - (tongtien * tileGiam);
        txtTongHoaDon.setText(String.valueOf(String.format("%.2f VNĐ", tongtien))); // load lại tổng tiền thanh toán
    }

    // cắt chuỗi làm mã hoá đơn
    public String handleMHD() {
        String maHD = "HD";
        String[] arr = txtNgayLap.getText().split(" ");
        for (int i = 0; i < arr.length; i++) {
            if (i == 0) {
                String[] supArr = arr[i].split("-");
                for (String item : supArr) {
                    maHD = maHD.concat(item);
                }
            } else {
                String[] supArr = arr[i].split(":");
                for (String item : supArr) {
                    maHD = maHD.concat(item);
                }
            }
        }
        return maHD;
    }

    // reset lại tất cả form và value
    public static void hanleResetFormAndValue() {
        cboxMaGiamGia.setSelectedIndex(0); // set lại combox
        model_table.setRowCount(0); // reset table giỏ hàng
        listMatHangSelected.clear(); // reset arrayList giỏ hàng
        txtTongHoaDon.setText(""); // reset field hoá đơn
        txtSoLuong.setText(""); // reset field số lượng
        txtNgayLap.setText(""); // reset field ngày lập

        // reset lại các thông số trong local
        _SaveData.tongTien = 0; // reset giá trị trong local
        _SaveData.maPhieuGiamGia = ""; // reset mã giảm giá trong local
        _SaveData.maHD = ""; // reset mã hoá đơn trong local
        _SaveData.tenNV = ""; // reset tên nhân viên trong local
        _SaveData.ngayBan = ""; // reset ngày bán trong local
        _SaveData.ChiTietHoaDon = null; // reset lại chi tiết hoá đơn

        // reset lại các thông số: Số lượng, Thành tiền của từng mặt hàng đã xét trước đó
        for (MatHangDTO item : MatHangBUS.getData()) {
            MatHangBUS.resetSoLuong(item);
            MatHangBUS.resetThanhTien(item);
        }
    }

    // Variables declaration - do not modify
    private javax.swing.JButton btnDanhSachHoaDon;
    private javax.swing.JButton btnGiamMH;
    private javax.swing.JButton btnHuyHoaDon;
    private javax.swing.JButton btnLamMoi;
    private javax.swing.JButton btnLaphoaDon;
    private javax.swing.JButton btnTimKiem;
    private javax.swing.JButton btnXoaMH;
    private javax.swing.JComboBox<String> cboxLoaiMatHang;
    private static javax.swing.JComboBox<String> cboxMaGiamGia;
    private javax.swing.JLabel lbLoaiMatHang;
    private javax.swing.JLabel lbMaGiamGia;
    private javax.swing.JLabel lbNVLapHD;
    private javax.swing.JLabel lbNVLapHD_Res;
    private javax.swing.JLabel lbNgayLap;
    private javax.swing.JLabel lbSoLuong;
    private javax.swing.JLabel lbTenMatHang;
    private javax.swing.JLabel lbTongHoaDon;
    private javax.swing.JPanel pnGioHang;
    private static javax.swing.JPanel pnMatHang;
    private javax.swing.JPanel pnTimKiem;
    private javax.swing.JPanel pnXulyGiohang;
    private javax.swing.JScrollPane spGioHang;
    private javax.swing.JScrollPane spMatHang;
    private static javax.swing.JTable tbGioHang;
    private static javax.swing.JTextField txtNgayLap;
    private static javax.swing.JTextField txtSoLuong;
    private javax.swing.JTextField txtTenMatHang;
    private static javax.swing.JTextField txtTongHoaDon;
    // End of variables declaration
}
