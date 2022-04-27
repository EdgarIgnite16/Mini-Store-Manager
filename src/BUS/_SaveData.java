package BUS;

import DTO.MatHangDTO;

import java.util.ArrayList;

public class _SaveData {
    // thông tin đăng nhập
    public static String userLogin = "";

    // thông tin xoá số lượng mặt hàng
    public static int soLuongXoa = 0;
    public static int soLuongXoaToiDa = 0;

    // các thông tin hoá đơn
    public static String maHD = "";
    public static String tenNV = "";
    public static String maKH = "";
    public static String ngayBan = "";
    public static float tongTien = 0;
    public static ArrayList<MatHangDTO> ChiTietHoaDon = null;
}
