package DTO;

public class PhieuGiamGiaDTO {
    private String maGiamGia; // primary key
    private String tenGiamGia;
    private String noiDung;
    private float tiLeGiam;

    public PhieuGiamGiaDTO() {
    }

    public PhieuGiamGiaDTO(String maGiamGia, String tenGiamGia, String noiDung, float tiLeGiam) {
        this.maGiamGia = maGiamGia;
        this.tenGiamGia = tenGiamGia;
        this.noiDung = noiDung;
        this.tiLeGiam = tiLeGiam;
    }

    public String getMaGiamGia() {
        return maGiamGia;
    }

    public void setMaGiamGia(String maGiamGia) {
        this.maGiamGia = maGiamGia;
    }

    public String getTenGiamGia() {
        return tenGiamGia;
    }

    public void setTenGiamGia(String tenGiamGia) {
        this.tenGiamGia = tenGiamGia;
    }

    public String getNoiDung() {
        return noiDung;
    }

    public void setNoiDung(String noiDung) {
        this.noiDung = noiDung;
    }

    public double getTiLeGiam() {
        return tiLeGiam;
    }

    public void setTiLeGiam(float tiLeGiam) {
        this.tiLeGiam = tiLeGiam;
    }

    @Override
    public String toString() {
        return "PhieuGiamGiaDTO{" +
                "maGiamGia='" + maGiamGia + '\'' +
                ", tenGiamGia='" + tenGiamGia + '\'' +
                ", noiDung='" + noiDung + '\'' +
                ", tiLeGiam=" + tiLeGiam +
                '}';
    }
}
