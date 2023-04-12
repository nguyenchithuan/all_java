package model;

public class MouseModel {
    private int x;
    private int y;
    private int count;
    private String checkIn;

    public MouseModel() {
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getCheckIn() {
        return checkIn;
    }

    public void setCheckIn(String checkIn) {
        this.checkIn = checkIn;
    }
    
    public void click() {
        count++;
    }
    
    public void enter() {
        checkIn = "yes";
    }
    
    public void exit() {
        checkIn = "no";
    }
    
}
