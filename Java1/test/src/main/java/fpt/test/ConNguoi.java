package fpt.test;

public abstract class ConNguoi {
    protected String ten;
    protected int tuoi;
    protected double diem;
    
    public ConNguoi() {
    }

    public ConNguoi(String ten, int tuoi, double diem) {
        this.ten = ten;
        this.tuoi = tuoi;
        this.diem = diem;
    }


    public String getTen() {
        return ten;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }
    
    public abstract void xuatThongTin();
    
    public String hocLuc() {
        if(diem < 5) {
            return "Yeu";
        } else if(diem < 6.5) {
            return "TB";
        } else if(diem < 8) {
            return "Kha";
        } else {
            return "Gioi";
        }
    }
        
}
