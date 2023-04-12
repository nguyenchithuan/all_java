package QLSV;

import java.io.File;
import java.util.Scanner;

public class Test {

    public static void menu() {
        System.out.println("\n\n\n==========================Menu===========================");
        System.out.println("1. Them sinh vien vao danh sach");
        System.out.println("2. In danh sach sinh vien ra man hinh");
        System.out.println("3. Kiem tra danh sach co rong hay khong");
        System.out.println("4. Lay ra so luong sinh vien trong danh sach");
        System.out.println("5. Lam rong danh sach sinh vien");
        System.out.println("6. Kiem tra sinh vien co ton tai hay khong, dua theo MaSV");
        System.out.println("7. Xoa mot sinh vien, dua tren ten duoc nhap tu ban phim");
        System.out.println("8. Tim kiem tat ca sinh vien dua tren ten duoc nhap tu ban phim");
        System.out.println("10. Ghi file");
        System.out.println("11. Doc file");
        System.out.println("9. Xuat ra danh sach sinh vien co diem tu cao den thap");
        System.out.println("0. Thoat");
        System.out.println("=========================================================");
        System.out.println("Moi ban chon(1,2,3,4,5,6,7,8,9,10,11):");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        QuanLySV quanLy = new QuanLySV();
        int luaChon = 0;
        do {
            menu();
            luaChon = Integer.parseInt(sc.nextLine());
            switch (luaChon) {
                case 1:
                    quanLy.themSinhVien();
                    break;
                case 2:
                    quanLy.xuatDanhSach();
                    break;
                case 3:
                    System.out.println("Danh sach co rong hay khong: " + quanLy.kiemTraRong());
                    break;
                case 4:
                    System.out.println("So luong sinh vien: " + quanLy.soLuongSinhVien());
                    break;
                case 5:
                    quanLy.lamRongDanhSach();
                    break;
                case 6:
                    System.out.println("Nhap ma sv muon tim kiem: ");
                    String masv = sc.nextLine();
                    quanLy.kiemTraSinhVienTonTai(masv);
                    break;
                case 7:
                    System.out.println("Nhap ten muon xoa");
                    String ten = sc.nextLine();
                    quanLy.xoaMotSinhVien(ten);
                    break;
                case 8:
                    System.out.println("Nhap ten muon tim kiem: ");
                    ten = sc.nextLine();
                    quanLy.tinKiemSinhVienTheoTen(ten);
                    break;
                case 9:
                    quanLy.sapXepTheoDiem();
                    break;
                case 10:
                    System.out.println("Nhap file: ");
                    File nhapFile = new File(sc.nextLine());
                    quanLy.ghiFile(nhapFile);
                    break;
                case 11:
                    System.out.println("Nhap file: ");
                    nhapFile = new File(sc.nextLine());
                    quanLy.docFile(nhapFile);
                    break;
                default:
                    throw new AssertionError();
            }
        } while (luaChon != 0);
    }
}
