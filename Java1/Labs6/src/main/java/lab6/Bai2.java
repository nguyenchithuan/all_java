package lab6;

import java.util.ArrayList;
import java.util.Scanner;

public class Bai2 {

    public static void main(String[] args) {
        ArrayList<SanPham> sp = new ArrayList<>();
        SanPham s = new SanPham();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so san pham:");
        int i = Integer.parseInt(sc.nextLine());
        for (int j = 0; j < i; j++) {
            sp.add(s.nhapThongTinSanPham());
        }

        for (SanPham sanPham : sp) {
            if (sanPham.getHang().equalsIgnoreCase("Nokia")) {
                System.out.println(sanPham);
            }
        }
    }
}
