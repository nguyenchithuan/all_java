package file;

import java.io.File;
import java.util.Scanner;

public class Test {

    public static void menu() {
        System.out.println("\n\n\n=================MENU==================");
        System.out.println("1. Kiem tra file co the thuc thi hay khong?");
        System.out.println("2. Kiem tra file co the doc hay khong?");
        System.out.println("3. Kiem tra file co the ghi hay khong?");
        System.out.println("4. In duong dan");
        System.out.println("5. In ten file");
        System.out.println("6. Kiem tra file la thu muc hoac tap tin");
        System.out.println("7. In ra danh sach cac file con");
        System.out.println("8. In ra cay thu muc");
        System.out.println("0. Thoat");
        System.out.println("Moi ban chon(1,2,3,4,5,6,7,8):");
    }

    File file;

    public Test(String file) {
        this.file = new File(file);
    }

    public boolean kiemTraThucThi() {
        // kiem tra file co thuc thi hay khong
        return file.canExecute();
    }

    public boolean kiemTraDoc() {
        // kiem tra file co the doc hay khong
        return file.canRead();
    }

    public boolean kiemTraGhi() {
        // kiem tra file co the thuc thi hay khong
        return file.canWrite();
    }

    public void duongDan() {
        System.out.println("Duong dan: " + file.getAbsolutePath());
    }

    public void ten() {
        System.out.println("Ten: " + file.getName());
    }

    public void kiemTraLaFolderORFile() {
        if (file.isDirectory()) {
            System.out.println("La mot folder/diretory");
        } else if (file.isFile()) {
            System.out.println("La mot file");
        }
    }

    public void cacThuMucCon() {
        if (file.isDirectory()) {
            System.out.println("Cac thuc muc con la: ");
            File[] mangFile = file.listFiles();
            for (File f : mangFile) {
                System.out.println(f.getAbsolutePath());
            }
        } else if (file.isFile()) {
            System.out.println("Loi!");
        }

    }

    public void cayThucMuc() {
        chiTietCayThuMuc(file, 1);
    }

    public void chiTietCayThuMuc(File f, int bac) {
        for (int i = 0; i < bac; i++) {
            System.out.print("\t");
        }
        System.out.println(f.getName());
        if (f.canRead() && f.isDirectory()) {
            File[] mangCon = f.listFiles();
            for (File fx : mangCon) {
                chiTietCayThuMuc(fx, bac + 1);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Moi nhap vao File");
        String chuoi = sc.nextLine();
        Test textFile = new Test(chuoi);
        int chon = 0;
        do {
            menu();
            chon = Integer.parseInt(sc.nextLine());
            switch (chon) {
                case 1:
                    System.out.println(textFile.kiemTraThucThi());
                    break;
                case 2:
                    System.out.println(textFile.kiemTraDoc());
                    break;
                case 3:
                    System.out.println(textFile.kiemTraGhi());
                    break;
                case 4:
                    textFile.duongDan();
                    break;
                case 5:
                    textFile.ten();
                    break;
                case 6:
                    textFile.kiemTraLaFolderORFile();
                    break;
                case 7:
                    textFile.cacThuMucCon();
                    break;
                case 8:
                    textFile.cayThucMuc();
                    break;
                default:
                    throw new AssertionError();
            }
        } while (chon != 0);
    }
}
