package DTO;

import java.util.Date;

public class ChiTietHoaDonDTO {
    private String maHD; // primary key
    private String maMH; // primary key
    private String ThanhTien;
    private Date NgayBan;
    private int soLuong;

    public ChiTietHoaDonDTO() {
    }

    public ChiTietHoaDonDTO(String maHD, String maMH, String thanhTien, Date ngayBan, int soLuong) {
        this.maHD = maHD;
        this.maMH = maMH;
        ThanhTien = thanhTien;
        NgayBan = ngayBan;
        this.soLuong = soLuong;
    }

    public String getMaHD() {
        return maHD;
    }

    public void setMaHD(String maHD) {
        this.maHD = maHD;
    }

    public String getMaMH() {
        return maMH;
    }

    public void setMaMH(String maMH) {
        this.maMH = maMH;
    }

    public String getThanhTien() {
        return ThanhTien;
    }

    public void setThanhTien(String thanhTien) {
        ThanhTien = thanhTien;
    }

    public Date getNgayBan() {
        return NgayBan;
    }

    public void setNgayBan(Date ngayBan) {
        NgayBan = ngayBan;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }
}
