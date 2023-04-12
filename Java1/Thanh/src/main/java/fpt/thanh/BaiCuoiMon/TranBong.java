package fpt.thanh.BaiCuoiMon;

public class TranBong {
    private int thang;
    private int thua;
    private int hoa;

    public TranBong() {
    }

    public TranBong(int thang, int thua, int hoa) {
        this.thang = thang;
        this.thua = thua;
        this.hoa = hoa;
    }
    
    public int getThang() {
        return thang;
    }

    public void setThang(int thang) {
        this.thang = thang;
    }

    public int getThua() {
        return thua;
    }

    public void setThua(int thua) {
        this.thua = thua;
    }

    public int getHoa() {
        return hoa;
    }

    public void setHoa(int hoa) {
        this.hoa = hoa;
    }
    
    
}
