package BUS;

import DAO.HoaDonDAO;
import DTO.HoaDonDTO;
import DTO.KhachHangDTO;
import DTO.NhanVienDTO;

import java.util.ArrayList;

public class HoaDonBUS {
    private ArrayList<HoaDonDTO> listHoaDon;

    public HoaDonBUS() {
        try {
            listHoaDon = new HoaDonDAO().getData(); // lấy dữ liệu từ Database thông qua DAO
        } catch (Exception ex) {
            System.out.printf("Đã xảy ra lỗi: %s\n", ex.getMessage());
            ex.printStackTrace();
        }
    }

    // lấy đối tượng thông qua mã hoá đơn
    public HoaDonDTO getItemBymMaHD(String maHD) {
        for (HoaDonDTO item : listHoaDon) {
            if (item.getMaHD().equals(maHD)) {
                return item;
            }
        }
        return null;
    }

    // lấy đối tượng thông qua mã khách hàng
    public HoaDonDTO getItemByMaKH(String MaKH) {
        for (HoaDonDTO item : listHoaDon) {
            if (item.getMaKH().equals(MaKH)) {
                return item;
            }
        }
        return null;
    }

    // lấy đối tượng thông qua mã giảm giá
    public HoaDonDTO getItemByMaGiamGia(String maGiamGia) {
        for (HoaDonDTO item : listHoaDon) {
            if (item.getMaGiamGia().equals(maGiamGia)) {
                return item;
            }
        }
        return null;
    }

    // lấy toàn bộ dữ liệu
    public ArrayList<HoaDonDTO> getData() {
        // lấy dữ liệu
        return listHoaDon;
    }

    // in toàn bộ dữ liệu
    public void printData() {
        for (HoaDonDTO hoaDonDTO : listHoaDon) {
            System.out.println(hoaDonDTO.toString()); // in ra terminal
        }
    }

    // hàm lọc dữ liệu
    public ArrayList<HoaDonDTO> fillData(String id, String type) {
        ArrayList<HoaDonDTO> listHD = new ArrayList<>();
        if (type.equals("KH")) {
            for (HoaDonDTO item : listHoaDon) {
                if (item.getMaKH().equals(id)) {
                    listHD.add(item);
                }
            }
        }
        if (type.equals("NV")) {
            for (HoaDonDTO item : listHoaDon) {
                if (item.getMaNV().equals(id)) {
                    listHD.add(item);
                }
            }
        }
        return listHD;
    }

    // hàm tính tổng thành tiền
    public float tinhTongThanhTienAll() {
        float tongThanhTien = 0;
        for (HoaDonDTO item : listHoaDon) {
            tongThanhTien += item.getTongHoaDon();
        }
        return tongThanhTien;
    }

    // kiểm tra khách hàng đã tồn tại trong danh sách hoá đơn
    public boolean checkKhachHangExist(KhachHangDTO khachHangDTO) {
        for (HoaDonDTO item : listHoaDon) {
            if (item.getMaKH().equals(khachHangDTO.getMaKH())) {
                return true;
            }
        }
        return false;
    }

    // kiểm tra nhân viên đã tồn tại trong danh sách hoá đơn
    public boolean checkNhanVienExist(NhanVienDTO nhanVienDTO) {
        for (HoaDonDTO item : listHoaDon) {
            if (item.getMaNV().equals(nhanVienDTO.getMaNV())) {
                return true;
            }
        }
        return false;
    }

    // =================================================================================== //
    // thực hiện hàm insert
    public boolean insertItem(HoaDonDTO hoaDonDTO) throws Exception {
        if (hoaDonDTO != null) {
            HoaDonDAO hoaDonDAO = new HoaDonDAO();
            return hoaDonDAO.insertItem(hoaDonDTO);
        }
        return false;
    }
}
