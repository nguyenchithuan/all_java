package fpt.hung;

import fpt.hung.GiaoVien;
import java.util.Scanner;

public class Main {
    public static void menu() {
        System.out.println("====================MENU======================");
        System.out.println("1. Nhap danh sach sinh vien.");
        System.out.println("2. Xuat danh sach sinh vien.");
        System.out.println("3. Tiem kiem giao vien theo khoang luong.");
        System.out.println("4. Tim kiem giao vien theo ten.");
        System.out.println("5. Sap xep giao vien giam dan theo luong.");
        System.out.println("6. Ke thua.");
        System.out.println("0. Thoat.");
        System.out.println("==============================================");
        System.out.println("Moi ban chon(1,2,3,4,5,6): ");
    }
    
    public static void main(String[] args) {
        GiaoVien gv = new GiaoVien();
        GiaoVienCN gvcn = new GiaoVienCN();
        Scanner sc = new Scanner(System.in);
        int chon = 0;
        do {            
            menu();
            chon = Integer.parseInt(sc.nextLine());
            switch (chon) {
                case 1:
                    gv.nhap();
                    break;
                case 2: 
                    gv.xuat();
                    break;
                case 3:
                    gv.timKiemLuong();
                    break;
                case 4: 
                    gv.timGiaoVien();
                    break;
                case 5:
                    gv.sapXep();
                    gv.xuat();
                    break;
                case 6:
                    gvcn.giaoVienChuNhiem();
                    break;
                case 0:
                    System.out.println("Cam on ban da chon chuc nang cua chung toi!");
                    break;
                default:
                    System.out.println("Moi ban chon lai cac chuc nang!(1->6)");
            }
        } while (chon != 0);
    }
}
