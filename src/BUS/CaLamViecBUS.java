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

    // lấy đối tượng thông qua ID
    public CaLamViecDTO getItemByID(String id) {
        for (CaLamViecDTO item : listCaLamViec) {
            if (item.getMaCa().equals(id)) {
                return item;
            }
        }
        return null;
    }

    // lấy đối tượng thông qua tên
    public CaLamViecDTO getItemByName(String name) {
        for (CaLamViecDTO item : listCaLamViec) {
            if (item.getTenCa().equals(name)) {
                return item;
            }
        }
        return null;
    }

    // lấy toàn bộ dữ liệu
    public ArrayList<CaLamViecDTO> getData() {
        return listCaLamViec;
    }

    // in toàn bộ dữ liệu
    public void printData() {
        for (CaLamViecDTO caLam : listCaLamViec) {
            System.out.println(caLam.toString());  // in ra terminal
        }
    }
}
