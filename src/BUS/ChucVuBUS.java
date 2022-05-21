package BUS;

import DAO.ChucVuDAO;
import DTO.ChucVuDTO;

import java.util.ArrayList;

public class ChucVuBUS {
    private ArrayList<ChucVuDTO> listChucVu;

    public ChucVuBUS() {
        try {
            listChucVu = new ChucVuDAO().getData(); // lấy dữ liệu từ Database thông qua DAO
        } catch (Exception ex) {
            System.out.printf("Đã xảy ra lỗi: %s\n", ex.getMessage());
            ex.printStackTrace();
        }
    }

    // lấy đối tượng thông qua ID
    public ChucVuDTO getItemByID(String id) {
        for (ChucVuDTO item : listChucVu) {
            if (item.getMaCV().equals(id)) {
                return item;
            }
        }
        return null;
    }

    // lấy đối tượng thông qua tên
    public ChucVuDTO getItemByName(String name) {
        for (ChucVuDTO item : listChucVu) {
            if (item.getTenCV().equals(name)) {
                return item;
            }
        }
        return null;
    }

    // lấy toàn bộ dữ liệu
    public ArrayList<ChucVuDTO> getData() {
        return listChucVu;
    }

    // in toàn bộ dữ liệu
    public void printData() {
        for (ChucVuDTO chucVu : listChucVu) {
            System.out.println(chucVu.toString()); // in ra terminal
        }
    }
}
