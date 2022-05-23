package BUS;

import DAO.ChiTietPhieuNhapDAO;
import DTO.ChiTietPhieuNhapDTO;

import java.util.ArrayList;

public class ChiTietPhieuNhapBUS {
    private ArrayList<ChiTietPhieuNhapDTO> listPhieuNhapMua;

    public ChiTietPhieuNhapBUS() {
        try {
            listPhieuNhapMua = new ChiTietPhieuNhapDAO().getData(); // lấy dữ liệu từ Database thông qua DAO
        } catch (Exception ex) {
            System.out.printf("Đã xảy ra lỗi: %s\n", ex.getMessage());
            ex.printStackTrace();
        }
    }

    // lấy đối tượng thông qua mã hoá đơn
    public ArrayList<ChiTietPhieuNhapDTO> getListItemByMaPN(String maPhieuNhap) {
        ArrayList<ChiTietPhieuNhapDTO> list = new ArrayList<>();
        for (ChiTietPhieuNhapDTO item : listPhieuNhapMua) {
            if (item.getMaPhieuNhap().equals(maPhieuNhap)) {
                list.add(item);
            }
        }
        return list;
    }

    // lấy toàn bộ dữ liệu
    public ArrayList<ChiTietPhieuNhapDTO> getData() {
        // lấy dữ liệu
        return listPhieuNhapMua;
    }

    // in toàn bộ dữ liệu
    public void printData() {
        for (ChiTietPhieuNhapDTO chiTietPhieuNhapDTO : listPhieuNhapMua) {
            System.out.println(chiTietPhieuNhapDTO.toString()); // in ra terminal
        }
    }

    // =================================================================================== //
    // thực hiện hàm insert
    public boolean insertItem(ChiTietPhieuNhapDTO chiTietPhieuNhapDTO) throws Exception {
        if (chiTietPhieuNhapDTO != null) {
            ChiTietPhieuNhapDAO chiTietPhieuNhapDAO = new ChiTietPhieuNhapDAO();
            return chiTietPhieuNhapDAO.insertItem(chiTietPhieuNhapDTO);
        }
        return false;
    }
}

