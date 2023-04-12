package thread;

import javax.swing.text.html.parser.DTD;

public class DongBo {

    public static double taiKhoan = 10;

    public static void main(String[] args) {
        DongBo dt = new DongBo(); // tao doi tuong

        Thread th1 = new Thread() {
            @Override
            public void run() {
                try {
                    dt.rutTien(13);
                } catch (Exception e) {

                }
            }
        };

        Thread th2 = new Thread() {
            @Override
            public void run() {
                try {
                    dt.napTien(4);
                } catch (Exception e) {

                }
            }
        };

        th2.start(); // synchronized dong bo
        th1.start(); // sap xep the cai nao chay truoc 
    }
    
    
    
    static synchronized void rutTien(double tienRut) {
        System.out.println("Ban dang rut tien........");
        if (taiKhoan < tienRut) {
            System.out.println("Xin chia buon.......");
        } else {
            try {
                Thread.sleep(2000);
            } catch (Exception e) {

            }
            taiKhoan -= tienRut;
            System.out.println("So du sau rut: " + taiKhoan);
        }
    }

    static synchronized void napTien(double tienNap) {
        System.out.println("Nam damg nap tien..........");
        try {
            Thread.sleep(1000);
        } catch (Exception e) {

        }
        taiKhoan += tienNap;
        System.out.println("So du sau nap: " + taiKhoan);
    }
}
