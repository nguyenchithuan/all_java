package view;

import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author ASUS
 */
public class FlowLayoutTest extends JFrame{ // hien thi cua so

    public FlowLayoutTest() {
        this.setSize(600, 400);
        this.setLocationRelativeTo(null); // can giua
        
        // tao lay out
        FlowLayout layOut_1 = new FlowLayout();
        FlowLayout layOut_2 = new FlowLayout(FlowLayout.RIGHT);
        FlowLayout layOut_3 = new FlowLayout(FlowLayout.CENTER, 50, 50);
        // cach hien thi cua lay out
//        this.setLayout(layOut_1); 
//        this.setLayout(layOut_2);
        this.setLayout(layOut_3);
        
        // tao mot nut button
        JButton nut1 = new JButton("1");
        JButton nut2 = new JButton("2");
        JButton nut3 = new JButton("3");
        JButton nut4 = new JButton("4");
        
        // them mot dieu khuyen  vao vat chua
        this.add(nut1);
        this.add(nut2);
        this.add(nut3);
        this.add(nut4);
        
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
    
    
    public static void main(String[] args) {
        new FlowLayoutTest();
    }
}
