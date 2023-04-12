package Assignment;

import java.util.List;
import java.util.Scanner;

public class Employee {

    private String code;
    private String name;
    private int salary;

    public Employee() {
    }

    public Employee(String code, String name, int salary) {
        this.code = code;
        this.name = name;
        this.salary = salary;
    }

    //==============================PhuongThuc===============================
    
    public int getThuNhap() {
        return this.salary;
    }

    public int getThue() {
        if (this.getThuNhap() < 9000000) {
            return 0;
        } else if (this.getThuNhap() < 15000000) {
            return this.getThuNhap() * 10 / 100;
        } else {
            return this.getThuNhap() * 12 / 100;
        }
    }

    public Employee nhapMotNhanVien() {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("===============================");
        System.out.println("Nhap ma: ");
        String ma = sc.nextLine();
        System.out.println("Nhap ten: ");
        String ten = sc.nextLine();
        System.out.println("Nhap luong: ");
        int luong = Integer.parseInt(sc.nextLine());
        System.out.println("===============================");
        
        Employee e = new Employee(ma, ten, luong);
        return e;
    }

    public void nhapNhanVien(List<Employee> emp) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nNhap so luong nhan vien: ");
        int n = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < n; i++) {
            emp.add(nhapMotNhanVien());
        }
    }
    
    public void showMotNhanVien() {
        System.out.println("----------------------------------");
        System.out.println("Ma: " + this.code);
        System.out.println("Ten: " + this.name);
        System.out.println("Thu nhap: " + this.getThuNhap());
        System.out.println("Tien thue: " + this.getThue());
        System.out.println("----------------------------------");
    }
    
    public void showNhanVien(List<Employee> emp) {
        System.out.println("\n===============SHOW===============");
        for (Employee e : emp) {
            e.showMotNhanVien();
        }
        System.out.println("==================================");
    }
    
    public void timMaNhanVien(List<Employee> emp) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ma can tim: ");
        String ma = sc.nextLine();
        for (Employee e : emp) {
            if(ma.equalsIgnoreCase(e.code)) {
                e.showMotNhanVien();
            }
        }
    }

    //===========================KetThucPhuongThuc===========================
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

}
