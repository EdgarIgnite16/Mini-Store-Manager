package DTO;

public class ChucVuDTO {
    private String maCV; // primary key
    private String tenCV;

    public ChucVuDTO() {
    }

    public ChucVuDTO(String maCV, String tenCV) {
        this.maCV = maCV;
        this.tenCV = tenCV;
    }

    public String getMaCV() {
        return maCV;
    }

    public void setMaCV(String maCV) {
        this.maCV = maCV;
    }

    public String getTenCV() {
        return tenCV;
    }

    public void setTenCV(String tenCV) {
        this.tenCV = tenCV;
    }

    @Override
    public String toString() {
        return "ChucVuDTO{" +
                "maCV='" + maCV + '\'' +
                ", tenCV='" + tenCV + '\'' +
                '}';
    }
}
