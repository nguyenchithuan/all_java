package fpt.labs2;

import java.util.Scanner;

public class Bai1 {
    public static void ptb1() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap a: ");
        int a = sc.nextInt();
        System.out.println("Nhap b: ");
        int b = sc.nextInt();
        if(a == 0) {
            if(b == 0) {
                System.out.println("Phuong trinh vo so nghiem!");
            } else {
                System.out.println("Phuong trinh vo nghiem!");
            }
        } else {
            System.out.println("Phuong trinh co nghiem x1 = " + (float)(-b)/a);
        }
    }
}
