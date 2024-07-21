package org.labs.lab11;

import java.util.concurrent.CountDownLatch;

public class MultiCounter implements Runnable {
    private Counter counter;
    private CountDownLatch latch;

    public MultiCounter(Counter counter, CountDownLatch latch) {
        this.counter = counter;
        this.latch = latch;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            counter.increment();
            latch.countDown();
        }
    }

    public static void main(String[] args) {
        CountDownLatch latch = new CountDownLatch(100000);

        Counter count = new Counter();

        for (int i = 0; i < 1000 ; i++) {
           new Thread(new MultiCounter(count, latch)).start();
        }
        try {
            latch.await();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(count.getCount());
    }
}
