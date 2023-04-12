package main;

import QLSV.SinhVien;
import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

public class GhiDoiTuong {

    public static void main(String[] args) {
        try {
            File file = new File("F:\\Hoc_Java\\Java1\\NguyenChiThuan_PH26023_Labs\\Java_61\\thuan.thuan");
            OutputStream os = new FileOutputStream(file);
            ObjectOutputStream oos = new ObjectOutputStream(os);
            SinhVien sv = new SinhVien("ph26023", "Nguyen Chi Thuan", 2003, 9.7);
            oos.writeObject(sv);
            oos.flush();
            oos.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
