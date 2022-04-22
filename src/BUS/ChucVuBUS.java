package BUS;

import DAO.CaLamViecDAO;
import DAO.ChucVuDAO;
import DTO.CaLamViecDTO;
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

    public void getData() {
        for(ChucVuDTO chucVu : listChucVu) {
            System.out.println(chucVu.toString()); // in ra terminal
        }
    }
}
