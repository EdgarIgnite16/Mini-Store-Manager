package BUS;

import DAO.PhieuGiamGiaDAO;
import DTO.PhieuGiamGiaDTO;

import java.util.ArrayList;

public class PhieuGiamGiaBUS {
    private ArrayList<PhieuGiamGiaDTO> listPhieuGiamGia;

    public PhieuGiamGiaBUS() {
        try {
            listPhieuGiamGia = new PhieuGiamGiaDAO().getData(); // lấy dữ liệu từ Database thông qua DAO
        } catch (Exception ex) {
            System.out.printf("Đã xảy ra lỗi: %s\n", ex.getMessage());
            ex.printStackTrace();
        }
    }

    public PhieuGiamGiaDTO getItemByName(String name) {
        for (PhieuGiamGiaDTO item : listPhieuGiamGia) {
            if (item.getTenGiamGia().equals(name)) {
                return item;
            }
        }
        return null;
    }

    public ArrayList<PhieuGiamGiaDTO> getData() {
        return listPhieuGiamGia;
    }

    public void printData() {
        for (PhieuGiamGiaDTO phieuGiamGia : listPhieuGiamGia) {
            System.out.println(phieuGiamGia.toString()); // in ra terminal
        }
    }
}
