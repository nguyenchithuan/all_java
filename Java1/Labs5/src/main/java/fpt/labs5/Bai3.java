package fpt.labs5;

import java.util.Scanner;

public class Bai3 {
    
    public static void menu() {
        System.out.println("\n\n\n");
        System.out.println("=========================MENU=========================");
        System.out.println("1. Nhap danh sach san pham tu ban phim.");
        System.out.println("2. Sap xep giam dan theo gia  va xuat ra man hinh.");
        System.out.println("3. Tim va xoa san pham the ten nhap  tu ban phim.");
        System.out.println("4. Xuat gia trung binh cua cac san pham.");
        System.out.println("0. Thoat.");
        System.out.println("=======================================================");
        System.out.println("Moi ban chon chuc nang(1,2,3,4): ");
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SanPham sp = new SanPham();
        int chon;
        do {
            menu();
            chon = Integer.parseInt(sc.nextLine());
            switch (chon) {
                case 1:
                    sp.nhapMangSanPham();
                    break;
                case 2:
                    sp.sapXep();
                    break;
                case 3:
                    sp.xoaSanPham();
                    break;
                case 4:
                    sp.giaTB();
                    break;
                case 0:
                    System.out.println("Cam on ban da dung chuc nang!");
                    break;
                default:
                    System.out.println("Moi ban nhap lai!");
            }
        } while (chon != 0);
    }
}
