package lab6;

public class SinhVien {
    private String hoVaTen;
    private String email;
    private String sdt;
    private String cmt;

    public SinhVien() {
    }

    public SinhVien(String hoVaTen, String email, String sdt, String cmt) {
        this.hoVaTen = hoVaTen;
        this.email = email;
        this.sdt = sdt;
        this.cmt = cmt;
    }

    public String getHoVaTen() {
        return hoVaTen;
    }

    public void setHoVaTen(String hoVaTen) {
        this.hoVaTen = hoVaTen;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public String getCmt() {
        return cmt;
    }

    public void setCmt(String cmt) {
        this.cmt = cmt;
    }
    
    
}
