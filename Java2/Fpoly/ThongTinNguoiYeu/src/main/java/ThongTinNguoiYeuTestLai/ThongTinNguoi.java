package ThongTinNguoiYeuTestLai;

import java.awt.Color;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ThongTinNguoi extends javax.swing.JFrame implements Runnable{

    public ThongTinNguoi() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        buttonGroup1 = new javax.swing.ButtonGroup();
        lbl_name = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txt_hoTen = new javax.swing.JTextField();
        txt_ngaySinh = new javax.swing.JTextField();
        txt_canNang = new javax.swing.JTextField();
        rdo_nam = new javax.swing.JRadioButton();
        rdo_nu = new javax.swing.JRadioButton();
        cbo_queQuan = new javax.swing.JComboBox<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbl = new javax.swing.JTable();
        btn_them = new javax.swing.JButton();
        btn_ghiFIle = new javax.swing.JButton();
        btn_moFile = new javax.swing.JButton();
        btn_xoa = new javax.swing.JButton();
        btn_capNhat = new javax.swing.JButton();
        lbl_time = new javax.swing.JLabel();
        lbl_timeRun = new javax.swing.JLabel();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        lbl_name.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        lbl_name.setForeground(new java.awt.Color(204, 0, 51));
        lbl_name.setText("CHAO CAC BAN NHA  ");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel2.setText("Ho ten");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel3.setText("Ngay sinh");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel4.setText("Gioi tinh");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel5.setText("Can nang");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel6.setText("Que quan");

        txt_hoTen.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N

        txt_ngaySinh.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N

        txt_canNang.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N

        buttonGroup1.add(rdo_nam);
        rdo_nam.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        rdo_nam.setSelected(true);
        rdo_nam.setText("Nam");

        buttonGroup1.add(rdo_nu);
        rdo_nu.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        rdo_nu.setText("Nu");

        cbo_queQuan.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        cbo_queQuan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        tbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "HO TEN", "NGAY SINH", "GIOI TINH", "CAN NANG", "QUE QUAN", "SUC KHOE"
            }
        ));
        tbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tbl);

        btn_them.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btn_them.setText("Them");
        btn_them.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_themActionPerformed(evt);
            }
        });

        btn_ghiFIle.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btn_ghiFIle.setText("Ghi file");
        btn_ghiFIle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ghiFIleActionPerformed(evt);
            }
        });

        btn_moFile.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btn_moFile.setText("Mo file");
        btn_moFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_moFileActionPerformed(evt);
            }
        });

        btn_xoa.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btn_xoa.setText("Xoa");
        btn_xoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_xoaActionPerformed(evt);
            }
        });

        btn_capNhat.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btn_capNhat.setText("Cap nhat");
        btn_capNhat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_capNhatActionPerformed(evt);
            }
        });

        lbl_time.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lbl_time.setText("Thoi gian");

        lbl_timeRun.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lbl_timeRun.setText("TimeChay");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(jLabel6))
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(rdo_nam)
                                .addGap(92, 92, 92)
                                .addComponent(rdo_nu))
                            .addComponent(txt_hoTen)
                            .addComponent(txt_ngaySinh)
                            .addComponent(txt_canNang)
                            .addComponent(cbo_queQuan, 0, 300, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_them, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_ghiFIle, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_moFile, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_xoa, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_capNhat, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 573, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbl_name)
                                .addGap(29, 29, 29)
                                .addComponent(lbl_time)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lbl_timeRun)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(34, 34, 34))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_name)
                    .addComponent(lbl_time)
                    .addComponent(lbl_timeRun))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txt_hoTen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_them))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txt_ngaySinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_ghiFIle))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(rdo_nam)
                    .addComponent(rdo_nu)
                    .addComponent(btn_moFile))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txt_canNang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_xoa))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(cbo_queQuan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_capNhat))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);

        cbo_queQuan.removeAllItems();

        cbo_queQuan.addItem("Ha Noi");
        cbo_queQuan.addItem("Ho Chi Minh");
        cbo_queQuan.addItem("Hai Phong");
        cbo_queQuan.addItem("Da Nang");
        
        
        startTime = System.currentTimeMillis() / 1000;
    }//GEN-LAST:event_formWindowOpened

    private void tblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblMouseClicked
        // TODO add your handling code here:
        writeForm(list.get(indexTable()));
    }//GEN-LAST:event_tblMouseClicked

    private void btn_themActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_themActionPerformed
        // TODO add your handling code here:
        this.add();

    }//GEN-LAST:event_btn_themActionPerformed

    private void btn_capNhatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_capNhatActionPerformed
        // TODO add your handling code here:
        this.update();
        JOptionPane.showMessageDialog(this, "Ban da cap nhat!");
    }//GEN-LAST:event_btn_capNhatActionPerformed

    private void btn_xoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_xoaActionPerformed
        // TODO add your handling code here:
        this.delete();
        JOptionPane.showMessageDialog(this, "Ban da xoa!");
    }//GEN-LAST:event_btn_xoaActionPerformed

    private void btn_ghiFIleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ghiFIleActionPerformed
        // TODO add your handling code here:
        this.writeFile();
    }//GEN-LAST:event_btn_ghiFIleActionPerformed

    private void btn_moFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_moFileActionPerformed
        // TODO add your handling code here:
        this.readFile();
    }//GEN-LAST:event_btn_moFileActionPerformed

    //--------------------------------Code----------------------------------
    ArrayList<Nguoi> list = new ArrayList<>();
    long startTime, endTime;

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ThongTinNguoi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ThongTinNguoi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ThongTinNguoi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ThongTinNguoi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        ThongTinNguoi thongTin = new ThongTinNguoi();
        thongTin.setVisible(true);
        Thread th = new Thread(thongTin);
        th.start();
    }

    @Override
    public void run() {
        while (true) {            
            String ten = lbl_name.getText();
            String dau = ten.substring(0, 1);
            ten = ten.substring(1) + dau;
            lbl_name.setText(ten);
            //--------------------------------
            SimpleDateFormat fm = new SimpleDateFormat("dd-MM-yyyy  hh:mm:ss  a");
            Date date = new Date();
            String time = fm.format(date);
            lbl_time.setText(time);
            //--------------------------------
            endTime = System.currentTimeMillis() / 1000;
            
            lbl_timeRun.setText((endTime - startTime) + "");
            
            
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
            }
        }
    }
    
    

    public void fillTable() {
        DefaultTableModel model = (DefaultTableModel) tbl.getModel();
        model.setRowCount(0);
        for (Nguoi nguoi : list) {
            model.addRow(new Object[]{
                nguoi.getHoTen(), nguoi.getNgaySinh(), nguoi.getGioiTinh(),
                nguoi.getCanNang(), nguoi.getQueQuan(), nguoi.getSucKhoe()
            });
        }
    }

    public Nguoi readForm() {
        Nguoi ng = new Nguoi();

        ng.setHoTen(txt_hoTen.getText());
        ng.setNgaySinh(txt_ngaySinh.getText());
        ng.setCanNang(Double.parseDouble(txt_canNang.getText()));

        if (rdo_nam.isSelected()) {
            ng.setGioiTinh("Nam");
        } else {
            ng.setGioiTinh("Nu");
        }

        ng.setQueQuan(cbo_queQuan.getSelectedItem() + "");

        return ng;
    }

    public void writeForm(Nguoi ng) {
        txt_hoTen.setText(ng.getHoTen());
        txt_canNang.setText(ng.getCanNang() + "");
        txt_ngaySinh.setText(ng.getNgaySinh());

        if (ng.getGioiTinh().equalsIgnoreCase("Nam")) {
            rdo_nam.setSelected(true);
        } else {
            rdo_nu.setSelected(true);
        }

        for (int i = 0; i < cbo_queQuan.getItemCount(); i++) {
            if (cbo_queQuan.getItemAt(i).equalsIgnoreCase(ng.getQueQuan())) {
                cbo_queQuan.setSelectedIndex(i);
                break;
            }
        }
    }

    public int indexTable() {
        return tbl.getSelectedRow();
    }

    public void add() {
        if (kiemTraTen() == false) {
            txt_hoTen.setBackground(Color.YELLOW);
            txt_hoTen.requestFocus();
        } else if (kiemTraNgaySinh() == false) {
            txt_ngaySinh.setBackground(Color.YELLOW);
            txt_ngaySinh.requestFocus();
        } else if (kiemTraCanNang() == false) {
            txt_canNang.setBackground(Color.YELLOW);
            txt_canNang.requestFocus();
        } else {
            list.add(readForm());
            fillTable();
            JOptionPane.showMessageDialog(this, "Ban da them!");
        }

    }

    public void update() {
        list.set(indexTable(), readForm());
        fillTable();
    }

    public void delete() {
        list.remove(indexTable());
        fillTable();
    }

    public void writeFile() {
        try {
            JFileChooser fc = new JFileChooser();
            int chon = fc.showSaveDialog(this);
            if (chon == 0) {
                String path = fc.getSelectedFile().getPath();
                FileOutputStream fo = new FileOutputStream(path);
                ObjectOutputStream ofo = new ObjectOutputStream(fo);
                ofo.writeObject(list);
                ofo.close();
                DefaultTableModel model = (DefaultTableModel) tbl.getModel();
                model.setRowCount(0);
                JOptionPane.showMessageDialog(this, "Ghi file thanh cong!");

            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Loi ghi file!");
        }
    }

    public void readFile() {
        try {
            JFileChooser fc = new JFileChooser();
            int chon = fc.showSaveDialog(this);
            if(chon == 0) {
                String path = fc.getSelectedFile().getPath();
                FileInputStream fi = new FileInputStream(path);
                ObjectInputStream ifi = new ObjectInputStream(fi);
                list = (ArrayList<Nguoi>) ifi.readObject();
                fillTable();
                ifi.close();
                JOptionPane.showMessageDialog(this, "Doc file thanh cong!");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Loi doc file!");
        }
    }

    public boolean kiemTraTen() {
        String dinhDang = "[a-zA-Z ]+";
        if (txt_hoTen.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Ho ten null!");
            return false;
        } else if (txt_hoTen.getText().matches(dinhDang) == false) {
            JOptionPane.showMessageDialog(this, "Ho ten khong dung dinh dang!");
            return false;
        }

        txt_hoTen.setBackground(Color.WHITE);
        return true;
    }

    public boolean kiemTraNgaySinh() {
        String dinhDang = "(0?[1-9]|[12][0-9]|3[01])/(0?[1-9]|1[012])/((19|20)\\d\\d)";
        if (txt_ngaySinh.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Ngay sinh null!");
            return false;
        } else if (txt_ngaySinh.getText().matches(dinhDang) == false) {
            JOptionPane.showMessageDialog(this, "Ngay sinh khong dung dinh dang!");
            return false;
        }
        txt_ngaySinh.setBackground(Color.WHITE);
        return true;
    }

    public boolean kiemTraCanNang() {
        if (txt_canNang.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Can nang null!");
            return false;
        } else {
            try {
                Double.parseDouble(txt_canNang.getText());
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Can nang khong dung dinh dang!");
                return false;
            }
        }

        txt_canNang.setBackground(Color.WHITE);
        return true;
    }

    //-------------------------------------------------------------------------
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_capNhat;
    private javax.swing.JButton btn_ghiFIle;
    private javax.swing.JButton btn_moFile;
    private javax.swing.JButton btn_them;
    private javax.swing.JButton btn_xoa;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cbo_queQuan;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JLabel lbl_name;
    private javax.swing.JLabel lbl_time;
    private javax.swing.JLabel lbl_timeRun;
    private javax.swing.JRadioButton rdo_nam;
    private javax.swing.JRadioButton rdo_nu;
    private javax.swing.JTable tbl;
    private javax.swing.JTextField txt_canNang;
    private javax.swing.JTextField txt_hoTen;
    private javax.swing.JTextField txt_ngaySinh;
    // End of variables declaration//GEN-END:variables
}
