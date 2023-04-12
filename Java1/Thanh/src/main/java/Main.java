
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String so = sc.nextLine();
        
        String[] mang = so.split(",");
        
        for (String s : mang) {
            
            int k = Integer.parseInt(s);
            
            if(k % 2 == 0) {
                System.out.println(k);
            }
            
        }
    }
}
