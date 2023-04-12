package view;

import controller.MiniCalculatorListener;
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import model.MiniCalculatorModel;

public class MiniCalculatorView extends JFrame{
    private MiniCalculatorModel miniCalculatorModel;
    private JTextField jTextField_one;
    private JTextField jTextField_two;
    private JTextField jTextField_answer;

    public MiniCalculatorView() {
        miniCalculatorModel = new MiniCalculatorModel();
        this.init();
        this.setVisible(true);
    }

    private void init() {
        this.setSize(400, 200);
        this.setLocationRelativeTo(null);
        this.setTitle("Mini Calculator");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // ------Font-----
        Font font = new Font("Arial", Font.BOLD, 18);
        
        
        // --------Vung1---------
        JPanel vung1 = new JPanel();
        vung1.setLayout(new GridLayout(3, 2, 10, 10));
        
        JLabel jLabel_one = new JLabel("1st Value");
        jLabel_one.setFont(font);
        JLabel jLabel_two = new JLabel("2st Value");
        jLabel_two.setFont(font);
        JLabel jLabel_answer = new JLabel("Answer");
        jLabel_answer.setFont(font);
        
        
        jTextField_one = new JTextField(50);
        jTextField_one.setFont(font);
        jTextField_two = new JTextField(50);
        jTextField_two.setFont(font);
        jTextField_answer = new JTextField(50);
        jTextField_answer.setFont(font);
        
        vung1.add(jLabel_one);
        vung1.add(jTextField_one);
        vung1.add(jLabel_two);
        vung1.add(jTextField_two);
        vung1.add(jLabel_answer);
        vung1.add(jTextField_answer);
        
        //--------ActionListener--------
        ActionListener ac = new MiniCalculatorListener(this);
        //--------Vung2---------
        
        JPanel vung2 = new JPanel();
        vung2.setLayout(new GridLayout(2, 3, 5, 5));
        
        JButton jButton_sum = new JButton("+");
        jButton_sum.addActionListener(ac);
        JButton jButton_minus = new JButton("-");
        jButton_minus.addActionListener(ac);
        JButton jButton_multiply = new JButton("*");
        jButton_multiply.addActionListener(ac);
        JButton jButton_divide = new JButton("/");
        jButton_divide.addActionListener(ac);
        JButton jButton_pow = new JButton("^");
        jButton_pow.addActionListener(ac);
        JButton jButton_mod = new JButton("%");
        jButton_mod.addActionListener(ac);
        
        vung2.add(jButton_sum);
        vung2.add(jButton_minus);
        vung2.add(jButton_multiply);
        vung2.add(jButton_divide);
        vung2.add(jButton_pow);
        vung2.add(jButton_mod);
        
        this.setLayout(new BorderLayout(10, 10));
        this.add(vung1, BorderLayout.CENTER);
        this.add(vung2, BorderLayout.SOUTH);
    }
    
    public void sum() {
        Double valueOne = Double.parseDouble(jTextField_one.getText());
        Double valueTwo = Double.parseDouble(jTextField_two.getText());
        miniCalculatorModel.setValue_one(valueOne);
        miniCalculatorModel.setValue_two(valueTwo);
        miniCalculatorModel.sum();
        jTextField_answer.setText(miniCalculatorModel.getAnswer() + "");
    }
    
    public void minus() {
        Double valueOne = Double.parseDouble(jTextField_one.getText());
        Double valueTwo = Double.parseDouble(jTextField_two.getText());
        miniCalculatorModel.setValue_one(valueOne);
        miniCalculatorModel.setValue_two(valueTwo);
        miniCalculatorModel.minus();
        jTextField_answer.setText(miniCalculatorModel.getAnswer() + "");
    }
    
    public void multiply() {
        Double valueOne = Double.parseDouble(jTextField_one.getText());
        Double valueTwo = Double.parseDouble(jTextField_two.getText());
        miniCalculatorModel.setValue_one(valueOne);
        miniCalculatorModel.setValue_two(valueTwo);
        miniCalculatorModel.multiply();
        jTextField_answer.setText(miniCalculatorModel.getAnswer() + "");
    }
    
    public void divide() {
        Double valueOne = Double.parseDouble(jTextField_one.getText());
        Double valueTwo = Double.parseDouble(jTextField_two.getText());
        miniCalculatorModel.setValue_one(valueOne);
        miniCalculatorModel.setValue_two(valueTwo);
        miniCalculatorModel.divide();
        jTextField_answer.setText(miniCalculatorModel.getAnswer() + "");
    }
    
    public void pow() {
        Double valueOne = Double.parseDouble(jTextField_one.getText());
        Double valueTwo = Double.parseDouble(jTextField_two.getText());
        miniCalculatorModel.setValue_one(valueOne);
        miniCalculatorModel.setValue_two(valueTwo);
        miniCalculatorModel.pow();
        jTextField_answer.setText(miniCalculatorModel.getAnswer() + "");
    }
    
    public void mod() {
        Double valueOne = Double.parseDouble(jTextField_one.getText());
        Double valueTwo = Double.parseDouble(jTextField_two.getText());
        miniCalculatorModel.setValue_one(valueOne);
        miniCalculatorModel.setValue_two(valueTwo);
        miniCalculatorModel.mod();
        jTextField_answer.setText(miniCalculatorModel.getAnswer() + "");
    }
}
