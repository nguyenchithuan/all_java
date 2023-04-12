package demo_interface1;

public class Duck extends Animal implements Fly, Run, Swim{

    // ten, eat
    // them: bay, boi, chay
    
    @Override
    public void flying() {
        System.out.println("Bay kieu duck");
    }

    @Override
    public void running() {
        System.out.println("run kieu duck");
    }

    @Override
    public void swimming() {
        System.out.println("Swim kieu duck");
    }
    
}
