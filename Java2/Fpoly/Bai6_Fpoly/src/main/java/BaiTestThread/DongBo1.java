package BaiTestThread;

import java.util.logging.Level;
import java.util.logging.Logger;

public class DongBo1 {

    private double taiKhoan1 = 10;

    public static void main(String[] args) {
        DongBo1 doiTuong = new DongBo1();
        Thread th1 = new Thread() {
            @Override
            public void run() {
                doiTuong.rutTien(13);
            }
        };
        
        Thread th2 = new Thread() {
            @Override
            public void run() {
                doiTuong.napTien(10);
            }
        };
        
        
        th2.start();
        th1.start();
    }

    public synchronized void rutTien(double tienRut) {
        System.out.println("Ban dang rut tien!");
        if (taiKhoan1 < tienRut) {
            System.out.println("Xin chia buon!");
        } else {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException ex) {
            }

            taiKhoan1 -= tienRut;
            System.out.println("Tai khoan: " + taiKhoan1);
        }
    }

    public synchronized void napTien(double tienNap) {
        System.out.println("Ban dang nap tien!");
        try {
            Thread.sleep(1000);
        } catch (Exception e) {

        }

        taiKhoan1 += tienNap;
        System.out.println("Tai khoan: " + taiKhoan1);

    }
}
