package fpt.labs4;

import java.util.Scanner;

public class SanPham {
    // tao ra cac thuoc tinh(Danh tu)
    private String tenSP;
    private double donGia;
    private double giamGia;

    public SanPham() {
    }

    public SanPham(String tenSP, double donGia) {
        this.tenSP = tenSP;
        this.donGia = donGia;
    }

    public SanPham(String tenSP, double donGia, double giamGia) {
        this(tenSP, donGia);
        this.giamGia = giamGia;
    }
    
    
    //---------------------------ThucHienPhuongThuc-----------------------------
    // tao ra cac phuong thuc (Dong tu): hành dong.
    private double thueNhapKhau() {
        return donGia*0.1;
    }
    
    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ten: ");
        this.tenSP = sc.nextLine();
        System.out.println("Nhap don gia: ");
        this.donGia = Double.parseDouble(sc.nextLine());
        System.out.println("Nhap giam gia: ");
        this.giamGia = Double.parseDouble(sc.nextLine());
    }
    
    public void show() {
        System.out.println("=============ThongTin==============");
        System.out.println("Thong tin san pham");
        System.out.println("Ten san pham: " + this.getTenSP());
        System.out.printf("Don gia: %.0f\n",this.getDonGia());
        System.out.printf("Giam gia: %.0f\n",this.giamGia);
        System.out.println("Thue nhap khau: " + this.thueNhapKhau());
        System.out.println("===================================");
    }
    
    //--------------------------------KetThuc-----------------------------------

    public String getTenSP() {
        return tenSP;
    }

    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    public double getGiamGia() {
        return giamGia;
    }

    public void setGiamGia(double giamGia) {
        this.giamGia = giamGia;
    }
    
}
