package model;

public class MiniCalculatorModel {
    private double value_one;
    private double value_two;
    private double answer;

    public MiniCalculatorModel() {
    }

    public double getValue_one() {
        return value_one;
    }

    public void setValue_one(double value_one) {
        this.value_one = value_one;
    }

    public double getValue_two() {
        return value_two;
    }

    public void setValue_two(double value_two) {
        this.value_two = value_two;
    }

    public double getAnswer() {
        return answer;
    }

    public void setAnswer(double answer) {
        this.answer = answer;
    }
    
    public void sum() {
        this.answer = this.value_one + this.value_two;
    }
    
    public void minus() {
        this.answer = this.value_one - this.value_two;
    }
    
    public void multiply() {
        this.answer = this.value_one * this.value_two;
    }
    
    public void divide() {
        this.answer = this.value_one / this.value_two;
    }
    
    public void pow() {
        this.answer = Math.pow(value_one, value_two);
    }
    
    public void mod() {
        this.answer = value_one % value_two;
    }
    
}
