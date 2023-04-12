package JPanel;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MyCalculator extends JFrame{

    public MyCalculator() {
        this.setSize(300, 350);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // --------------------------code--------------------------
        
        
        // chia thanh vung1 Jpanel chua dua lieu text
        JTextField text = new JTextField(50);
        JPanel bienJPanel_1 = new JPanel();
        bienJPanel_1.setLayout(new BorderLayout());
        bienJPanel_1.add(text, BorderLayout.CENTER);
        
        
        // chia thanh vung2 Jpanel chua du lieu JButton
        
        JPanel bienJPanel_2 = new JPanel();
        bienJPanel_2.setLayout(new GridLayout(5, 3, 5, 5));
        
        
        
        JButton nut_1 = new JButton("1");
        JButton nut_2 = new JButton("2");
        JButton nut_3 = new JButton("3");
        JButton nut_4 = new JButton("4");
        JButton nut_5 = new JButton("5");
        JButton nut_6 = new JButton("6");
        JButton nut_7 = new JButton("7");
        JButton nut_8 = new JButton("8");
        JButton nut_9 = new JButton("9");
        JButton nut_0 = new JButton("0");
        JButton nut_cong = new JButton("+");
        JButton nut_tru = new JButton("-");
        JButton nut_nhan = new JButton("*");
        JButton nut_chia = new JButton("%");
        JButton nut_bang = new JButton("=");
        
        bienJPanel_2.add(nut_1);
        bienJPanel_2.add(nut_2);
        bienJPanel_2.add(nut_3);
        bienJPanel_2.add(nut_4);
        bienJPanel_2.add(nut_5);
        bienJPanel_2.add(nut_6);
        bienJPanel_2.add(nut_7);
        bienJPanel_2.add(nut_8);
        bienJPanel_2.add(nut_9);
        bienJPanel_2.add(nut_0);
        bienJPanel_2.add(nut_cong);
        bienJPanel_2.add(nut_tru);
        bienJPanel_2.add(nut_nhan);
        bienJPanel_2.add(nut_chia);
        bienJPanel_2.add(nut_bang);
        
        
        this.setLayout(new BorderLayout());
        this.add(bienJPanel_1, BorderLayout.NORTH);
        this.add(bienJPanel_2, BorderLayout.CENTER);
        
        
        //--------------------------------------------------------
        
        this.setVisible(true);
    }
    
    
    
    public static void main(String[] args) {
        new MyCalculator();
    }
}
