package org.labs.lab3;

public class Tree {
    private Integer age;
    private Boolean alive;
    private String name;

    public Tree() {
        System.out.println("Пустой конструктор без параметров сработал");
    }

    public Tree(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public Tree(int age, boolean alive, String name) {
        this.age = age;
        this.alive = alive;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Tree{" +
                "age = " + age +
                ", alive = " + alive +
                ", name = '" + name + '\'' +
                '}';
    }
}
