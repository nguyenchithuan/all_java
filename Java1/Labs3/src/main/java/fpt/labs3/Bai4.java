package fpt.labs3;

import java.util.Scanner;

public class Bai4 {
    public static void thongTinSV() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap n: ");
        int n; 
        n =  Integer.parseInt(sc.nextLine());
        String ten[] = new String[n];
        double diem[] = new double[n];
        String hocLuc[] = new String[n];
        
        
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap ten: ");
            ten[i] = sc.nextLine();
            System.out.println("Nhap Diem: ");
            diem[i] = Double.parseDouble(sc.nextLine());
            
            if(diem[i] < 5) {
                hocLuc[i] = "Yeu!";
            } else if(diem[i] < 6.5) {
                hocLuc[i] = "Trung Binh!";
            } else if(diem[i] < 7.5) {
                hocLuc[i] = "Kha!";
            } else if(diem[i] < 9) {
                hocLuc[i] = "Gioi!";
            } else {
                hocLuc[i] = "Xuat sac!";
            }
        }
        
        System.out.println("=================================");
        System.out.println("Chua sap xep: ");
        for (int i = 0; i < n; i++) {
            System.out.println("Ten: " + ten[i] + ", Diem: " + diem[i] + ", Hoc luc: " + hocLuc[i]);
        }
        
        
        System.out.println("Da sap xep: ");
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if(diem[i] < diem[j]) {
                    String temp = ten[i];
                    ten[i] = ten[j];
                    ten[j] = temp;
                    
                    Double temp2 = diem[i];
                    diem[i] = diem[j];
                    diem[j] = temp2;
                    
                    String temp3 = hocLuc[i];
                    hocLuc[i] = hocLuc[j];;
                    hocLuc[j] = temp3;
                }
            }
        }
        
        System.out.println("=================================");
        for (int i = 0; i < n; i++) {
            System.out.println("Ten: " + ten[i] + ", Diem: " + diem[i] + ", Hoc luc: " + hocLuc[i]);
        }
    }
    
}
