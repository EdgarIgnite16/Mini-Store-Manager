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

    // lấy đối tượng thông qua ID
    public KhachHangDTO getItemById(String id) {
        for (KhachHangDTO item : listKhachHang) {
            if (item.getMaKH().equals(id)) {
                return item;
            }
        }
        return null;
    }


    // lấy đối tượng thông qua tên
    public KhachHangDTO getItemByName(String name) {
        for (KhachHangDTO item : listKhachHang) {
            if (item.getTenKH().equals(name)) {
                return item;
            }
        }
        return null;
    }


    // lấy toàn bộ dữ liệu
    public ArrayList<KhachHangDTO> getData() {
        // trả về dữ liệu
        return listKhachHang;
    }

    // in toàn bộ dữ liệu
    public void printData() {
        for (KhachHangDTO khachHangDTO : listKhachHang) {
            System.out.println(khachHangDTO.toString()); // in ra terminal
        }
    }

    // kiểm tra khách hàng có trạng thái offline hay không
    public boolean checkStatusIsClose(KhachHangDTO khachHangDTO) {
        for (KhachHangDTO item : listKhachHang) {
            // nếu mặt hàng đã tồn tại và status của mặt hàng đó là 0
            if (item.getMaKH().equals(khachHangDTO.getMaKH()) && item.getStatus() == 0) {
                return true;
            }
        }
        return false;
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

    // thực hiện hàm updateChangeStatus
    public boolean updateChangeStatus(KhachHangDTO khachHangDTO, int status) throws Exception {
        if (khachHangDTO != null) {
            KhachHangDAO khachHangDAO = new KhachHangDAO();
            return khachHangDAO.updateChangeStatus(khachHangDTO, status);
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
