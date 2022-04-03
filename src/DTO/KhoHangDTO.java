package DTO;

public class KhoHangDTO {
    private String maKho; // primary key
    private String tenKho;
    private int SL_HienTai;
    private int SL_ToiDa;

    public KhoHangDTO() {
    }

    public KhoHangDTO(String maKho, String tenKho, int SL_HienTai, int SL_ToiDa) {
        this.maKho = maKho;
        this.tenKho = tenKho;
        this.SL_HienTai = SL_HienTai;
        this.SL_ToiDa = SL_ToiDa;
    }

    public String getMaKho() {
        return maKho;
    }

    public void setMaKho(String maKho) {
        this.maKho = maKho;
    }

    public String getTenKho() {
        return tenKho;
    }

    public void setTenKho(String tenKho) {
        this.tenKho = tenKho;
    }

    public int getSL_HienTai() {
        return SL_HienTai;
    }

    public void setSL_HienTai(int SL_HienTai) {
        this.SL_HienTai = SL_HienTai;
    }

    public int getSL_ToiDa() {
        return SL_ToiDa;
    }

    public void setSL_ToiDa(int SL_ToiDa) {
        this.SL_ToiDa = SL_ToiDa;
    }
}
