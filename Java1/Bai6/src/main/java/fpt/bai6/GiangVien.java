package fpt.bai6;

import java.util.ArrayList;
import java.util.Scanner;



public class GiangVien extends Nguoi{
    private String maGiangVien;
    private int soNamKinhNghiem;

    public GiangVien() {
    }

    public GiangVien(String maGiangVien, int soNamKinhNghiem, HoTen hoten, DiaChi diaChi, int phoneNumber) {
        super(hoten, diaChi, phoneNumber);
        this.maGiangVien = maGiangVien;
        this.soNamKinhNghiem = soNamKinhNghiem;
    }
    
    public GiangVien nhapMotGiangVien() {
        Scanner sc = new Scanner(System.in);
        System.out.println("===================================");
        System.out.println("Nhap ma: ");
        String ma = sc.nextLine();
        
        System.out.println("NHap so nam kinh nghiem: ");
        int soNamKinhNghiem = Integer.parseInt(sc.nextLine());
        
        HoTen ht = new HoTen();
        System.out.println("Nhap ho: ");
        ht.setHo(sc.nextLine());
        System.out.println("Nhap dem: ");
        ht.setDem(sc.nextLine());
        System.out.println("Nhap ten: ");
        ht.setTen(sc.nextLine());
        
        DiaChi dc = new DiaChi();
        System.out.println("Nhap thanh pho: ");
        dc.setTenThanhPho(sc.nextLine()); 
        
        System.out.println("Nhap std: ");
        int sdt = Integer.parseInt(sc.nextLine());
        
        GiangVien gv = new GiangVien(ma, soNamKinhNghiem, ht, dc, sdt);
        return gv;
    }
    
    public void nhapMang(ArrayList<GiangVien> gv) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so GV: ");
        int n = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < n; i++) {
            gv.add(nhapMotGiangVien());
        }
    }
    
    public void suaThongTin(ArrayList<GiangVien> gv) {
        System.out.println("==================================");
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ma GV: ");
        String ma = sc.nextLine();
        for (int i = 0; i < gv.size(); i++) {
            if(ma.equals(gv.get(i).maGiangVien)) {
                gv.set(i, nhapMotGiangVien());
            }
        }
    }
    
    public void xoaThongTin(ArrayList<GiangVien> gv) {
        System.out.println("=================================");
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ma GV: ");
        String ma = sc.nextLine();
        for (int i = 0; i < gv.size(); i++) {
            if(ma.equals(gv.get(i).maGiangVien)) {
               gv.remove(i);
            }
        }
    }
    
    public void timThongTin(ArrayList<GiangVien> gv) {
        System.out.println("=================================");
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ten GV: ");
        String ma = sc.nextLine();
        for (int i = 0; i < gv.size(); i++) {
            if(ma.equals(gv.get(i).getHoten().getTen())) {
                showMotGiangVien(gv.get(i));
            }
        }
    }
    
    public void showMotGiangVien(GiangVien gv) {
        System.out.println("===================================");
        System.out.println("Nhap ma: " + gv.maGiangVien);
        System.out.println("NHap so nam kinh nghiem: " + gv.soNamKinhNghiem);
        System.out.println("Nhap ho: " + gv.getHoten().getHo() + " " + gv.getHoten().getDem() + " " + gv.getHoten().getTen());
        System.out.println("Nhap thanh pho: " + gv.getDiaChi().getTenThanhPho());
        System.out.println("Nhap std: " + gv.getPhoneNumber());
    }
    
    public void showMang(ArrayList<GiangVien> gv) {
        for (GiangVien giangVien : gv) {
            showMotGiangVien(giangVien);
        }
    }
}
