package Main;

import java.util.Scanner;

public class HangHoa {
    private String maHang;
    private String tenHang;
    private int soLuong;
    private int doGia;

    public HangHoa() {
        // dau hieu nhan biet
        // ten trung voi class
        // khong co gia tri tra ve
        // public
    }

    public HangHoa(String maHang, String tenHang, int soLuong, int doGia) {
        this.maHang = maHang;
        this.tenHang = tenHang;
        this.soLuong = soLuong;
        this.doGia = doGia;
        // cong dung: dung de khoi tao gia tri cho thuoc tinh
    }

    @Override
    public String toString() {
        return "HangHoa{" + "maHang=" + maHang + ", tenHang=" + tenHang + ", soLuong=" + soLuong + ", doGia=" + doGia + '}';
    }
    
    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ma hang: ");
        maHang = sc.nextLine();
        System.out.println("Nhap ten hang: ");
        tenHang = sc.nextLine();
        System.out.println("Nhap so luong: ");
        soLuong = Integer.parseInt(sc.nextLine());
        System.out.println("Nhap don gia: ");
        doGia = Integer.parseInt(sc.nextLine());
    }
    
    public void showHangHoa() {
        System.out.println("==============HangHoa==================");
        System.out.println("Ma hang hoa: " + this.maHang);
        System.out.println("Ten hang hoa: " + this.tenHang);
        System.out.println("So luong: " + this.soLuong);
        System.out.println("Don gia: " + this.doGia);
        System.out.println("=======================================");
    }
    
    public String getMaHang() {
        return maHang;
    }

    public String getTenHang() {
        return tenHang; //  tra lai gia tri cho thuoc tinh
    }

    public int getSoLuong() {
        return soLuong; // thiet lap gia tri cho thuoc tinh
    }

    public int getDoGia() {
        return doGia;
    }

    public void setMaHang(String maHang) {
        this.maHang = maHang;
    }

    public void setTenHang(String tenHang) {
        this.tenHang = tenHang;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public void setDoGia(int doGia) {
        this.doGia = doGia;
    }
           
}
