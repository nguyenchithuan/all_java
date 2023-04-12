package bai2;

public abstract class SinhVienFoly {
    protected String hoVaTen;
    protected String nganh;

    public SinhVienFoly() {
    }

    public SinhVienFoly(String hoVaTen, String nganh) {
        this.hoVaTen = hoVaTen;
        this.nganh = nganh;
    }
    
    public abstract double getDiem();
    
    public abstract void nhap();
    
    public abstract void xuat();
    
    
    public String hocLuc() {
        if(this.getDiem() < 5) {
            return "Yeu";
        } else if(this.getDiem() < 6.5) {
            return "Trung binh";
        } else if(this.getDiem() < 8) {
            return "Kha";
        } else if(this.getDiem() < 9){
            return "Gioi";
        } else {
            return "Xuat sac";
        }
    }
}
