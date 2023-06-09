package BaiTestThread;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author ASUS
 */
public class ChayThu1 extends javax.swing.JFrame implements Runnable{

    /**
     * Creates new form ChayThu1
     */
    public ChayThu1() {
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

        lbl_name = new javax.swing.JLabel();
        lbl_time = new javax.swing.JLabel();
        lbl_timeRun = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        lbl_name.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lbl_name.setForeground(new java.awt.Color(255, 0, 0));
        lbl_name.setText("CHAO CAC BAN NHA   ");

        lbl_time.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lbl_time.setText("Thoi gian");

        lbl_timeRun.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lbl_timeRun.setText("Thoi gian dang chay");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(lbl_name)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_timeRun)
                    .addComponent(lbl_time))
                .addContainerGap(111, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_name)
                    .addComponent(lbl_time))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbl_timeRun)
                .addContainerGap(372, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        
        startTime = System.currentTimeMillis() / 1000;
        
    }//GEN-LAST:event_formWindowOpened

    long startTime, endTime;
    // -------------------------------Main-----------------------------------
    public static void main(String args[]) {
        
        ChayThu1 doiTuong = new ChayThu1();
        // hien thi
        doiTuong.setVisible(true);
        
        Thread th = new Thread(doiTuong);
        th.start();
    }

    @Override
    public void run() {
        String ten = lbl_name.getText();
        while(true) {
            // ----------------------ten-----------------------
            String dau = ten.substring(0, 1);
            ten = ten.substring(1) + dau;
            lbl_name.setText(ten);
            
            // --------------------simpleDateFormat--------------------
            SimpleDateFormat fm = new SimpleDateFormat("dd-MM-yyyy  hh:mm:ss  a");
            Date date = new Date();
            String thoiGian = fm.format(date);
            lbl_time.setText(thoiGian);
            
            
            
            // --------------------tinh gioi gian chay -----------------
            
            endTime = System.currentTimeMillis() / 1000;
            
            lbl_timeRun.setText("Thoi gian chay: " + (endTime - startTime));
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
            }
        }
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lbl_name;
    private javax.swing.JLabel lbl_time;
    private javax.swing.JLabel lbl_timeRun;
    // End of variables declaration//GEN-END:variables
}
