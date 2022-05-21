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

    // lấy đối tượng thông qua ID
    public PhieuGiamGiaDTO getItemById(String id) {
        for (PhieuGiamGiaDTO item : listPhieuGiamGia) {
            if (item.getMaGiamGia().equals(id)) {
                return item;
            }
        }
        return null;
    }

    // lấy đối tượng thông qua tên
    public PhieuGiamGiaDTO getItemByName(String name) {
        for (PhieuGiamGiaDTO item : listPhieuGiamGia) {
            if (item.getTenGiamGia().equals(name)) {
                return item;
            }
        }
        return null;
    }

    // lấy toàn bộ dữ liệu
    public ArrayList<PhieuGiamGiaDTO> getData() {
        return listPhieuGiamGia;
    }

    // in toàn bộ dữ liệu
    public void printData() {
        for (PhieuGiamGiaDTO phieuGiamGia : listPhieuGiamGia) {
            System.out.println(phieuGiamGia.toString()); // in ra terminal
        }
    }
}
