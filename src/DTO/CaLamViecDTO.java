package DTO;

public class CaLamViecDTO {
    private String maCa; // primary key
    private String tenCa;
    private String khungGio;

    public CaLamViecDTO() {
    }

    public CaLamViecDTO(String maCa, String tenCa, String khungGio) {
        this.maCa = maCa;
        this.tenCa = tenCa;
        this.khungGio = khungGio;
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

    public String getKhungGio() {
        return khungGio;
    }

    public void setKhungGio(String khungGio) {
        this.khungGio = khungGio;
    }

    @Override
    public String toString() {
        return "CaLamViecDTO{" +
                "maCa='" + maCa + '\'' +
                ", tenCa='" + tenCa + '\'' +
                ", khungGio='" + khungGio + '\'' +
                '}';
    }
}