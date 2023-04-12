package view;

import controler.CouterListener;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import model.CouterModel;

public class CouterView extends JFrame{
    CouterModel couterModel;
    JButton nut_tang;
    JButton nut_giam;
    JButton nut_reset;
    JLabel text;

    public CouterView() {
        couterModel = new CouterModel();
        codeGiaoDien();
        this.setVisible(true);
    }
    
    public void codeGiaoDien() {
        this.setSize(300, 300);
        this.setLocationRelativeTo(null);
        this.setTitle("Couter");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        ActionListener al = new CouterListener(this);
        
        JPanel vung1 = new JPanel();
        vung1.setLayout(new BorderLayout());
        nut_tang = new JButton("UP");
        nut_tang.addActionListener(al);
        nut_giam = new JButton("DOWN");
        nut_giam.addActionListener(al);
        text = new JLabel(couterModel.getValue() + "", JLabel.CENTER);
        
        vung1.add(nut_giam, BorderLayout.WEST);
        vung1.add(nut_tang, BorderLayout.EAST);
        vung1.add(text, BorderLayout.CENTER);
        
        JPanel vung2 = new JPanel();
        vung2.setLayout(new BorderLayout());
        nut_reset = new JButton("RESET");
        nut_reset.addActionListener(al);
        vung2.add(nut_reset, BorderLayout.CENTER);
        
        this.setLayout(new BorderLayout());
        this.add(vung1, BorderLayout.CENTER);
        this.add(vung2, BorderLayout.SOUTH);
    }
    
    public void increment() {
        couterModel.increment();
        text.setText(couterModel.getValue() + "");
    }
    
    public void decrement() {
        couterModel.decrement();
        text.setText(couterModel.getValue() + "");
    }
    
    public void reset() {
        couterModel.reset();
        text.setText(couterModel.getValue() + "");
    }
}
