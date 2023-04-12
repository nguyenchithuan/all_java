package main;

import java.io.Serializable;

public class SinhVienPoly extends SinhVien implements Serializable{
    private int chuyenNganhKep;

    public SinhVienPoly() {
    }

    public SinhVienPoly(int chuyenNganhKep, String maSv, String hoTen, String chuyenNganh) {
        super(maSv, hoTen, chuyenNganh);
        this.chuyenNganhKep = chuyenNganhKep;
    }

    public int getChuyenNganhKep() {
        return chuyenNganhKep;
    }

    public void setChuyenNganhKep(int chuyenNganhKep) {
        this.chuyenNganhKep = chuyenNganhKep;
    }

    @Override
    public void inThongTin() {
        System.out.println("===============ThongTin===============");
        System.out.println("Ma SV: " + this.getMaSv());
        System.out.println("Ho va ten: " + this.getHoTen());
        System.out.println("Chuyen ngang: " + this.getChuyenNganh());
        System.out.println("Chuyen ngang hep: " + this.chuyenNganhKep);
        System.out.println("======================================");
    }
    
    
}
