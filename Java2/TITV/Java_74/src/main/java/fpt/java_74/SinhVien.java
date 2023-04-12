package fpt.java_74;

import java.io.Serializable;

public class SinhVien implements Serializable{
    private String maSv;
    private String hoTen;
    private String chuyenNganh;

    public SinhVien() {
    }

    public SinhVien(String maSv, String hoTen, String chuyenNganh) {
        this.maSv = maSv;
        this.hoTen = hoTen;
        this.chuyenNganh = chuyenNganh;
    }
    
    public void inThongTin () {
        System.out.println("===============ThongTin===============");
        System.out.println("Ma SV: " + this.maSv);
        System.out.println("Ho va ten: " + this.hoTen);
        System.out.println("Chuyen ngang: " + this.chuyenNganh);
        System.out.println("======================================");
    }

    @Override
    public String toString() {
        return "SinhVien{" + "maSv=" + maSv + ", hoTen=" + hoTen + ", chuyenNganh=" + chuyenNganh + '}';
    }

    public String getMaSv() {
        return maSv;
    }

    public void setMaSv(String maSv) {
        this.maSv = maSv;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getChuyenNganh() {
        return chuyenNganh;
    }

    public void setChuyenNganh(String chuyenNganh) {
        this.chuyenNganh = chuyenNganh;
    }
    
    
}
