import java.util.*;
class MyTh extends Thread{
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Thread: " + Thread.currentThread().getName() + ", Count: " + i);
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}

class MyThread implements Runnable{
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Thread: " + Thread.currentThread().getName() + ", Count: " + i);
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}

public class Multi_Threading {
    public static void main(String[] args) {
        MyTh th1 = new MyTh();
        MyTh th2 = new MyTh();
        MyThread th3 = new MyThread();
        th1.start();
        th2.start();
        th3.run();
    }
}
