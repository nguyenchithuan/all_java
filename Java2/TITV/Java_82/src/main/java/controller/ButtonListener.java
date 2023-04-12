package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.ButtonView;

public class ButtonListener implements ActionListener{
    ButtonView buttonView;

    public ButtonListener(ButtonView buttonView) {
        this.buttonView = buttonView;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String chuoi = e.getActionCommand();
        
        if(chuoi.endsWith("1")) {
            buttonView.getValue_1();
        } else if(chuoi.endsWith("2")) {
            buttonView.getValue_2();
        } else if(chuoi.endsWith("3")) {
            buttonView.getValue_3();
        } else if(chuoi.endsWith("4")) {
            buttonView.getValue_4();
        }
    }
    
    
}
