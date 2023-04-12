package fpt.java_71;

public class Student {

    public static void main(String[] args) {
        try {
            java.io.PrintWriter pw = new java.io.PrintWriter("F:\\Hoc_Java\\Java2\\ThanTrieu\\Java_71\\thuan.txt", "UTF-8");
            pw.println("Chao cac ban");
            pw.print("Day la so: ");
            pw.println(3.14);
            PrintWriter thongTin = new PrintWriter("haha", 18);
            pw.println(thongTin);
            pw.flush();
            pw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
