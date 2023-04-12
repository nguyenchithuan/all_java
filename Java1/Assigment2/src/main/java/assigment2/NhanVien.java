package assigment2;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class NhanVien{
    protected String maNV;
    protected String hoVaTen;
    protected int luong;

    public NhanVien() {
    }

    public NhanVien(String maNV, String hoVaTen, int luong) {
        this.maNV = maNV;
        this.hoVaTen = hoVaTen;
        this.luong = luong;
    }
    
    public int getThuNhap() {
        return this.luong;
    }
    
    public int getThueTN() {
        if(this.getThuNhap() < 9) {
            return 0;
        } else if(this.getThuNhap() <= 15){
            return luong * 10 / 100;
        } else {
            return luong * 12 / 100;
        }
    }
    
    public void nhapThongTin() {
        Scanner sc = new Scanner(System.in);
        System.out.println("--------------NhapNhanVien---------------");
        System.out.println("Nhap ma Nhan Vien: ");
        this.maNV = sc.nextLine();
        System.out.println("Nhap ho va ten Nhan Vien: ");
        this.hoVaTen = sc.nextLine();
        System.out.println("Nhap Luong Nhan Vien: ");
        this.luong = Integer.parseInt(sc.nextLine());
        System.out.println("------------------------------------------");
    }
    
    public void xuatThongTin() {
        Locale l = new Locale("vi", "VN");
        NumberFormat numf = NumberFormat.getInstance(l);
        System.out.println("--------------ShowNhanVien----------------");
        System.out.println("Ma Nhan Vien       : " + this.maNV);
        System.out.println("Ho va ten Nhan Vien: " + this.hoVaTen);
        System.out.println("Luong Nhan Vien    : " + numf.format(this.getThuNhap()));
        System.out.println("Thue Nhan Vien     : " + numf.format(this.getThueTN()));
        System.out.println("------------------------------------------");
    }

}
