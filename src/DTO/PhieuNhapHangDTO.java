package DTO;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class PhieuNhapHangDTO {
    private String maPhieuNhap; // primary key
    private String maNCC; // foreign key
    private String ngayNhap;


//    DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

    public PhieuNhapHangDTO() {
    }

    public PhieuNhapHangDTO(String maPhieuNhap, String maNCC, String ngayNhap) {
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        this.maPhieuNhap = maPhieuNhap;
        this.maNCC = maNCC;
        this.ngayNhap = dateFormat.format(ngayNhap);
    }

    public String getMaPhieuNhap() {
        return maPhieuNhap;
    }

    public void setMaPhieuNhap(String maPhieuNhap) {
        this.maPhieuNhap = maPhieuNhap;
    }

    public String getMaNCC() {
        return maNCC;
    }

    public void setMaNCC(String maNCC) {
        this.maNCC = maNCC;
    }

    public String getNgayNhap() {
        return ngayNhap;
    }

    public void setNgayNhap(String ngayNhap) {
        this.ngayNhap = ngayNhap;
    }

    @Override
    public String toString() {
        return "PhieuNhapHangDTO{" +
                "maPhieuNhap='" + maPhieuNhap + '\'' +
                ", maNCC='" + maNCC + '\'' +
                ", ngayNhap='" + ngayNhap + '\'' +
                '}';
    }
}
