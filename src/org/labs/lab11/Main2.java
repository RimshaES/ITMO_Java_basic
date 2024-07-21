package org.labs.lab11;

public class Main2 {
    public static void main(String[] args) {
        Object lock = new Object();
        Thread myThread2_1 = new Thread(new MyRunnable2(lock, true));
        Thread myThread2_2 = new Thread(new MyRunnable2(lock, false));
        myThread2_1.start();
        myThread2_2.start();
    }
}
