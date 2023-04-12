package view;

import java.awt.HeadlessException;
import javax.swing.JFrame;

public class MyWindow extends JFrame{ // day moi la cai thuong dung

    public MyWindow(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // khi thoat khoi cua so JFrame thi truong trinh se ngung chay
    }
    
    public void hienThi() {
        this.setVisible(true); //hien thi cua so JFrame
    }
    
    public void hienThi(String title) {
        this.setTitle(title); // hien thi title
        this.setVisible(true); // hien thi cua so JFrame
    }
    
    public void hienThi(String title, int width, int height) {
        this.setTitle(title); // hien thi title
        this.setSize(width, height); // tao dien tich cho khung
        this.setVisible(true); // hien thi cua so
    }
    
    public void hienThi(String title, int width, int height, int x, int y) {
        this.setTitle(title);
        this.setSize(width, height);
        this.setLocation(x, y);
        this.setVisible(true);
    }
    
    public static void main(String[] args) {
        MyWindow mw = new MyWindow();
//        mw.hienThi();
//        mw.hienThi("Lap trinh Java Swing");
//        mw.hienThi("Lap trinh JFrame", 200, 100);
        mw.hienThi("Lap trinh", 250, 150, 100, 200);
    }
    
}
