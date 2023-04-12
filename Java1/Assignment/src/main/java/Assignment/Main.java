package Assignment;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import java.util.Scanner;

import java.util.Scanner;

public class Main {
    
    public static void menu() {
        System.out.println("\n\n");
        System.out.println("===========================MENU==============================");
        System.out.println("+ 1. Nhap danh sach nhan vien tu ban phim.                 +");
        System.out.println("+ 2. Xuat danh sach nhan vien ra man hinh.                 +");
        System.out.println("+ 3. Tim va hien thi nhan vien theo ma nhap tu ban phim.   +");
        System.out.println("+ 4. Xoa nhan vien theo ma nhap tu ban phim.               +");
        System.out.println("+ 5. Cap nhat thong tin nhan vien theo ma nhap tu ban phim.+");
        System.out.println("+ 6. Tim cac nhan vien theo khoang luong nhap tu ban phim. +");
        System.out.println("+ 7. Sap xep nhan vien theo ho va ten.                     +");
        System.out.println("+ 8. Sap xep nhan vien theo thu nhap.                      +");
        System.out.println("+ 9. Xuat 5 nhan vien co thu nhap cao nhat.                +");
        System.out.println("+ 0. Thoat.                                                +");
        System.out.println("============================================================");
        System.out.println("Moi Ban chon chuc nang(1,2,3,4,5,6,7,8,9): ");
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Khai bao mang ArrayList va doi chua.
        List<Employee> emp = new ArrayList<>();
        Employee nv = new Employee();
        
        int chon;
        do {
            Main.menu();
            
            try {
                chon = Integer.parseInt(sc.nextLine());
            } catch (Exception e) {
                System.out.println("Loi nhap! Tu dong chon chuc nang 2.!!!!!!");
                chon = 2;
            }
            
            switch (chon) {
                case 1:
                    nv.nhapNhanVien(emp);
                    break;
                case 2:
                    nv.showNhanVien(emp);
                    break;
                case 3:
                    nv.timMaNhanVien(emp);
                    break;
                case 4:
                    
                    break;
                case 5:
                    
                    break;
                case 6:
                    
                    break;
                case 7:
                    
                    break;
                case 8:
                    
                    break;
                case 9:
                    
                    break;
                case 0:
                    System.out.println("Cảm ơn các bạn đã dùng chức năng của chúng tôi!");
                    break;
                default:
                    System.out.println("Mời bạn chọn lại các chức năng thừ 1->9.");
            }
        } while (chon != 0);
        
    }
}
