package LamLaiLabs3ChoNho;

import java.util.Arrays;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MapDemo {
    public static void main(String[] args) {
        Map<String, Student> map = new TreeMap<>();
        
        Student sv1 = new Student("Thuan", 10, "Cong nghe thong tin");
        Student sv2 = new Student("Hai", 5.6, "Lap trinh");
        Student sv3 = new Student("Lam", 4, "Digital marketing");
        
        map.put(sv1.getTen(), sv1);
        map.put(sv2.getTen(), sv2);
        map.put(sv3.getTen(), sv3);
        
        Set<String> keys = map.keySet();
        for (String key : keys) {
            Student sinhVien = map.get(key);
            System.out.println(sinhVien);
        }
    }
}
