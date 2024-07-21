package org.labs.lab11;

public class MyThread extends Thread {
    @Override
    public void run() {
        int i = 0;
        while (i <= 100) {
            System.out.println(i + " " + Thread.currentThread().getName());
            i++;
        }
    }
}
