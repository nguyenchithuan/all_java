package fpt.thuannc_ph26023;

public class Phong {
    private String ten;
    private double dienTich;
    private int trangThai;
    private double giaThuePhong;

    public Phong() {
    }

    public Phong(String ten, double dienTich, int trangThai, double giaThuePhong) {
        this.ten = ten;
        this.dienTich = dienTich;
        this.trangThai = trangThai;
        this.giaThuePhong = giaThuePhong;
    }

    

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public double getDienTich() {
        return dienTich;
    }

    public void setDienTich(double dienTich) {
        this.dienTich = dienTich;
    }

    public int getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(int trangThai) {
        this.trangThai = trangThai;
    }

    public double getGiaThuePhong() {
        return giaThuePhong;
    }

    public void setGiaThuePhong(double giaThuePhong) {
        this.giaThuePhong = giaThuePhong;
    }
    
    public void inThongTin() {
        System.out.println("================ThongTin================");
        System.out.println("Ten: " + this.ten);
        System.out.println("Dien tich: " + this.dienTich);
        System.out.println("Trang thai: " + this.trangThai);
        System.out.println("Gia thue phong: " + this.giaThuePhong);
        System.out.println("========================================");
    }
    
}
