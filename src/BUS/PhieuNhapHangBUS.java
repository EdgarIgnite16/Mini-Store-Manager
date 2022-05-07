package BUS;

import DAO.PhieuNhapHangDAO;
import DTO.PhieuNhapHangDTO;
import java.util.ArrayList;

public class PhieuNhapHangBUS {
    private ArrayList<PhieuNhapHangDTO> listPhieuNhap;

    public PhieuNhapHangBUS() {
        try {
            listPhieuNhap = new PhieuNhapHangDAO().getData(); // lấy dữ liệu từ Database thông qua DAO
        } catch (Exception ex) {
            System.out.printf("Đã sảy ra lỗi: %s\n", ex.getMessage());
            ex.printStackTrace();
        }
    }

    public PhieuNhapHangDTO getItemByID(String id) {
        for (PhieuNhapHangDTO item : listPhieuNhap) {
            if (item.getMaPhieuNhap().equals(id)) {
                return item;
            }
        }
        return null;
    }

    public ArrayList<PhieuNhapHangDTO> getData() {
        // trả về dữ liệu
        return listPhieuNhap;
    }

    public void printData() {
        for (PhieuNhapHangDTO phieuNhapHangDTO : listPhieuNhap) {
            System.out.println(phieuNhapHangDTO.toString()); // in ra terminal
        }
    }

    // =================================================================================== //
    // thực hiện hàm insert
    public boolean insertItem(PhieuNhapHangDTO phieuNhapHangDTO) throws Exception {
        if (phieuNhapHangDTO != null) {
            PhieuNhapHangDAO phieuNhapHangDAO = new PhieuNhapHangDAO();
            return phieuNhapHangDAO.insertItem(phieuNhapHangDTO);
        }
        return false;
    }
}

