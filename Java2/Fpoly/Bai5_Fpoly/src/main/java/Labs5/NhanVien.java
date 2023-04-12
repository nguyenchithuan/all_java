package Labs5;

import java.io.Serializable;

public class NhanVien implements Serializable{
    private String hoVaTen;
    private Double luong;

    public NhanVien() {
    }

    public NhanVien(String hoVaTen, Double luong) {
        this.hoVaTen = hoVaTen;
        this.luong = luong;
    }

    public String getHoVaTen() {
        return hoVaTen;
    }

    public void setHoVaTen(String hoVaTen) {
        this.hoVaTen = hoVaTen;
    }

    public Double getLuong() {
        return luong;
    }

    public void setLuong(Double luong) {
        this.luong = luong;
    }
}
