package BUS;

import DAO.NhaCungCapDAO;
import DTO.NhaCungCapDTO;

import java.util.ArrayList;

public class NhaCungCapBUS {
    private ArrayList<NhaCungCapDTO> listNhaCungCap;

    public NhaCungCapBUS() {
        try {
            this.listNhaCungCap = new NhaCungCapDAO().getData(); // lấy dữ liệu từ Database thông qua DAO
        } catch (Exception ex) {
            System.out.printf("Đã sảy ra lỗi: %s\n", ex.getMessage());
            ex.printStackTrace();
        }
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
