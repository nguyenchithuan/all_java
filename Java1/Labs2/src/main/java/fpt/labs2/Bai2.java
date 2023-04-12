package fpt.labs2;

import java.util.Scanner;

public class Bai2 {

    public static void ptb2() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap a: ");
        int a = sc.nextInt();
        System.out.println("Nhap b: ");
        int b = sc.nextInt();
        System.out.println("Nhap c: ");
        int c = sc.nextInt();

        float delta = (float) (Math.pow(b, 2) - 4 * a * c);
        if (delta < 0) {
            System.out.println("Phuong trinh vo nghiem!");
        } else if (delta == 0) {
            System.out.println("Phuong trinh co nghiem kep X1 = X2 = " + (float) (-b) / (2 * a));
        } else {
            System.out.println("X1 = " + ( (-b + Math.sqrt(delta)) / (2 * a)) );
            System.out.println("X1 = " + ( (-b - Math.sqrt(delta)) / (2 * a)) );
        }
    }
}
