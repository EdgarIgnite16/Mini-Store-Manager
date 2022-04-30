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
            if (user.getMaNV().equals(username) && password.equals("12345")) {
                return user;
            }
        }
        return null;
    }
}
