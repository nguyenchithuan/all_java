package view;

import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class GridLayoutTest extends JFrame{ // hien thi cua so

    public GridLayoutTest() {
        this.setSize(600, 400);
        this.setLocationRelativeTo(null);
        
        GridLayout gridLayout1 = new GridLayout(); // tao mot lay out
        GridLayout gridLayout2 = new GridLayout(4, 4);
        GridLayout gridLayout3 = new GridLayout(4, 4, 25, 25);
        
//        this.setLayout(gridLayout1); // cach hien thi lay out
        this.setLayout(gridLayout2); // cach hien thi lay out
        this.setLayout(gridLayout3); // cach hien thi lay out
        
        for (int i = 1; i <= 16; i++) {
            JButton nut = new JButton(i + "");
            this.add(nut);
        }
        
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
    
    public static void main(String[] args) {
        new GridLayoutTest();
    }
    
}
