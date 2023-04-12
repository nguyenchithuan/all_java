package Main;

public class HangXuatKhau extends HangHoa{
    private String quocTich;

    public HangXuatKhau() {
    }

    public HangXuatKhau(String quocTich, String maHang, String tenHang, int soLuong, int doGia) {
        super(maHang, tenHang, soLuong, doGia);
        this.quocTich = quocTich;
    }
    
    public int thue() {
        return this.getDoGia() * 10 / 100;
    }

    
    @Override
    public void showHangHoa() {
        System.out.println("==============HangHoaXuatKhau==================");
        System.out.println("Ma hang hoa: " + this.getMaHang());
        System.out.println("Ten hang hoa: " + this.getTenHang());
        System.out.println("So luong: " + this.getSoLuong());
        System.out.println("Don gia: " + this.getDoGia());
        System.out.println("Quoc tich nhap hang: " + this.quocTich);
        System.out.println("Thue: " + this.thue());
        System.out.println("=======================================");
    }

    public String getQuocTich() {
        return quocTich;
    }


    public void setQuocTich(String quocTich) {
        this.quocTich = quocTich;
    }
}
