package Bai1_labs4;

public class NhanVien {
    private String hoVaTen;
    private String ngaySinh;
    private double luong;

    public NhanVien() {
    }

    public NhanVien(String hoVaTen, String ngaySinh, double luong) {
        this.hoVaTen = hoVaTen;
        this.ngaySinh = ngaySinh;
        this.luong = luong;
    }

    public String getHoVaTen() {
        return hoVaTen;
    }

    public void setHoVaTen(String hoVaTen) {
        this.hoVaTen = hoVaTen;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public double getLuong() {
        return luong;
    }

    public void setLuong(double luong) {
        this.luong = luong;
    }
    
}
