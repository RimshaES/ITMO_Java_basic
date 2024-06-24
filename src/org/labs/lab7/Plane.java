package org.labs.lab7;

public class Plane {
    class Wing {
        int weight;

        public Wing(int weight) {
            this.weight = weight;
        }

        void printWingWeight() {
            System.out.println("Вес крыла: " + weight);
        }
    }

    public void classWingCall(int weight) {
        Wing wing = new Wing(weight);
        wing.printWingWeight();
    }
}
