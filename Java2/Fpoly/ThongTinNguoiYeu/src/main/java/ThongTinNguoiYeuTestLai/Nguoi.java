package ThongTinNguoiYeuTestLai;

import java.io.Serializable;

public class Nguoi implements Serializable{
    private String hoTen;
    private String ngaySinh;
    private String gioiTinh;
    private double canNang;
    private String queQuan;

    public Nguoi() {
    }

    public Nguoi(String hoTen, String ngaySinh, String gioiTinh, double canNang, String queQuan) {
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.gioiTinh = gioiTinh;
        this.canNang = canNang;
        this.queQuan = queQuan;
    }
    
    public String getSucKhoe() {
        if(canNang >= 55 && canNang <= 65) {
            return "Tot";
        } else {
            return "Kem";
        }
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public double getCanNang() {
        return canNang;
    }

    public void setCanNang(double canNang) {
        this.canNang = canNang;
    }

    public String getQueQuan() {
        return queQuan;
    }

    public void setQueQuan(String queQuan) {
        this.queQuan = queQuan;
    }
    
    
}
