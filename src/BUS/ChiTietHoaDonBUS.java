package BUS;

import DAO.ChiTietHoaDonDAO;
import DTO.ChiTietHoaDonDTO;
import DTO.MatHangDTO;

import java.util.ArrayList;

public class ChiTietHoaDonBUS {
    private ArrayList<ChiTietHoaDonDTO> listMatHangMua;

    public ChiTietHoaDonBUS() {
        try {
            listMatHangMua = new ChiTietHoaDonDAO().getData(); // lấy dữ liệu từ Database thông qua DAO
        } catch (Exception ex) {
            System.out.printf("Đã xảy ra lỗi: %s\n", ex.getMessage());
            ex.printStackTrace();
        }
    }

    // lấy đối tượng thông qua mã hoá đơn
    public ArrayList<ChiTietHoaDonDTO> getListItemByMaHD(String maHD) {
        ArrayList<ChiTietHoaDonDTO> list = new ArrayList<>();
        for (ChiTietHoaDonDTO item : listMatHangMua) {
            if (item.getMaHD().equals(maHD)) {
                list.add(item);
            }
        }
        return list;
    }

    // lấy toàn bộ dữ liệu
    public ArrayList<ChiTietHoaDonDTO> getData() {
        // lấy dữ liệu
        return listMatHangMua;
    }

    // in toàn bộ dữ liệu
    public void printData() {
        for (ChiTietHoaDonDTO chiTietHoaDonDTO : listMatHangMua) {
            System.out.println(chiTietHoaDonDTO.toString()); // in ra terminal
        }
    }

    // hàm tính toàn số lượng bán ra của một mặt hàng nhất định
    public int tinhTonhSLBan(String maMH) {
        int soLuong = 0;
        for (ChiTietHoaDonDTO item : listMatHangMua) {
            if (item.getMaMH().equals(maMH)) {
                soLuong += item.getSoLuong();
            }
        }

        return soLuong;
    }

    // hàm tính toàn thành tiền bán ra của một mặt hàng nhất định
    public float tinhTongThanhTien(String maMH, float thanhTien) {
        float tongTien = 0;
        for (ChiTietHoaDonDTO item : listMatHangMua) {
            if (item.getMaMH().equals(maMH)) {
                tongTien += thanhTien * item.getSoLuong();
            }
        }
        return tongTien;
    }

    // kiểm tra mặt hàng đã tồn tại trong chi tiết bán hàng hay chưa
    public boolean checkMatHangExist(MatHangDTO matHangDTO) {
        for (ChiTietHoaDonDTO item : listMatHangMua) {
            if (item.getMaMH().equals(matHangDTO.getMaMH())) {
                return true;
            }
        }
        return false;
    }

    // =================================================================================== //
    // thực hiện hàm insert
    public boolean insertItem(ChiTietHoaDonDTO chiTietHoaDonDTO) throws Exception {
        if (chiTietHoaDonDTO != null) {
            ChiTietHoaDonDAO chiTietHoaDonDAO = new ChiTietHoaDonDAO();
            return chiTietHoaDonDAO.insertItem(chiTietHoaDonDTO);
        }
        return false;
    }
}
