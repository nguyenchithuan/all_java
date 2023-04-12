package LamLaiLabs3ChoNho;

public class Student {
    private String ten;
    private double diem;
    private String nganh;

    public Student() {
    }

    public Student(String ten, double diem, String nganh) {
        this.ten = ten;
        this.diem = diem;
        this.nganh = nganh;
    }
    
    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public double getDiem() {
        return diem;
    }

    public void setDiem(double diem) {
        this.diem = diem;
    }

    public String getNganh() {
        return nganh;
    }

    public void setNganh(String nganh) {
        this.nganh = nganh;
    }
    
    
    
    
    public String getHocLuc() {
        if(diem < 3) {
            return "Kem";
        } else if(diem < 5) {
            return "Yeu";
        } else if(diem < 6.5) {
            return "Trung binh";
        } else if(diem < 7.5) {
            return "Kha";
        } else if(diem < 9) {
            return "Gioi";
        } else {
            return "Xuat sac";
        }
    }
    
    public boolean kiemTraThuong() {
        return diem >= 7.5;
    }

    @Override
    public String toString() {
        return "Student{" + "ten=" + ten + ", diem=" + diem + ", nganh=" + nganh + '}';
    }
    
    
}
