package BUS;

import DAO.ChucVuDAO;
import DAO.NhaCungCapDAO;
import DTO.ChucVuDTO;
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

    public void getData() {
        for(NhaCungCapDTO nhaCungCap : listNhaCungCap) {
            System.out.println(nhaCungCap.toString()); // in ra terminal
        }
    }
}
