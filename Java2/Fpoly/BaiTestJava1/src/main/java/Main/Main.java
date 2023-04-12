package Main;

import java.util.Scanner;

public class Main {

    public static void menu() {
        System.out.println("\n\n\n==========================Menu==========================");
        System.out.println("1. Nhap danh sach hang.");
        System.out.println("2. Xuat danh sach hang hoa.");
        System.out.println("3. Cap nhap lai thong tin hang theo ma nhap tu ban phim.");
        System.out.println("4. Tim hang theo ten hang nhap vao");
        System.out.println("5. Sap xep hang theo ten giam dan");
        System.out.println("6. Xoa hang thoe ma nhap vao");
        System.out.println("7. Tim nhang co don gia lon nhat");
        System.out.println("8. Tim hang theo khoang soLuong nhap vao.");
        System.out.println("9. Hang ke thua.");
        System.out.println("0. Thoat");
        System.out.println("========================================================");
        System.out.println("Moi ban chon chuc nang(1,2,3,4,5,6,7,8,0): ");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        QLHangHoa quanLy = new QLHangHoa();
        int luaChon = 0;
        do {
            menu();
            luaChon = Integer.parseInt(sc.nextLine());
            switch (luaChon) {
                case 1:
                    quanLy.nhapHangHoa();
                    break;
                case 2:
                    quanLy.xuatDanhSach();
                    break;
                case 3:
                    System.out.println("Nhap vao ma hang hoa muon cap nhat: ");
                    String ma = sc.nextLine();
                    quanLy.capNhatLaiThongTin(ma);
                    break;
                case 4:
                    System.out.println("Nhap ten muon tim: ");
                    String ten = sc.nextLine();
                    quanLy.timHangHoaTeoTen(ten);
                    break;
                case 5:
                    quanLy.sapXephangHoaTheoTen();
                    break;
                case 6:
                    System.out.println("Nhap ma muon xoa: ");
                    ma = sc.nextLine();
                    quanLy.xoaHangHoa(ma);
                    break;
                case 7:
                    quanLy.donGiaLonNhat();
                    break;
                case 8:
                    System.out.println("Nhap khoang so luong min: ");
                    int min = Integer.parseInt(sc.nextLine());
                    System.out.println("Nhap khoang so luong max: ");
                    int max = Integer.parseInt(sc.nextLine());
                    quanLy.timHangHoaTheoSoLuong(min, max);
                    break;
                case 9:
                    System.out.println("Nhap ma hang xuat khau: ");
                    String maHangHoa = sc.nextLine();
                    System.out.println("Nhap ten hang xuat khau: ");
                    String tenHangHoa = sc.nextLine();
                    System.out.println("Nhap so luong hang xuat khau: ");
                    int soLuongHangHoa = Integer.parseInt(sc.nextLine());
                    System.out.println("Nhap don gia hang xuat khau: ");
                    int donGiaHangHoa = Integer.parseInt(sc.nextLine());
                    System.out.println("Nhap quoc gia nhap hang");
                    String quocTichHangHoa = sc.nextLine();
                    HangXuatKhau hxk = new HangXuatKhau(quocTichHangHoa, maHangHoa, tenHangHoa, soLuongHangHoa, donGiaHangHoa);
                    hxk.showHangHoa();
                    break;
                default:
                    throw new AssertionError();
            }
        } while (luaChon != 0);
    }
    
    // cac tinh chat cua oop
    // dong goi
    // ke thua
    // tinh da hinh
    // truu tuong
}


