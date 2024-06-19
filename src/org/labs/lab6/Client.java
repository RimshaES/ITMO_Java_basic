package org.labs.lab6;

public class Client extends Human implements Configurable {
    String nameOfBank;

    public Client(String name, String surname, String nameOfBank) {
        super(name, surname);
        this.nameOfBank = nameOfBank;
    }

    @Override
    protected void printInfo() {
        System.out.println("Информация о клиенте: " + name + " " + surname + " " + nameOfBank);
    }

    @Override
    public void changeSurname(String surname) {
        System.out.println("Изменение фамилии клиента на " + surname);
        this.surname = surname;
    }
}
