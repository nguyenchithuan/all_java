package KiemTra;

public class Thuan {
    private String hoTen;
    private int nam;
    private String doUong;
    private String com;

    public Thuan() {
    }

    public Thuan(String hoTen, int nam, String doUong, String com) {
        this.hoTen = hoTen;
        this.nam = nam;
        this.doUong = doUong;
        this.com = com;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public int getTuoi() {
        return nam;
    }

    public void setTuoi(int nam) {
        this.nam = nam;
    }

    public String getDoUong() {
        return doUong;
    }

    public void setDoUong(String doUong) {
        this.doUong = doUong;
    }

    public String getCom() {
        return com;
    }

    public void setCom(String com) {
        this.com = com;
    }
    
    
}
