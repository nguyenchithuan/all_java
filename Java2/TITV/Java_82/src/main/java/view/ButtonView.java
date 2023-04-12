package view;

import controller.ButtonListener;
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import model.ButtonModel;

public class ButtonView extends JFrame{
    ButtonModel buttonModel;
    JLabel jLabel;

    public ButtonView() {
        buttonModel = new ButtonModel();
        init();
        this.setVisible(true);
    }

    private void init() {
        this.setTitle("Button");
        this.setSize(300, 300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        
        // tao font
        
        Font font = new Font("Arial", Font.BOLD, 20);
        // vung1
        
        ActionListener ac = new ButtonListener(this);
        
        JPanel vung1 = new JPanel();
        vung1.setLayout(new GridLayout(2, 2));
        
        JButton nut_1 = new JButton("1");
        nut_1.setFont(font);
        nut_1.addActionListener(ac);
        JButton nut_2 = new JButton("2");
        nut_2.setFont(font);
        nut_2.addActionListener(ac);
        JButton nut_3 = new JButton("3");
        nut_3.setFont(font);
        nut_3.addActionListener(ac);
        JButton nut_4 = new JButton("4");
        nut_4.setFont(font);
        nut_4.addActionListener(ac);
        
        
        vung1.add(nut_1);
        vung1.add(nut_2);
        vung1.add(nut_3);
        vung1.add(nut_4);
        
        
        // vung2
        
        JPanel vung2 = new JPanel();
        vung2.setLayout(new BorderLayout());
        jLabel = new JLabel("-------------", JLabel.CENTER);
        jLabel.setFont(font);
        vung2.setLayout(new BorderLayout());
        vung2.add(jLabel);
        
        this.setLayout(new BorderLayout());
        this.add(vung1, BorderLayout.CENTER);
        this.add(vung2, BorderLayout.SOUTH);
    }
    
    
    public void getValue_1() {
        jLabel.setText("BUTTON: " + buttonModel.getValue_1());
    }
    
    public void getValue_2() {
        jLabel.setText("BUTTON: " + buttonModel.getValue_2());
    }
    
    public void getValue_3() {
        jLabel.setText("BUTTON: " + buttonModel.getValue_3());
    }
    
    public void getValue_4() {
        jLabel.setText("BUTTON: " + buttonModel.getValue_4());
    }
    
    
}
