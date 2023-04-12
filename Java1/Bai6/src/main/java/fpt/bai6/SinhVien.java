package fpt.bai6;

import java.rmi.StubNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class SinhVien extends Nguoi implements Comparable<SinhVien>{

    private String maSV;
    private String chuyenNganh;
    private String xepLoai;
    List<SinhVien> sv = new ArrayList<SinhVien>();
    
    public SinhVien(String maSV, String chuyenNganh, String xepLoai, HoTen hoten, DiaChi diaChi) {
        super(hoten, diaChi, 123456789);
        this.maSV = maSV;
        this.chuyenNganh = chuyenNganh;
        this.xepLoai = xepLoai;
    }

    public SinhVien() {
    }

    public void setXepLoai(String xepLoai) {
        this.xepLoai = xepLoai;
    }
    
    public SinhVien nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.println("=========================================");
        System.out.println("Nhap ma: ");
        String ma = sc.nextLine();
        System.out.println("Nhap chuyen nganh: ");
        String cn = sc.nextLine();
        System.out.println("Nhap xep loai: ");
        String xl = sc.nextLine();
        HoTen ht = new HoTen();
        System.out.println("Nhap ho: ");
        ht.setHo(sc.nextLine());
        System.out.println("Nhap dem: ");
        ht.setDem(sc.nextLine());
        System.out.println("Nhap ten: ");
        ht.setTen(sc.nextLine());
        System.out.println("Nhap dia chi: ");
        String d = sc.nextLine();
        System.out.println("=========================================");
        DiaChi dc = new DiaChi(d);
        SinhVien sv = new SinhVien(ma, cn, xl, ht, dc);
        return sv;
    }

    public void nhapMang() { // nhap vao mang
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so sv: ");
        int n = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < n; i++) {
            sv.add(nhap());
        }
    }

    public void xoaDanhSach() {
        Scanner sc = new Scanner(System.in);
        System.out.println("=========================================");
        System.out.println("Nhap xoa ma: ");
        String ma = sc.nextLine();
        for (int i = 0; i < sv.size(); i++) {
            if (ma.equals(sv.get(i).maSV)) {
                sv.remove(i);
            }
        }
        System.out.println("=========================================");
    }

    public void suaThongTin() {
        Scanner sc = new Scanner(System.in);
        System.out.println("=========================================");
        System.out.println("Nhap ten ma: ");
        String ma = sc.nextLine();
        
        for (int i = 0; i < sv.size(); i++) {
            if (ma.equals(sv.get(i).maSV)) {
                sv.set(i, nhap());
            }
        }
        System.out.println("=========================================");
    }

    public void timKiemDoiTuong() {
        Scanner sc = new Scanner(System.in);
        System.out.println("==========================================");
        System.out.println("Nhap ten: ");
        String ten = sc.nextLine();
        for (SinhVien sinhVien : sv) {
            if (ten.equals(sinhVien.getHoten().getTen())) {
                sinhVien.show();
                
                System.out.println("");
            }
        }
        System.out.println("=========================================");
    }
    
    public void sapXepTheoTen() {
        for(int i = 0; i < sv.size() - 1; i++) {
            for (int j = i + 1; j < sv.size(); j++) {
                if(sv.get(i).compareTo(sv.get(j)) > 0){
                    SinhVien temp = sv.get(i);
                    sv.set(i, sv.get(j));
                    sv.set(j, temp);
                }
            }
        }
    }
    
    public void show() { // xuat mang
        System.out.println("=========================================");
        System.out.println("Thanh pho: " + this.getDiaChi().getTenThanhPho());
        System.out.println("Ho va ten: " + this.getHoten().getHo() + " " + this.getHoten().getDem()
                + " " + this.getHoten().getTen());
        System.out.println("Ma: " + this.maSV);
        System.out.println("Chuyen nganh: " + this.chuyenNganh);
        System.out.println("Xep Loai: " + this.xepLoai);
        System.out.println("=========================================");
    }

    public void showMang() { // xuat mang
        for (SinhVien sinhVien : sv) {
            sinhVien.show();
        }
    }

    @Override
    public int compareTo(SinhVien o) {
        return this.getHoten().getTen().compareTo(o.getHoten().getTen());
    }

}
