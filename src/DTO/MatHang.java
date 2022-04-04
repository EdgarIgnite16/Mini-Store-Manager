package DTO;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MatHang {
    private String maMH; // primary key
    private String maPLMH; // foreign key
    private String maKHO; // foreign key
    private String maGiamGia; // foreign key
    private String tenMH;
    private String thanhTien;
    private Date NSX;
    private String HSD;

    public MatHang() {
    }

    public MatHang(String maMH, String maPLMH, String maKHO, String maGiamGia, String tenMH, String thanhTien, Date NSX, String HSD) {
        this.maMH = maMH;
        this.maPLMH = maPLMH;
        this.maKHO = maKHO;
        this.maGiamGia = maGiamGia;
        this.tenMH = tenMH;
        this.thanhTien = thanhTien;
        this.NSX = NSX;
        this.HSD = HSD;
    }

    public MatHang(String maMH, String maPLMH, String maKHO, String maGiamGia, String tenMH, String thanhTien, Date NSX, Date HSD) {
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        this.maMH = maMH;
        this.maPLMH = maPLMH;
        this.maKHO = maKHO;
        this.maGiamGia = maGiamGia;
        this.tenMH = tenMH;
        this.thanhTien = thanhTien;
        this.NSX = NSX;
        this.HSD = dateFormat.format(HSD);
    }

    public String getMaMH() {
        return maMH;
    }

    public void setMaMH(String maMH) {
        this.maMH = maMH;
    }

    public String getMaPLMH() {
        return maPLMH;
    }

    public void setMaPLMH(String maPLMH) {
        this.maPLMH = maPLMH;
    }

    public String getMaKHO() {
        return maKHO;
    }

    public void setMaKHO(String maKHO) {
        this.maKHO = maKHO;
    }

    public String getMaGiamGia() {
        return maGiamGia;
    }

    public void setMaGiamGia(String maGiamGia) {
        this.maGiamGia = maGiamGia;
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

    public Date getNSX() {
        return NSX;
    }

    public void setNSX(Date NSX) {
        this.NSX = NSX;
    }

    public String getHSD() {
        return HSD;
    }

    public void setHSD(String HSD) {
        this.HSD = HSD;
    }
}
