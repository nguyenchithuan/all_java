package fpt.labs2;

import java.util.Scanner;

public class Bai3 {
    public static void tinhSoTienDien() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so dien: ");
        int soDien = sc.nextInt();
        if(soDien > 0) {
            
            if(soDien <= 50) {
                int soTien = soDien * 1000;
                System.out.println("So tien phi nop la: " + soTien + " VND");
            } else {
                int soTien = 50 * 1000 + (soDien - 50) * 1200;
                System.out.println("So tien phi nop la: " + soTien + " VND");
            }
            
        } else {
            System.out.println("Moi nhap a > 0!");
        }
    }
}
