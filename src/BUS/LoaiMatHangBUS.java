package BUS;

import DAO.LoaiMatHangDAO;
import DTO.LoaiMatHangDTO;

import java.util.ArrayList;

public class LoaiMatHangBUS {
    private ArrayList<LoaiMatHangDTO> listLoaiMatHang;

    public LoaiMatHangBUS() {
        try {
            listLoaiMatHang = new LoaiMatHangDAO().getData(); // lấy dữ liệu từ Database thông qua DAO
        } catch (Exception ex) {
            System.out.printf("Đã xảy ra lỗi: %s\n", ex.getMessage());
            ex.printStackTrace();
        }
    }

    // tìm kiếm đối tượng thông qua id
    public LoaiMatHangDTO getItemByID(String id) {
        for (LoaiMatHangDTO item : listLoaiMatHang) {
            if (item.getMaLMH().equals(id)) {
                return item;
            }
        }
        return null;
    }

    // tìm kiếm đối tượng thông qua tên
    public LoaiMatHangDTO getItemByName(String name) {
        for (LoaiMatHangDTO item : listLoaiMatHang) {
            if (item.getTenLMH().equals(name)) {
                return item;
            }
        }
        return null;
    }

    // lấy toàn bộ dữ liệu
    public ArrayList<LoaiMatHangDTO> getData() {
        // trả về dữ liệu
        return listLoaiMatHang;
    }

    // in toàn bộ dữ liệu
    public void printData() {
        for (LoaiMatHangDTO loaiMatHang : listLoaiMatHang) {
            System.out.println(loaiMatHang.toString()); // in ra terminal
        }
    }

    // hàm xử lí lấy icon mặc định
    public static String getDefaultIcon(String maLMH) {
        String path;

        switch (maLMH) {
            case "BEAN" -> path = "res\\icon\\defaulticon\\icons8-java-bean-80.png";
            case "BEER" -> path = "res\\icon\\defaulticon\\icons8-beer-80.png";
            case "CAN" -> path = "res\\icon\\defaulticon\\icons8-tin-can-80.png";
            case "DRINK" -> path = "res\\icon\\defaulticon\\icons8-energy-drink-80.png";
            case "FRUIT" -> path = "res\\icon\\defaulticon\\icons8-group-of-fruits-80.png";
            case "HOUSEHOLD" -> path = "res\\icon\\defaulticon\\icons8-household-80.png";
            case "MILK" -> path = "res\\icon\\defaulticon\\icons8-milk-carton-80.png";
            case "RICE" -> path = "res\\icon\\defaulticon\\icons8-rice-bowl-80.png";
            case "SNACK" -> path = "res\\icon\\defaulticon\\icons8-snack-80.png";
            case "STUDIES" -> path = "res\\icon\\defaulticon\\icons8-studies-80.png";
            case "VEGATABLE" -> path = "res\\icon\\defaulticon\\icons8-group-of-vegetables-80.png";
            case "WATER" -> path = "res\\icon\\defaulticon\\icons8-bottle-of-water-80.png";
            default -> path = "res\\icon\\defaulticon\\icons8_question_mark_80px.png";
        }

        return path;
    }

    // hàm xử lí lấy mã mặt hàng mặc định
    public static String getMaMHDefault(String maLMH) {
        String maMH;

        switch (maLMH) {
            case "BEAN" -> maMH = "BEA";
            case "BEER" -> maMH = "BEE";
            case "CAN" -> maMH = "CAN";
            case "DRINK" -> maMH = "DRI";
            case "FRUIT" -> maMH = "FRU";
            case "HOUSEHOLD" -> maMH = "HOH";
            case "MILK" -> maMH = "MIL";
            case "RICE" -> maMH = "RIC";
            case "SNACK" -> maMH = "SNA";
            case "STUDIES" -> maMH = "STU";
            case "VEGATABLE" -> maMH = "VEG";
            case "WATER" -> maMH = "WAT";
            default -> maMH = "";
        }

        return maMH;
    }
}
