package model;

public class TimKiemModel {
    private String vanBan;
    private String tuKhoa;
    private String ketQua;

    public TimKiemModel() {
    }

    public String getVanBan() {
        return vanBan;
    }

    public void setVanBan(String vanBan) {
        this.vanBan = vanBan;
    }

    public String getTuKhoa() {
        return tuKhoa;
    }

    public void setTuKhoa(String tuKhoa) {
        this.tuKhoa = tuKhoa;
    }

    public String getKetQua() {
        return ketQua;
    }

    public void setKetQua(String ketQua) {
        this.ketQua = ketQua;
    }
    
    public void timKiem() {
        int count = 0;
        int index = 0;
        while (true) {            
            int i = vanBan.indexOf(tuKhoa, index);
            if (i == -1) {
                break;
            } else {
                count++;
                index = i + 1;
            }
        }
        ketQua = "Ket qua: " + count + " " + tuKhoa;
    }
    
}
