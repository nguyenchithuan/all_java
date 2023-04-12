package fpt.labs3;

import java.util.Scanner;

public class Bai1 {

    public static void kiemTraSoNguyenTo() {
        Scanner sc = new Scanner(System.in);
        int a;
        do {
            System.out.println("Nhap a: ");
            a = sc.nextInt();
        } while (a < 2);
        
        int kiemTra = 0;
        
        for (int i = 2; i <= Math.sqrt(a); i++) {
            if(a % i == 0) {
                kiemTra++;
                break;
            }
        }
        
        if (kiemTra == 0) {
            System.out.println(a + " la so nguyen to.");
        } else {
            System.out.println(a + " khong la so nguyen to.");
        }
    }
    
    
}
