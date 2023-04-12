package main;

import java.util.Queue;

/**
 *
 * @author ASUS
 */
public class PriorityQueue {
    public static void main(String[] args) {
        // PriorityQueue tu dong sap xep lai
        Queue<String> danhSach = new java.util.PriorityQueue<String>();
        
        danhSach.offer("TITV 1");
        danhSach.offer("Nguyen Van A");
        danhSach.offer("Nguyen Van B");
        danhSach.offer("TITV 2");
        
        while(true) {
            String ten = danhSach.poll();
            if(ten == null) {
                break;
            }
            System.out.println(ten);
        }
    }
}
