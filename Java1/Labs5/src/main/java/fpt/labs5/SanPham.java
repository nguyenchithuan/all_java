package fpt.labs5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SanPham implements Comparable<SanPham>{
    private String ten;
    private int gia;
    private ArrayList<SanPham> sp = new ArrayList<>();

    public SanPham() {
    }

    public SanPham(String ten, int gia) {
        this.ten = ten;
        this.gia = gia;
    }
    
    public SanPham nhapMotSanPham() {
        Scanner sc = new Scanner(System.in);
        System.out.println("===============================");
        System.out.println("Nhap ten san pham: ");
        String tenSp = sc.nextLine();
        System.out.println("Nhap gia san pham: ");
        int giaSp = Integer.parseInt(sc.nextLine());
        System.out.println("===============================");
        SanPham sp = new SanPham(tenSp, giaSp);
        return sp;
    }
    
    public void nhapMangSanPham() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so luong san pham: ");
        int n = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < n; i++) {
            sp.add(nhapMotSanPham());
        }
    }
    
    public void sapXep() {
        Collections.sort(sp);
        showMang();
    }
    
    public void xoaSanPham() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ten can xoa:");
        String ten = sc.nextLine();
        for (int i = 0; i < sp.size(); i++) {
            if (sp.get(i).ten.equals(ten)) {
                sp.remove(i);
                break;
            }
        }
        showMang();
    }
    
    public void giaTB() {
        int sum = 0;
        double tb = 0;
        for (SanPham s : sp) {
            sum += s.gia;
        }
        System.out.printf("Gia trung binh: %f",((double)sum/sp.size()));
    }
    
    public void showMotSanPham() {
        System.out.println("------------------------------------");
        System.out.println("Ten SP: " + this.ten);
        System.out.println("Gia SP: " + this.gia);
        System.out.println("------------------------------------");
    }
    
    public void showMang() {
        System.out.println("================SHOW================");
        for (SanPham s : sp) {
            s.showMotSanPham();
        }
        System.out.println("====================================");
    }
    
    
    
    //=========================================================================
    @Override
    public int compareTo(SanPham o) {
        return this.gia - o.gia;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getGia() {
        return gia;
    }

    public void setGia(int gia) {
        this.gia = gia;
    }

    public ArrayList<SanPham> getSp() {
        return sp;
    }

    public void setSp(ArrayList<SanPham> sp) {
        this.sp = sp;
    }
    
    
    
    
}
