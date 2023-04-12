package fpt.hung;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class GiaoVien {

    protected String magv;
    protected String hoVaTen;
    protected int luong;

    private ArrayList<GiaoVien> manggv = new ArrayList<>();

    public GiaoVien() {
    }

    public GiaoVien(String magv, String hoVaTen, int luong) {
        this.magv = magv;
        this.hoVaTen = hoVaTen;
        this.luong = luong;
    }

    public void nhap() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("================NHAP=================");
            System.out.println("Nhap ma gv: ");
            String ma = sc.nextLine();
            System.out.println("Nhap ho va ten gv: ");
            String ten = sc.nextLine();
            System.out.println("Nhap luong gv: ");
            int luong = Integer.parseInt(sc.nextLine());
            System.out.println("=====================================");
            GiaoVien gv = new GiaoVien(ma, ten, luong);
            manggv.add(gv);
            System.out.println("Ban con muon tiep tuc hay khong(Y/N): ");
            String kq = sc.nextLine();
            if (kq.equalsIgnoreCase("n")) {
                break;
            }
        }
    }

    public void xuat() {
        System.out.println("--------------------ShowGiaoVien--------------------");
        for (GiaoVien gv : manggv) {
            System.out.println("=================SHOW=================");
            System.out.println("Ma gv: " + gv.magv);
            System.out.println("Ten gv: " + gv.hoVaTen);
            System.out.println("Luong gv: " + gv.luong);
            System.out.println("======================================");
        }
        System.out.println("----------------------------------------------------");
    }
    
    public void xuatMotGV() {
            System.out.println("=================SHOW=================");
            System.out.println("Ma gv: " + this.magv);
            System.out.println("Ten gv: " + this.hoVaTen);
            System.out.println("Luong gv: " + this.luong);
            System.out.println("======================================");
    }

    public void timKiemLuong() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap luong min: ");
        int min = Integer.parseInt(sc.nextLine());
        System.out.println("Nhap luong max: ");
        int max = Integer.parseInt(sc.nextLine());
        System.out.println("-------------CacGiaoVienTrongKhoanLuong--------------");
        for (GiaoVien gv : manggv) {
            if(min <= gv.luong && gv.luong <= max) {
                gv.xuatMotGV();
            }
        }
        System.out.println("-----------------------------------------------------");
    }

    public void timGiaoVien() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ten can tim: ");
        String nhapTen = sc.nextLine();
        System.out.println("------------------CacGiaoVienCoTen-------------------");
        for (GiaoVien gv : manggv) {
            if(nhapTen.equalsIgnoreCase(gv.hoVaTen)) {
                gv.xuatMotGV();
            }
        }
        System.out.println("-----------------------------------------------------");
    }
    
    public void sapXep() {
        Collections.sort(manggv, new Comparator<GiaoVien>() {
            @Override
            public int compare(GiaoVien o1, GiaoVien o2) {
                return o2.luong - o1.luong;
            }
        });
    }
}
