package BUS;

import DAO.PhieuGiamGiaDAO;
import DTO.PhieuGiamGiaDTO;

import java.util.ArrayList;

public class PhieuGiamGiaBUS {
    private ArrayList<PhieuGiamGiaDTO> listPhieuGiamGia;

    public PhieuGiamGiaBUS() {
        try {
            this.listPhieuGiamGia = new PhieuGiamGiaDAO().getData(); // lấy dữ liệu từ Database thông qua DAO
        } catch (Exception ex) {
            System.out.printf("Đã sảy ra lỗi: %s\n", ex.getMessage());
            ex.printStackTrace();
        }
    }

    public void getData() {
        for(PhieuGiamGiaDTO phieuGiamGia : listPhieuGiamGia) {
            System.out.println(phieuGiamGia.toString()); // in ra terminal
        }
    }
}
