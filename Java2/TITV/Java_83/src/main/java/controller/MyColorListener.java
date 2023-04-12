package controller;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.MyColorView;

public class MyColorListener implements ActionListener {

    MyColorView myColorView;

    public MyColorListener(MyColorView myColorView) {
        this.myColorView = myColorView;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String chuoi = e.getActionCommand(); // lay ten nut
        if (chuoi.equals("Red Text")) {
            myColorView.changeForegroud(Color.RED);
        } else if (chuoi.equals("Yellow Text")) {
            myColorView.changeForegroud(Color.YELLOW);
        } else if (chuoi.equals("Green Text")) {
            myColorView.changeForegroud(Color.GREEN);
        } else if (chuoi.equals("Red BackGround")) {
            myColorView.changeBackgroud(Color.RED);
        } else if (chuoi.equals("Yellow BackGround")) {
            myColorView.changeBackgroud(Color.YELLOW);
        } else if (chuoi.equals("Green BackGround")) {
            myColorView.changeBackgroud(Color.GREEN);
        }
    }

}
