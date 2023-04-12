package fpt.test;

import java.util.Scanner;

public class Main {

    public static void menu() {
        System.out.println("=====================MENU====================");
        System.out.println("1. Nhap thong tin SV.");
        System.out.println("2. Xuat thong tin SV.");
        System.out.println("3. Tim kiem thong tin SV.");
        System.out.println("4. Xoa thong tin SV");
        System.out.println("5. Sap xep thong tin SV.");
        System.out.println("0. Thoat.");
        System.out.println("=============================================");
        System.out.println("Moi ban chon(1,2,3,4): ");

    }

    public static void main(String[] args) {
        Student sv = new Student();
        Scanner sc = new Scanner(System.in);
        int chon = 0;
        do {
            menu();
            chon = Integer.parseInt(sc.nextLine());
            switch (chon) {
                case 1:
                    sv.nhapSV();
                    break;
                case 2:
                    sv.xuatThongTin();
                    break;
                case 3:
                    System.out.println("Nhap ten can tim kiem: ");
                    String ten = sc.nextLine();
                    sv.timKiem(ten);
                    break;
                case 4:
                    System.out.println("Nhap ten can xoa: ");
                    ten = sc.nextLine();
                    sv.xoaSV(ten);
                    break;
                case 5:
                    sv.sapXep();
                    break;
                case 0:
                    System.out.println("Cam on ban da chon chuc nang cua chung toi!");
                default:
                    System.out.println("Moi ban chon lai!");
            }
        } while (chon != 0);
    }
}
