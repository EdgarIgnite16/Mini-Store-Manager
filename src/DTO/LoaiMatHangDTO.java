package DTO;

public class LoaiMatHangDTO {
    private String maPLMH;
    private String tenPLMH;

    public LoaiMatHangDTO() {
    }

    public LoaiMatHangDTO(String maPLMH, String tenPLMH) {
        this.maPLMH = maPLMH;
        this.tenPLMH = tenPLMH;
    }

    public String getMaPLMH() {
        return maPLMH;
    }

    public void setMaPLMH(String maPLMH) {
        this.maPLMH = maPLMH;
    }

    public String getTenPLMH() {
        return tenPLMH;
    }

    public void setTenPLMH(String tenPLMH) {
        this.tenPLMH = tenPLMH;
    }
}
