package lab6;

import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String fullname = sc.nextLine();
        
        String ho = fullname.substring(0, fullname.indexOf(" ")).toUpperCase();
        String dem = fullname.substring(fullname.indexOf(" "), fullname.lastIndexOf(" "));
        String ten = fullname.substring(fullname.lastIndexOf(" ")).toUpperCase();
        
        System.out.println(ho + dem + ten);
    }
}
