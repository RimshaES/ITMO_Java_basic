package org.labs.lab6.transport;

public class Lorry extends Car {
    private int wheelsNumber;
    private float maxWeight;

    public Lorry(int weight, String model, char color, float speed, int wheelsNumber, float maxWeight) {
        super(weight, model, color, speed);
        this.wheelsNumber = wheelsNumber;
        this.maxWeight = maxWeight;
    }

    public void newWheels(int wheelsNumber) {
        this.wheelsNumber = wheelsNumber;
        System.out.println(wheelsNumber);
    }
}
