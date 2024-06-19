package org.labs.lab6;

public class BankEmployee extends Human implements Configurable{
    String nameOfBank;

    public BankEmployee(String name, String surname, String nameOfBank) {
        super(name, surname);
        this.nameOfBank = nameOfBank;
    }

    @Override
    protected void printInfo() {
        System.out.println("Информация о сотруднике: " + name + " " + surname + " " + nameOfBank);
    }

    @Override
    public void changeSurname(String surname) {
        System.out.println("Изменение фамилии сотрудника на " + surname);
        this.surname = surname;
    }
}
