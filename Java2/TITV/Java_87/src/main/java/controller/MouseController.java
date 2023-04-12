package controller;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import view.MouseView;

public class MouseController implements MouseListener, MouseMotionListener{
    
    private MouseView view;

    public MouseController(MouseView view) {
        this.view = view;
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        view.click();
    }

    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        view.enter();
        int x = e.getX();
        int y = e.getY();
        view.update(x, y);
    }

    @Override
    public void mouseExited(MouseEvent e) {
        view.exit();
    }

    @Override
    public void mouseDragged(MouseEvent e) {
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        int x = e.getX();
        int y = e.getY();
        view.update(x, y);
    }
    
}
