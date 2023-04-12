package fpt.duonglqph_ph21794;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class QLSV {
    ArrayList<SinhVien> mangSV = new ArrayList<>();
    
    public void nhapSinhVien() {
        Scanner sc = new Scanner(System.in);
        while(true) {
            System.out.println("===================Nhap==================");
            System.out.println("Nhap ms sv: ");
            String ma = sc.nextLine();
            System.out.println("Nhap ten sv: ");
            String ten = sc.nextLine();
            System.out.println("Nhap chuyen nganh sv: ");
            String chuyenNganh = sc.nextLine();
            System.out.println("========================================");
            SinhVien sv = new SinhVien(ma, ten, chuyenNganh);
            mangSV.add(sv);
            System.out.println("Ban co muon tiep tuc hay khong(Y/N): ");
            String kq = sc.nextLine();
            if(kq.equalsIgnoreCase("N")) {
                break;
            }
        }
    }
    
    public void xuatMangSinhVien() {
        for (SinhVien sv : mangSV) {
            System.out.println(sv);
        }
    }
    
    public void tinKiemSinhVien(String ma) {
        for (int i = 0; i < mangSV.size(); i++) {
            if(mangSV.get(i).getMaSV().equalsIgnoreCase(ma)) {
                System.out.println(mangSV.get(i));
            }
        }
    }
    
    public void sapXepChuyenNganh() {
        Collections.sort(mangSV, new Comparator<SinhVien>() {
            @Override
            public int compare(SinhVien o1, SinhVien o2) {
                return o1.getChuyenNganh().compareToIgnoreCase(o2.getChuyenNganh());
            }
        });
    }
    
}
