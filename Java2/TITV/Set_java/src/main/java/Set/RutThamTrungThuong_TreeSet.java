package Set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class RutThamTrungThuong_TreeSet {

    public static void menu() {
        System.out.println("\n\n\n-------------------Menu---------------------");
        System.out.println("1. Them ma so du thuong");
        System.out.println("2. xoa ma so du thuong");
        System.out.println("3. Kiem tra ma so du thuong co ton tai hay khong?");
        System.out.println("4. xoa tat cac cac phieu du thuong");
        System.out.println("5. So luong phieu du thuong");
        System.out.println("6. Rut tham trung thuong");
        System.out.println("7. Hien thi tat cac");
        System.out.println("--------------------------------------------");
        System.out.println("Moi ban chon chuc nang(1,2,3,4,5,6,7):");
    }

    Set<String> rutThamChungThuong = new TreeSet<String>();

    public RutThamTrungThuong_TreeSet() {
    }

    public void themPhieu(String giaTri) {
        rutThamChungThuong.add(giaTri);
    }

    public void xoaPhieu(String giaTri) {
        rutThamChungThuong.remove(giaTri);
    }

    public boolean kiemTraTonTai(String giaTri) {
        return rutThamChungThuong.contains(giaTri);
    }

    public void xoaTatCa() {
        rutThamChungThuong.clear();
    }

    public int soLuongPhieu() {
        return rutThamChungThuong.size();
    }

    public String rutMotPhieu() {
        Random rd = new Random();
        int viTri = rd.nextInt(rutThamChungThuong.size());
        return (String) rutThamChungThuong.toArray()[viTri];
    }
    
    public void showPhieu() {
        System.out.println(Arrays.toString(rutThamChungThuong.toArray()));
    }

    public static void main(String[] args) {
        int chon = 0;
        Scanner sc = new Scanner(System.in);
        RutThamTrungThuong_TreeSet rutTham = new RutThamTrungThuong_TreeSet();
        do {
            menu();
            chon = Integer.parseInt(sc.nextLine());

            switch (chon) {
                case 1:
                    System.out.println("Nhap vao mot ma du thuong: ");
                    String them = sc.nextLine();
                    rutTham.themPhieu(them);
                    break;
                case 2:
                    System.out.println("Xoa mot phieu du thuong: ");
                    String xoa = sc.nextLine();
                    rutTham.xoaPhieu(xoa);
                    break;
                case 3:
                    System.out.println("Nhap vao mot phieu kiem tra ton tai: ");
                    String tonTai = sc.nextLine();
                    System.out.println("Phieu ton tai: " + rutTham.kiemTraTonTai(tonTai));
                    break;
                case 4:
                    System.out.println("Xoa thanh cong tat cac cac phieu!");
                    rutTham.xoaTatCa();
                    break;
                case 5:
                    System.out.println("So luong phieu la : " + rutTham.soLuongPhieu());
                    break;
                case 6:
                    System.out.println("Phieu rut tham duoc la: " + rutTham.rutMotPhieu());
                    break;
                case 7:
                    System.out.println("Tat cac ca phieu:");
                    rutTham.showPhieu();
                    break;
                default:
                    System.out.println("Moi ban chon lai!");
            }
        } while (chon != 0);
    }
}
