package edu.poly.labs1;

import java.util.Scanner;

public class Bai2 {
    
    public static void hcn() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap chieu dai: ");
        int dai = sc.nextInt();
        System.out.println("Nhap chieu rong: ");
        int rong = sc.nextInt();
        int canhNhoNhat = Math.min(dai, rong);
        int canhNhoNhat2 = (dai > rong) ? rong : dai;
        System.out.println("Canh nho nhat: " + canhNhoNhat);
        System.out.println("Canh nho nhat: " + canhNhoNhat2);
        System.out.printf("Dien tich: %d\nChu vi: %d\n", dai*rong, 2*(dai + rong));
    }
    
    public static void main(String[] args) {
        Bai2 b = new Bai2();
        b.hcn();
        hcn();
    }
}
