package fpt.java_58;

import java.sql.Date;
import java.sql.Time;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class ThoiGian {

    public static void main(String[] args) {
        long t1 = System.currentTimeMillis();
        for (int i = 0; i < 1; i++) {
            System.out.println("thuan");
        }
        long t2 = System.currentTimeMillis();
        System.out.println("Gio bat dau: " + t1 + "mls");
        System.out.println("Gio ket thuc: " + t2 + "mls");
        System.out.println("Ket qua: " + (t2 - t1) + "mls");

        Date d = new Date(System.currentTimeMillis());
        Time t = new Time(System.currentTimeMillis());
        System.out.println(t + " " + d);

        Calendar c = Calendar.getInstance();
        System.out.println(c.get(Calendar.DATE) + "/" + (c.get(Calendar.MONTH) + 1) + "/" + c.get(Calendar.YEAR));
        System.out.println(c.get(Calendar.HOUR) + ":" + c.get(Calendar.MINUTE) + ":" + c.get(Calendar.SECOND));
        c.add(Calendar.DATE, 14);
        System.out.println(c.get(Calendar.DATE) + "/" + (c.get(Calendar.MONTH) + 1) + "/" + c.get(Calendar.YEAR));
        System.out.println(c.get(Calendar.HOUR) + ":" + c.get(Calendar.MINUTE) + ":" + c.get(Calendar.SECOND));
        
        
        DateFormat df = new SimpleDateFormat();
        System.out.println(df.format(d));
        System.out.println(df.format(t));
        
        DateFormat df2 = new SimpleDateFormat("h:mm a yyyy/MM/dd");
        DateFormat df3 = new SimpleDateFormat("H:mm:ss dd/MM/yyyy");
        System.out.println(df2.format(t));
        System.out.println(df3.format(d));
                                
    }

}
