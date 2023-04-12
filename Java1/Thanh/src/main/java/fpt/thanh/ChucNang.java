package fpt.thanh;

import java.util.Scanner;

public class ChucNang {
    public int[] nhap(int arr[]) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            System.out.println("arr[" + i + "] = ");
            arr[i] = sc.nextInt();
        }
        return arr;
    }
    
    public void show(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    
    public static void main(String[] args) {
        ChucNang nc = new ChucNang();
        int arr[] = new int[5];
        nc.nhap(arr);
        nc.show(arr);
    }
}
