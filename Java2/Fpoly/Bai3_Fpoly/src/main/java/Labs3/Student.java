package Labs3;

import java.io.Serializable;

public class Student implements Serializable{
    private String name;
    private double marks;
    private String major;

    public Student() {
    }

    public Student(String name, double marks, String major) {
        this.name = name;
        this.marks = marks;
        this.major = major;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMarks() {
        return marks;
    }

    public void setMarks(double marks) {
        this.marks = marks;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }
    
    public String getGrade() {
        if(marks < 3) {
            return "Kem";
        } else if(marks < 5) {
            return "Yeu";
        } else if(marks < 6.5) {
            return "Trung binh";
        } else if(marks < 7.5) {
            return "Kha";
        } else if(marks < 9) {
            return "Gioi";
        } else {
            return "Xuat sac";
        }
    }
    
    public boolean isBonus() {
        return marks >= 7.5;
    }

    @Override
    public String toString() {
        return "Student{" + "name=" + name + ", marks=" + marks + ", major=" + major + '}';
    }
    
}
