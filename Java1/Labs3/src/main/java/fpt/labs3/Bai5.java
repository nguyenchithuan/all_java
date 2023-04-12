package fpt.labs3;

import java.util.Scanner;

public class Bai5 {
    
    private String ten;
    private float diem;
    private String hocLuc;
    

    public Bai5() {
    }

    public Bai5(String ten, float diem, String hocLuc) {
        this.ten = ten;
        this.diem = diem;
        this.hocLuc = hocLuc;
    }
    
    Scanner sc = new Scanner(System.in); // do phai khai bao lai nhieu lam
    
    public Bai5 nhapMotDoiTuong() {
        System.out.println("Nhap ten: ");
        ten = sc.nextLine();
        System.out.println("Nhap diem: ");
        diem = Float.parseFloat(sc.nextLine());
        
        if(diem < 5) {
            hocLuc = "Yeu";
        } else if(diem < 6.5) {
            hocLuc = "Trung Binh";
        } else if(diem < 7.5) {
            hocLuc = "Kha";
        } else if(diem < 9) {
            hocLuc = "Gioi";
        } else {
            hocLuc = "Xuat sac";
        }
        
        return this;
    }
    
    public void nhapMang(Bai5 arr[]) {
//        System.out.println("Nhap n: ");
//        int n = Integer.parseInt(sc.nextLine());
//        arr = new Bai5[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = nhapMotDoiTuong();
        }
    }
    
    public void showMotDoiTuong(Bai5 b) {
        System.out.println("Ho va ten: " + b.ten + ", Diem: " + b.diem + ", Hoc luc: " + b.hocLuc);
    }
    
    public void showMang(Bai5 arr[]) {
        for (Bai5 bai5 : arr) {
            showMotDoiTuong(bai5);
        }
    }
}
