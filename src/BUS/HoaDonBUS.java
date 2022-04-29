package BUS;

import DAO.HoaDonDAO;
import DTO.HoaDonDTO;

import java.util.ArrayList;

public class HoaDonBUS {
    private ArrayList<HoaDonDTO> listHoaDon;

    public HoaDonBUS() {
        try {
            listHoaDon = new HoaDonDAO().getData(); // lấy dữ liệu từ Database thông qua DAO
        } catch (Exception ex) {
            System.out.printf("Đã xảy ra lỗi: %s\n", ex.getMessage());
            ex.printStackTrace();
        }
    }

    // lấy đối tượng thông qua mã hoá đơn
    public HoaDonDTO getItemBymMaHD(String maHD) {
        for (HoaDonDTO item : listHoaDon) {
            if (item.getMaHD().equals(maHD)) {
                return item;
            }
        }
        return null;
    }

    // lấy đối tượng thông qua mã khách hàng
    public HoaDonDTO getItemByMaKH(String MaKH) {
        for (HoaDonDTO item : listHoaDon) {
            if (item.getMaKH().equals(MaKH)) {
                return item;
            }
        }
        return null;
    }

    // lấy đối tượng thông qua mã giảm giá
    public HoaDonDTO getItemByMaGiamGia(String maGiamGia) {
        for (HoaDonDTO item : listHoaDon) {
            if (item.getMaGiamGia().equals(maGiamGia)) {
                return item;
            }
        }
        return null;
    }

    public ArrayList<HoaDonDTO> getData() {
        // lấy dữ liệu
        return listHoaDon;
    }

    public void printData() {
        for (HoaDonDTO hoaDonDTO : listHoaDon) {
            System.out.println(hoaDonDTO.toString()); // in ra terminal
        }
    }

    // =================================================================================== //
    // thực hiện hàm insert
    public boolean insertItem(HoaDonDTO hoaDonDTO) throws Exception {
        if (hoaDonDTO != null) {
            HoaDonDAO hoaDonDAO = new HoaDonDAO();
            return hoaDonDAO.insertItem(hoaDonDTO);
        }
        return false;
    }
}
