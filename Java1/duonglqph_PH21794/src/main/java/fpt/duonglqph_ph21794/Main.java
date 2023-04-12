package fpt.duonglqph_ph21794;

import java.util.Scanner;

public class Main {

    public static void menu() {
        System.out.println("======================MENU=====================");
        System.out.println("1. Nhap sv.");
        System.out.println("2. Xuat sv.");
        System.out.println("3. Tim sv theo ma.");
        System.out.println("4. Sap xep sinh vien theo chuyen nganh.");
        System.out.println("5. Ke thua");
        System.out.println("0. Thoat.");
        System.out.println("===============================================");
        System.out.println("Moi ban chon (1,2,3,4,5): ");
    }

    public static void main(String[] args) {
        QLSV sv = new QLSV();
        Scanner sc = new Scanner(System.in);
        int chon = 0;
        do {
            menu();
            chon = Integer.parseInt(sc.nextLine());
            switch (chon) {
                case 1:
                    sv.nhapSinhVien();
                    break;
                case 2:
                    sv.xuatMangSinhVien();
                    break;
                case 3:
                    System.out.println("Nhap ma can tin: ");
                    String ma = sc.nextLine();
                    sv.tinKiemSinhVien(ma);
                    break;
                case 4:
                    sv.sapXepChuyenNganh();
                    sv.xuatMangSinhVien();
                    break;
                case 5:
                    System.out.println("Nhap ms sv: ");
                    String mapl = sc.nextLine();
                    System.out.println("Nhap ten sv: ");
                    String ten = sc.nextLine();
                    System.out.println("Nhap chuyen nganh sv: ");
                    String chuyenNganh = sc.nextLine();
                    System.out.println("Nhap chuyen nganh hep: ");
                    int chuyenNganhHep = Integer.parseInt(sc.nextLine());
                    SinhVienPoly svp = new SinhVienPoly(chuyenNganhHep, mapl, ten, chuyenNganh);
                    svp.show();
                    break;
                case 0:
                    break;
                default:
                    throw new AssertionError();
            }
        } while (chon != 0);
    }
}
