package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.TimKiemView;

public class TimKiemListener implements ActionListener{
    private TimKiemView view;

    public TimKiemListener(TimKiemView view) {
        this.view = view;
    }
           
    @Override
    public void actionPerformed(ActionEvent e) {
       view.timKiem();
    }
    
}
