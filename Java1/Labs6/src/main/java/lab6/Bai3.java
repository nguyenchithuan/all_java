package lab6;

import java.util.ArrayList;
import java.util.Scanner;

public class Bai3 {
     public static void main(String[] args) {
         Scanner  sc = new Scanner(System.in);
         ArrayList<SinhVien> sv = new ArrayList<>();
         String dinhDangEmail = "\\w+@+\\w+\\.+\\w{3,4}";
         String dinhDangSdt = "09[0-9]{8}";
         String dinhDangCmt = "[0-9]{9}";
         String dk;
         do {             
             SinhVien s = new SinhVien();
             System.out.println("Nhap ho va ten: ");
             String name = sc.nextLine();
             System.out.println("Nhap email: ");
             String email = sc.nextLine();
             if (email.matches(dinhDangEmail)) {
                 System.out.println("Ban da nhap dung!");
             } else {
                 System.out.println("Ban nhap sai!");
             }
             System.out.println("Nhap so dien thoat: ");
             String sdt = sc.nextLine();
             if (sdt.matches(dinhDangSdt)) {
                 System.out.println("Ban da nhap dung!");
             } else {
                 System.out.println("Ban nhap sai!");
             }
             System.out.println("Nhap chung minh thu: ");
             String cmt = sc.nextLine();
             if (cmt.matches(dinhDangCmt)) {
                 System.out.println("Ban da nhap dung!");
             } else {
                 System.out.println("Ban nhap sai!");
             }
             
             System.out.println("Ban muon tiep tuc hay khong(y/n):");
             dk = sc.nextLine();
         } while (dk.equalsIgnoreCase("y"));
    }
}
