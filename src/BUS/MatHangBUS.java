package BUS;

import DAO.MatHangDAO;
import DTO.MatHangDTO;

import java.util.ArrayList;

public class MatHangBUS {
    private static ArrayList<MatHangDTO> listMatHang;

    public MatHangBUS() {
        try {
            listMatHang = new MatHangDAO().getData();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public static MatHangDTO getItemByName(String name) {
        for(MatHangDTO item : listMatHang) {
            if(item.getTenMH().equals(name)) {
                return item;
            }
        }
        return null;
    }

    public static MatHangDTO getItemByLMH(String idLMH) {
        for(MatHangDTO item : listMatHang) {
            if(item.getMaLMH().equals(idLMH)) {
                return item;
            }
        }
        return null;
    }

    public static ArrayList<MatHangDTO> fillDataByName(String name) {
        ArrayList<MatHangDTO> listFillData = new ArrayList<>();
        for(MatHangDTO item : listMatHang) {
            if(item.getTenMH().contains(name)) {
                listFillData.add(item);
            }
        }
        return listFillData;
    }

    public static ArrayList<MatHangDTO> fillDataByIdLMH(String idLMH) {
        ArrayList<MatHangDTO> listFillData = new ArrayList<>();
        for(MatHangDTO item : listMatHang) {
            if(item.getMaLMH().contains(idLMH)) {
                listFillData.add(item);
            }
        }
        return listFillData;
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
