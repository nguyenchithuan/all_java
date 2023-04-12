package main;

import java.util.Queue;

public class LinkedList {
    public static void main(String[] args) {
        Queue<String> danhSach = new java.util.LinkedList<String>();
        
        danhSach.offer("TITV 1");
        danhSach.offer("Nguyen van A");
        danhSach.offer("Nguyen van B");
        danhSach.offer("TITV 2");
        
        while(true) {
            String ten = danhSach.poll(); // poll lay du lieu o dau va xoa
            // peek lay du lieu o dau nhung khong xoa
            
            if (ten == null) {
                break;
            }
            System.out.println(ten);
        }
    }
}
