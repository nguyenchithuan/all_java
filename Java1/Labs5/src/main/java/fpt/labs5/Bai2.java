package fpt.labs5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Bai2 {
    private ArrayList<String> chuoi = new ArrayList<>();
    
    private void menu() {
        System.out.println("\n\n\n");
        System.out.println("=====================MENU======================");
        System.out.println("1. Nhap danh s.println(\"2. Xuat danh sach ho va ten.\");\n" +
"        System.out.println(\"3. Xuat danh sach ngau nhien.\");\n" +
"        System.out.println(\"4. Sap xep giam dan va xuat danh sach.\");\n" +
"        System.out.println(\"5. Tim va xoa ho va ten tu ban phim.\");\n" +
"        System.out.println(\"6. Ket thuc.\");\n" +
"        System.out.println(\"===============================================\");\n" +
"        System.out.println(\"Moi ban chon chuc nang(1,2,3,4,5,6):\");\n" +
"    }\n" +
"    \n" +
"    private void nhapTen() {\n" +
"        Scanner sc = new Scanner(System.in);\n" +
"        System.out.println(\"Nhap so luong: \");ach ho va ten.");
        System.out.println("2. Xuat danh sach ho va ten.");
        System.out.println("3. Xuat danh sach ngau nhien.");
        System.out.println("4. Sap xep giam dan va xuat danh sach.");
        System.out.println("5. Tim va xoa ho va ten tu ban phim.");
        System.out.println("6. Ket thuc.");
        System.out.println("===============================================");
        System.out.println("Moi ban chon chuc nang(1,2,3,4,5,6):");
    }
    
    private void nhapTen() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so luong: ");
        int n = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap ho va ten: ");
            chuoi.add(sc.nextLine());
        }
    }
    
    private void show() {
        for (String s : chuoi) {
            System.out.println("Ho va ten: " + s);
        }
    }
    
    private void xuatDanhSachNgauNhien() {
        Collections.shuffle(chuoi);
        show();
    }
    
    private void sapXepGiamDan() {
        Collections.sort(chuoi);
        Collections.reverse(chuoi);
        show();
    }
    
    private void xoaHoVaTen() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ho va ten can xoa: ");
        String ten = sc.nextLine();
        for (int i = 0; i < chuoi.size(); i++) {
            if(chuoi.get(i).equals(ten)) {
                chuoi.remove(i);
                break;
            }
        }
        show();
    }
    
    public void TongHopCacChucNang() {
        Scanner sc = new Scanner(System.in);
        Bai2 b = new Bai2();
        int chon;
        do {
            menu();
            chon = Integer.parseInt(sc.nextLine());
            switch (chon) {
                case 1:
                    b.nhapTen();
                    break;
                case 2:
                    b.show();
                    break;
                case 3:
                    b.xuatDanhSachNgauNhien();
                    break;
                case 4:
                    b.sapXepGiamDan();
                    break;
                case 5:
                    b.xoaHoVaTen();
                    break;    
                case 6:
                    System.out.println("Cam on ban da dung chuc nang!");
                    break;
                default:
                    System.out.println("Moi ban nhap lai!");
            }
        } while (chon != 6);
    }
    
    
    
}
