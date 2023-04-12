package generic;

/**
 *
 * @author ASUS
 */
public class TextBox {
    public static void main(String[] args) {
        Box2<Integer> b1 = new Box2<Integer>(12);
        
        Box2 b2 = new Box2<String>("chi thuan");
        b2.setGiaTri("hihi");
        
        Box2<Double> b3 = new Box2<Double>(1.2);
    }
}
