package fpt.duonglqph_ph21794;

public class SinhVienPoly extends SinhVien{
    private int chuyenNganhHep;

    public SinhVienPoly() {
    }

    public SinhVienPoly(int chuyenNganhHep, String maSV, String hoTen, String chuyenNganh) {
        super(maSV, hoTen, chuyenNganh);
        this.chuyenNganhHep = chuyenNganhHep;
    }

    public int getChuyenNganhHep() {
        return chuyenNganhHep;
    }

    public void setChuyenNganhHep(int chuyenNganhHep) {
        this.chuyenNganhHep = chuyenNganhHep;
    }

    public void show() {
        System.out.println("====================SVPoly===========================");
        System.out.println("Ma sv: " + this.getMaSV());
        System.out.println("Ho va ten: " + this.getHoTen());
        System.out.println("Chuyen nganh: " + this.getChuyenNganh());
        System.out.println("Chuyen ngang hep: " + this.getChuyenNganhHep());
        System.out.println("======================================================");
    }
    
}
