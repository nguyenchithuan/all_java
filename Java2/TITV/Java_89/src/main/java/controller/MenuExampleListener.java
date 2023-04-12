package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.MenuExampleView;

public class MenuExampleListener implements ActionListener{
    MenuExampleView view;

    public MenuExampleListener(MenuExampleView view) {
        this.view = view;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        String chuoi = e.getActionCommand();
        if(chuoi.equals("Enter")) {
            view.duLieu("Enter");
        } else if(chuoi.equals("Exit")) {
            view.duLieu("Exit");
            System.exit(0);
        } else if(chuoi.equals("Check")) {
            view.duLieu("Check");
        } else if(chuoi.equals("New")) {
            view.duLieu("New");
        }
    }
}
