package fpt.java_74;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.ObjectInputStream;

public class DocDoiTuong {

    public static void main(String[] args) {
        try {
            File file = new File("F:\\Hoc_Java\\Java2\\TITV\\Java_74\\nguyenchithuan.thuan");
            InputStream is = new FileInputStream(file);
            ObjectInputStream ois = new ObjectInputStream(is);
            SinhVien sv = (SinhVien)ois.readObject();
            System.out.println(sv);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
