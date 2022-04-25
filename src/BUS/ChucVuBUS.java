package BUS;

import DAO.ChucVuDAO;
import DTO.ChucVuDTO;

import java.util.ArrayList;

public class ChucVuBUS {
    private ArrayList<ChucVuDTO> listChucVu;

    public ChucVuBUS() {
        try {
            this.listChucVu = new ChucVuDAO().getData(); // lấy dữ liệu từ Database thông qua DAO
        } catch (Exception ex) {
            System.out.printf("Đã sảy ra lỗi: %s\n", ex.getMessage());
            ex.printStackTrace();
        }
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
