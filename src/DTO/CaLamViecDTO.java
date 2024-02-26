package DTO;

public class CaLamViecDTO {
    private String maCa; // primary key
    private String tenCa;

    public CaLamViecDTO() {
    }

    public CaLamViecDTO(String maCa, String tenCa) {
        this.maCa = maCa;
        this.tenCa = tenCa;
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

    @Override
    public String toString() {
        return "CalamViecDTO{" +
                "maCa='" + maCa + '\'' +
                ", tenCa='" + tenCa + '\'' +
                '}';
    }
}