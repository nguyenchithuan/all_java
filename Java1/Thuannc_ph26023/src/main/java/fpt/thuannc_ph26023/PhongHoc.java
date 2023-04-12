package fpt.thuannc_ph26023;

public class PhongHoc extends Phong{
    private int loaiPhong;

    public PhongHoc() {
    }
    
    public PhongHoc(int loaiPhong, String ten, double dienTich, int trangThai, double giaThuePhong) {
        super(ten, dienTich, trangThai, giaThuePhong);
        this.loaiPhong = loaiPhong;
    }

    public int getLoaiPhong() {
        return loaiPhong;
    }

    public void setLoaiPhong(int loaiPhong) {
        this.loaiPhong = loaiPhong;
    }

    @Override
    public void inThongTin() {
        System.out.println("================ThongTin================");
        System.out.println("Ten: " + this.getTen());
        System.out.println("Dien tich: " + this.getDienTich());
        System.out.println("Trang thai: " + this.getTrangThai());
        System.out.println("Gia thue phong: " + this.getGiaThuePhong());
        System.out.println("Loai phong: " + this.loaiPhong);
        System.out.println("========================================");
    }
    
    
}
