package DTO;

public class NhanVienDTO {
    private String maNV; // primary key
    private String maCV; // foreign key
    private String maCa; // foreign key
    private String tenNV;
    private String pwd;
    private String SDT;
    private String cccd;
    private int status;

    public NhanVienDTO() {
    }

    public NhanVienDTO(String maNV, String maCV, String maCa, String tenNV, String pwd, String SDT, String cccd, int status) {
        this.maNV = maNV;
        this.maCV = maCV;
        this.maCa = maCa;
        this.tenNV = tenNV;
        this.pwd = pwd;
        this.SDT = SDT;
        this.cccd = cccd;
        this.status = status;
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

    public String getCccd() {
        return cccd;
    }

    public void setCccd(String cccd) {
        this.cccd = cccd;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }


    @Override
    public String toString() {
        return "NhanVienDTO{" +
                "maNV='" + maNV + '\'' +
                ", maCV='" + maCV + '\'' +
                ", maCa='" + maCa + '\'' +
                ", tenNV='" + tenNV + '\'' +
                ", SDT='" + SDT + '\'' +
                ", cccd='" + cccd + '\'' +
                ", status=" + status +
                '}';
    }
}
