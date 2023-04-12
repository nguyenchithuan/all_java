package main;

import java.io.File;
import java.util.Scanner;

public class Main {

    public static void menu() {
        System.out.println("==================MENU==================");
        System.out.println("1. Nhap danh sach doi tuong.");
        System.out.println("2. Xuat danh sach doi tuong.");
        System.out.println("3. Tim kiem SV theo ma.");
        System.out.println("4. Sap xep danh sach theo chuyen ngang.");
        System.out.println("5. Ke thua.");
        System.out.println("6. Ghi file");
        System.out.println("0. Thoat.");
        System.out.println("========================================");
        System.out.println("Moi ban chon(1,2,3,4,5): ");
    }

    public static void main(String[] args) {
        QLSV sv = new QLSV();
        int chon = 0;
        Scanner sc = new Scanner(System.in);

        do {
            menu();
            chon = Integer.parseInt(sc.nextLine());
            switch (chon) {
                case 1:
                    sv.nhapSinhVien();
                    break;
                case 2:
                    sv.xuatDanhSach();
                    break;
                case 3:
                    System.out.println("Nhap ma: ");
                    String ma = sc.nextLine();
                    sv.timMa(ma);
                    break;
                case 4:
                    sv.sapXep();
                    break;
                case 5:
                    System.out.println("Nhap ma: ");
                    ma = sc.nextLine();
                    System.out.println("Nhap ten: ");
                    String ten = sc.nextLine();
                    System.out.println("Nhap chuyen nganh: ");
                    String chuyenNganh = sc.nextLine();
                    System.out.println("Nhap chuyen ngang hep(1: java, 2: C#)");
                    String chuyenNganhHep = sc.nextLine();
                    SinhVienPoly p = new SinhVienPoly(chon, ma, ten, chuyenNganh);
                    p.inThongTin();
                    break;
                case 6:
                    System.out.println("Nhap file");
                    String chuoiFile = sc.nextLine();
                    File file = new File(chuoiFile);
                    sv.ghiFile(file);
                    break;
                case 0:
                    System.out.println("Cam on ban da chon chuc nang cua chung toi!");
                    break;
                default:
                    System.out.println("Moi ban chon lai!");
            }
        } while (chon != 0);
    }
}
