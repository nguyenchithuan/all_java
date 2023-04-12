package BaiTest3;

import java.io.Serializable;

public class Mami implements Serializable{
    private String hoten;
    private String ngaySinh;
    private String queQuan;
    private String nhomMau;

    public Mami() {
    }

    public Mami(String hoten, String ngaySinh, String queQuan, String nhomMau) {
        this.hoten = hoten;
        this.ngaySinh = ngaySinh;
        this.queQuan = queQuan;
        this.nhomMau = nhomMau;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getQueQuan() {
        return queQuan;
    }

    public void setQueQuan(String queQuan) {
        this.queQuan = queQuan;
    }

    public String getNhomMau() {
        return nhomMau;
    }

    public void setNhomMau(String nhomMau) {
        this.nhomMau = nhomMau;
    }
    
    
}
