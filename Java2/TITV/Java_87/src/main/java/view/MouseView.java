package view;

import controller.MouseController;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.MouseListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import model.MouseModel;

public class MouseView extends JFrame {

    private MouseModel mouseModel;
    private JLabel lbl_x;
    private JLabel lbl_y;
    private JLabel lbl_click_value;
    private JLabel lbl_checkIn_value;
    private JPanel vung1;
    private JLabel lbl_position;
    private JLabel lbl_click;
    private JLabel lbl_empty1;
    private JLabel lbl_checkIn;
    private JLabel lbl_empty2;

    public MouseView() {
        mouseModel = new MouseModel();
        this.init();
        this.setVisible(true);
    }

    private void init() {
        this.setSize(900, 400);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setTitle("Mouse Event");

        // font
        Font font = new Font("Arial", Font.PLAIN, 25);

        // mouseLisenter, mouseMotionListener
        MouseController mouseController = new MouseController(this);

        // vung 1
        vung1 = new JPanel();
        vung1.setBackground(Color.CYAN);
        vung1.addMouseListener(mouseController);
        vung1.addMouseMotionListener(mouseController);

        // vung2
        JPanel vung2 = new JPanel(new GridLayout(3, 3));

        lbl_position = new JLabel("Positon: ");
        lbl_position.setFont(font);
        lbl_x = new JLabel("x = ");
        lbl_x.setFont(font);
        lbl_y = new JLabel("y = ");
        lbl_y.setFont(font);
        lbl_click = new JLabel("Number of clicks: ");
        lbl_click.setFont(font);
        lbl_click_value = new JLabel("n");
        lbl_click_value.setFont(font);
        lbl_empty1 = new JLabel();
        lbl_empty1.setFont(font);
        lbl_checkIn = new JLabel("Mouse is in component: ");
        lbl_checkIn.setFont(font);
        lbl_checkIn_value = new JLabel("no");
        lbl_checkIn_value.setFont(font);
        lbl_empty2 = new JLabel();
        lbl_empty2.setFont(font);

        vung2.add(lbl_position);
        vung2.add(lbl_x);
        vung2.add(lbl_y);
        vung2.add(lbl_click);
        vung2.add(lbl_click_value);
        vung2.add(lbl_empty1);
        vung2.add(lbl_checkIn);
        vung2.add(lbl_checkIn_value);
        vung2.add(lbl_empty2);

        // JFrame
        this.setLayout(new BorderLayout());
        this.add(vung1, BorderLayout.CENTER);
        this.add(vung2, BorderLayout.SOUTH);
    }

    public void click() {
        mouseModel.click();
        this.lbl_click_value.setText(mouseModel.getCount() + "");
    }

    public void enter() {
        mouseModel.enter();
        this.lbl_checkIn_value.setText(mouseModel.getCheckIn());
    }

    public void exit() {
        mouseModel.exit();
        this.lbl_checkIn_value.setText(mouseModel.getCheckIn());
    }

    public void update(int x, int y) {
        lbl_x.setText(x + "");
        lbl_y.setText(y + "");
    }

}
