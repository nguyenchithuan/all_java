package fpt.bai6;

public class TruongKhoa extends Nguoi{
    private String thanhTich;

    public TruongKhoa() {
    }

    public TruongKhoa(String thanhTich, HoTen hoten, DiaChi diaChi, int phoneNumber) {
        super(hoten, diaChi, phoneNumber);
        this.thanhTich = thanhTich;
    }

    public String getThanhTich() {
        return thanhTich;
    }

    public void setThanhTich(String thanhTich) {
        this.thanhTich = thanhTich;
    }

    
}
