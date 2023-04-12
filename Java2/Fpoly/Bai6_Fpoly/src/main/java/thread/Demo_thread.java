package thread;

// chay nhieu nhiem vu cung 1 luc

import java.util.logging.Level;
import java.util.logging.Logger;


public class Demo_thread implements Runnable{  // chay thread
    public static void main(String[] args) {
//        for (int i = 0; i < 10; i++) {
//            System.out.println("i = " + i);
//        }
//        
//        for (int i = 0; i < 10; i++) {
//            System.out.println("i = " + i);
//        }
        
        
        Demo_thread dt = new Demo_thread(); // tao doi tuong cua form
        
        // luong voi thread giong nhau
        
        Thread th1 = new Thread(dt); // khai bao luong
        th1.setName("th1"); // dat ten luong
        
        
        Thread th2 = new Thread(dt);
        th2.setName("th2");
        
        Thread th3 = new Thread(dt);
        th3.setName("th3");
        
        Thread th4 = new Thread(dt);
        th4.setName("th4");
        
        
        th1.start();// chay luong
        th2.start();
        th3.start();
        th4.start();
    }

    @Override
    public void run() {
        Thread th = Thread.currentThread(); // thay duoc cai thread dang chay (giong nhu this)
        for (int i = 0; i < 10; i++) {
            System.out.println(th.getName() + "; " + i);
            try {
                th.sleep(1000); // la bang 1 giay
            } catch (InterruptedException ex) {
                break;
            }
        }
    }
}
