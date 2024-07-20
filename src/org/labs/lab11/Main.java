package org.labs.lab11;

public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {          //задание 1
            new MyThread().start();             //задание 1
        }                                       //задание 1

        //задание 2
        Thread myRunnable = new Thread(new MyRunnable());

        System.out.println("State before start: " + myRunnable.getState());
        myRunnable.start();

        System.out.println("State after start: " + myRunnable.getState());

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted");
        }

        System.out.println("State after finish: " + myRunnable.getState());

    }
}
