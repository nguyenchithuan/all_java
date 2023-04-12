package fpt.java_71;

/**
 *
 * @author ASUS
 */
public class PrintWriter {
    private String thongTin;
    private int age;

    public PrintWriter() {
    }

    public PrintWriter(String thongTin, int age) {
        this.thongTin = thongTin;
        this.age = age;
    }

    @Override
    public String toString() {
        return "PrintWriter{" + "thongTin=" + thongTin + ", age=" + age + '}';
    }
    
}
