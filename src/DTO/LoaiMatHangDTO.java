package DTO;

public class LoaiMatHangDTO {
    private String maLMH;
    private String tenLMH;

    public LoaiMatHangDTO() {
    }

    public LoaiMatHangDTO(String maLMH, String tenLMH) {
        this.maLMH = maLMH;
        this.tenLMH = tenLMH;
    }

    public String getMaLMH() {
        return maLMH;
    }

    public void setMaLMH(String maLMH) {
        this.maLMH = maLMH;
    }

    public String getTenLMH() {
        return tenLMH;
    }

    public void setTenLMH(String tenLMH) {
        this.tenLMH = tenLMH;
    }

    @Override
    public String toString() {
        return "LoaiMatHangDTO{" +
                "maLMH='" + maLMH + '\'' +
                ", tenLMH='" + tenLMH + '\'' +
                '}';
    }
}
