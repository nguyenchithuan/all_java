package fpt.labs8;

import java.util.ArrayList;
import java.util.Collections;

public final class XPoly {
    public static final double sum(Double...a) {
        double sum = 0;
        for (Double a1 : a) {
            sum += a1;
        }
        return sum;
    }
    
    public static final double sum(int...a) {
        int sum = 0;
        for (int a1 : a) {
            sum += a1;
        }
        return sum;
    }
    
    
    
    public static final double min(Double...a) {
        ArrayList<Double> d = new ArrayList<>();
        for (Double a1 : a) {
            d.add(a1);
        }
        Collections.sort(d);
        return d.get(0);
    }
    
    public static final int min(int...a) {
        ArrayList<Integer> d = new ArrayList<>();
        for (int a1 : a) {
            d.add(a1);
        }
        Collections.sort(d);
        return d.get(0);
    }
    
    public static final double max(Double...a) {
        ArrayList<Double> d = new ArrayList<>();
        for (Double a1 : a) {
            d.add(a1);
        }
        Collections.sort(d);
        return d.get(d.size() - 1);
    }
    
    public static final int max(int...a) {
        ArrayList<Integer> d = new ArrayList<>();
        for (int a1 : a) {
            d.add(a1);
        }
        Collections.sort(d);
        return d.get(d.size() - 1);
    }

    public static final String toUpperFirstChar(String ten) {
        String[] mang = ten.split(" ");
        String kq = "";
        for (int i = 0; i < mang.length; i++) {
            String a = mang[i].substring(0, 1).toUpperCase() + mang[i].substring(1);
            kq += a + " ";
        }
        return kq.trim();
    }
    
 }
