package fpt.labs5;

import java.util.ArrayList;
import java.util.Scanner;

public class Bai1 {
    private ArrayList<Double> list;
    
    public void nhapMang() {
        Scanner sc = new Scanner(System.in);
        list = new ArrayList<>();
        double a;
        while(true) {
            System.out.println("Nhap so thuc: ");
            a = Double.parseDouble(sc.nextLine());
            list.add(a);
            System.out.println("Ban co muon tiep tuc hay khong(Y/N): ");
            if (sc.nextLine().equals("N")) {
                break;
            }
        }
    }
    
    public void tong() {
        double sum = 0;
        for (Double d : list) {
            sum += d;
        }
        System.out.println("Tong cac so vua nhap: " + sum);
    }
}
