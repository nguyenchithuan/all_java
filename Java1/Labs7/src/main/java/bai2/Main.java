package bai2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void menu() {
        System.out.println("=====================MENU====================");
        System.out.println("1. Nhap danh sach sinh vien.");
        System.out.println("2. Xuat danh sach sinh vien.");
        System.out.println("3. Xuat danh sach sinh vien co hoc luc gioi.");
        System.out.println("4. Sap xep danh sach sinh vien theo diem.");
        System.out.println("0. Ket thuc.");
        System.out.println("=============================================");
        System.out.println("Ban chon chuc nang nao(1,2,3,4): ");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<SinhVienIT> mangSinhVien = new ArrayList<>();
        int chon;
        do {
            menu();
            chon = Integer.parseInt(sc.nextLine());
            switch (chon) {
                case 1:
                    SinhVienIT it = new SinhVienIT();
                    it.nhap();
                    mangSinhVien.add(it);
                    break;
                case 2:
                    for (SinhVienIT sv : mangSinhVien) {
                         sv.xuat();
                    }
                    break;
                case 3:
                    for (SinhVienIT sv : mangSinhVien) {
                        if (sv.getDiem() >= 8) {
                            sv.xuat();
                        }
                    }
                    break;
                case 4:
                    Collections.sort(mangSinhVien);
                    for (SinhVienIT sv : mangSinhVien) {
                         sv.xuat();
                    }
                    break;
                case 0:
                    System.out.println("Cam on ban da chon chuc nang cua chung toi!");
                    break;
                default:
                    System.out.println("Moi ban chon lai cac chuc nang!");
            }
        } while (chon != 0);
    }
}
