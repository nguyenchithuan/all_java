package fpt.labs2;

import java.util.Scanner;

public class Menu {

    public static void show() {
        Scanner sc = new Scanner(System.in);
        int chon;
        do {
            System.out.println("/n/n");
            System.out.println("================MENU=================");
            System.out.println("*  1. Giai phuong trinh bac 1.      *");
            System.out.println("*  2. Giai phuong trinh bac 2.      *");
            System.out.println("*  3. Tinh tien dien.               *");
            System.out.println("*  4. Thoat.                        *");
            System.out.println("=====================================");
            System.out.println("Ban chon chuc nang nao: ");
            chon = sc.nextInt();

            switch (chon) {
                case 1:
                    Bai1.ptb1();
                    break;
                case 2:
                    new Bai2().ptb2();
                    break;
                case 3:
                    Bai3 b = new Bai3();
                    b.tinhSoTienDien();
                    break;
                case 4:
                    System.out.println("Cam on ban da dung chuong trinh!");
                    break;
                default:
                    System.out.println("Vui long nhap lai!");
                    break;
            }
        } while (chon != 4);
    }
}
