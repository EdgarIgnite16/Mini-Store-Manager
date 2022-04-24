package DTO;

public class ChiTietPhieuNhapDTO {
    private String maPhieuNhap; // foreign key
    private String maMH; // foreign key
    private int soLuong;

    public ChiTietPhieuNhapDTO() {
    }

    public ChiTietPhieuNhapDTO(String maPhieuNhap, String maMH, int soLuong) {
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
