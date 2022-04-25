package BUS;

import DAO.CaLamViecDAO;
import DTO.CaLamViecDTO;

import java.util.ArrayList;

public class CaLamViecBUS {
    private ArrayList<CaLamViecDTO> listCaLamViec;

    public CaLamViecBUS() {
        try {
            this.listCaLamViec = new CaLamViecDAO().getData(); // lấy dữ liệu từ Database thông qua DAO
        } catch (Exception ex) {
            System.out.printf("Đã sảy ra lỗi: %s\n", ex.getMessage());
            ex.printStackTrace();
        }
    }

    public ArrayList<CaLamViecDTO> getData() {
        return listCaLamViec;
    }

    public void printData() {
        for (CaLamViecDTO caLam : listCaLamViec) {
            System.out.println(caLam.toString());  // in ra terminal
        }
    }
}
