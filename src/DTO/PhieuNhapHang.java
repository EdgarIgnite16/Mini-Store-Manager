package DTO;

public class PhieuNhapHang {
    private String maPN; // primary key
    private String maKho; // foreign key
    private String maNCC; // foreign key
    private String tenPN;

    public PhieuNhapHang() {
    }

    public PhieuNhapHang(String maPN, String maKho, String maNCC, String tenPN) {
        this.maPN = maPN;
        this.maKho = maKho;
        this.maNCC = maNCC;
        this.tenPN = tenPN;
    }

    public String getMaPN() {
        return maPN;
    }

    public void setMaPN(String maPN) {
        this.maPN = maPN;
    }

    public String getMaKho() {
        return maKho;
    }

    public void setMaKho(String maKho) {
        this.maKho = maKho;
    }

    public String getMaNCC() {
        return maNCC;
    }

    public void setMaNCC(String maNCC) {
        this.maNCC = maNCC;
    }

    public String getTenPN() {
        return tenPN;
    }

    public void setTenPN(String tenPN) {
        this.tenPN = tenPN;
    }
}
