package DTO;

public class ChiTietHoaDonDTO {
    private String maHD; // foreign key
    private String maMH; // foreign key
    private int soLuong;

    public ChiTietHoaDonDTO() {
    }

    public ChiTietHoaDonDTO(String maHD, String maMH, int soLuong) {
        this.maHD = maHD;
        this.maMH = maMH;
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

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    @Override
    public String toString() {
        return "ChiTietHoaDonDTO{" +
                "maHD='" + maHD + '\'' +
                ", maMH='" + maMH + '\'' +
                ", soLuong=" + soLuong +
                '}';
    }
}
