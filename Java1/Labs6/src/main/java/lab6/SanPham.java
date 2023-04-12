package lab6;

import java.util.Scanner;

public class SanPham {
    private String ten;
    private String hang;
    private double donGia;

    public SanPham() {
    }

    public SanPham(String ten, String hang, double donGia) {
        this.ten = ten;
        this.hang = hang;
        this.donGia = donGia;
    }

    public double getDonGia() {
        return donGia;
    }

    public String getHang() {
        return hang;
    }

    public String getTen() {
        return ten;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    public void setHang(String hang) {
        this.hang = hang;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    @Override
    public String toString() {
        return "SanPham{" + "ten=" + ten + ", hang=" + hang + ", donGia=" + donGia + '}';
    }
    
    public SanPham nhapThongTinSanPham() {
        Scanner sc = new Scanner(System.in);
        int i = 1;
        System.out.println("Nhap san pham thu " + i + ":");
        System.out.println("Nhap ten:");
        String ten = sc.nextLine();
        System.out.println("Nhap hang:");
        String hang = sc.nextLine();
        System.out.println("Nhap gia:");
        double donGia = sc.nextDouble();
        sc.nextLine();
        SanPham s = new SanPham(ten, hang, donGia);
        i++;
        return s;
    }
}
