package fpt.test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Student extends ConNguoi implements Comparable<Student>{
    private String ma;
    
    ArrayList<Student> mangSV = new ArrayList<>();

    public Student() {
    }

    public Student(String ma, String ten, int tuoi, double diem) {
        super(ten, tuoi, diem);
        this.ma = ma;
    }
    
    
    public void nhapSV() {
        Scanner sc = new Scanner(System.in);
        while (true) {  
            System.out.println("================NhapSV=================");
            System.out.println("Nhap ma: ");
            String ma = sc.nextLine();
            System.out.println("Nhap ten: ");
            String ten = sc.nextLine();
            System.out.println("Nhap tuoi: ");
            int tuoi = Integer.parseInt(sc.nextLine());
            System.out.println("Nhap diem: ");
            double diem = Double.parseDouble(sc.nextLine());
            Student sv = new Student(ma, ten, tuoi, diem);
            mangSV.add(sv);
            System.out.println("=======================================");
            System.out.println("Ban co muon tiep tuc khong(Y/N): ");
            String kq = sc.nextLine();
            if(kq.equalsIgnoreCase("N")) {
                break;
            }
        }
    }
    
    public void thongTinMotHocSinh() {
        System.out.println("====================Show======================");
        System.out.println("Ma: " + this.ma);
        System.out.println("Ten: " + this.ten);
        System.out.println("Tuoi: " + this.tuoi);
        System.out.println("Diem: " + this.diem);
        System.out.println("Hoc luc: " + hocLuc());
        System.out.println("==============================================");
    }

    @Override
    public void xuatThongTin() {
        System.out.println("----------------------------------------------");
        for (Student sv : mangSV) {
            sv.thongTinMotHocSinh();
        }
        System.out.println("----------------------------------------------");
    }
    
    public void xoaSV(String ten) {
        for (int i = 0; i < mangSV.size(); i++) {
            if(mangSV.get(i).ten.equalsIgnoreCase(ten)) {
                mangSV.remove(i);
            }
        }
    }
    
    public void timKiem(String ten) {
        for (int i = 0; i < mangSV.size(); i++) {
            if(mangSV.get(i).ten.equalsIgnoreCase(ten)) {
                mangSV.get(i).thongTinMotHocSinh();
            }
        }
    }
    
    public void sapXep() {
        Collections.sort(mangSV);
    }

    @Override
    public int compareTo(Student o) {
        return (int) (this.diem - o.diem);
    }
    
}
