package main;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

public class GhiFileDoiTuong {

    public static void main(String[] args) {
        try {
            File file = new File("F:\\Hoc_Java\\Java2\\TITV\\Java_73a\\nguyenchithuan.thuan");
            OutputStream os = new FileOutputStream(file);
            ObjectOutputStream oos = new ObjectOutputStream(os);
            SinhVien sv = new SinhVien("1", "1", "1");
            oos.writeObject(sv);
            oos.flush();
            oos.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
