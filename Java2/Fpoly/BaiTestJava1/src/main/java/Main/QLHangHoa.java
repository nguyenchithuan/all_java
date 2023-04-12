package Main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class QLHangHoa {

    List<HangHoa> mangHangHoa = new ArrayList<>();

    public HangHoa nhapMotHangHoa() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ma hang: ");
        String maHang = sc.nextLine();
        System.out.println("Nhap ten hang: ");
        String tenHang = sc.nextLine();
        System.out.println("Nhap so luong: ");
        int soLuong = Integer.parseInt(sc.nextLine());
        System.out.println("Nhap don gia: ");
        int donGia = Integer.parseInt(sc.nextLine());
        HangHoa hh = new HangHoa(maHang, tenHang, soLuong, donGia);
        return hh;
    }

    // nhap danh sach
    public void nhapHangHoa() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            mangHangHoa.add(nhapMotHangHoa());
            System.out.println("Ban cho muon tiep tuc hay khong(Y/N): ");
            String bien = sc.nextLine();
            if (bien.equalsIgnoreCase("n")) {
                break;
            }
        }
    }
    // xuat danh sach

    public void xuatDanhSach() {
        for (HangHoa hangHoa : mangHangHoa) {
            hangHoa.showHangHoa();
        }
    }

    // xap nhap lai thong tin
    public void capNhatLaiThongTin(String ma) {
        for (int i = 0; i < mangHangHoa.size(); i++) {
            if (mangHangHoa.get(i).getMaHang().equalsIgnoreCase(ma)) {
                mangHangHoa.set(i, nhapMotHangHoa());
            }
        }
    }

    // Tim hang hoa theo ten
    void timHangHoaTeoTen(String ten) {
        for (HangHoa hangHoa : mangHangHoa) {
            if (hangHoa.getTenHang().equalsIgnoreCase(ten)) {
                hangHoa.showHangHoa();
            }
        }
    }

    // sap xep hang hoa theo ten
    public void sapXephangHoaTheoTen() {
        Collections.sort(mangHangHoa, new Comparator<HangHoa>() {
            @Override
            public int compare(HangHoa o1, HangHoa o2) {
                return o1.getTenHang().compareToIgnoreCase(o2.getTenHang());
            }
        });
        System.out.println("Danh sach sau khi sap xep");
        xuatDanhSach();
    }

    // xoa hang theo ma nhap vao
    public void xoaHangHoa(String ma) {
        for (int i = 0; i < mangHangHoa.size(); i++) {
            if (mangHangHoa.get(i).getMaHang().equalsIgnoreCase(ma)) {
                System.out.println("Hang hoa da xoa!");
                mangHangHoa.get(i);
                mangHangHoa.remove(i);
            }
        }
    }

    // Tim hang hoa co don gia lon nhat
    public void donGiaLonNhat() {
        Collections.sort(mangHangHoa, new Comparator<HangHoa>() {
            @Override
            public int compare(HangHoa o1, HangHoa o2) {
                return o1.getDoGia() - o2.getDoGia();
            }
        });

        mangHangHoa.get(mangHangHoa.size() - 1).showHangHoa();
    }

    public void timHangHoaTheoSoLuong(int min, int max) {
        for (HangHoa hangHoa : mangHangHoa) {
            if (hangHoa.getSoLuong() >= min && hangHoa.getSoLuong() <= max) {
                hangHoa.showHangHoa();
            }
        }
    }

}
