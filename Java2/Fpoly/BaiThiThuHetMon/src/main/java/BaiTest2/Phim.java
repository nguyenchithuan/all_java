package BaiTest2;

import java.io.Serializable;

public class Phim implements Serializable{
    private String hoTen;
    private int namSinh;
    private String theLoai;
    private String hinhThuc;
    private String phimKinhDien;

    public Phim() {
    }

    public Phim(String hoTen, int namSinh, String theLoai, String hinhThuc, String phimKinhDien) {
        this.hoTen = hoTen;
        this.namSinh = namSinh;
        this.theLoai = theLoai;
        this.hinhThuc = hinhThuc;
        this.phimKinhDien = phimKinhDien;
    }

    public int getTuoi() {
        int tuoi = (2022 - namSinh);
        return tuoi;
    }
    
    public String getTinhCach() {
        if(theLoai.equalsIgnoreCase("Hanh dong")) {
            return "Manh me";
        } else if(theLoai.equalsIgnoreCase("Hai")) {
            return "Vui ve";
        } else {
            return "Tinh cam";
        }
    }
    
    
    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public int getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(int namSinh) {
        this.namSinh = namSinh;
    }

    public String getTheLoai() {
        return theLoai;
    }

    public void setTheLoai(String theLoai) {
        this.theLoai = theLoai;
    }

    public String getHinhThuc() {
        return hinhThuc;
    }

    public void setHinhThuc(String hinhThuc) {
        this.hinhThuc = hinhThuc;
    }

    public String getPhimKinhDien() {
        return phimKinhDien;
    }

    public void setPhimKinhDien(String phimKinhDien) {
        this.phimKinhDien = phimKinhDien;
    }
    
}
