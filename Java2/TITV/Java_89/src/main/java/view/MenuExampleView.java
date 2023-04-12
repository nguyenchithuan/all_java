package view;

import controller.MenuExampleListener;
import java.awt.BorderLayout;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.KeyStroke;
import javax.xml.crypto.dsig.keyinfo.KeyValue;

public class MenuExampleView extends JFrame{
    JLabel jLabel;

    public MenuExampleView() {
        this.setSize(400, 300);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Menu Example");
        
        // tao JMenuBar
        JMenuBar jMenuBar = new JMenuBar();
        
        // tao ActionListener
        
        MenuExampleListener menuExampleListener = new MenuExampleListener(this);
        
        
        // create, add JMenu va JMenuItem
        JMenu jMenu_file = new JMenu("File");
        JMenuItem jMenuItem_enter = new JMenuItem("Enter");
        jMenuItem_enter.addActionListener(menuExampleListener);
        jMenuItem_enter.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_E, InputEvent.CTRL_DOWN_MASK));
        JMenuItem jMenuItem_new = new JMenuItem("New");
        jMenuItem_new.addActionListener(menuExampleListener);
        jMenuItem_new.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, InputEvent.CTRL_DOWN_MASK));
        JMenuItem jMenuItem_exit = new JMenuItem("Exit");
        jMenuItem_exit.addActionListener(menuExampleListener);
        jMenuItem_exit.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_E, InputEvent.ALT_DOWN_MASK));
        jMenu_file.add(jMenuItem_enter);
        jMenu_file.add(jMenuItem_new);
        jMenu_file.addSeparator();
        jMenu_file.add(jMenuItem_exit);
        jMenuBar.add(jMenu_file);
        
        
        // create, add JMenu va JMenuItem
        JMenu jMenu_Help = new JMenu("Help");
        JMenuItem jMenuItem_check = new JMenuItem("Check");
        jMenuItem_check.addActionListener(menuExampleListener);
        jMenu_Help.add(jMenuItem_check);
        jMenuBar.add(jMenu_Help);
        
        
        // them JMenuBar vao giaoDien
        this.setJMenuBar(jMenuBar);       
        
        // JLabel
        jLabel = new JLabel("");
        
        
        // setLauout
        this.setLayout(new BorderLayout());
        this.add(jLabel, BorderLayout.CENTER);
//        this.add(jMenuBar, BorderLayout.SOUTH);

        
        this.setVisible(true);
    }
    
    public void duLieu(String s) {
        jLabel.setText(s);
    }
    
}
