package org.labs.lab3;

public class Car {
    private String color;
    private String name;
    private int weight;

    public Car () {

    }
    public Car (String color){
        this.color = color;
    }
    public Car (String color, int weight) {
        this.color = color;
        this.weight = weight;
    }

    public String getColor () {
        return color;
    }

    public void setColor (String color) {
        this.color = color;
    }

    public String getName () {
        return name;
    }

    public void setName (String name) {
        this.name = name;
    }

    public int getWeight () {
        return weight;
    }

    public void setWeight (int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", name='" + name + '\'' +
                ", weight=" + weight +
                '}';
    }
}
