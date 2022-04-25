package BUS;

import DAO.NhaCungCapDAO;
import DTO.MatHangDTO;
import DTO.NhaCungCapDTO;

import java.util.ArrayList;

public class NhaCungCapBUS {
    private static ArrayList<NhaCungCapDTO> listNhaCungCap;

    public NhaCungCapBUS() {
        try {
            listNhaCungCap = new NhaCungCapDAO().getData(); // lấy dữ liệu từ Database thông qua DAO
        } catch (Exception ex) {
            System.out.printf("Đã sảy ra lỗi: %s\n", ex.getMessage());
            ex.printStackTrace();
        }
    }

    public static NhaCungCapDTO getItemByName(String name) {
        for(NhaCungCapDTO item : listNhaCungCap) {
            if(item.getTenNCC().equals(name)) {
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
