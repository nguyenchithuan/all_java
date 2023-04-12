package view;

import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class BorderLayoutTest extends JFrame{

    public BorderLayoutTest() {
        this.setSize(600, 400);
        this.setLocationRelativeTo(null);
        
        BorderLayout border1 = new BorderLayout();
        BorderLayout border2 = new BorderLayout(25, 25);
        
//        this.setLayout(border1);
        this.setLayout(border2);
        
        JButton nut1 = new JButton("1");
        JButton nut2 = new JButton("2");
        JButton nut3 = new JButton("3");
        JButton nut4 = new JButton("4");
        JButton nut5 = new JButton("5");
        
        this.add(nut1, BorderLayout.NORTH);
        this.add(nut2, BorderLayout.WEST);
        this.add(nut3, BorderLayout.CENTER);
        this.add(nut4, BorderLayout.EAST);
        this.add(nut5, BorderLayout.SOUTH);
        
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
    
    
    
    public static void main(String[] args) {
        new BorderLayoutTest();
    }
}
