package DTO;

public class HoaDonDTO {
    private String maHD; // primary key
    private String maNV; // foreign key
    private String maKH; // foreign key
    private String maGiamGia; // foreign key
    private float tongHoaDon;
    private String ngayBan;

//    DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");

    public HoaDonDTO() {
    }

    public HoaDonDTO(String maHD, String maNV, String maKH, String maGiamGia, float tongHoaDon, String ngayBan) {
        this.maHD = maHD;
        this.maNV = maNV;
        this.maKH = maKH;
        this.maGiamGia = maGiamGia;
        this.tongHoaDon = tongHoaDon;
        this.ngayBan = ngayBan;
    }

    public String getMaHD() {
        return maHD;
    }

    public void setMaHD(String maHD) {
        this.maHD = maHD;
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

    public String getMaGiamGia() {
        return maGiamGia;
    }

    public void setMaGiamGia(String maGiamGia) {
        this.maGiamGia = maGiamGia;
    }

    public float getTongHoaDon() {
        return tongHoaDon;
    }

    public void setTongHoaDon(float tongHoaDon) {
        this.tongHoaDon = tongHoaDon;
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
                ", maNV='" + maNV + '\'' +
                ", maKH='" + maKH + '\'' +
                ", maGiamGia='" + maGiamGia + '\'' +
                ", tongHoaDon=" + tongHoaDon +
                ", ngayBan='" + ngayBan + '\'' +
                '}';
    }
}
