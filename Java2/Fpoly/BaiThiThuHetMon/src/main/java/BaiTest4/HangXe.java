package BaiTest4;

import java.io.Serializable;

public class HangXe implements Serializable{
    private String hoten;
    private String email;
    private String hangXe;
    private double thuNhap;

    public HangXe() {
    }

    public HangXe(String hoten, String email, String hangXe, double thuNhap) {
        this.hoten = hoten;
        this.email = email;
        this.hangXe = hangXe;
        this.thuNhap = thuNhap;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getHangXe() {
        return hangXe;
    }

    public void setHangXe(String hangXe) {
        this.hangXe = hangXe;
    }

    public double getThuNhap() {
        return thuNhap;
    }

    public void setThuNhap(double thuNhap) {
        this.thuNhap = thuNhap;
    }
    
    
}
