package fpt.java_74;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class QLSV {

    ArrayList<SinhVien> mangsv = new ArrayList<>();

    public SinhVien nhapMotSinhVien() {
        Scanner sc = new Scanner(System.in);
        System.out.println("================Nhap===============");
        System.out.println("Nhap ma: ");
        String ma = sc.nextLine();
        System.out.println("Nhap ten: ");
        String ten = sc.nextLine();
        System.out.println("Nhap chuyen nganh: ");
        String chuyenNganh = sc.nextLine();
        System.out.println("===================================");
        SinhVien sv = new SinhVien(ma, ten, chuyenNganh);
        return sv;
    }

    public void nhapSinhVien() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            mangsv.add(nhapMotSinhVien());
            System.out.println("Ban co muon tiep tuc khong(Y/N): ");
            String kq = sc.nextLine();
            if (kq.equalsIgnoreCase("n")) {
                break;
            }
        }
    }

    public void xuatDanhSach() {
        System.out.println("==============DanhSach==============");
        for (SinhVien sinhVien : mangsv) {
            sinhVien.inThongTin();
        }
    }

    public void timMa(String ma) {
        for (SinhVien sinhVien : mangsv) {
            if (sinhVien.getMaSv().equalsIgnoreCase(ma)) {
                sinhVien.inThongTin();
            }
        }
    }

    public void sapXep() {
        Collections.sort(mangsv, new Comparator<SinhVien>() {
            @Override
            public int compare(SinhVien o1, SinhVien o2) {
                return o1.getChuyenNganh().compareToIgnoreCase(o2.getChuyenNganh());
            }
        });
    }

    public void ghiFile(File file) {
        try {
            OutputStream os = new FileOutputStream(file);
            ObjectOutputStream oos = new ObjectOutputStream(os);
            for (SinhVien sinhVien : mangsv) {
                oos.writeObject(sinhVien);
            }
            oos.flush();
            oos.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void docFile(File file) {
        try {
            InputStream is = new FileInputStream(file);
            ObjectInputStream ois = new ObjectInputStream(is);
            SinhVien sv;
            while(true) {
                sv = (SinhVien)ois.readObject();
                if(sv == null) {
                    break;
                } else {
                    mangsv.add(sv);
                }
            }
            ois.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
