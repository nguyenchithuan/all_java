package QLSV;

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

public class QuanLySV {

    ArrayList<SinhVien> danhSach = new ArrayList<>();

    public SinhVien themMotSinhVien() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ma sv: ");
        String masv = sc.nextLine();
        System.out.println("Nhap ho va ten: ");
        String hoVaten = sc.nextLine();
        System.out.println("Nhap nam sinh: ");
        int namSinh = Integer.parseInt(sc.nextLine());
        System.out.println("Nhap diem tb: ");
        Double dtb = Double.parseDouble(sc.nextLine());
        SinhVien sv = new SinhVien(masv, hoVaten, namSinh, dtb);
        return sv;
    }

    public void themSinhVien() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            danhSach.add(themMotSinhVien());
            System.out.println("Ban co muon tiep tuc hay khong(Y/N):");
            String bien = sc.nextLine();
            if(bien.equalsIgnoreCase("n")) {
                break;
            }
        }
    }
    
    public void xuatDanhSach() {
        System.out.println("====================DanhSach======================");
        for (SinhVien sinhVien : danhSach) {
            sinhVien.inThongTin();
        }
        System.out.println("==================================================");
    }
    
    public boolean kiemTraRong() {
        return danhSach.isEmpty();
    }
    
    public int soLuongSinhVien() {
        return danhSach.size();
    }
    
    public void lamRongDanhSach() {
        danhSach.clear();
        System.out.println("Da lam rong thanh cong!");
    }
    
    public void kiemTraSinhVienTonTai(String maSV) {
        int i = 0;
        for (SinhVien sinhVien : danhSach) {
            if(sinhVien.getMaSv().equalsIgnoreCase(maSV)) {
                sinhVien.inThongTin();
                i++;
            }
        }
        if(i == 0) {
            System.out.println("Sinh vien khong ton tai!");
        }
    }
    
    public void xoaMotSinhVien(String ten) {
        for (int i = 0; i < danhSach.size(); i++) {
            if(danhSach.get(i).getHoVaTen().equalsIgnoreCase(ten)) {
                danhSach.get(i).inThongTin();
                danhSach.remove(i);
            }
        }
    }
    
    public void tinKiemSinhVienTheoTen(String ten) {
        for (SinhVien sinhVien : danhSach) {
            if(sinhVien.getHoVaTen().equalsIgnoreCase(ten)) {
                sinhVien.inThongTin();
            }
        }
    }
    
    public void sapXepTheoDiem() {
        Collections.sort(danhSach, new Comparator<SinhVien>() {
            @Override
            public int compare(SinhVien o1, SinhVien o2) {
                if(o1.getDtb() < o2.getDtb()) {
                    return 1;
                } else if(o1.getDtb() > o2.getDtb()) {
                    return -1;
                } else {
                    return 0;
                }
            }
        });
    }
    
    public void ghiFile(File file) {
        try {
            OutputStream os = new FileOutputStream(file);
            ObjectOutputStream oos = new ObjectOutputStream(os);
            for (SinhVien sinhVien : danhSach) {
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
                sv = (SinhVien) ois.readObject();
                if(sv == null) {
                    break;
                } else {
                    danhSach.add(sv);
                }
            }
            ois.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
