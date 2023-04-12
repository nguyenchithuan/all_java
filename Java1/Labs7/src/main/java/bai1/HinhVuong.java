package bai1;

/**
 *
 * @author ASUS
 */
public class HinhVuong extends HinhChuNhat{
    private double canh;

    public HinhVuong() {
    }

    public HinhVuong(double canh) {
        this.canh = canh;
    }

    @Override
    public double getChuVi() {
        return canh * 4;
    }

    @Override
    public double getDienTich() {
        return canh * canh;
    }

    @Override
    public void xuat() {
        System.out.println("===========ThongTinHV===========");
        System.out.println("Canh: " + this.canh);
        System.out.println("Chu vi HCM: " + this.getChuVi());
        System.out.println("Diem tich HCM: " + this.getDienTich());
        System.out.println("=================================");
    }
    
    
    
    
}
