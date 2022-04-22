package DTO;

public class NhaCungCapDTO {
    private String maNCC; // primary key
    private String tenNCC;
    private String SDT;

    public NhaCungCapDTO() {
    }

    public NhaCungCapDTO(String maNCC, String tenNCC, String SDT) {
        this.maNCC = maNCC;
        this.tenNCC = tenNCC;
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

    public String getSDT() {
        return SDT;
    }

    public void setSDT(String SDT) {
        this.SDT = SDT;
    }

    @Override
    public String toString() {
        return "NhaCungCapDTO{" +
                "maNCC='" + maNCC + '\'' +
                ", tenNCC='" + tenNCC + '\'' +
                ", SDT='" + SDT + '\'' +
                '}';
    }
}
