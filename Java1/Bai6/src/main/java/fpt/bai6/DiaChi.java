package fpt.bai6;

public class DiaChi {
    private String soNha;
    private String tenDuong;
    private String tenXom;
    private String tenPhuong;
    private String tenHuyen;
    private String tenThanhPho;

    public DiaChi(String tenThanhPho) {
        this.tenThanhPho = tenThanhPho;
    }

    public DiaChi() {
    }
    
    public String getTenThanhPho() {
        return tenThanhPho;
    }

    public void setTenThanhPho(String tenThanhPho) {
        this.tenThanhPho = tenThanhPho;
    }

    void getTenThanhPho(String nextLine) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
}
