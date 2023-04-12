package fpt.java_58;

import java.util.Calendar;
import java.sql.Date;
import java.sql.Time;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class ThoiGian2 {
    public static void main(String[] args) {
        long t1 = System.currentTimeMillis();
        for (int i = 0; i < 100; i++) {
            System.out.println(" ");
        }
        long t2 = System.currentTimeMillis();
        System.out.println("Thoi gian bat dau: " + t1);
        System.out.println("Thoi gian ket thuc: " + t2);
        System.out.println("Ket qua: " + (t2 - t1));
        System.out.println("====================");
        System.out.println("====================");
        
        Calendar c = Calendar.getInstance();
        c.add(Calendar.MONTH, 1);
        System.out.println(c.get(Calendar.HOUR) + ":" + c.get(Calendar.MINUTE) + ":" + c.get(Calendar.SECOND));
        System.out.println(c.get(Calendar.DATE) + "/" + c.get(Calendar.MONTH) + "/" + c.get(Calendar.YEAR));
        System.out.println("====================");
        
        Time t = new Time(System.currentTimeMillis());
        System.out.println(t);
        Date d = new Date(System.currentTimeMillis());
        System.out.println(d);
        System.out.println("====================");
        
        DateFormat df1 = new SimpleDateFormat();
        System.out.println(df1.format(d));
        System.out.println(df1.format(t));
        
        DateFormat df2 = new SimpleDateFormat("dd/MM/yyyy H:mm:ss");
        System.out.println(df2.format(d));
        System.out.println(df2.format(t));
        
        DateFormat df3 = new SimpleDateFormat("yyyy/MM/dd h:mm a");
        System.out.println(df3.format(d));
        System.out.println(df3.format(t));
    }
}
