package main;

import java.util.Scanner;
import java.util.Stack;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Stack<String> stackChuoi = new Stack<String>();
        
        // stackChuoi.push(value) => du gia tri vao cuoi stack
        // stackChuoi.pop() => lay gia tri, xoa gia tri o cuoi stack
        // stackChuoi.peek() => lay gia tri o cuoi nhung khong xoa khoi stack
        // stackChuoi.clear() => xoa tat ca phan tu trong stack
        // stackChuoi.contains("value") => xac dinh gia tri ton tai trong stack hay khong
        // stackChuoi.size() => lay do dai cua stack
        
        
        // VD 1: dao nguoc chuoi
        
        
//        System.out.println("Nhap moi chuoi: ");
//        String chuoi = sc.nextLine();
//        for (int i = 0; i < chuoi.length(); i++) {
//            stackChuoi.push(chuoi.charAt(i) + "");
//        }
//        
//        System.out.println("Chuoi dao nguoc la: ");
//        for (int i = 0; i < chuoi.length(); i++) {
//            System.out.print(stackChuoi.pop());
//        }

        Stack<Integer> thapPhan = new Stack<Integer>();
    
        System.out.println("Nhap so thap phan: ");
        int so = sc.nextInt();
        
        while(so > 0) {
            int soDu = so % 2;
            so /= 2;
            thapPhan.push(soDu);
        }
        
        int n = thapPhan.size();
        
        System.out.println("So nhi phan: ");
        for (int i = 0; i < n; i++) {
            System.out.print(thapPhan.pop());
        }
    }
}
