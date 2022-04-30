package BUS;

import DTO.KhachHangDTO;
import DTO.MatHangDTO;

import java.util.ArrayList;

public class _SaveData {
    //===============================================================//
    // Variable của form Bán hàng
    // thông tin đăng nhập
    public static String userLogin = "";

    // thông tin xoá số lượng mặt hàng
    public static int soLuongXoa = 0;

    // thông tin thêm số lượng mặt hàng
    public static int soLuongThem = 0;

    // các thông tin hoá đơn
    public static String maHD = "";
    public static String maNV = "";
    public static String tenNV = "";
    public static String maPhieuGiamGia = "";
    public static String ngayBan = "";
    public static float tongTien = 0;
    public static ArrayList<MatHangDTO> ChiTietHoaDon = null;

    //===============================================================//
    // Variable của form khách hàng
    public static String saveID = "";
    public static KhachHangDTO khachHangTimThay = null;
}
