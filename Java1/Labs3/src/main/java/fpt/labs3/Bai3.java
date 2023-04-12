package fpt.labs3;

import java.util.Scanner;
import java.util.Arrays;

public class Bai3 {
    public static void nhapXuatMang() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap n: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        
        //1. Sap Xep cac phan tu trong mang.
        for (int i = 0; i < arr.length; i++) {
            System.out.println("arr[" + i + "] = ");
            arr[i] = sc.nextInt();
        }
        
        System.out.println("Chua sap xep: ");
        for (int i : arr) {
            System.out.printf("%8d", i);
        }
        
//        for (int i = 0; i < arr.length - 1; i++) {
//            for (int j = i + 1; j < arr.length; j++) {
//                if(arr[i] > arr[j]) {
//                    int temp = arr[i];
//                    arr[i] = arr[j];
//                    arr[j] = temp;
//                }
//            }
//        }
        
        Arrays.sort(arr);  // Cach 1.

        System.out.println("\nDa sap xep: ");
        for (int i : arr) {
            System.out.printf("%8d", i);
        }
        System.out.println("\n=============================\n");
        
        //2. Tim Min.
        
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            min = Math.min(min, arr[i]);
        }
        
        System.out.println("Min: " + min);
        System.out.println("\n=============================\n");
        //3.Tinh trung binh cac so chia het cho 3.
        
        int count = 0;
        int sum = 0;
        for (int i : arr) {
            if(i % 3 == 0) {
                sum += i;
                count++;
            }
        }
        
        double average = (double)sum/count;
        System.out.println("Trung binh: " + average);
    }
}
