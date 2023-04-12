package KiemTra;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ASUS
 */
public class SoThichCuaToi extends javax.swing.JFrame {

    /**
     * Creates new form SoThichCuaToi
     */
    public SoThichCuaToi() {
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
        txt_ten = new javax.swing.JTextField();
        cbo_nam = new javax.swing.JComboBox<>();
        rdo_ruou = new javax.swing.JRadioButton();
        rdo_bia = new javax.swing.JRadioButton();
        rdo_nuocNgot = new javax.swing.JRadioButton();
        cbo_com = new javax.swing.JComboBox<>();
        btn_sauDoiTuong = new javax.swing.JButton();
        btn_sapXep = new javax.swing.JButton();
        btn_them = new javax.swing.JButton();
        btn_sua = new javax.swing.JButton();
        btn_xoa = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl = new javax.swing.JTable();
        btn_tuoi = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 0, 255));
        jLabel1.setText("So Thich Cua Toi");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("HO TEN");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setText("NAM SINH");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setText("DO UONG");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setText("COM");

        txt_ten.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        cbo_nam.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        cbo_nam.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        buttonGroup1.add(rdo_ruou);
        rdo_ruou.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        rdo_ruou.setSelected(true);
        rdo_ruou.setText("RUOU");

        buttonGroup1.add(rdo_bia);
        rdo_bia.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        rdo_bia.setText("BIA");

        buttonGroup1.add(rdo_nuocNgot);
        rdo_nuocNgot.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        rdo_nuocNgot.setText("NUOC NGOT");

        cbo_com.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        cbo_com.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        btn_sauDoiTuong.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btn_sauDoiTuong.setText("DO 6 DOI TUONG VAO TABLE");
        btn_sauDoiTuong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_sauDoiTuongActionPerformed(evt);
            }
        });

        btn_sapXep.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btn_sapXep.setText("SAP XEP THEO TEN");
        btn_sapXep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_sapXepActionPerformed(evt);
            }
        });

        btn_them.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btn_them.setText("THEM");
        btn_them.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_themActionPerformed(evt);
            }
        });

        btn_sua.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btn_sua.setText("SUA");
        btn_sua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_suaActionPerformed(evt);
            }
        });

        btn_xoa.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btn_xoa.setText("XOA");
        btn_xoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_xoaActionPerformed(evt);
            }
        });

        tbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ho ten", "nam sinh", "uong", "com"
            }
        ));
        tbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl);

        btn_tuoi.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btn_tuoi.setText("SAP XEP THEO TUOI");
        btn_tuoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_tuoiActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(124, 124, 124)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 710, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5))
                                .addGap(45, 45, 45)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_ten, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cbo_nam, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cbo_com, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(rdo_ruou)
                                        .addGap(18, 18, 18)
                                        .addComponent(rdo_bia)
                                        .addGap(18, 18, 18)
                                        .addComponent(rdo_nuocNgot)))
                                .addGap(30, 30, 30)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btn_tuoi, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(btn_sauDoiTuong, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btn_sapXep, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(btn_them)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(btn_sua)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(btn_xoa))))))))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txt_ten, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_sauDoiTuong))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cbo_nam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_sapXep))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(rdo_ruou)
                    .addComponent(rdo_bia)
                    .addComponent(rdo_nuocNgot)
                    .addComponent(btn_tuoi))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(cbo_com, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_them)
                    .addComponent(btn_sua)
                    .addComponent(btn_xoa))
                .addGap(43, 43, 43)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);

        cbo_nam.removeAllItems();
        cbo_com.removeAllItems();

        String chuoi;

        for (int i = 1995; i <= 2015; i++) {
            chuoi = i + "";
            cbo_nam.addItem(chuoi);
        }

        cbo_com.addItem("Com rang");
        cbo_com.addItem("My tom");
        cbo_com.addItem("Banh my");
    }//GEN-LAST:event_formWindowOpened

    private void btn_themActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_themActionPerformed
        // TODO add your handling code here:
        addTable();
        cleanForm();
    }//GEN-LAST:event_btn_themActionPerformed

    private void tblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblMouseClicked
        // TODO add your handling code here:
        writeTable(danhSach.get(indexTable()));
    }//GEN-LAST:event_tblMouseClicked

    int count = 0;

    private void btn_sauDoiTuongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_sauDoiTuongActionPerformed
        // TODO add your handling code here:
        if (count == 0) {
            Thuan t1 = new Thuan("Thuan", 2003, "Bia", "Banh my");
            Thuan t2 = new Thuan("Hai", 1999, "Nuoc ngot", "My tom");
            Thuan t3 = new Thuan("Ngoc", 2015, "Ruou", "Com rang");
            Thuan t4 = new Thuan("Tong Trang", 2003, "Bia", "My tom");
            Thuan t5 = new Thuan("Binh", 1998, "Ruou", "Banh my");
            Thuan t6 = new Thuan("Viet Anh", 2013, "Bia", "Com rang");

            danhSach.add(t1);
            danhSach.add(t2);
            danhSach.add(t3);
            danhSach.add(t4);
            danhSach.add(t5);
            danhSach.add(t6);

            fillTable();
            
            count++;
        }
    }//GEN-LAST:event_btn_sauDoiTuongActionPerformed

    private void btn_suaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_suaActionPerformed
        // TODO add your handling code here:
        updateTable();
        cleanForm();
    }//GEN-LAST:event_btn_suaActionPerformed

    private void btn_xoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_xoaActionPerformed
        // TODO add your handling code here:
        deleteTable();
        cleanForm();
    }//GEN-LAST:event_btn_xoaActionPerformed

    private void btn_sapXepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_sapXepActionPerformed
        // TODO add your handling code here:
        sapXepTheoTen();
    }//GEN-LAST:event_btn_sapXepActionPerformed

    private void btn_tuoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_tuoiActionPerformed
        // TODO add your handling code here:
        sapXepTheoTuoi();
    }//GEN-LAST:event_btn_tuoiActionPerformed

    /**
     * @param args the command line arguments
     */
    ArrayList<Thuan> danhSach = new ArrayList<>();

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
            java.util.logging.Logger.getLogger(SoThichCuaToi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SoThichCuaToi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SoThichCuaToi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SoThichCuaToi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SoThichCuaToi().setVisible(true);
            }
        });
    }

    public void fillTable() {
        DefaultTableModel model = (DefaultTableModel) tbl.getModel();

        model.setRowCount(0);

        for (Thuan thuan : danhSach) {
            model.addRow(new Object[]{
                thuan.getHoTen(), thuan.getTuoi(), thuan.getDoUong(), thuan.getCom()
            });
        }
    }

    public Thuan readTable() {
        String ten = txt_ten.getText();
        int nam = Integer.parseInt(cbo_nam.getSelectedItem() + "");
        String doUong;

        if (rdo_bia.isSelected() == true) {
            doUong = "Bia";
        } else if (rdo_nuocNgot.isSelected() == true) {
            doUong = "Nuoc ngot";
        } else {
            doUong = "Ruou";
        }

        String com = cbo_com.getSelectedItem() + "";

        return new Thuan(ten, nam, doUong, com);
    }

    public void writeTable(Thuan thuan) {
        txt_ten.setText(thuan.getHoTen());

        for (int i = 0; i < cbo_nam.getItemCount(); i++) {
            if (cbo_nam.getItemAt(i).equalsIgnoreCase(thuan.getTuoi() + "")) {
                cbo_nam.setSelectedIndex(i);
            }
        }

        if (thuan.getDoUong() == "Bia") {
            rdo_bia.setSelected(true);
        } else if (thuan.getDoUong() == "Ruou") {
            rdo_ruou.setSelected(true);
        } else {
            rdo_nuocNgot.setSelected(true);
        }

        for (int i = 0; i < cbo_com.getItemCount(); i++) {
            if (cbo_com.getItemAt(i).equalsIgnoreCase(thuan.getCom())) {
                cbo_com.setSelectedIndex(i);
            }
        }
    }

    public int indexTable() {
        return tbl.getSelectedRow();
    }

    public void addTable() {
        if (kiemTrahoTen() == false) {
            txt_ten.setBackground(Color.YELLOW);
            txt_ten.requestFocus();
        } else {
            danhSach.add(readTable());
            JOptionPane.showMessageDialog(this, "Ban da them!");
        }

        fillTable();
    }
    
    public void updateTable() {
        if(kiemTrahoTen() == false) {
            txt_ten.setBackground(Color.YELLOW);
            txt_ten.requestFocus();
        } else {
            danhSach.set(indexTable(), readTable());
            JOptionPane.showMessageDialog(this, "Ban da sua!");
        }
        fillTable();
    }
    
    public void deleteTable() {
        danhSach.remove(indexTable());
        JOptionPane.showMessageDialog(this, "Ban da xoa");
        fillTable();
    }

    public boolean kiemTrahoTen() {
        String kiemTraTen = "[a-zA-Z ]+";

        if (txt_ten.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Ho ten NULL");
            return false;
        } else if (txt_ten.getText().matches(kiemTraTen) == false) {
            JOptionPane.showMessageDialog(this, "Ho ten khong dung dinh dang");
            return false;
        }

        txt_ten.setBackground(Color.WHITE);
        return true;
    }
    
    public void sapXepTheoTen() {
        Collections.sort(danhSach, new Comparator<Thuan>() {
            @Override
            public int compare(Thuan o1, Thuan o2) {
                return o1.getHoTen().compareToIgnoreCase(o2.getHoTen());
            }
        });
        fillTable();
    }
    
    public void sapXepTheoTuoi() {
        Collections.sort(danhSach, new Comparator<Thuan>() {
            @Override
            public int compare(Thuan o1, Thuan o2) {
                return o1.getTuoi() - o2.getTuoi();
            }
        });
        fillTable();
    }
    
    
    public void cleanForm() {
        txt_ten.setText("");
        cbo_nam.setSelectedIndex(0);
        cbo_com.setSelectedIndex(0);
        rdo_ruou.setSelected(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_sapXep;
    private javax.swing.JButton btn_sauDoiTuong;
    private javax.swing.JButton btn_sua;
    private javax.swing.JButton btn_them;
    private javax.swing.JButton btn_tuoi;
    private javax.swing.JButton btn_xoa;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cbo_com;
    private javax.swing.JComboBox<String> cbo_nam;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton rdo_bia;
    private javax.swing.JRadioButton rdo_nuocNgot;
    private javax.swing.JRadioButton rdo_ruou;
    private javax.swing.JTable tbl;
    private javax.swing.JTextField txt_ten;
    // End of variables declaration//GEN-END:variables
}