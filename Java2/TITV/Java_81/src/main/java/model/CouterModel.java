package model;

public class CouterModel { // chua cac du lieu data
    private int value;

    public CouterModel() {
        value = 0;
    }
    
    public int getValue() {
        return value;
    }

    public void increment() {
        value++;
    }
    
    public void decrement() {
        value--;
    }
    
    public void reset() {
        value = 0;
    }
}
