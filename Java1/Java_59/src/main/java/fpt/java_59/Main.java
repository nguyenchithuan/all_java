package fpt.java_59;

public class Main {
    public static void main(String[] args) {
        Day d = Day.Tuesday;
        ThoiKhoaBieu tkb1 = new ThoiKhoaBieu(Day.Monday, "Toan-Ly-Hoa");
        ThoiKhoaBieu tkb2 = new ThoiKhoaBieu(d , "Toan-Van-Anh");
        ThoiKhoaBieu tkb3 = new ThoiKhoaBieu(Day.Wednesday, "LY-Hoa-Sinh");
        
        System.out.println(tkb1);
        System.out.println(tkb2);
        System.out.println(tkb3);
        
        System.out.println(Thang.thang1 + ":" + Thang.thang1.soNgay());
        System.out.println(Thang.thang2 + ":" + Thang.thang2.soNgay());
    }
}
