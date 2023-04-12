package bai2;

import java.util.Scanner;

public class SinhVienIT extends SinhVienFoly implements Comparable<SinhVienIT>{
    private double diemJava;
    private double diemHtml;
    private double diemCss;

    public SinhVienIT() {
    }

    public SinhVienIT(double diemJava, double DiemHtml, double DiemCss, String hoVaTen, String nganh) {
        super(hoVaTen, nganh);
        this.diemJava = diemJava;
        this.diemHtml = DiemHtml;
        this.diemCss = DiemCss;
    }
    
    @Override
    public double getDiem() {
        return (2 * diemJava + diemCss + diemHtml) / 4;
    }

    @Override
    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.println("==============NhapThongTinSVIT===============");
        System.out.println("Nhap ho va ten: ");
        this.hoVaTen = sc.nextLine();
        System.out.println("Nhap chuyen nganh:");
        this.nganh = sc.nextLine();
        System.out.println("Nhap diem java: ");
        this.diemJava = Double.parseDouble(sc.nextLine());
        System.out.println("Nhap diem Html: ");
        this.diemHtml = Double.parseDouble(sc.nextLine());
        System.out.println("Nhap diem Css: ");
        this.diemCss = Double.parseDouble(sc.nextLine());
    }

    @Override
    public void xuat() {
        System.out.println("=====================Show=====================");
        System.out.println("Ho va ten: " + this.hoVaTen);
        System.out.println("Chuyen nganh: " + this.nganh);
        System.out.println("Diem Java: " + this.diemJava);
        System.out.println("Diem Html: " + this.diemHtml);
        System.out.println("Diem Css: " + this.diemCss);
        System.out.println("Diem TB: " + this.getDiem());
        System.out.println("Hoc Luc: " + this.hocLuc());
        System.out.println("==============================================");
    }

    @Override
    public int compareTo(SinhVienIT o) {
        return (int) (this.getDiem() - o.getDiem());
    }
    
    
}
