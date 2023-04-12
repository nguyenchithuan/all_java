package view;

import controller.MyColorListener;
import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import model.MyColorModel;

public class MyColorView extends JFrame{
    MyColorModel myColorModel;
    JLabel jLabel;
    
    public MyColorView() {
        myColorModel = new MyColorModel();
        this.init();
        this.setVisible(true);
    }

    private void init() {
        this.setSize(1000, 600);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setTitle("My Color");
        
        // vung text
        jLabel = new JLabel("TEXT......");
        jLabel.setFont(new Font("Arial", Font.BOLD, 100));
        
        
        ActionListener ac = new MyColorListener(this);
        
        // vung button
        Font font = new Font("Arial", Font.BOLD, 30);
        
        JPanel vung = new JPanel();
        vung.setLayout(new GridLayout(2, 3));
                
        Button nut_foreground1 = new Button("Red Text");
        nut_foreground1.setFont(font);
        nut_foreground1.setForeground(Color.RED);
        nut_foreground1.addActionListener(ac);
        Button nut_foreground2 = new Button("Yellow Text");
        nut_foreground2.setFont(font);
        nut_foreground2.setForeground(Color.YELLOW);
        nut_foreground2.addActionListener(ac);
        Button nut_foreground3 = new Button("Green Text");
        nut_foreground3.setFont(font);
        nut_foreground3.setForeground(Color.GREEN);
        nut_foreground3.addActionListener(ac);
        
        Button nut_background1 = new Button("Red BackGround");
        nut_background1.setFont(font);
        nut_background1.setBackground(Color.RED);
        nut_background1.addActionListener(ac);
        Button nut_background2 = new Button("Yellow BackGround");
        nut_background2.setFont(font);
        nut_background2.setBackground(Color.YELLOW);
        nut_background2.addActionListener(ac);
        Button nut_background3 = new Button("Green BackGround");
        nut_background3.setFont(font);
        nut_background3.setBackground(Color.GREEN);
        nut_background3.addActionListener(ac);
        
        
        
        vung.add(nut_foreground1);
        vung.add(nut_foreground2);
        vung.add(nut_foreground3);
        vung.add(nut_background1);
        vung.add(nut_background2);
        vung.add(nut_background3);
        
        // JFrame
        
        this.setLayout(new BorderLayout());
        this.add(jLabel, BorderLayout.NORTH);
        this.add(vung, BorderLayout.CENTER);
    }
    
    public void changeForegroud(Color color) {
        jLabel.setForeground(color);
    }
    
    public void changeBackgroud(Color color) {
        jLabel.setBackground(color);
        jLabel.setOpaque(true);
    }
    
}
