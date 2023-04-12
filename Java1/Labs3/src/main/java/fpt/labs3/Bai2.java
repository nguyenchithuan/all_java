package fpt.labs3;

/**
 *
 * @author ASUS
 */
public class Bai2 {
    public static void bangCuuChuong() {
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.printf("%d * %d = %d\n", i, j, i * j);
            }
            System.out.println("=================");
        }
    }

}
