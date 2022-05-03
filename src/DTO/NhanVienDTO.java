package DTO;

public class NhanVienDTO {
    private String maNV; // primary key
    private String maCV; // foreign key
    private String maCa; // foreign key
    private String tenNV;
    private String SDT;
    private String cmnd;

    // thuộc tính show ra màn hình
    private int isShow;

    public NhanVienDTO() {

    }

    public NhanVienDTO(String maNV, String maCV, String maCa, String tenNV, String SDT, String cmnd, int isShow) {
        this.maNV = maNV;
        this.maCV = maCV;
        this.maCa = maCa;
        this.tenNV = tenNV;
        this.SDT = SDT;
        this.cmnd = cmnd;
        this.isShow = isShow;
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

    public String getSdt() {
        return SDT;
    }

    public void setSdt(String SDT) {
        this.SDT = SDT;
    }

    public String getCmnd() {
        return cmnd;
    }

    public void setCmnd(String cmnd) {
        this.cmnd = cmnd;
    }

    public int getIsShow() {
        return isShow;
    }

    public void setIsShow(int isShow) {
        this.isShow = isShow;
    }

    @Override
    public String toString() {
        return "NhanVienDTO{" +
                "maNV='" + maNV + '\'' +
                ", maCV='" + maCV + '\'' +
                ", maCa='" + maCa + '\'' +
                ", tenNV='" + tenNV + '\'' +
                ", SDT='" + SDT + '\'' +
                ", cmnd='" + cmnd + '\'' +
                ", isShow=" + isShow +
                '}';
    }
}
