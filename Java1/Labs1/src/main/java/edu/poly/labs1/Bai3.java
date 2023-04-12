package edu.poly.labs1;

import java.util.Scanner;

public class Bai3 {
    
    public static void tinhTheTich() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap canh: ");
        int canh = sc.nextInt();
        System.out.println("The tich: " + Math.pow(canh, 3));
        System.out.printf("The tich: %d\n", canh * canh * canh);
    }
    
    public static void main(String[] args) {
        Bai3 b  = new Bai3();
        b.tinhTheTich();
        System.out.print("=======================\n");
        tinhTheTich();
    }
}
