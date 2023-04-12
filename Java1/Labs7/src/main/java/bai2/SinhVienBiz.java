package bai2;

import java.util.Scanner;

public class SinhVienBiz extends SinhVienFoly{
    private double diemMarketing;
    private double diemSale;

    public SinhVienBiz() {
    }

    public SinhVienBiz(double diemMarketing, double diemSale, String hoVaTen, String nganh) {
        super(hoVaTen, nganh);
        this.diemMarketing = diemMarketing;
        this.diemSale = diemSale;
    }
    
    @Override
    public double getDiem() {
        return (diemMarketing * 2 + diemSale) / 3;
    }

    @Override
    public void nhap() {
         Scanner sc = new Scanner(System.in);
        System.out.println("==============NhapThongTinSVIT===============");
        System.out.println("Nhap ho va ten: ");
        this.hoVaTen = sc.nextLine();
        System.out.println("Nhap chuyen nganh:");
        this.nganh = sc.nextLine();
        System.out.println("Nhap diem Marketing: ");
        this.diemMarketing = Double.parseDouble(sc.nextLine());
        System.out.println("Nhap diem Sales: ");
        this.diemSale = Double.parseDouble(sc.nextLine());
    }

    @Override
    public void xuat() {
        System.out.println("=====================Show=====================");
        System.out.println("Ho va ten: " + this.hoVaTen);
        System.out.println("Chuyen nganh: " + this.nganh);
        System.out.println("Diem Marketing: " + this.diemMarketing);
        System.out.println("Diem sales: " + this.diemSale);
        System.out.println("Diem TB: " + this.getDiem());
        System.out.println("Hoc Luc: " + this.hocLuc());
        System.out.println("==============================================");
    }
    
}
