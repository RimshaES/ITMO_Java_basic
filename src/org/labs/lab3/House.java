package org.labs.lab3;

import java.time.Year;

public class House {
    private int numberOfFloors;
    private int date;
    private String name;

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public void setNumberOfFloors(int numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        int currentYear = Year.now().getValue();
        int age = currentYear - date;
        return age;
    }


    @Override
    public String toString() {
        return "House{" +
                "numberOfFloors ='" + numberOfFloors + '\'' +
                ", date = '" + date + '\'' +
                ", name = '" + name + '\'' +
                ", age = "  + getAge() +
                '}';
    }
}
