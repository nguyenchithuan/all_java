package edu.poly.labs1;

import java.util.Scanner;

public class Bai4 {

    public static void phuongTrinh() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap a: ");
        int a = sc.nextInt();
        System.out.println("Nhap b: ");
        int b = sc.nextInt();
        System.out.println("Nhap c: ");
        int c = sc.nextInt();

        double delta = Math.pow(b, 2) - 4 * a * c;
        if (delta < 0) {
            System.out.println("Phuong trinh vo nghiem!");
        } else if (delta == 0) {
            System.out.println("Co nghiem kep x1 = x2 = " + (-b) / (2 * a));
        } else {
            System.out.println("X1 = " + (b + Math.sqrt(delta)) / (2 * a));
            System.out.println("X2 = " + (b - Math.sqrt(delta)) / (2 * a));
        }
    }

    public static void main(String[] args) {
        phuongTrinh();
    }
}
