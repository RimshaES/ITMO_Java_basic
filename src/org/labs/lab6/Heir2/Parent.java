package org.labs.lab6.Heir2;

import java.util.Scanner;

public class Parent {
    protected Scanner scanner = new Scanner(System.in);
    protected int age;
    protected String name;


    public void getData() {
        System.out.println("Введите возраст: ");
        age = scanner.nextInt();
        System.out.println("Вы ввели возраст: " + age);
    }

}
