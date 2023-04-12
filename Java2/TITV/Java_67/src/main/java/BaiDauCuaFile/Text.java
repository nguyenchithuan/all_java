package BaiDauCuaFile;

import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Text {

    public static void main(String[] args) {
        // Chu y:
        // Window dung \\ VD: C:\\aa\\bb\\c.txt
        // Mac os, linux dung /asdf/asdf/asdf.sfs

        File directory1 = new File("F:\\Hoc_Java\\Java2\\ThanTrieu\\Java_67");
        File directory2 = new File("F:\\Hoc_Java\\Java2\\ThanTrieu\\Java_68");

        System.out.println("Kiem tra folder1/directory1 co ton tai: " + directory1.exists());
        System.out.println("Kiem tra folder2/directory2 co ton tai: " + directory2.exists());

        // tao mot folder/directory/thuMuc: mkdir();
        // mkdir(): se khong tao dc nhieu thu muc
        File taoThuMuc = new File("F:\\Hoc_Java\\Java2\\ThanTrieu\\Java_67\\Directory1");
        taoThuMuc.mkdir();

        // tao hang loat folder/diectory/thuMuc: mkdirs(); \
        File taoThuMuc1 = new File("F:\\Hoc_Java\\Java2\\ThanTrieu\\Java_67\\Directory1\\Directoty2\\Directory3");
        taoThuMuc1.mkdirs();

        
        // file: createNewFile() Ham nay phai dung den try catch
        
        File taoFile = new File("F:\\Hoc_Java\\Java2\\ThanTrieu\\Java_67\\Directory1\\text.txt");
        try {
            taoFile.createNewFile();
        } catch (IOException ex) {
            Logger.getLogger(Text.class.getName()).log(Level.SEVERE, null, ex);
            // khong cho phep truy cap
            // bo nho da day
            // ten trung
            // sai duong dan
        }
    }   
}
