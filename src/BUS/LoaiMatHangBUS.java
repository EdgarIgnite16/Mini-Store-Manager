package BUS;

import DAO.LoaiMatHangDAO;
import DTO.LoaiMatHangDTO;
import DTO.MatHangDTO;

import java.util.ArrayList;

public class LoaiMatHangBUS {
    private static ArrayList<LoaiMatHangDTO> listLoaiMatHang;

    public LoaiMatHangBUS() {
        try {
            listLoaiMatHang = new LoaiMatHangDAO().getData(); // lấy dữ liệu từ Database thông qua DAO
        } catch (Exception ex) {
            System.out.printf("Đã sảy ra lỗi: %s\n", ex.getMessage());
            ex.printStackTrace();
        }
    }

    public static LoaiMatHangDTO getItemByName(String name) {
        for(LoaiMatHangDTO item : listLoaiMatHang) {
            if(item.getTenLMH().equals(name)) {
                return item;
            }
        }
        return null;
    }

    public ArrayList<LoaiMatHangDTO> getData() {
        return listLoaiMatHang;
    }

    public void printData() {
        for (LoaiMatHangDTO loaiMatHang : listLoaiMatHang) {
            System.out.println(loaiMatHang.toString()); // in ra terminal
        }
    }
}
