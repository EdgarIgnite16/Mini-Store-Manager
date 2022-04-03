package DTO;

import java.util.Date;

public class ChiTietPhieuNhap {
    private String maMH;
    private String MaPN;
    private int soLuong;
    private Date ngayNhap;

    public ChiTietPhieuNhap() {
    }

    public ChiTietPhieuNhap(String maMH, String maPN, int soLuong, Date ngayNhap) {
        this.maMH = maMH;
        this.MaPN = maPN;
        this.soLuong = soLuong;
        this.ngayNhap = ngayNhap;
    }

    public String getMaMH() {
        return maMH;
    }

    public void setMaMH(String maMH) {
        this.maMH = maMH;
    }

    public String getMaPN() {
        return MaPN;
    }

    public void setMaPN(String maPN) {
        this.MaPN = maPN;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public Date getNgayNhap() {
        return ngayNhap;
    }

    public void setNgayNhap(Date ngayNhap) {
        this.ngayNhap = ngayNhap;
    }
}
