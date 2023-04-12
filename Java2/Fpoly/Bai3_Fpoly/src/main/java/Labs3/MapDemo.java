package Labs3;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo {
    public static void main(String[] args) {
        Map<String, Student> map = new HashMap<>();
        Student sv1 = new Student("Thuan", 10, "Cong nghe thong tin");
        Student sv2 = new Student("Lam", 9, "Thiet ke do hoa");
        Student sv3 = new Student("Hai", 6.5, "Ung dung phan mem");
        
        map.put(sv1.getName(), sv1);
        map.put(sv2.getName(), sv2);
        map.put(sv3.getName(), sv3);
        
        Set<String> keys = map.keySet();
        for (String key : keys) {
            Student sv = map.get(key);
            System.out.println("Ho ten: " + sv.getName());
            System.out.println("Hoc luc: " + sv.getGrade());
        }
    }
}
