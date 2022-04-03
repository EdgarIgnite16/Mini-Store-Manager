package DTO;

public class HoaDonDTO {
    private String MaHD; // primary key
    private String MaNV;
    private String MaKH;

    public HoaDonDTO() {
    }

    public HoaDonDTO(String maHD, String maNV, String maKH) {
        this.MaHD = maHD;
        this.MaNV = maNV;
        this.MaKH = maKH;
    }

    public String getMaHD() {
        return MaHD;
    }

    public void setMaHD(String maHD) {
        this.MaHD = maHD;
    }

    public String getMaNV() {
        return MaNV;
    }

    public void setMaNV(String maNV) {
        this.MaNV = maNV;
    }

    public String getMaKH() {
        return MaKH;
    }

    public void setMaKH(String maKH) {
        this.MaKH = maKH;
    }
}
