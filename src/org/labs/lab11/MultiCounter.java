package org.labs.lab11;

public class MultiCounter implements Runnable {
    private Counter counter;

    public MultiCounter(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            counter.increment();
        }
    }

    public static void main(String[] args) {
        Counter count = new Counter();
        for (int i = 0; i < 1000 ; i++) {
           new Thread(new MultiCounter(count)).start();
        }
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(count.getCount());
    }
}
