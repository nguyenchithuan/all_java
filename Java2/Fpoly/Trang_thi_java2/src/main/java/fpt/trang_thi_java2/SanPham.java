package fpt.trang_thi_java2;

import java.io.Serializable;

public class SanPham implements Serializable{
    private String tenSp;
    private String dvt;
    private double donGia;

    public SanPham() {
    }

    public SanPham(String tenSp, String dvt, double donGia) {
        this.tenSp = tenSp;
        this.dvt = dvt;
        this.donGia = donGia;
    }
    
    public String getStatus() {
        if(donGia >= 5000) {
            return "San pham tot";
        } else {
            return "Trung binh";
        }
    }

    public String getTenSp() {
        return tenSp;
    }

    public void setTenSp(String tenSp) {
        this.tenSp = tenSp;
    }

    public String getDvt() {
        return dvt;
    }

    public void setDvt(String dvt) {
        this.dvt = dvt;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }
    
    
}
