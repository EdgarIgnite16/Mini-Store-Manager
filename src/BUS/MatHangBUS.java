package BUS;

import DAO.MatHangDAO;
import DTO.MatHangDTO;

import java.util.ArrayList;

public class MatHangBUS {
    private ArrayList<MatHangDTO> listMatHang;

    public MatHangBUS() {
        try {
            listMatHang = new MatHangDAO().getData();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public MatHangDTO getItemByName(String name) {
        for(MatHangDTO item : listMatHang) {
            if(item.getTenMH().equals(name)) {
                return item;
            }
        }
        return null;
    }

    public ArrayList<MatHangDTO> getData() {
        return listMatHang;
    }

    public void printData() {
        for (MatHangDTO item : listMatHang) {
            System.out.println(item.toString());
        }
    }
}
