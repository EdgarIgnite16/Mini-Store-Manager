package BUS;

import DAO.MatHangDAO;
import DTO.MatHangDTO;

import java.util.ArrayList;

public class MatHangBUS {
    private ArrayList<MatHangDTO> listSanPham;

    public MatHangBUS() {
        try {
            listSanPham = new MatHangDAO().getDataTest();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public ArrayList<MatHangDTO> getData() {
        for(MatHangDTO item : listSanPham) {
            System.out.println(item.toString());
        }
        return listSanPham;
    }
}
