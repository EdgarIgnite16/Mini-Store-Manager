package DTO;

public class MatHangDTO {
    private String maMH; // primary key
    private String maLMH; // foreign key
    private String tenMH;
    private float thanhTien;
    private int soLuong;
    private int status;

    // các thông số hiển thị của sản phẩm (thuộc tính sử dụng cho mục đích hiển thị trong GUI)
    public int soLuong_hientai = 0;
    public double thanhTien_hientai = 0;

    public MatHangDTO() {
    }

    public MatHangDTO(String maMH, String maLMH, String tenMH, float thanhTien, int soLuong, int status) {
        this.maMH = maMH;
        this.maLMH = maLMH;
        this.tenMH = tenMH;
        this.thanhTien = thanhTien;
        this.soLuong = soLuong;
        this.status = status;
    }

    public String getMaMH() {
        return maMH;
    }

    public void setMaMH(String maMH) {
        this.maMH = maMH;
    }

    public String getMaLMH() {
        return maLMH;
    }

    public void setMaLMH(String maLMH) {
        this.maLMH = maLMH;
    }

    public String getTenMH() {
        return tenMH;
    }

    public void setTenMH(String tenMH) {
        this.tenMH = tenMH;
    }

    public float getThanhTien() {
        return thanhTien;
    }

    public void setThanhTien(float thanhTien) {
        this.thanhTien = thanhTien;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "MatHangDTO{" +
                "maMH='" + maMH + '\'' +
                ", maLMH='" + maLMH + '\'' +
                ", tenMH='" + tenMH + '\'' +
                ", thanhTien=" + thanhTien +
                ", soLuong=" + soLuong +
                ", status=" + status +
                '}';
    }

    public String toStringGioHang() {
        return "MatHang{" +
                "maMH='" + maMH + '\'' +
                ", tenMH='" + tenMH + '\'' +
                ", thanhTienHienTai='" + thanhTien_hientai + '\'' +
                ", soLuongHienTai=" + soLuong_hientai +
                ", soLuongToiDa=" + soLuong +
                '}';
    }
}
