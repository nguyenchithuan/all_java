package edu.poly.labs1;

import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ten: ");
        String hoVaTen = sc.nextLine();
        System.out.println("Nhap diem: ");
        double diem = sc.nextDouble();
        
        System.out.print(hoVaTen + " " + diem + " diem\n");
        System.out.println(hoVaTen + " " + diem + " diem");
        System.out.printf("%s %.1f diem", hoVaTen, diem);
        
    }
}
