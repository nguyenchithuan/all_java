package generic;

public class Box2<T> {
    // generic: T thay cho kieu du lieu
    
    private T giaTri;

    public Box2() {
    }

    public Box2(T giaTri) {
        this.giaTri = giaTri;
    }

    public T getGiaTri() {
        return giaTri;
    }

    public void setGiaTri(T giaTri) {
        this.giaTri = giaTri;
    }
    
}
