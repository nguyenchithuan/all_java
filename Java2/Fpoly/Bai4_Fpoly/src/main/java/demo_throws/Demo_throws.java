package demo_throws;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ASUS
 */
public class Demo_throws {
    // throw duoc su dung de phat sinh mot ngoai le
    // throws duoc su dung de quang ngoai le ra ngoai
    // phuong thuc ngoai le se duoc xu ly khi goi ai goi phuong thuc co throw thi phai xu lu

    static Scanner sc = new Scanner(System.in);

    static void choDauMoi() throws Exception { // day trach nhiem ra ben ngoai
        int pl;
        System.out.println("Moi nhap phan loai hoa qua: ");
        pl = sc.nextInt();
        // 1-3: loai tot
        // >3: co hoa chat
//        if(pl > 3) {
//            System.out.println("Co tam thuoc dung an");
//        }
        // pl trach nhiem khogn su ly: day ra ngoai
        
        if (pl > 3) {
            throw new Exception("Co tam thuoc dung an");
        }
        
        
        // neu cho dau moi su ly luon try catch thi khong co van de gi ca
        // con khong xu ly thi phai dung throws de cho thang sau su ly

    }
    
    static void cuaHang() throws Exception { // cua hang day ra ngoai de ngoai khac su ly
        // co trach nhiem
//        try {
//            choDauMoi(); // cua hang den cho dau moi lay hang
//            System.out.println("Hang tot");
//        } catch (Exception ex) {
//            ex.printStackTrace();
//        }

        // vo trach nhiem khong su ly
        choDauMoi();
    }

    public static void main(String[] args) throws Exception {
//        try {
//            cuaHang(); // khach den cua hang mua hoa qua , khach phai tu xu ly
//        } catch (Exception ex) {
//            System.out.println(ex.toString());
//        }

        // khach cung khong xu ly
        cuaHang(); // sau khi den mua hoa qua
        System.out.println("An xong song tiep");
    }
}
