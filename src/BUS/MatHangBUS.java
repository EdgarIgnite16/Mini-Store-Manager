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

    // lọc dữ liệu thông qua tên mặt hàng
    public static MatHangDTO getItemByID(String id) {
        for (MatHangDTO item : listMatHang) {
            if (item.getMaMH().equals(id)) {
                return item;
            }
        }
        return null;
    }

    // lọc dữ liệu thông qua tên mặt hàng
    public static MatHangDTO getItemByName(String name) {
        for (MatHangDTO item : listMatHang) {
            if (item.getTenMH().equals(name)) {
                return item;
            }
        }
        return null;
    }

    // lọc dữ liệu thông qua mã loại mặt hàng
    public static MatHangDTO getItemByLMH(String idLMH) {
        for (MatHangDTO item : listMatHang) {
            if (item.getMaLMH().equals(idLMH)) {
                return item;
            }
        }
        return null;
    }

    // lọc dữ liệu
    public static ArrayList<MatHangDTO> fillData(String name, String idLMH) {
        ArrayList<MatHangDTO> listFillData = new ArrayList<>();
        for (MatHangDTO item : listMatHang) {
            if (idLMH.equals("")) {
                if (item.getTenMH().contains(name)) {
                    listFillData.add(item);
                }
            } else if (name.equals("")) {
                if (item.getMaLMH().contains(idLMH)) {
                    listFillData.add(item);
                }
            } else {
                if (item.getTenMH().contains(name) && item.getMaLMH().contains(idLMH)) {
                    listFillData.add(item);
                }
            }
        }
        return listFillData;
    }

    public ArrayList<MatHangDTO> getData() {
        // trả về dữ liệu
        return listMatHang;
    }

    // in danh sách mặt hàng
    public void printData() {
        for (MatHangDTO item : listMatHang) {
            System.out.println(item.toString());
        }
    }

    // Xử lý các tác vụ giỏ hàng
    public static void increaseSoLuong(MatHangDTO matHangDTO) {
        matHangDTO.soLuong_hientai = matHangDTO.soLuong_hientai + 1;
    }

    public static void increaseThanhTien(MatHangDTO matHangDTO) {
        matHangDTO.thanhTien_hientai = matHangDTO.thanhTien_hientai + matHangDTO.getThanhTien();
    }

    public static void decreaseSoLuong(MatHangDTO matHangDTO) {
        matHangDTO.soLuong_hientai = matHangDTO.soLuong_hientai - 1;
    }

    public static void decreaseThanhTien(MatHangDTO matHangDTO) {
        matHangDTO.thanhTien_hientai = matHangDTO.thanhTien_hientai - matHangDTO.getThanhTien();
    }

    public static void resetSoLuong(MatHangDTO matHangDTO) {
        matHangDTO.soLuong_hientai = 0;
    }

    public static void resetThanhTien(MatHangDTO matHangDTO) {
        matHangDTO.thanhTien_hientai = 0;
    }

    public static boolean isFull(MatHangDTO matHangDTO) {
        return matHangDTO.soLuong_hientai >= matHangDTO.getSoLuong();
    }

    public static boolean isEmpty(MatHangDTO matHangDTO) {
        return matHangDTO.soLuong_hientai < matHangDTO.getSoLuong() || matHangDTO.soLuong_hientai == 0;
    }

    public static void getDataItem(MatHangDTO matHangDTO) {
        System.out.println(matHangDTO.toStringGioHang());
    }
}
