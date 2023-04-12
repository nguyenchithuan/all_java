package fpt.bai6;

public class Nguoi {
    private int canCuc;
    private HoTen hoten;
    private DiaChi diaChi;
    private String email;
    private int phoneNumber;

    public Nguoi(HoTen hoten, DiaChi diaChi, int phoneNumber) {
        this.hoten = hoten;
        this.diaChi = diaChi;
        this.phoneNumber = phoneNumber;
    }

    public Nguoi() {
    }
    
    public int getCanCuc() {
        return canCuc;
    }

    public void setCanCuc(int canCuc) {
        this.canCuc = canCuc;
    }

    public HoTen getHoten() {
        return hoten;
    }

    public void setHoten(HoTen hoten) {
        this.hoten = hoten;
    }

    public DiaChi getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(DiaChi diaChi) {
        this.diaChi = diaChi;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    
    
}
