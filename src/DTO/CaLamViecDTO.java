package DTO;

public class CaLamViecDTO {
    private String maCa; // primary key
    private String tenCa;
    private String thoiGian;

    public CaLamViecDTO() {
    }

    public CaLamViecDTO(String maCa, String tenCa, String thoiGian) {
        this.maCa = maCa;
        this.tenCa = tenCa;
        this.thoiGian = thoiGian;
    }

    public String getMaCa() {
        return maCa;
    }

    public void setMaCa(String maCa) {
        this.maCa = maCa;
    }

    public String getTenCa() {
        return tenCa;
    }

    public void setTenCa(String tenCa) {
        this.tenCa = tenCa;
    }

    public String getThoiGian() {
        return thoiGian;
    }

    public void setThoiGian(String thoiGian) {
        this.thoiGian = thoiGian;
    }

    @Override
    public String toString() {
        return "CalamViecDTO{" +
                "maCa='" + maCa + '\'' +
                ", tenCa='" + tenCa + '\'' +
                ", thoiGian='" + thoiGian + '\'' +
                '}';
    }
}