package demo_interface1;

public class Main {
    public static void main(String[] args) {
        System.out.println("Thong tin cua duck");
        Duck d = new Duck();
        d.flying();
        d.running();
        d.swimming();
        d.eat();
        
        System.out.println("\n\nThong tin cua bird");
        Bird b = new Bird();
        b.flying();
        b.running();
        b.eat();
    }
}
