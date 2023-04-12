package bai1;

public class HinhChuNhat {
    private double chieuDai;
    private double chieuRong;

    public HinhChuNhat() {
    }

    public HinhChuNhat(double chieuDai, double chieuRong) {
        this.chieuDai = chieuDai;
        this.chieuRong = chieuRong;
    }
    
    public double getChuVi() {
        return (chieuDai + chieuRong) * 2;
    }
    
    public double getDienTich() {
        return chieuDai * chieuRong;
    }
    
    public void xuat() {
        System.out.println("===========ThongTinHCN===========");
        System.out.println("Chieu dai: " + this.chieuDai);
        System.out.println("Chieu rong: " + this.chieuRong);
        System.out.println("Chu vi HCM: " + this.getChuVi());
        System.out.println("Diem tich HCM: " + this.getDienTich());
        System.out.println("=================================");
    }
}
