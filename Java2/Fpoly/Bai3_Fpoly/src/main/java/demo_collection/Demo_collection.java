package demo_collection;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;


public class Demo_collection {
    // static: tinh: gan voi class ma khong gan voi doi tuong
    
    static void demoList() {
        // list co 2 loai
        // -----------a. demo list khong dinh kieu------------
        List list_k = new ArrayList();
        list_k.add("Hom nay di hoc, kho khan qua");
        list_k.add(10);
        list_k.add(10.5);
        list_k.add(true);
        // hien thi luon kieu list
        System.out.println("List khong dinh kieu: " + list_k.toString());
        
        // chuyen ve arr xong cho no hien thi
        System.out.println("List khong dinh danh: " + Arrays.toString(list_k.toArray()));
        
        // truy cap bang chi so
        System.out.println("list[2]" + list_k.get(2));
        
        
        // ------------b. list co dinh kieu---------------
        List<String> list_c = new ArrayList<>();
        
        list_c.add("Troi mua qua");
        // list_c.add(10); loi vi kieu nguyen
        list_c.add(10 + "");
        list_c.add(String.valueOf(10)); // c1: chuan
        System.out.println("list co kieu: " + list_c.toString());
    }
    
    static void demoSet() {
        // set la mot tap hop:
        // khong co gia tri trung nhau, khong truy cap duoc bang chi so
        // co 2 loai: set khong dinh kieu va set co dinh kieu
        
        // list chua nhieu du lieu: ten, tuoi, ma
        // set chi chua 1 du lieu: ten
        Set demo_set = new HashSet();
        demo_set.add("Trang do do");
        demo_set.add("trang do do");
        demo_set.add("trang do do");
        demo_set.add(10);
        demo_set.add("Trang do do");
        demo_set.add("Trang do do");
        System.out.println("Set: " + demo_set.toString());
    }
    
    static void demoMap() {
        // ---------Su dung cho tim kiem---------
        
        // entry: la key va value
        // Map la tap hop cac entry
        // Moi entry gom key va value
        // Su dung key de truy xuat gia tri cua moi phan tu
        
        Map<Integer, String> demo_map = new HashMap<>();
        // day du lieu vao map
        demo_map.put(1, "Thuan"); // (key, value)
        demo_map.put(1, "Huan");
        // new trung key thi lay cai duoi
        demo_map.put(2, "Hong");
        demo_map.put(3, "Hoa");
        demo_map.put(3, "HIHI");
        System.out.println("Map: " + demo_map.toString());
        
        System.out.println("Gia tri: " + demo_map.get(1));
        System.out.println("Gia tri: " + demo_map.get(2));
        System.out.println("Gia tri: " + demo_map.get(3));
    }
    
    public static void main(String[] args) {
        
        // tao doi tuong
        // Demo_collection dt = new Demo_collection();
        // dt.demoList();
        
        demoList();
        demoSet();
        demoMap();
        
        // -----------list----------
        //1. xoa: remove()
        //2. sua 1 doi tuong trong list: set()
        //3. kich thuong: size()
        //4. lay ra 1 doi tuong: get()
    }
}
