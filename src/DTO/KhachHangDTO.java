package DTO;

public class KhachHangDTO {
    private String maKH; // primary key
    private String tenKH;
    private String sdt;
    private int status;

    public KhachHangDTO() {
    }

    public KhachHangDTO(String maKH, String tenKH, String sdt, int status) {
        this.maKH = maKH;
        this.tenKH = tenKH;
        this.sdt = sdt;
        this.status = status;
    }

    public String getMaKH() {
        return maKH;
    }

    public void setMaKH(String maKH) {
        this.maKH = maKH;
    }

    public String getTenKH() {
        return tenKH;
    }

    public void setTenKH(String tenKH) {
        this.tenKH = tenKH;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "KhachHangDTO{" +
                "maKH='" + maKH + '\'' +
                ", tenKH='" + tenKH + '\'' +
                ", sdt='" + sdt + '\'' +
                ", status=" + status +
                '}';
    }
}
