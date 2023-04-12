package labs2_coHuongDan;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Demo_form extends javax.swing.JFrame {

    public Demo_form() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        lbl_nhan = new javax.swing.JLabel();
        lbl_id = new javax.swing.JLabel();
        txt_id = new javax.swing.JTextField();
        lbl_ten = new javax.swing.JLabel();
        txt_ten = new javax.swing.JTextField();
        btn_check = new javax.swing.JButton();
        lbl_gioiTinh = new javax.swing.JLabel();
        txt_pass = new javax.swing.JPasswordField();
        lbl_pass = new javax.swing.JLabel();
        rdo_nam = new javax.swing.JRadioButton();
        rdo_nu = new javax.swing.JRadioButton();
        rdo_khac = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        lbl_nhan.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        lbl_nhan.setForeground(new java.awt.Color(255, 0, 0));
        lbl_nhan.setText("NguyenChiThuan-PH26023");

        lbl_id.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbl_id.setText("MA SINH VIEN");

        txt_id.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txt_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_idActionPerformed(evt);
            }
        });

        lbl_ten.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbl_ten.setText("HO TEN");

        txt_ten.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txt_ten.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_tenActionPerformed(evt);
            }
        });

        btn_check.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btn_check.setForeground(new java.awt.Color(204, 0, 0));
        btn_check.setText("CHECK");
        btn_check.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_checkActionPerformed(evt);
            }
        });

        lbl_gioiTinh.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbl_gioiTinh.setText("GIOI TINH");

        txt_pass.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        lbl_pass.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbl_pass.setText("PASS");

        buttonGroup1.add(rdo_nam);
        rdo_nam.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        rdo_nam.setSelected(true);
        rdo_nam.setText("Nam");

        buttonGroup1.add(rdo_nu);
        rdo_nu.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        rdo_nu.setText("Nu");

        buttonGroup1.add(rdo_khac);
        rdo_khac.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        rdo_khac.setText("Khac");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_nhan)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lbl_id, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbl_ten, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbl_gioiTinh, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbl_pass, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txt_id, javax.swing.GroupLayout.DEFAULT_SIZE, 285, Short.MAX_VALUE)
                                    .addComponent(txt_ten)
                                    .addComponent(txt_pass))
                                .addGap(54, 54, 54)
                                .addComponent(btn_check))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(rdo_nam)
                                .addGap(47, 47, 47)
                                .addComponent(rdo_nu)
                                .addGap(54, 54, 54)
                                .addComponent(rdo_khac)))))
                .addContainerGap(55, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(lbl_nhan)
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_id)
                    .addComponent(txt_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_check))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_ten)
                    .addComponent(txt_ten, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txt_pass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_pass))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_gioiTinh)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(rdo_nam)
                        .addComponent(rdo_nu)
                        .addComponent(rdo_khac)))
                .addContainerGap(184, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_idActionPerformed

    private void txt_tenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_tenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_tenActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        this.setLocationRelativeTo(null); // dat ra giua
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // thiet lap gia tri co san trong text
        txt_id.setText("PH26023");
        txt_ten.setText("Nguyen Chi Thuan");
    }//GEN-LAST:event_formWindowOpened

    private void btn_checkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_checkActionPerformed
        // TODO add your handling code here:
        // lay du lieu tu text; ma; ten
        // dua ra thong bao
        String id, ten;
        id = txt_id.getText();
        ten = txt_ten.getText();
//        System.out.println("Ma: " + id + ", ten"  + ten);  --> dung kieu nguyen thuy
        JOptionPane.showMessageDialog(this, "Ma: " + id + ", ho ten: " + ten); // --> hien ra hop thoai
    }//GEN-LAST:event_btn_checkActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(Demo_form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Demo_form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Demo_form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Demo_form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Demo_form().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_check;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.JLabel lbl_gioiTinh;
    private javax.swing.JLabel lbl_id;
    private javax.swing.JLabel lbl_nhan;
    private javax.swing.JLabel lbl_pass;
    private javax.swing.JLabel lbl_ten;
    private javax.swing.JRadioButton rdo_khac;
    private javax.swing.JRadioButton rdo_nam;
    private javax.swing.JRadioButton rdo_nu;
    private javax.swing.JTextField txt_id;
    private javax.swing.JPasswordField txt_pass;
    private javax.swing.JTextField txt_ten;
    // End of variables declaration//GEN-END:variables
}
