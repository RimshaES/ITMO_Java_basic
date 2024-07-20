package org.labs.lab11;

public class MyRunnable2 implements Runnable {
    private final Object lock;
    private final boolean isFirst;
    private static boolean isFirstTurn = true;

    public MyRunnable2(Object lock, boolean isFirst) {
        this.lock = lock;
        this.isFirst = isFirst;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (lock) {
                try {
                    while (isFirstTurn != isFirst) {
                        lock.wait();
                    }
                    System.out.println("Name: " + Thread.currentThread().getName());
                    isFirstTurn = !isFirstTurn;;
                    lock.notify();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
