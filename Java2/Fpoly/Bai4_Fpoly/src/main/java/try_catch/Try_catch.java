package try_catch;

public class Try_catch { // try: co gang, catch: bat
    public static void main(String[] args) {
        int a, b;
        
        int[] mang = new int[10]; // mang co 10 phan tu: chay 0 -> 9
        
        try {
            
            mang[10] = 10;
            System.out.println("mang[10] = " + mang[10]);
            
//            a = Integer.parseInt("12hgv");
//            System.out.println("a: " + a);
            
//            b = Integer.parseInt("12");
//            System.out.println("b: " + b);
        } catch (Exception e) { // neu loi moi chay
            e.printStackTrace(); // hien thi loi
        } finally { // kieu gi cung chay thang nay
            System.out.println("Cuoi cung cung co vo");
        }
        
        
        System.out.println("Lenh tiep theo");
        System.out.println("Lenh......");
        System.out.println("lenh thu 1000");
    }
}
