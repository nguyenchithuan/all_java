package fpt.thanh.BaiCuoiMon;

import java.rmi.StubNotFoundException;
import java.util.Scanner;

public class DoiBong {
    private String tenDoiBong;
    private int nam;
    private TranBong tranBong;
    
    DoiBong[] db;

    public DoiBong() {
    }
    
    public DoiBong(String tenDoiBong, int nam, TranBong tranBong) {
        this.tenDoiBong = tenDoiBong;
        this.nam = nam;
        this.tranBong = tranBong;
    }

    Scanner sc = new Scanner(System.in);
    
    public DoiBong nhapMotDoi() {
        System.out.println("======================================");
        System.out.println("Nhap ten doi: ");
        String ten = sc.nextLine();
        System.out.println("Nhap nam: ");
        int nam = Integer.parseInt(sc.nextLine());
        
        TranBong tb = new TranBong();
        System.out.println("Tran thang: ");
        tb.setThang(sc.nextInt());
        System.out.println("Tran thua: ");
        tb.setThua(sc.nextInt());
        System.out.println("Tran hoa: ");
        tb.setHoa(sc.nextInt());
        sc.nextLine();
        
        System.out.println("======================================");
        DoiBong d = new DoiBong(ten, nam, tb);
        return d;
    }
    
    
    public void nhapMang() {
        System.out.println("Nhap so doi: ");
        db = new DoiBong[sc.nextInt()];         sc.nextLine();
        for (int i = 0; i < db.length; i++) {
            db[i] = nhapMotDoi();
        }
    }
    
    public int diem() {
        return this.tranBong.getThang() * 3 + this.tranBong.getHoa();
    }
    
    public void doiBongDiemCaoNhat() {
        DoiBong max = db[0];
        for (int i = 0; i < db.length; i++) {
            if(max.diem() < db[i].diem()) {
                max = db[i];
            }
        }
        
        System.out.println("Doi co diem cao nhat!");
        for (int i = 0; i < db.length; i++) {
            if(max.diem() == db[i].diem()) {
                db[i].showMotDoiTuong();
            }
        }
        
    }
    
    public void showMotDoiTuong() {
        System.out.println("====================================");
        System.out.println("Ten doi bong:" + this.tenDoiBong);
        System.out.println("Nam thanh lap: " + this.nam);
        System.out.println("Tran thang: " + this.tranBong.getThang());
        System.out.println("Tran thua: " + this.tranBong.getThua());
        System.out.println("Tran hoa: " + this.tranBong.getHoa());
        System.out.println("====================================");
    }
    
    public void showMang () {
        for (int i = 0; i < db.length; i++) {
            db[i].showMotDoiTuong();
        }
    }
    
    
    
}
