package fpt.java_70;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Test {
    public static void main(String[] args) {
        File thuan = new File("F:\\Hoc_Java\\Java2\\ThanTrieu\\Java_70\\Thuan");
        File thuan01 = new File("F:\\Hoc_Java\\Java2\\ThanTrieu\\Java_70\\Thuan01");
        File diChuyen = new File("F:\\Hoc_Java\\Java2\\ThanTrieu\\Java_70\\diChuyen\\Thuan01");
       
//        try {
//            Files.move(thuan.toPath(), thuan01.toPath(), StandardCopyOption.REPLACE_EXISTING);
//        } catch (IOException ex) {
//            Logger.getLogger(Test.class.getName()).log(Level.SEVERE, null, ex);
//        }
        try {
            Files.move(thuan01.toPath(), diChuyen.toPath(), StandardCopyOption.REPLACE_EXISTING);
        } catch (IOException ex) {
            Logger.getLogger(Test.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
