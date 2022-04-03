package DTO;

public class NhaCungCapDTO {
    private String maNCC; // primary key
    private String tenNCC;
    private String DiaChi;
    private String SDT;

    public NhaCungCapDTO() {
    }

    public NhaCungCapDTO(String maNCC, String tenNCC, String diaChi, String SDT) {
        this.maNCC = maNCC;
        this.tenNCC = tenNCC;
        this.DiaChi = diaChi;
        this.SDT = SDT;
    }

    public String getMaNCC() {
        return maNCC;
    }

    public void setMaNCC(String maNCC) {
        this.maNCC = maNCC;
    }

    public String getTenNCC() {
        return tenNCC;
    }

    public void setTenNCC(String tenNCC) {
        this.tenNCC = tenNCC;
    }

    public String getDiaChi() {
        return DiaChi;
    }

    public void setDiaChi(String diaChi) {
        this.DiaChi = diaChi;
    }

    public String getSDT() {
        return SDT;
    }

    public void setSDT(String SDT) {
        this.SDT = SDT;
    }
}
