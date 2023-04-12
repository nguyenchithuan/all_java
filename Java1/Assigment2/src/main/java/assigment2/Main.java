package assigment2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

    public static void menu() {
        System.out.println("\n\n");
        System.out.println("===========================MENU===============================");
        System.out.println("+ 1.  Nhap danh sach Nhan Vien tu ban phim.                  +");
        System.out.println("+ 2.  Nhap danh sach Tiep Thi tu ban phim.                   +");
        System.out.println("+ 3.  Nhap danh sach Truong Phong tu ban phim.               +");
        System.out.println("+ 4.  Xuat danh sach Nhan Vien ra man hinh.                  +");
        System.out.println("+ 5.  Tim va hien thi theo ma nhap tu ban phim.              +");
        System.out.println("+ 6.  Xoa theo ma nhap tu ban phim.                          +");
        System.out.println("+ 7.  Cap nhat thong tin nhan vien theo ma nhap tu ban phim. +");
        System.out.println("+ 8.  Tim cac nhan vien theo khoang luong nhap tu ban phim.  +");
        System.out.println("+ 9.  Sap xep nhan vien theo ho va ten.                      +");
        System.out.println("+ 10. Sap xep nhan vien theo thu nhap.                       +");
        System.out.println("+ 11. Xuat 5 nhan vien co thu nhap cao nhat.                 +");
        System.out.println("+ 0.  Thoat.                                                 +");
        System.out.println("==============================================================");
        System.out.println("Moi Ban chon chuc nang(0,1,2,3,4,5,6,7,8,9): ");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<NhanVien> mangNV = new ArrayList<>();
        ArrayList<TiepThi> mangTT = new ArrayList<>();
        ArrayList<TruongPhong> mangTP = new ArrayList<>();
        int chon;
        do {
            menu();
            chon = Integer.parseInt(sc.nextLine());
            switch (chon) {
                case 1:
                    NhanVien nv = new NhanVien();
                    nv.nhapThongTin();
                    mangNV.add(nv);
                    break;
                case 2:
                    TiepThi tt = new TiepThi();
                    tt.nhapThongTin();
                    mangTT.add(tt);
                    break;
                case 3:
                    TruongPhong tp = new TruongPhong();
                    tp.nhapThongTin();
                    mangTP.add(tp);
                    break;
                case 4:
                    System.out.println("==================ThongTinCacNhanVien====================");
                    for (NhanVien n : mangNV) {
                        n.xuatThongTin();
                    }
                    for (TiepThi t : mangTT) {
                        t.xuatThongTin();
                    }
                    for (TruongPhong p : mangTP) {
                        p.xuatThongTin();
                    }
                    System.out.println("=========================================================");
                    break;
                case 5:
                    System.out.println("Nhap Ma ma ban muon tim: ");
                    String ma = sc.nextLine();
                    for (NhanVien n : mangNV) {
                        if (n.maNV.equalsIgnoreCase(ma)) {
                            n.xuatThongTin();
                        }
                    }
                    for (TiepThi t : mangTT) {
                        if (t.maNV.equalsIgnoreCase(ma)) {
                            t.xuatThongTin();
                        }
                    }
                    for (TruongPhong p : mangTP) {
                        if (p.maNV.equalsIgnoreCase(ma)) {
                            p.xuatThongTin();
                        }
                    }
                    break;
                case 6:
                    System.out.println("Nhap ma ban muon xoa: ");
                    ma = sc.nextLine();
                    for (int i = 0; i < mangNV.size(); i++) {
                        if (mangNV.get(i).maNV.equalsIgnoreCase(ma)) {
                            mangNV.remove(i);
                        }
                    }
                    for (int i = 0; i < mangTT.size(); i++) {
                        if (mangTT.get(i).maNV.equalsIgnoreCase(ma)) {
                            mangTT.remove(i);
                        }
                    }
                    for (int i = 0; i < mangTP.size(); i++) {
                        if (mangTP.get(i).maNV.equalsIgnoreCase(ma)) {
                            mangTP.remove(i);
                        }
                    }
                    break;
                case 7:
                    System.out.println("Nhap ma can cap nhat: ");
                    ma = sc.nextLine();
                    for (int i = 0; i < mangNV.size(); i++) {
                        if (ma.equalsIgnoreCase(mangNV.get(i).maNV)) {
                            System.out.println("===========CapNhat============");
                            System.out.println("Nhap ho va ten Nhan Vien: ");
                            mangNV.get(i).hoVaTen = sc.nextLine();
                            System.out.println("Nhap Luong Nhan Vien: ");
                            mangNV.get(i).luong = Integer.parseInt(sc.nextLine());
                            System.out.println("============================== ");
                        }
                    }

                    for (int i = 0; i < mangTT.size(); i++) {
                        if (ma.equalsIgnoreCase(mangTT.get(i).maNV)) {
                            System.out.println("===========CapNhat============");
                            System.out.println("Nhap ho va ten Tiep Thi: ");
                            mangTT.get(i).hoVaTen = sc.nextLine();
                            System.out.println("Nhap Luong Tiep Thi: ");
                            mangTT.get(i).luong = Integer.parseInt(sc.nextLine());
                            System.out.println("Nhap danh so ban hang: ");
                            mangTT.get(i).setDanhSoBanHang(Integer.parseInt(sc.nextLine()));
                            System.out.println("Nhap hoa hong: ");
                            mangTT.get(i).setHoaHong(Integer.parseInt(sc.nextLine()));
                            System.out.println("============================== ");
                        }
                    }
                    for (int i = 0; i < mangTP.size(); i++) {
                        if (ma.equalsIgnoreCase(mangTP.get(i).maNV)) {
                            System.out.println("===========CapNhat============");
                            System.out.println("Nhap ho va ten Truong phong: ");
                            mangTP.get(i).hoVaTen = sc.nextLine();
                            System.out.println("Nhap Luong Truong phong: ");
                            mangTP.get(i).luong = Integer.parseInt(sc.nextLine());
                            System.out.println("Nhap luong trach nhiem: ");
                            mangTP.get(i).setLuongTrachNhiem(Integer.parseInt(sc.nextLine()));
                            System.out.println("============================== ");
                        }
                    }
                    break;
                case 8:
                    System.out.println("Tim nhan vien theo khoang luong: ");
                    System.out.println("Nhap luong min: ");
                    int min = Integer.parseInt(sc.nextLine());
                    System.out.println("Nhap luong max: ");
                    int max = Integer.parseInt(sc.nextLine());
                    for (NhanVien n : mangNV) {
                        if (min <= n.luong && n.luong <= max) {
                            n.xuatThongTin();
                        }
                    }
                    for (TiepThi t : mangTT) {
                        if (min <= t.luong && t.luong <= max) {
                            t.xuatThongTin();
                        }
                    }
                    for (TruongPhong p : mangTP) {
                        if (min <= p.luong && p.luong <= max) {
                            p.xuatThongTin();
                        }
                    }
                    break;
                case 9:
                    Collections.sort(mangNV, new Comparator<NhanVien>() {
                        @Override
                        public int compare(NhanVien o1, NhanVien o2) {
                            return o1.hoVaTen.compareToIgnoreCase(o2.hoVaTen);
                        }
                    });

                    Collections.sort(mangTT, new Comparator<TiepThi>() {
                        @Override
                        public int compare(TiepThi o1, TiepThi o2) {
                            return o1.hoVaTen.compareToIgnoreCase(o2.hoVaTen);
                        }
                    });

                    Collections.sort(mangTP, new Comparator<TruongPhong>() {
                        @Override
                        public int compare(TruongPhong o1, TruongPhong o2) {
                            return o1.hoVaTen.compareToIgnoreCase(o2.hoVaTen);
                        }
                    });
                    break;
                case 10:
                    Collections.sort(mangNV, new Comparator<NhanVien>() {
                        @Override
                        public int compare(NhanVien o1, NhanVien o2) {
                            return o1.getThuNhap() - o2.getThuNhap();
                        }
                    });

                    Collections.sort(mangTT, new Comparator<TiepThi>() {
                        @Override
                        public int compare(TiepThi o1, TiepThi o2) {
                            return o1.getThuNhap() - o2.getThuNhap();
                        }
                    });

                    Collections.sort(mangTP, new Comparator<TruongPhong>() {
                        @Override
                        public int compare(TruongPhong o1, TruongPhong o2) {
                            return o1.getThuNhap() - o2.getThuNhap();
                        }
                    });
                    break;
                case 11:

                    Collections.sort(mangNV, new Comparator<NhanVien>() {
                        @Override
                        public int compare(NhanVien o1, NhanVien o2) {
                            return o1.getThuNhap() - o2.getThuNhap();
                        }
                    });
                    Collections.reverse(mangNV);

                    Collections.sort(mangTT, new Comparator<TiepThi>() {
                        @Override
                        public int compare(TiepThi o1, TiepThi o2) {
                            return o1.getThuNhap() - o2.getThuNhap();
                        }
                    });
                    Collections.reverse(mangTT);

                    Collections.sort(mangTP, new Comparator<TruongPhong>() {
                        @Override
                        public int compare(TruongPhong o1, TruongPhong o2) {
                            return o1.getThuNhap() - o2.getThuNhap();
                        }
                    });
                    Collections.reverse(mangTP);

                    System.out.println("__________________5nhanVienLuongCaoNhat_________________");
                    for (int i = 0; i < mangNV.size(); i++) {
                        mangNV.get(i).xuatThongTin();
                        if (i == 4) {
                            break;
                        }
                    }
                    System.out.println("________________________________________________________");

                    System.out.println("\n\n__________________5tiepThiLuongCaoNhat_________________");
                    for (int i = 0; i < mangTT.size(); i++) {
                        mangTT.get(i).xuatThongTin();
                        if (i == 4) {
                            break;
                        }
                    }
                    System.out.println("________________________________________________________");

                    System.out.println("\n\n__________________5TruongPhongLuongCaoNhat_____________");
                    for (int i = 0; i < mangTP.size(); i++) {
                        mangTP.get(i).xuatThongTin();
                        if (i == 4) {
                            break;
                        }
                    }
                    System.out.println("________________________________________________________");
                    break;
                case 0:
                    System.out.println("Cảm ơn các bạn đã dùng chức năng của chúng tôi!");
                    break;
                default:
                    System.out.println("Mời bạn chọn lại các chức năng thừ 1->9.");
            }
        } while (chon != 0);
    }
}
