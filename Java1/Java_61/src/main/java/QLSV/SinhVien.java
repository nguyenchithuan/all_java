package QLSV;

import java.io.Serializable;

public class SinhVien implements Serializable{
    private String maSv;
    private String hoVaTen;
    private int namSinh;
    private double dtb;

    public SinhVien() {
    }

    public SinhVien(String maSv, String hoVaTen, int namSinh, double dtb) {
        this.maSv = maSv;
        this.hoVaTen = hoVaTen;
        this.namSinh = namSinh;
        this.dtb = dtb;
    }
    
    public void inThongTin() {
        System.out.println("------------ThongTin------------");
        System.out.println("Ma sinh vien: " + this.maSv);
        System.out.println("Ten sinh vien: " + this.hoVaTen);
        System.out.println("Nam sinh: " + this.namSinh);
        System.out.println("Diem trung binh: " + this.dtb);
        System.out.println("--------------------------------");
    }

    @Override
    public String toString() {
        return "SinhVien{" + "maSv=" + maSv + ", hoVaTen=" + hoVaTen + ", namSinh=" + namSinh + ", dtb=" + dtb + '}';
    }

    public double getDtb() {
        return dtb;
    }

    public String getHoVaTen() {
        return hoVaTen;
    }

    public String getMaSv() {
        return maSv;
    }

    public int getNamSinh() {
        return namSinh;
    }

    public void setDtb(double dtb) {
        this.dtb = dtb;
    }

    public void setHoVaTen(String hoVaTen) {
        this.hoVaTen = hoVaTen;
    }

    public void setMaSv(String maSv) {
        this.maSv = maSv;
    }

    public void setNamSinh(int namSinh) {
        this.namSinh = namSinh;
    }
    
    
}
