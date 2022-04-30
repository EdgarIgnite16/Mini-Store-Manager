package BUS;

import DAO.KhachHangDAO;
import DTO.KhachHangDTO;

import java.util.ArrayList;

public class KhachHangBUS {
    private ArrayList<KhachHangDTO> listKhachHang;

    public KhachHangBUS() {
        try {
            listKhachHang = new KhachHangDAO().getData(); // lấy dữ liệu từ Database thông qua DAO
        } catch (Exception ex) {
            System.out.printf("Đã sảy ra lỗi: %s\n", ex.getMessage());
            ex.printStackTrace();
        }
    }

    public KhachHangDTO getItemByName(String name) {
        for (KhachHangDTO item : listKhachHang) {
            if (item.getTenKH().equals(name)) {
                return item;
            }
        }
        return null;
    }

    public KhachHangDTO getItemById(String id) {
        for (KhachHangDTO item : listKhachHang) {
            if (item.getMaKH().equals(id)) {
                return item;
            }
        }
        return null;
    }

    public ArrayList<KhachHangDTO> getData() {
        // trả về dữ liệu
        return listKhachHang;
    }

    public void printData() {
        for (KhachHangDTO khachHangDTO : listKhachHang) {
            System.out.println(khachHangDTO.toString()); // in ra terminal
        }
    }

    // =================================================================================== //
    // thực hiện hàm insert
    public boolean insertItem(KhachHangDTO khachHangDTO) throws Exception {
        if (khachHangDTO != null) {
            KhachHangDAO khachHangDAO = new KhachHangDAO();
            return khachHangDAO.insertItem(khachHangDTO);
        }
        return false;
    }

    // thực hiện hàm update
    public boolean updateItem(KhachHangDTO khachHangDTO) throws Exception {
        if (khachHangDTO != null) {
            KhachHangDAO khachHangDAO = new KhachHangDAO();
            return khachHangDAO.updateItem(khachHangDTO);
        }
        return false;
    }

    // thực hiện hàm delete
    public boolean deleteItem(KhachHangDTO khachHangDTO) throws Exception {
        if (khachHangDTO != null) {
            KhachHangDAO khachHangDAO = new KhachHangDAO();
            return khachHangDAO.deleteItem(khachHangDTO);
        }
        return false;
    }

}
