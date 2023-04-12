package fpt.map;

import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class TreeMap {

    private Map<String, String> duLieu = new java.util.TreeMap<String, String>();

    public void themTuKhoa(String key, String value) {
        duLieu.put(key, value);
    }

    public void xoaTu(String key) {
        duLieu.remove(key);
    }

    public void yNghia(String key) {
        System.out.println(duLieu.get(key));
    }

    public void kiemTraChuaTu(String key) {
        System.out.println(duLieu.containsKey(key));
    }

    public void show() {
        Set<String> danhSachKey = duLieu.keySet();
        System.out.println(Arrays.toString(danhSachKey.toArray()));
    }

    public void soLuong() {
        System.out.println("So luong: " + duLieu.size());
    }

    public void xoaToanBo() {
        duLieu.clear();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int luaChon = 0;
        TreeMap tuDien = new TreeMap();

        do {
            System.out.println("\n\n----------------------Menu-----------------------");
            System.out.println("1. Them tu");
            System.out.println("2. Xoa tu");
            System.out.println("3. Tim y nghia cua tu khoa");
            System.out.println("4. Kiem tra xem tu da co chua");
            System.out.println("5. Hien thi danh sach tu khoa");
            System.out.println("6. So luong tu khoa");
            System.out.println("7. Xoa tat ca cac tu khoa");
            System.out.println("0. Thoat");
            System.out.println("--------------------------------------------------");
            System.out.println("Moi ban chon(1,2,3,4,5,6,7):");
            luaChon = Integer.parseInt(sc.nextLine());
            switch (luaChon) {
                case 1:
                    System.out.println("Moi nhap tu khoa: ");
                    String tuKhoa = sc.nextLine();
                    System.out.println("Moi nhap nghia:");
                    String nghia = sc.nextLine();
                    tuDien.themTuKhoa(tuKhoa, nghia);
                    break;
                case 2:
                    System.out.println("Nhap vao tu khoa muon xoa: ");
                    tuKhoa = sc.nextLine();
                    tuDien.xoaTu(tuKhoa);
                    break;
                case 3:
                    System.out.println("Tim y nghia: ");
                    tuKhoa = sc.nextLine();
                    tuDien.yNghia(tuKhoa);
                    break;
                case 4:
                    System.out.println("Tim kiem tu khoa: ");
                    tuKhoa = sc.nextLine();
                    tuDien.kiemTraChuaTu(tuKhoa);
                    break;
                case 5:
                    System.out.println("In thong tin: ");
                    tuDien.show();
                    break;
                case 6:
                    tuDien.soLuong();
                    break;
                case 7:
                    tuDien.xoaToanBo();
                    break;
                default:
                    System.out.println("Moi ban chon lai!");
            }
        } while (luaChon != 0);
    }

}
