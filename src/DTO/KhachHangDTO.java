package DTO;

public class KhachHangDTO {
    private String maKH; // primary key
    private String tenKH;
    private String sdt;

    // thuộc tính show ra màn hình
    private byte isShow;

    public KhachHangDTO() {

    }

    public KhachHangDTO(String maKH, String tenKH, String sdt, byte isShow) {
        this.maKH = maKH;
        this.tenKH = tenKH;
        this.sdt = sdt;
        this.isShow = isShow;
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

    public byte getIsShow() {
        return isShow;
    }

    public void setIsShow(byte isShow) {
        this.isShow = isShow;
    }

    @Override
    public String toString() {
        return "KhachHangDTO{" +
                "maKH='" + maKH + '\'' +
                ", tenKH='" + tenKH + '\'' +
                ", sdt='" + sdt + '\'' +
                ", isShow=" + isShow +
                '}';
    }
}
