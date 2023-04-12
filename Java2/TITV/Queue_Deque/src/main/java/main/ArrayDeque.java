package main;

import java.util.Deque;

public class ArrayDeque {
    public static void main(String[] args) {
        Deque<String> danhSach = new java.util.ArrayDeque<String>();
        
        danhSach.offer("TITV 1");
        danhSach.offer("Nguyen Van A");
        danhSach.offer("Nguyen Van B");
        danhSach.offer("TITV 2");
        danhSach.offerFirst("TITV 0");
        danhSach.offerLast("TITV 4");
        danhSach.offerFirst("TITV -1"); // offerFirst them vao dau danh sach
        danhSach.offerLast("TITV 10"); // offerLast them vao cuoi danh sach
        
        while(true) {
            String ten = danhSach.pollFirst();
            if(ten == null) {
                break;
            }
            
            System.out.println(ten);
        }
    }
}
