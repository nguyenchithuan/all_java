package controler;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.CouterView;

public class CouterListener implements ActionListener{
    CouterView view;

    public CouterListener() {
    }

    public CouterListener(CouterView view) {
        this.view = view;
    }
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        String bien = e.getActionCommand();
        if(bien.equals("UP")) {
            view.increment();
        } else if(bien.equals("DOWN")) {
            view.decrement();
        } else if(bien.equals("RESET")) {
            view.reset();
        }
    }
    
}
