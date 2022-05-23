package BUS;

import DAO.NhaCungCapDAO;
import DTO.NhaCungCapDTO;

import java.util.ArrayList;

public class NhaCungCapBUS {
    private ArrayList<NhaCungCapDTO> listNhaCungCap;

    public NhaCungCapBUS() {
        try {
            listNhaCungCap = new NhaCungCapDAO().getData(); // lấy dữ liệu từ Database thông qua DAO
        } catch (Exception ex) {
            System.out.printf("Đã xảy ra lỗi: %s\n", ex.getMessage());
            ex.printStackTrace();
        }
    }

    // lấy đối tượng thông qua ID
    public NhaCungCapDTO getItemByID(String id) {
        for (NhaCungCapDTO item : listNhaCungCap) {
            if (item.getMaNCC().equals(id)) {
                return item;
            }
        }
        return null;
    }

    // lấy đối tượng thông qua tên
    public NhaCungCapDTO getItemByName(String name) {
        for (NhaCungCapDTO item : listNhaCungCap) {
            if (item.getTenNCC().equals(name)) {
                return item;
            }
        }
        return null;
    }

    // lấy toàn bộ dữ liệu
    public ArrayList<NhaCungCapDTO> getData() {
        return listNhaCungCap;
    }

    // in toàn bộ dữ liệu
    public void printData() {
        for (NhaCungCapDTO nhaCungCap : listNhaCungCap) {
            System.out.println(nhaCungCap.toString()); // in ra terminal
        }
    }
}
