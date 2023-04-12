package main;

import java.io.File;

public class XoaFile {

    public static void xoaFile(File f) {
        if(f.isFile()) {
            System.out.println(f.getAbsolutePath());
            // xoa file
            f.delete();
        } else if(f.isDirectory()) {
            File[] mangFile = f.listFiles();
            for (File file : mangFile) {
                // xoa cac file con
                xoaFile(file);
            }
            System.out.println(f.getAbsolutePath());
            // xoa folder neu da xoa het file con
            f.delete();
        }
    }

    public static void main(String[] args) {
        File f0 = new File("F:\\Hoc_Java\\Java2\\ThanTrieu\\Java_69\\f0");
        File f0_1 = new File("F:\\Hoc_Java\\Java2\\ThanTrieu\\Java_69\\f0_1");
        File vidu = new File("F:\\Hoc_Java\\Java2\\ThanTrieu\\Java_69\\vidu.txt");
        File folder = new File("F:\\Hoc_Java\\Java2\\ThanTrieu\\Java_69\\New folder");

        f0.delete(); // khong xoa duoc folder chua tap tin va thu muc ben trong 
        // phai dung toi phuong de quy

        f0_1.delete(); // xoa duoc folder rong tra ve boolean
        vidu.delete(); // xoa duoc file tra ve void
        
        xoaFile(folder);
    }
}
