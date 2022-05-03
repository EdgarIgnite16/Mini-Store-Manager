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

    // tìm kiếm đối tượng thông qua tên
    public LoaiMatHangDTO getItemByName(String name) {
        for (LoaiMatHangDTO item : listLoaiMatHang) {
            if (item.getTenLMH().equals(name)) {
                return item;
            }
        }
        return null;
    }

    public ArrayList<LoaiMatHangDTO> getData() {
        // trả về dữ liệu
        return listLoaiMatHang;
    }

    public void printData() {
        for (LoaiMatHangDTO loaiMatHang : listLoaiMatHang) {
            System.out.println(loaiMatHang.toString()); // in ra terminal
        }
    }

    public static String getDefaultIcon(String maLMH) {
        String path;

        switch (maLMH) {
            case "BEAN" -> path = "resource\\icon\\defaulticon\\icons8-java-bean-80.png";
            case "BEER" -> path = "resource\\icon\\defaulticon\\icons8-beer-80.png";
            case "CAN" -> path = "resource\\icon\\defaulticon\\icons8-tin-can-80.png";
            case "DRINK" -> path = "resource\\icon\\defaulticon\\icons8-energy-drink-80.png";
            case "FRUIT" -> path = "resource\\icon\\defaulticon\\icons8-group-of-fruits-80.png";
            case "HOUSEHOLD" -> path = "resource\\icon\\defaulticon\\icons8-household-80.png";
            case "MILK" -> path = "resource\\icon\\defaulticon\\icons8-milk-carton-80.png";
            case "RICE" -> path = "resource\\icon\\defaulticon\\icons8-rice-bowl-80.png";
            case "SNACK" -> path = "resource\\icon\\defaulticon\\icons8-snack-80.png";
            case "STUDIES" -> path = "resource\\icon\\defaulticon\\icons8-studies-80.png";
            case "VEGATABLE" -> path = "resource\\icon\\defaulticon\\icons8-group-of-vegetables-80.png";
            case "WATER" -> path = "resource\\icon\\defaulticon\\icons8-bottle-of-water-80.png";
            default -> path = "resource\\icon\\defaulticon\\icons8_question_mark_80px.png";
        }

        return path;
    }
}
