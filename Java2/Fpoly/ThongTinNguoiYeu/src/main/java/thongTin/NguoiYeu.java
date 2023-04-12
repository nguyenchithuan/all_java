package thongTin;

import java.io.Serializable;

public class NguoiYeu implements Serializable{
    private String hoTen;
    private String ngaySinh;
    private String gioiTinh;
    private int canNang;
    private String queQuan;

    public NguoiYeu() {
    }

    public NguoiYeu(String hoTen, String ngaySinh, String gioiTinh, int canNang, String queQuan) {
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.gioiTinh = gioiTinh;
        this.canNang = canNang;
        this.queQuan = queQuan;
    }
    
    public String getSucKhoe() {
        if(canNang >= 50 && canNang <= 65) {
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

    public int getCanNang() {
        return canNang;
    }

    public void setCanNang(int canNang) {
        this.canNang = canNang;
    }

    public String getQueQuan() {
        return queQuan;
    }

    public void setQueQuan(String queQuan) {
        this.queQuan = queQuan;
    }

}
