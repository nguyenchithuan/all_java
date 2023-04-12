package fpt.hung;

import static fpt.hung.Main.menu;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class GiaoVienCN extends GiaoVien {

    public int phuCap;
    private ArrayList<GiaoVienCN> manggvcn = new ArrayList<>();

    public GiaoVienCN() {
    }

    public GiaoVienCN(int phuCap, String magv, String hoVaTen, int luong) {
        super(magv, hoVaTen, luong);
        this.phuCap = phuCap;
    }

    @Override
    public void nhap() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("================NHAPGVCN=================");
            System.out.println("Nhap ma gv: ");
            String ma = sc.nextLine();
            System.out.println("Nhap ho va ten gv: ");
            String ten = sc.nextLine();
            System.out.println("Nhap luong gv: ");
            int luong = Integer.parseInt(sc.nextLine());
            System.out.println("Nhap phu cap: ");
            int phuCap = Integer.parseInt(sc.nextLine());
            System.out.println("=========================================");
            GiaoVienCN gv = new GiaoVienCN(phuCap, ma, ten, luong);
            manggvcn.add(gv);
            System.out.println("Ban con muon tiep tuc hay khong(Y/N): ");
            String kq = sc.nextLine();
            if (kq.equalsIgnoreCase("n")) {
                break;
            }
        }
    }

    @Override
    public void xuatMotGV() {
        System.out.println("=================SHOWGVCN=================");
        System.out.println("Ma gvcn: " + this.magv);
        System.out.println("Ten gvcn: " + this.hoVaTen);
        System.out.println("Luong gvcn: " + this.luong);
        System.out.println("Phu cap gvcn: " + this.phuCap);
        System.out.println("==========================================");
    }

    @Override
    public void xuat() {
        System.out.println("--------------------ShowGiaoVien--------------------");
        for (GiaoVienCN gv : manggvcn) {
            System.out.println("=================SHOWGVCN=================");
            System.out.println("Ma gvcn: " + gv.magv);
            System.out.println("Ten gvcn: " + gv.hoVaTen);
            System.out.println("Luong gvcn: " + gv.luong);
            System.out.println("Phu cap gvcn: " + gv.phuCap);
            System.out.println("==========================================");
        }
        System.out.println("----------------------------------------------------");
    }

    @Override
    public void timKiemLuong() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap luong min: ");
        int min = Integer.parseInt(sc.nextLine());
        System.out.println("Nhap luong max: ");
        int max = Integer.parseInt(sc.nextLine());
        System.out.println("-------------CacGiaoVienTrongKhoanLuong--------------");
        for (GiaoVienCN gv : manggvcn) {
            if (min <= gv.luong && gv.luong <= max) {
                gv.xuatMotGV();
            }
        }
        System.out.println("-----------------------------------------------------");
    }

    @Override
    public void timGiaoVien() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ten can tim: ");
        String nhapTen = sc.nextLine();
        System.out.println("------------------CacGiaoVienCoTen-------------------");
        for (GiaoVienCN gv : manggvcn) {
            if (nhapTen.equalsIgnoreCase(gv.hoVaTen)) {
                gv.xuatMotGV();
            }
        }
        System.out.println("-----------------------------------------------------");
    }

    @Override
    public void sapXep() {
        Collections.sort(manggvcn, new Comparator<GiaoVienCN>() {
            @Override
            public int compare(GiaoVienCN o1, GiaoVienCN o2) {
                return o2.luong - o1.luong;
            }
        });
    }

    public void giaoVienChuNhiem() {
        GiaoVienCN gv = new GiaoVienCN();
        Scanner sc = new Scanner(System.in);
        int chon = 0;
        do {
            System.out.println("====================MENUGiaoVienChuNhiem======================");
            System.out.println("1. Nhap danh sach giao vien cn.");
            System.out.println("2. Xuat danh sach giam vien cn.");
            System.out.println("3. Tiem kiem giao vien cn theo khoang luong.");
            System.out.println("4. Tim kiem giao vien cn theo ten.");
            System.out.println("5. Sap xep giao vien cn giam dan theo luong.");
            System.out.println("0. Thoat.");
            System.out.println("==============================================================");
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
                case 0:
                    System.out.println("Cam on ban da chon chuc nang cua chung toi!");
                    break;
                default:
                    System.out.println("Moi ban chon lai cac chuc nang!(1->6)");
            }
        } while (chon != 0);
    }

}
