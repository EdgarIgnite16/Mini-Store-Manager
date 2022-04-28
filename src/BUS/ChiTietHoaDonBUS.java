package BUS;

import DAO.ChiTietHoaDonDAO;
import DTO.ChiTietHoaDonDTO;

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
    public ChiTietHoaDonDTO getItemByMaHD(String maHD) {
        for (ChiTietHoaDonDTO item : listMatHangMua) {
            if (item.getMaHD().equals(maHD)) {
                return item;
            }
        }
        return null;
    }

    public ArrayList<ChiTietHoaDonDTO> getData() {
        // lấy dữ liệu
        return listMatHangMua;
    }

    public void printData() {
        for (ChiTietHoaDonDTO chiTietHoaDonDTO : listMatHangMua) {
            System.out.println(chiTietHoaDonDTO.toString()); // in ra terminal
        }
    }

    // =================================================================================== //
    // thực hiện hàm insert
    public void insert(ChiTietHoaDonDTO chiTietHoaDonDTO) throws Exception {
        if(chiTietHoaDonDTO != null) {
            ChiTietHoaDonDAO chiTietHoaDonDAO = new ChiTietHoaDonDAO();
            chiTietHoaDonDAO.insert(chiTietHoaDonDTO);
        }
    }

}
