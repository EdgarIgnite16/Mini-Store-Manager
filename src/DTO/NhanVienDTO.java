package DTO;

public class NhanVienDTO {
    private String maNV; // primary key
    private String maCV; // foreign key
    private String maCa; // foreign key
    private String tenNV;
    private String diaChi;
    private String sdt;
    private String cmnd;

    public NhanVienDTO() {
    }

    public NhanVienDTO(String maNV, String maCV, String maCa, String tenNV, String diaChi, String sdt, String cmnd) {
        this.maNV = maNV;
        this.maCV = maCV;
        this.maCa = maCa;
        this.tenNV = tenNV;
        this.diaChi = diaChi;
        this.sdt = sdt;
        this.cmnd = cmnd;
    }

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public String getMaCV() {
        return maCV;
    }

    public void setMaCV(String maCV) {
        this.maCV = maCV;
    }

    public String getMaCa() {
        return maCa;
    }

    public void setMaCa(String maCa) {
        this.maCa = maCa;
    }

    public String getTenNV() {
        return tenNV;
    }

    public void setTenNV(String tenNV) {
        this.tenNV = tenNV;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public String getCmnd() {
        return cmnd;
    }

    public void setCmnd(String cmnd) {
        this.cmnd = cmnd;
    }
}
