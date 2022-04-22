package DTO;

import java.util.Date;

public class HoaDonDTO {
    private String maHD; // primary key
    private String maGiamGia; // foreign key
    private String maNV;
    private String maKH;
    private float tongHoaDon;
    private int trangThai;
    private String ngayBan;

//    DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");

    public HoaDonDTO() {
    }

    public HoaDonDTO(String maHD, String maGiamGia, String maNV, String maKH, float tongHoaDon, int trangThai, String ngayBan) {
        this.maHD = maHD;
        this.maGiamGia = maGiamGia;
        this.maNV = maNV;
        this.maKH = maKH;
        this.tongHoaDon = tongHoaDon;
        this.trangThai = trangThai;
        this.ngayBan = ngayBan;
    }

    public String getMaHD() {
        return maHD;
    }

    public void setMaHD(String maHD) {
        this.maHD = maHD;
    }

    public String getMaGiamGia() {
        return maGiamGia;
    }

    public void setMaGiamGia(String maGiamGia) {
        this.maGiamGia = maGiamGia;
    }

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public String getMaKH() {
        return maKH;
    }

    public void setMaKH(String maKH) {
        this.maKH = maKH;
    }

    public float getTongHoaDon() {
        return tongHoaDon;
    }

    public void setTongHoaDon(float tongHoaDon) {
        this.tongHoaDon = tongHoaDon;
    }

    public int getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(int trangThai) {
        this.trangThai = trangThai;
    }

    public String getNgayBan() {
        return ngayBan;
    }

    public void setNgayBan(String ngayBan) {
        this.ngayBan = ngayBan;
    }

    @Override
    public String toString() {
        return "HoaDonDTO{" +
                "maHD='" + maHD + '\'' +
                ", maGiamGia='" + maGiamGia + '\'' +
                ", maNV='" + maNV + '\'' +
                ", maKH='" + maKH + '\'' +
                ", tongHoaDon=" + tongHoaDon +
                ", trangThai=" + trangThai +
                ", ngayBan=" + ngayBan +
                '}';
    }
}
