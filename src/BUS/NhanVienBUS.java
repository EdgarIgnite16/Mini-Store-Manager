package BUS;

import DAO.NhanVienDAO;
import DTO.NhanVienDTO;

import java.util.ArrayList;

public class NhanVienBUS {
    private ArrayList<NhanVienDTO> listNhanVien;

    public NhanVienBUS() {
        try {
            listNhanVien = new NhanVienDAO().getData(); // lấy dữ liệu từ Database thông qua DAO
        } catch (Exception ex) {
            System.out.printf("Đã xảy ra lỗi: %s\n", ex.getMessage());
            ex.printStackTrace();
        }
    }

    public NhanVienDTO getItemByName(String name) {
        for (NhanVienDTO item : listNhanVien) {
            if (item.getTenNV().equals(name)) {
                return item;
            }
        }
        return null;
    }

    public NhanVienDTO getItemByID(String id) {
        for (NhanVienDTO item : listNhanVien) {
            if (item.getMaNV().equals(id)) {
                return item;
            }
        }
        return null;
    }

    public ArrayList<NhanVienDTO> getData() {
        return listNhanVien;
    }

    public void printData() {
        for (NhanVienDTO nhanVienDTO : listNhanVien) {
            System.out.println(nhanVienDTO.toString()); // in ra terminal
        }
    }

    public NhanVienDTO getNhanVienLogin(String username, String password) {
        for (NhanVienDTO user : listNhanVien) {
            if (user.getMaNV().trim().equals(username) && password.equals("12345")) {
                return user;
            }
        }
        return null;
    }

    // kiểm tra nhân viên có trạng thái offline hay không
    public boolean checkStatusIsClose(NhanVienDTO nhanVienDTO) {
        for(NhanVienDTO item : listNhanVien) {
            // nếu mặt hàng đã tồn tại và status của mặt hàng đó là 0
            if(item.getMaNV().equals(nhanVienDTO.getMaNV()) && item.getStatus() == 0) {
                return true;
            }
        }
        return false;
    }

    // =================================================================================== //
    // thực hiện hàm insert
    public boolean insertItem(NhanVienDTO nhanVienDTO) throws Exception {
        if (nhanVienDTO != null) {
            NhanVienDAO nhanVienDAO = new NhanVienDAO();
            return nhanVienDAO.insertItem(nhanVienDTO);
        }
        return false;
    }

    // thực hiện hàm update
    public boolean updateItem(NhanVienDTO nhanVienDTO) throws Exception {
        if (nhanVienDTO != null) {
            NhanVienDAO nhanVienDAO = new NhanVienDAO();
            return nhanVienDAO.updateItem(nhanVienDTO);
        }
        return false;
    }

    // thực hiện hàm updateChangeStatus
    public boolean updateChangeStatus(NhanVienDTO nhanVienDTO, int status) throws Exception {
        if (nhanVienDTO != null) {
            NhanVienDAO nhanVienDAO = new NhanVienDAO();
            return nhanVienDAO.updateChangeStatus(nhanVienDTO, status);
        }
        return false;
    }

    // thực hiện hàm delete
    public boolean deleteItem(NhanVienDTO nhanVienDTO) throws Exception {
        if (nhanVienDTO != null) {
            NhanVienDAO nhanVienDAO = new NhanVienDAO();
            return nhanVienDAO.deleteItem(nhanVienDTO);
        }
        return false;
    }
}

