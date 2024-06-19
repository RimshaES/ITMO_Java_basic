package org.labs.lab6.Heir2;

public class Child extends Parent {
    @Override
    public void getData() {
        System.out.println("Введите имя: ");
        name = scanner.next();
        System.out.println("Вы ввели имя: " + name);
    }
}
