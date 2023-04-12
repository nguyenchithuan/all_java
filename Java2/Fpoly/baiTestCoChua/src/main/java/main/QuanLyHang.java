package main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class QuanLyHang {

    

    // tao 1 danh sach de quan ly hang hoa
    ArrayList<HangHoa> listHH = new ArrayList<>();

    

    public void menu() {
        Scanner sc = new Scanner(System.in);
        int chon = 0; // chon menu
        while(true) {
            System.out.println("\n\n\n==========================Menu==========================");
            System.out.println("1. Nhap danh sach hang.");
            System.out.println("2. Xuat danh sach hang hoa.");
            System.out.println("3. Cap nhap lai thong tin hang theo ma nhap tu ban phim.");
            System.out.println("4. Tim hang theo ten hang nhap vao");
            System.out.println("5. Sap xep hang theo ten giam dan");
            System.out.println("6. Xoa hang thoe ma nhap vao");
            System.out.println("7. Tim nhang co don gia lon nhat");
            System.out.println("8. Tim hang theo khoang soLuong nhap vao.");
            System.out.println("9. Hang ke thua.");
            System.out.println("0. Thoat");
            System.out.println("========================================================");
            System.out.println("Moi ban chon chuc nang(1,2,3,4,5,6,7,8,0): ");
            chon = Integer.parseInt(sc.nextLine());
            switch (chon) {
                case 1:
                    nhap();
                    break;
                case 2:
                    xuat();
                    break;
                case 3:
                    timTen();
                    break;
                case 4:
                    capNhat();
                    break;
                case 5:
                    sapXep();
                    break;
                case 6:
                    xoa();
                    break;
                case 7:
                    donGiaMax();
                    break;
                case 8:
                    timKhoang();
                    break;
                case 9:
                    keThua();
                    break;
                case 0:
                    System.exit(0); // dung toan bo truong trinh
                default:
                    System.out.println("May ngao a!");
            }
        }
    }
    
    private void nhap() {
        // nhap hang hoa
        // luu vao list
        HangHoa h = new HangHoa();
        // tao 1 hoi tuong: la h, kieu HangHoa
        h.nhap();
        listHH.add(h);
    }

    private void xuat() {
        for (HangHoa hangHoa : listHH) {
            hangHoa.showHangHoa();
        }
    }

    private void timTen() {
    }

    private void capNhat() {
        Scanner sc = new Scanner(System.in);
        String ma;
        System.out.println("Moi nhap ma hang can update: ");
        ma = sc.nextLine();
        int check = 0; // danh dau
        for (HangHoa hangHoa : listHH) {
            if(hangHoa.getMaHang().equalsIgnoreCase(ma)) {
                hangHoa.nhap();
                check = 1; // co tim thay
            }
        }
        if(check == 0) {
            System.out.println("Khong tim thay!");
        }
    }

    private void sapXep() {
        Comparator<HangHoa> com1 = new Comparator<HangHoa>() {
            @Override
            public int compare(HangHoa o1, HangHoa o2) {
                return o1.getTenHang().compareToIgnoreCase(o2.getTenHang());
            }
        };
        Collections.sort(listHH, com1);
        Collections.reverse(listHH); // dao nguoc
        this.xuat();
    }

    private void xoa() {
    }

    private void donGiaMax() {
    }

    private void timKhoang() {
    }

    private void keThua() {
    }

}
