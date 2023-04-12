package demo_interface1;

public class Bird extends Animal implements Fly, Run{ // interface giong nhu anh nuoi cha nuoi
    // co ten tu cha
    // them hanh dong bay chay thi phai can interface

    
    @Override
    public void flying() {
        System.out.println("Bay kieu chim");
    }

    @Override
    public void running() {
        System.out.println("Chay kieu chim");
    }

}
