package assigment2;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class TruongPhong extends NhanVien{
    private int luongTrachNhiem;

    public TruongPhong() {
    }

    public TruongPhong(int luongTrachNhiem, String maNV, String hoVaTen, int luong) {
        super(maNV, hoVaTen, luong);
        this.luongTrachNhiem = luongTrachNhiem;
    }

    @Override
    public int getThuNhap() {
        return super.luong + this.luongTrachNhiem;
    }

    @Override
    public void nhapThongTin() {
        Scanner sc = new Scanner(System.in);
        System.out.println("--------------NhapTruongPhong---------------");
        System.out.println("Nhap ma Truong phong: ");
        this.maNV = sc.nextLine();
        System.out.println("Nhap ho va ten Truong phong: ");
        this.hoVaTen = sc.nextLine();
        System.out.println("Nhap Luong Truong phong: ");
        this.luong = Integer.parseInt(sc.nextLine());
        System.out.println("Nhap luong trach nhiem: ");
        this.luongTrachNhiem = Integer.parseInt(sc.nextLine());
        System.out.println("------------------------------------------");
    }
    
    

    @Override
    public void xuatThongTin() {
        Locale l = new Locale("vi", "VN");
        NumberFormat numf = NumberFormat.getInstance(l);
        System.out.println("==============ShowTruongPhong================");
        System.out.println("Ma Truong phong       : " + this.maNV);
        System.out.println("Ho va ten Truong phong: " + this.hoVaTen);
        System.out.println("Luong trach nhiem     : " + this.luongTrachNhiem);
        System.out.println("Luong Truong phong    : " + numf.format(this.getThuNhap()));
        System.out.println("Thue Truong phong     : " + numf.format(this.getThueTN()));
        System.out.println("==========================================");
    }

    public int getLuongTrachNhiem() {
        return luongTrachNhiem;
    }

    public void setLuongTrachNhiem(int luongTrachNhiem) {
        this.luongTrachNhiem = luongTrachNhiem;
    }
    
}
