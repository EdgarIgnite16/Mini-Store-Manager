package BUS;

import DAO.NhaCungCapDAO;
import DTO.LoaiMatHangDTO;
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
    public NhaCungCapDTO getItemByID(String id) {
        for (NhaCungCapDTO item : listNhaCungCap) {
            if (item.getMaNCC().equals(id)) {
                return item;
            }
        }
        return null;
    }
    public NhaCungCapDTO getItemByName(String name) {
        for (NhaCungCapDTO item : listNhaCungCap) {
            if (item.getTenNCC().equals(name)) {
                return item;
            }
        }
        return null;
    }

    public ArrayList<NhaCungCapDTO> getData() {
        return listNhaCungCap;
    }

    public void printData() {
        for (NhaCungCapDTO nhaCungCap : listNhaCungCap) {
            System.out.println(nhaCungCap.toString()); // in ra terminal
        }
    }
}
