package BaiTestThread;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Demo_thread_1 implements Runnable{
    public static void main(String[] args) {
        Demo_thread_1 dt1 = new Demo_thread_1();
        Demo_thread_1 dt2 = new Demo_thread_1();
        Demo_thread_1 dt3 = new Demo_thread_1();
        
        Thread th1 = new Thread(dt1);
        Thread th2 = new Thread(dt2);
        Thread th3 = new Thread(dt3);
        
        th1.setName("Thread 1");
        th2.setName("Thread 2");
        th3.setName("Thread 3");
        
        
        th1.start();
        th2.start();
        th3.start();
        
    }

    @Override
    public void run() {
        Thread th = Thread.currentThread();
        
        for (int i = 0; i < 10; i++) {
            System.out.println(th.getName() +  "  :  " + i);
            try {
                th.sleep(1000);
            } catch (InterruptedException ex) {
            }
        }
    }
    
    
}
