package fpt.thuannc_ph26023;

import java.util.Scanner;

public class Main {

    public static void menu() {
        System.out.println("===================MENU====================");
        System.out.println("1. Nhap mot danh sach doi tuong.");
        System.out.println("2. Xuat danh sach doi tuong.");
        System.out.println("3. Xuat theo trang thai.");
        System.out.println("4. Xuat danh sach phong dang hoat dong theo khong dien tich.");
        System.out.println("5. Xuat danh sach phong co gia the lon nha va nho nhat.");
        System.out.println("6. Ke thua.");
        System.out.println("0. Thoat.");
        System.out.println("===========================================");
        System.out.println("Moi ban chon chuc nang(1,2,3,4,5, 6): ");
    }

    public static void main(String[] args) {
        QuanLyPhong ql = new QuanLyPhong();
        Scanner sc = new Scanner(System.in);
        int chon = 0;
        do {
            menu();
            chon = Integer.parseInt(sc.nextLine());
            switch (chon) {
                case 1:
                    ql.nhapMangPhong();
                    break;
                case 2:
                    ql.xuatDanhSach();
                    break;
                case 3:
                    System.out.println("Nhap mot trang trai(1/2): ");
                    int trangThai = Integer.parseInt(sc.nextLine());
                    ql.xuatTheoTrangThai(trangThai);
                    break;
                case 4:
                    System.out.println("Nhap min dien tich: ");
                    double min = Double.parseDouble(sc.nextLine());
                    System.out.println("Nhap max dien tich: ");
                    double max = Double.parseDouble(sc.nextLine());
                    ql.xuatTheoDienTich(min, max);
                    break;
                case 5:
                    ql.xuatDanhSachTheoGiaoTheu();
                    break;
                case 6:
                    PhongHoc ph = new PhongHoc(1, "p12345", 600, 1, 6000);
                    ph.inThongTin();
                    break;
                case 0:
                    System.out.println("Cam on ban da dung chuc nang cua chung toi!");
                default:
                    System.out.println("Moi ban nhap lai!");
            }
        } while (chon != 0);
    }
}
