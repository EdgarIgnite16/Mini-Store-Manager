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
    public static ArrayList<MatHangDTO> fillData(String tenMH, String idLMH) throws Exception {
        ArrayList<MatHangDTO> listFillData;
        if (idLMH.equals("") && !tenMH.isEmpty()) {
            // nếu loại mặt hàng là trống thì tìm theo tên mặt hàng
            listFillData = new MatHangDAO().fillDataByTenMH(tenMH);
            return listFillData;
        } else if (tenMH.equals("") && !idLMH.isEmpty()) {
            // nếu tên mặt hàng là trống thì tìm theo loại mặt hàng
            listFillData = new MatHangDAO().fillDataByLoaiMH(idLMH);
            return listFillData;
        } else if (!idLMH.isEmpty() && !tenMH.isEmpty()) {
            // nếu có cả hai điều kiện thì tìm cả hai
            listFillData = new MatHangDAO().fillDataByTenMH_LoaiMH(tenMH, idLMH);
            return listFillData;
        } else {
            // trong trường hợp ko nhập gì vào field mà vẫn bấm nút tím kiến
            listFillData = new MatHangDAO().getData();
            return listFillData;
        }
    }

    // lấy toàn bộ dữ liệu
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

    // kiểm tra mặt hàng có trạng thái đang đóng hay không
    public boolean checkStatusIsClose(MatHangDTO matHangDTO) {
        for (MatHangDTO item : listMatHang) {
            // nếu mặt hàng đã tồn tại và status của mặt hàng đó là 0
            if (item.getMaMH().equals(matHangDTO.getMaMH()) && item.getStatus() == 0) {
                return true;
            }
        }
        return false;
    }


    // =================================================================================== //
    // thực hiện hàm update
    public boolean insertItem(MatHangDTO matHangDTO) throws Exception {
        if (matHangDTO != null) {
            MatHangDAO matHangDAO = new MatHangDAO();
            return matHangDAO.insertItem(matHangDTO);
        }
        return false;
    }

    // thực hiện hàm update
    public boolean deleteItem(MatHangDTO matHangDTO) throws Exception {
        if (matHangDTO != null) {
            MatHangDAO matHangDAO = new MatHangDAO();
            return matHangDAO.deleteItem(matHangDTO);
        }
        return false;
    }

    // thực hiện hàm updateChangeStatus
    public boolean updateChangeStatus(MatHangDTO matHangDTO, int status) throws Exception {
        if (matHangDTO != null) {
            MatHangDAO matHangDAO = new MatHangDAO();
            return matHangDAO.updateChangeStatus(matHangDTO, status);
        }
        return false;
    }

    // thực hiện hàm update
    public boolean updateItem(MatHangDTO matHangDTO) throws Exception {
        if (matHangDTO != null) {
            MatHangDAO matHangDAO = new MatHangDAO();
            return matHangDAO.updateItem(matHangDTO);
        }
        return false;
    }

    // =================================================================================== //
    // Xử lý các tác vụ giỏ hàng
    public static void increaseSoLuong(MatHangDTO matHangDTO, int n) {
        matHangDTO.soLuong_hientai = matHangDTO.soLuong_hientai + n;
    }

    public static void increaseThanhTien(MatHangDTO matHangDTO, int n) {
        for (int i = matHangDTO.soLuong_hientai; i < (matHangDTO.soLuong_hientai + n); i++) {
            matHangDTO.thanhTien_hientai = matHangDTO.thanhTien_hientai + matHangDTO.getThanhTien();
        }
    }

    public static void decreaseSoLuong(MatHangDTO matHangDTO, int n) {
        matHangDTO.soLuong_hientai = matHangDTO.soLuong_hientai - n;
    }

    public static void decreaseThanhTien(MatHangDTO matHangDTO, int n) {
        for (int i = 1; i <= n; i++) {
            matHangDTO.thanhTien_hientai = matHangDTO.thanhTien_hientai - matHangDTO.getThanhTien();
        }
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
