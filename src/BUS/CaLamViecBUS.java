package BUS;

import DAO.CaLamViecDAO;
import DTO.CaLamViecDTO;

import java.util.ArrayList;

public class CaLamViecBUS {
    private ArrayList<CaLamViecDTO> listCaLamViec;

    public CaLamViecBUS() {
        try {
            listCaLamViec = new CaLamViecDAO().getData(); // lấy dữ liệu từ Database thông qua DAO
        } catch (Exception ex) {
            System.out.printf("Đã xảy ra lỗi: %s\n", ex.getMessage());
            ex.printStackTrace();
        }
    }

    public CaLamViecDTO getItemByName(String name) {
        for (CaLamViecDTO item : listCaLamViec) {
            if (item.getTenCa().equals(name)) {
                return item;
            }
        }
        return null;
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
