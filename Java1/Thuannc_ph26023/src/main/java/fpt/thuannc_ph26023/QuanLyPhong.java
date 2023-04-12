package fpt.thuannc_ph26023;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class QuanLyPhong {
    ArrayList<Phong> mangP = new ArrayList<>();
    
    public Phong nhapMotPhong() {
        Scanner sc = new Scanner(System.in);
        System.out.println("=============Nhap==============");
        System.out.println("Nhap ten phong: ");
        String ten = sc.nextLine();
        System.out.println("Nhap dien tich: ");
        Double dienTich = Double.parseDouble(sc.nextLine());
        System.out.println("Nhap trang thai(1: Hoat dong, 2: Khong hoat dong):");
        int trangThai = Integer.parseInt(sc.nextLine());
        System.out.println("Nhap gia thue phong: ");
        Double giaThue = Double.parseDouble(sc.nextLine());
        System.out.println("================================");
        Phong p = new Phong(ten, dienTich, trangThai, giaThue);
        return p;
    }
    
    public void nhapMangPhong() {
        Scanner sc = new Scanner(System.in);
        while (true) {            
            mangP.add(nhapMotPhong());
            System.out.println("Ban con muon nhap tiep khong(Y/N): ");
            String kq = sc.nextLine();
            if (kq.equalsIgnoreCase("N")) {
                break;
            }
        }
    }
    
    public void xuatDanhSach() {
        for (Phong phong : mangP) {
            phong.inThongTin();
        }
    }
    
    public void xuatTheoTrangThai(int trangThai) {
        for (Phong phong : mangP) {
            if(trangThai == phong.getTrangThai()) {
                phong.inThongTin();
            }
        }
    }
    
    public void xuatTheoDienTich(double min, double max) {
        for (Phong phong : mangP) {
            if(phong.getDienTich() >= min && phong.getDienTich() <= max) {
                phong.inThongTin();
            }
        }
    }
    
    public void xuatDanhSachTheoGiaoTheu() {
        Collections.sort(mangP, new Comparator<Phong>() {
            @Override
            public int compare(Phong o1, Phong o2) {
                return (int) (o1.getGiaThuePhong() - o2.getGiaThuePhong());
            }
        });
        
        System.out.println("Danh sach phong co gia thue nho nhat: ");
        mangP.get(0).inThongTin();
        System.out.println("Danh sach phong co gia thue lon nhat: ");
        mangP.get(mangP.size() - 1).inThongTin();
    }
}
