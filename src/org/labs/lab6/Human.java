package org.labs.lab6;

public abstract class Human {
    protected String name;
    protected String surname;

    public Human(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }
    protected abstract void printInfo();
}
