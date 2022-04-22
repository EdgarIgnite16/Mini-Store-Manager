package DTO;

import java.util.Date;

public class ChiTietPhieuNhap {
    private String maPhieuNhap; // primary key
    private String maMH; // foreign key
    private int soLuong;

    public ChiTietPhieuNhap() {
    }

    public ChiTietPhieuNhap(String maPhieuNhap, String maMH, int soLuong) {
        this.maPhieuNhap = maPhieuNhap;
        this.maMH = maMH;
        this.soLuong = soLuong;
    }

    public String getMaPhieuNhap() {
        return maPhieuNhap;
    }

    public void setMaPhieuNhap(String maPhieuNhap) {
        this.maPhieuNhap = maPhieuNhap;
    }

    public String getMaMH() {
        return maMH;
    }

    public void setMaMH(String maMH) {
        this.maMH = maMH;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    @Override
    public String toString() {
        return "ChiTietPhieuNhap{" +
                "maPhieuNhap='" + maPhieuNhap + '\'' +
                ", maMH='" + maMH + '\'' +
                ", soLuong=" + soLuong +
                '}';
    }
}
