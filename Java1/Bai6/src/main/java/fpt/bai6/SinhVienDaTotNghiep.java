package fpt.bai6;

public class SinhVienDaTotNghiep extends SinhVien{
    private String chucVu;
    private int mucLuong;

    public SinhVienDaTotNghiep(String chucVu, int mucLuong, String maSV, String chuyenNganh, String xepLoai, HoTen hoten, DiaChi diaChi) {
        super(maSV, chuyenNganh, xepLoai, hoten, diaChi);
        this.chucVu = chucVu;
        this.mucLuong = mucLuong;
    }

    public SinhVienDaTotNghiep() {
    }

    public String getChucVu() {
        return chucVu;
    }

    public void setChucVu(String chucVu) {
        this.chucVu = chucVu;
    }

    public int getMucLuong() {
        return mucLuong;
    }

    public void setMucLuong(int mucLuong) {
        this.mucLuong = mucLuong;
    }
    
    
    
    
}
