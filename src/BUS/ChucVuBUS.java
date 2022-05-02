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

    public ChucVuDTO getItemByID(String id) {
        for (ChucVuDTO item : listChucVu) {
            if (item.getMaCV().equals(id)) {
                return item;
            }
        }
        return null;
    }

    public ChucVuDTO getItemByName(String name) {
        for (ChucVuDTO item : listChucVu) {
            if (item.getTenCV().equals(name)) {
                return item;
            }
        }
        return null;
    }

    public ArrayList<ChucVuDTO> getData() {
        return listChucVu;
    }

    public void printData() {
        for (ChucVuDTO chucVu : listChucVu) {
            System.out.println(chucVu.toString()); // in ra terminal
        }
    }
}
