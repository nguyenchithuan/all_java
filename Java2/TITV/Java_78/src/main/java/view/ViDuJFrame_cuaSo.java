package view;

import javax.swing.JFrame;

public class ViDuJFrame_cuaSo {
    public static void main(String[] args) {
        JFrame jf = new JFrame(); // mot class
        
        jf.setSize(400, 300); // kich co cua cua so
        
        jf.setTitle("Lap trinh voi JFrame"); // tao title cho JFrame
        
        jf.setLocation(300, 200); // tao vi tri cua cua so
        
        jf.setVisible(true); // hien thi cua so, luon de cuoi cung
        
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        // khi thoat khoi cua so chuong trinh se duoc thoat
        
        while (true) {            
            System.out.println("Chuong trinh dang chay!");
        }
    }
}
