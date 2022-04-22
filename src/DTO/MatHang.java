package DTO;

public class MatHang {
    private String maMH; // primary key
    private String maLMH; // foreign key
    private String tenMH;
    private String thanhTien;
    private int soLuong;

    public MatHang() {
    }

    public MatHang(String maMH, String maLMH, String tenMH, String thanhTien, int soLuong) {
        this.maMH = maMH;
        this.maLMH = maLMH;
        this.tenMH = tenMH;
        this.thanhTien = thanhTien;
        this.soLuong = soLuong;
    }

    public String getMaMH() {
        return maMH;
    }

    public void setMaMH(String maMH) {
        this.maMH = maMH;
    }

    public String getMaLMH() {
        return maLMH;
    }

    public void setMaLMH(String maLMH) {
        this.maLMH = maLMH;
    }

    public String getTenMH() {
        return tenMH;
    }

    public void setTenMH(String tenMH) {
        this.tenMH = tenMH;
    }

    public String getThanhTien() {
        return thanhTien;
    }

    public void setThanhTien(String thanhTien) {
        this.thanhTien = thanhTien;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    @Override
    public String toString() {
        return "MatHang{" +
                "maMH='" + maMH + '\'' +
                ", maLMH='" + maLMH + '\'' +
                ", tenMH='" + tenMH + '\'' +
                ", thanhTien='" + thanhTien + '\'' +
                ", soLuong=" + soLuong +
                '}';
    }
}
