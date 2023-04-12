package view;

import controller.TimKiemListener;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import model.TimKiemModel;

public class TimKiemView extends JFrame{
    private TimKiemModel timKiemModel;
    private JLabel lbl_vanBan;
    private JTextArea txt_vanBan;
    private JLabel lbl_tuKhoa;
    private JTextField txt_tuKhoa;
    private JButton btn_thongKe;
    private JLabel lbl_ketQua;
    

    public TimKiemView() {
        timKiemModel = new TimKiemModel();
        this.init();
        this.setVisible(true);
    }

    private void init() {
        this.setSize(600, 400);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setTitle("Tim kiem");
        
        // Font
        Font font = new Font("Arial", Font.BOLD, 25);
        
        // ACtionListener
        ActionListener ac = new TimKiemListener(this);
        
        // lbl_vanBan
        lbl_vanBan = new JLabel("Van Ban");
        lbl_vanBan.setFont(font);
        
        // txt_vanBan
        txt_vanBan = new JTextArea(100, 100);
        txt_vanBan.setFont(font);
        
        // lbl_tuKhoa
        lbl_tuKhoa = new JLabel("Tu Khoa");
        lbl_tuKhoa.setFont(font);
        
        // txt_tuKhoa
        txt_tuKhoa = new JTextField(50);
        txt_tuKhoa.setFont(font);
        
        // btn_thongKe
        btn_thongKe = new JButton("Thong Ke");
        btn_thongKe.setFont(font);
        btn_thongKe.setBackground(Color.BLACK);
        btn_thongKe.setForeground(Color.WHITE);
        btn_thongKe.addActionListener(ac);
        
        // lbl_ketQua
        lbl_ketQua = new JLabel();
        lbl_ketQua.setFont(font);
        
        
        
        // gridLayOut
        JPanel vung = new JPanel();
        vung.setLayout(new GridLayout(2, 2));
        
        vung.add(lbl_tuKhoa);
        vung.add(txt_tuKhoa);
        vung.add(btn_thongKe);
        vung.add(lbl_ketQua);
        
        
        // Frame chinh
        this.setLayout(new BorderLayout());
        this.add(lbl_vanBan, BorderLayout.NORTH);
        this.add(txt_vanBan, BorderLayout.CENTER);
        this.add(vung, BorderLayout.SOUTH);
    }
    
    
    public void timKiem() {
        this.timKiemModel.setVanBan(txt_vanBan.getText());
        this.timKiemModel.setTuKhoa(txt_tuKhoa.getText());
        this.timKiemModel.timKiem();
        this.lbl_ketQua.setText(timKiemModel.getKetQua());
    }
    
}
