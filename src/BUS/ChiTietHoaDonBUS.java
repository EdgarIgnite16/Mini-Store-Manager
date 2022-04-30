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
    public ArrayList<ChiTietHoaDonDTO> getListItemByMaHD(String maHD) {
        ArrayList<ChiTietHoaDonDTO> list = new ArrayList<>();
        for (ChiTietHoaDonDTO item : listMatHangMua) {
            if (item.getMaHD().equals(maHD)) {
                list.add(item);
            }
        }
        return list;
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
    public boolean insertItem(ChiTietHoaDonDTO chiTietHoaDonDTO) throws Exception {
        if (chiTietHoaDonDTO != null) {
            ChiTietHoaDonDAO chiTietHoaDonDAO = new ChiTietHoaDonDAO();
            return chiTietHoaDonDAO.insertItem(chiTietHoaDonDTO);
        }
        return false;
    }

}
