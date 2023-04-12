package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.MiniCalculatorView;

public class MiniCalculatorListener implements ActionListener{ // bat su kien
    MiniCalculatorView view;

    public MiniCalculatorListener(MiniCalculatorView view) {
        this.view = view;
    }

    @Override
    public void actionPerformed(ActionEvent e) { // tuc thi su kien
        String chuoi = e.getActionCommand(); // lay du lieu khi co su kien
        
        if(chuoi.equals("+")) {
            view.sum();
        } else if(chuoi.equals("-")) {
            view.minus();
        } else if(chuoi.equals("*")) {
            view.multiply();
        } else if(chuoi.equals("/")) {
            view.divide();
        } else if(chuoi.equals("^")) {
            view.pow();
        } else if(chuoi.equals("%")) {
            view.mod();
        }
        
    }
    
}
