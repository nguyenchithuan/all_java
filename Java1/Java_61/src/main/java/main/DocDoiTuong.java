package main;

import QLSV.SinhVien;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.ObjectInputStream;

public class DocDoiTuong {
    public static void main(String[] args) {
        try {
            File file = new File("F:\\Hoc_Java\\Java1\\NguyenChiThuan_PH26023_Labs\\Java_61\\thuan.thuan");
            InputStream is = new FileInputStream(file);
            ObjectInputStream ois = new ObjectInputStream(is);
            SinhVien sv = (SinhVien)ois.readObject();
            System.out.println(sv);
            ois.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
