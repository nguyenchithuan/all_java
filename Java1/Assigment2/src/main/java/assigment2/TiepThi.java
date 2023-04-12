package assigment2;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class TiepThi extends NhanVien{
    private int danhSoBanHang;
    private int hoaHong;

    public TiepThi() {
    }

    public TiepThi(int danhSoBanHang, int hoaHong, String maNV, String hoVaTen, int luong) {
        super(maNV, hoVaTen, luong);
        this.danhSoBanHang = danhSoBanHang;
        this.hoaHong = hoaHong;
    }
    
    @Override
    public int getThuNhap() {
        return this.luong + (this.danhSoBanHang * this.hoaHong) / 100;
    }

    @Override
    public void nhapThongTin() {
        Scanner sc = new Scanner(System.in);
        System.out.println("--------------NhapNhanVien---------------");
        System.out.println("Nhap ma Tiep Thi: ");
        this.maNV = sc.nextLine();
        System.out.println("Nhap ho va ten Tiep Thi: ");
        this.hoVaTen = sc.nextLine();
        System.out.println("Nhap Luong Tiep Thi: ");
        this.luong = Integer.parseInt(sc.nextLine());
        System.out.println("Nhap danh so ban hang: ");
        this.danhSoBanHang = Integer.parseInt(sc.nextLine());
        System.out.println("Nhap hoa hong: ");
        this.hoaHong = Integer.parseInt(sc.nextLine());
        System.out.println("------------------------------------------");
    }
    
    

    @Override
    public void xuatThongTin() {
        Locale l = new Locale("vi", "VN");
        NumberFormat numf = NumberFormat.getInstance(l);
        System.out.println("==============ShowTiepThi================");
        System.out.println("Ma Tiep Thi       : " + this.maNV);
        System.out.println("Ho va ten Tiep Thi: " + this.hoVaTen);
        System.out.println("Doanh so ban hang : " + this.danhSoBanHang);
        System.out.println("Hoa hong          : " + this.hoaHong);
        System.out.println("Luong Tiep Thi    : " + numf.format(this.getThuNhap()));
        System.out.println("Thue Tiep Thi     : " + numf.format(this.getThueTN()));
        System.out.println("==========================================");
    }

    public int getDanhSoBanHang() {
        return danhSoBanHang;
    }

    public void setDanhSoBanHang(int danhSoBanHang) {
        this.danhSoBanHang = danhSoBanHang;
    }

    public int getHoaHong() {
        return hoaHong;
    }

    public void setHoaHong(int hoaHong) {
        this.hoaHong = hoaHong;
    }

    
}
