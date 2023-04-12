package BaiTest1;

import java.io.Serializable;

public class MyJob implements Serializable{
    private String congViec;
    private String doanhNghiep;
    private String hocTienSi;
    private double thuNhap;

    public MyJob() {
    }

    public MyJob(String congViec, String doanhNghiep, String hocTienSi, double thuNhap) {
        this.congViec = congViec;
        this.doanhNghiep = doanhNghiep;
        this.hocTienSi = hocTienSi;
        this.thuNhap = thuNhap;
    }
    
    public String getKetLuan() {
        if(thuNhap >= 50) {
            return "Can hoc tiep";
        } else if(thuNhap >= 20) {
            return "Viec tot";
        } else {
            return "Chuyen nghiep";
        }
    }

    public String getCongViec() {
        return congViec;
    }

    public void setCongViec(String congViec) {
        this.congViec = congViec;
    }

    public String getDoanhNghiep() {
        return doanhNghiep;
    }

    public void setDoanhNghiep(String doanhNghiep) {
        this.doanhNghiep = doanhNghiep;
    }

    public String getHocTienSi() {
        return hocTienSi;
    }

    public void setHocTienSi(String hocTienSi) {
        this.hocTienSi = hocTienSi;
    }

    public double getThuNhap() {
        return thuNhap;
    }

    public void setThuNhap(double thuNhap) {
        this.thuNhap = thuNhap;
    }
    
    
}
