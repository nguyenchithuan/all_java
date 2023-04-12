package BaiDauCuaFile;

import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class main {
    public static void main(String[] args) {
        // Luu y:
        // MS Windows: \ => \\ Vi du: "C:\\ThuMuc1\\ThuMuc2\\TapTin.xxx"
        // Linux, MacOX: / => Vi du: "/ThuMuc1/ThuMuc2/TapTin.xxx"
        
        File folder1 = new File("F:\\Hoc_Java\\Java2\\ThanTrieu\\Java_67");
        File folder2 = new File("F:\\Hoc_Java\\Java2\\ThanTrieu\\Java_68");
        System.out.println("Kiem tra folder1 co ton tai hay khong: " + folder1.exists());
        System.out.println("Kiem tra folder2 co ton tai hay khong: " + folder2.exists());
        
        
        // Tao thu muc 
        // Phuong thuc mkdir() => tao 1 thu muc
        File thuMuc1 = new File("F:\\Hoc_Java\\Java2\\ThanTrieu\\Java_67\\folder1");
        thuMuc1.mkdir();
        
        // Phuong thuc mkdirs() => tao nhieu thu muc
        File thuMuc2 = new File("F:\\Hoc_Java\\Java2\\ThanTrieu\\Java_67\\folder1\\folder2\\folder3\\folder4");
        thuMuc2.mkdirs();
        
        // Tao tap tin(co phan mo rong: .exe, .txt, .doc,.....)
        File file1 = new File("F:\\Hoc_Java\\Java2\\ThanTrieu\\Java_67\\folder1\\text.txt");
        try {
            file1.createNewFile();
        } catch (IOException ex) {
            // khong co quyen tao tap tin
            // O cung bi day
            // Duong dan sai
            Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
    }
}
