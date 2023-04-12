package BaiTest2;

import java.awt.Color;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.xml.crypto.Data;

/**
 *
 * @author ASUS
 */
public class PhimCuaToi extends javax.swing.JFrame implements Runnable{

    /**
     * Creates new form PhimCuaToi
     */
    public PhimCuaToi() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl = new javax.swing.JTable();
        txt_name = new javax.swing.JTextField();
        cbo_namSinh = new javax.swing.JComboBox<>();
        cbo_theLoai = new javax.swing.JComboBox<>();
        rdo_rap = new javax.swing.JRadioButton();
        rdo_mang = new javax.swing.JRadioButton();
        rdo_truyenHinh = new javax.swing.JRadioButton();
        cbo_kinhDien = new javax.swing.JComboBox<>();
        txt_tuoi = new javax.swing.JTextField();
        btn_them = new javax.swing.JButton();
        btn_sua = new javax.swing.JButton();
        btn_xoa = new javax.swing.JButton();
        btn_sapXep = new javax.swing.JButton();
        btn_ghiFIle = new javax.swing.JButton();
        btn_docFIle = new javax.swing.JButton();
        lbl_time = new javax.swing.JLabel();
        lbl_runChay = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 204));
        jLabel1.setText("PHIM CUA TOI");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel2.setText("HO TEN");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel3.setText("NAM SINH");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel4.setText("THE LOAI");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel5.setText("HINH THUC XEM");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel6.setText("PHIM KINH DIEN");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel7.setText("TUOI");

        tbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "HO TEN", "NAM SINH", "THE LOAI", "HINH THUC", "PHIM KINH DIEN", "TINH CAM"
            }
        ));
        tbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl);

        txt_name.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N

        cbo_namSinh.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        cbo_namSinh.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbo_namSinh.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cbo_namSinhMouseClicked(evt);
            }
        });

        cbo_theLoai.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        cbo_theLoai.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        buttonGroup1.add(rdo_rap);
        rdo_rap.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        rdo_rap.setSelected(true);
        rdo_rap.setText("RAP");

        buttonGroup1.add(rdo_mang);
        rdo_mang.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        rdo_mang.setText("MANG");

        buttonGroup1.add(rdo_truyenHinh);
        rdo_truyenHinh.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        rdo_truyenHinh.setText("TRUYEN HINH");

        cbo_kinhDien.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        cbo_kinhDien.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        txt_tuoi.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        txt_tuoi.setEnabled(false);

        btn_them.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btn_them.setText("THEM");
        btn_them.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_themActionPerformed(evt);
            }
        });

        btn_sua.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btn_sua.setText("SUA");
        btn_sua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_suaActionPerformed(evt);
            }
        });

        btn_xoa.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btn_xoa.setText("XOA");
        btn_xoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_xoaActionPerformed(evt);
            }
        });

        btn_sapXep.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btn_sapXep.setText("SAP XEP");
        btn_sapXep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_sapXepActionPerformed(evt);
            }
        });

        btn_ghiFIle.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btn_ghiFIle.setText("GHI FILE");
        btn_ghiFIle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ghiFIleActionPerformed(evt);
            }
        });

        btn_docFIle.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btn_docFIle.setText("DOC FILE");
        btn_docFIle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_docFIleActionPerformed(evt);
            }
        });

        lbl_time.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lbl_time.setForeground(new java.awt.Color(255, 0, 51));
        lbl_time.setText("Thoi gian");

        lbl_runChay.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lbl_runChay.setForeground(new java.awt.Color(0, 153, 51));
        lbl_runChay.setText("Thoi gian da chay");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 613, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7))
                                .addGap(39, 39, 39)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_name, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(cbo_theLoai, javax.swing.GroupLayout.Alignment.LEADING, 0, 136, Short.MAX_VALUE)
                                        .addComponent(cbo_namSinh, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(txt_tuoi, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(cbo_kinhDien, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(rdo_rap)
                                                .addGap(18, 18, 18)
                                                .addComponent(rdo_mang)))
                                        .addGap(18, 18, 18)
                                        .addComponent(rdo_truyenHinh))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addComponent(jLabel1)
                                .addGap(55, 55, 55)
                                .addComponent(lbl_runChay)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_time)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(btn_docFIle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btn_ghiFIle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btn_sapXep, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btn_xoa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btn_sua, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btn_them, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(22, 22, 22)))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(lbl_time)
                    .addComponent(lbl_runChay))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txt_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_them))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cbo_namSinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_sua))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cbo_theLoai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_xoa))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(rdo_rap)
                    .addComponent(rdo_mang)
                    .addComponent(rdo_truyenHinh)
                    .addComponent(btn_sapXep))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(cbo_kinhDien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_ghiFIle))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txt_tuoi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_docFIle))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        this.setLocationRelativeTo(null);

        cbo_namSinh.removeAllItems();
        for (int i = 1960; i <= 2010; i++) {
            cbo_namSinh.addItem(i + "");
        }

        cbo_theLoai.removeAllItems();
        cbo_theLoai.addItem("Tam ly");
        cbo_theLoai.addItem("Tinh cam");
        cbo_theLoai.addItem("Hai");
        cbo_theLoai.addItem("Hanh dong");

        cbo_kinhDien.removeAllItems();
        cbo_kinhDien.addItem("Titanic");
        cbo_kinhDien.addItem("Phim nhat");
        
        
        startTime = System.currentTimeMillis() / 1000;
    }//GEN-LAST:event_formWindowOpened

    private void btn_themActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_themActionPerformed
        // TODO add your handling code here:
        this.add();
    }//GEN-LAST:event_btn_themActionPerformed

    private void btn_suaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_suaActionPerformed
        // TODO add your handling code here:
        this.update();
    }//GEN-LAST:event_btn_suaActionPerformed

    private void btn_xoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_xoaActionPerformed
        // TODO add your handling code here:
        this.delete();
    }//GEN-LAST:event_btn_xoaActionPerformed

    private void tblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblMouseClicked
        // TODO add your handling code here:
        writeForm(list.get(indexTable()));
    }//GEN-LAST:event_tblMouseClicked

    private void btn_ghiFIleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ghiFIleActionPerformed
        // TODO add your handling code here:
        write();
    }//GEN-LAST:event_btn_ghiFIleActionPerformed

    private void btn_docFIleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_docFIleActionPerformed
        // TODO add your handling code here:
        read();
    }//GEN-LAST:event_btn_docFIleActionPerformed

    private void btn_sapXepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_sapXepActionPerformed
        // TODO add your handling code here:
        sapXepThemNam();
    }//GEN-LAST:event_btn_sapXepActionPerformed

    private void cbo_namSinhMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbo_namSinhMouseClicked
        // TODO add your handling code here:
        txt_tuoi.setText((2022 - Integer.parseInt(cbo_namSinh.getSelectedItem() + "")) + "");
    }//GEN-LAST:event_cbo_namSinhMouseClicked

    //--------------------------------------------------------------
    ArrayList<Phim> list = new ArrayList<>();

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
            java.util.logging.Logger.getLogger(PhimCuaToi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PhimCuaToi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PhimCuaToi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PhimCuaToi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        PhimCuaToi phim = new PhimCuaToi();
        phim.setVisible(true);
        Thread thread = new Thread(phim);
        thread.start();
    }
    
    long startTime, endTime;

    @Override
    public void run() {
        while (true) {            
            SimpleDateFormat fm = new SimpleDateFormat("hh:mm:ss  a");
            Date date = new Date();
            String thoiGian = fm.format(date);
            lbl_time.setText(thoiGian);
            
            endTime = System.currentTimeMillis() / 1000;
            String chay= "Thoi gian: " + (endTime - startTime);
            lbl_runChay.setText(chay);
            
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
            }
        }
    }
    
    

    public void fillTable() {
        DefaultTableModel model = (DefaultTableModel) tbl.getModel();
        model.setRowCount(0);
        for (Phim phim : list) {
            model.addRow(new Object[]{
                phim.getHoTen(), phim.getNamSinh(), phim.getTheLoai(),
                phim.getHinhThuc(), phim.getPhimKinhDien(), phim.getTinhCach()
            });
        }
    }

    public Phim readForm() {
        Phim phim = new Phim();

        phim.setHoTen(txt_name.getText());
        phim.setNamSinh(Integer.parseInt(cbo_namSinh.getSelectedItem() + ""));
        phim.setTheLoai(cbo_theLoai.getSelectedItem() + "");
        phim.setPhimKinhDien(cbo_kinhDien.getSelectedItem() + "");

        if (rdo_rap.isSelected()) {
            phim.setHinhThuc("Rap");
        } else if (rdo_mang.isSelected()) {
            phim.setHinhThuc("Mang");
        } else {
            phim.setHinhThuc("Truyen hinh");
        }

        return phim;
    }

    public void writeForm(Phim phim) {
        txt_name.setText(phim.getHoTen());
        txt_tuoi.setText(phim.getTuoi() + "");
        if (phim.getHinhThuc().equalsIgnoreCase("Rap")) {
            rdo_rap.setSelected(true);
        } else if (phim.getHinhThuc().equalsIgnoreCase("Mang")) {
            rdo_mang.setSelected(true);
        } else {
            rdo_truyenHinh.setSelected(true);
        }

        for (int i = 0; i < cbo_namSinh.getItemCount(); i++) {
            if (cbo_namSinh.getItemAt(i).equalsIgnoreCase(phim.getNamSinh() + "")) {
                cbo_namSinh.setSelectedIndex(i);
            }
        }

        for (int i = 0; i < cbo_theLoai.getItemCount(); i++) {
            if (cbo_theLoai.getItemAt(i).equalsIgnoreCase(phim.getTheLoai())) {
                cbo_theLoai.setSelectedIndex(i);
            }
        }

        for (int i = 0; i < cbo_kinhDien.getItemCount(); i++) {
            if (cbo_kinhDien.getItemAt(i).equalsIgnoreCase(phim.getPhimKinhDien())) {
                cbo_kinhDien.setSelectedIndex(i);
            }
        }
    }

    public int indexTable() {
        return tbl.getSelectedRow();
    }

    public void add() {
        if (kiemTraTen() == false) {
            txt_name.setBackground(Color.YELLOW);
            txt_name.requestFocus();
        } else {
            list.add(readForm());
            fillTable();
            JOptionPane.showMessageDialog(this, "Ban da them!");
        }
    }

    public boolean kiemTraTen() {
        String dinhDang = "[a-zA-z ]+";
        if (txt_name.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "ten null!");
            return false;
        } else if (txt_name.getText().matches(dinhDang) == false) {
            JOptionPane.showMessageDialog(this, "Khong dung dinh dang ten!");
            return false;
        }

        txt_name.setBackground(Color.WHITE);
        return true;
    }

    public void update() {
        list.set(indexTable(), readForm());
        fillTable();
        JOptionPane.showMessageDialog(this, "Ban update them!");
    }

    public void delete() {
        list.remove(indexTable());
        fillTable();
        JOptionPane.showMessageDialog(this, "Ban xoa them!");
    }

    public void sapXepThemNam() {
        Collections.sort(list, new Comparator<Phim>() {
            @Override
            public int compare(Phim o1, Phim o2) {
                if(o1.getNamSinh() - o2.getNamSinh() > 0) {
                    return 1;
                } else if(o1.getNamSinh() - o2.getNamSinh() < 0) {
                    return -1;
                } else {
                    return 0;
                }
            }
        });
        JOptionPane.showMessageDialog(this, "Sap xep the nam sinh!");
        fillTable();
    }
    
    
    public void write() { 
        try {
            JFileChooser fc = new JFileChooser();
            int chon = fc.showSaveDialog(null);
            if(chon == 0) {
                String path; 
                path = fc.getSelectedFile().getPath();
                FileOutputStream fo = new FileOutputStream(path);
                ObjectOutputStream ofo = new ObjectOutputStream(fo); 
                ofo.writeObject(list);
                ofo.close(); 
                JOptionPane.showMessageDialog(this, "Them bang thanh cong");
                DefaultTableModel model = (DefaultTableModel) tbl.getModel();
                model.setRowCount(0);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Ghi file loi!");
        }
        
    }
    
    public void read() {
        try {
            JFileChooser fc = new JFileChooser();
            int chon = fc.showOpenDialog(null);
            if(chon == 0) {
                String path = fc.getSelectedFile().getPath();
                FileInputStream fi = new FileInputStream(path);
                ObjectInputStream ifi = new ObjectInputStream(fi);
                list = (ArrayList<Phim>) ifi.readObject();
                ifi.close();
                fillTable();
                JOptionPane.showMessageDialog(this, "Doc thanh cong!");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Loi doc file!");
        }
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_docFIle;
    private javax.swing.JButton btn_ghiFIle;
    private javax.swing.JButton btn_sapXep;
    private javax.swing.JButton btn_sua;
    private javax.swing.JButton btn_them;
    private javax.swing.JButton btn_xoa;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cbo_kinhDien;
    private javax.swing.JComboBox<String> cbo_namSinh;
    private javax.swing.JComboBox<String> cbo_theLoai;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_runChay;
    private javax.swing.JLabel lbl_time;
    private javax.swing.JRadioButton rdo_mang;
    private javax.swing.JRadioButton rdo_rap;
    private javax.swing.JRadioButton rdo_truyenHinh;
    private javax.swing.JTable tbl;
    private javax.swing.JTextField txt_name;
    private javax.swing.JTextField txt_tuoi;
    // End of variables declaration//GEN-END:variables
}
