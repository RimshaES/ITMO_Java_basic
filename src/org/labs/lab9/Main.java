package org.labs.lab9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Ann", "Mike", "Ann", "Peter");
        System.out.println(Lab9.removeDuplicates(list));

        Lab9.testList(new ArrayList<>());
        System.out.println("----------------");
        Lab9.testList(new LinkedList<>());

        showUserPoints();


    }
    public static void showUserPoints() {
        Map<User, Integer> map = new HashMap<>();
        map.put(new User("Peter"), 345);
        map.put(new User("Ann"), 245);
        map.put(new User("Victor"), 675);
        map.put(new User("Nick"), 3);
        map.put(new User("Ted"), 105);
        System.out.print("Введите имя пользователя:");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        Integer num = map.get(new User(name));
        if (num == null) {
            System.out.println("Пользователя " + name + " не существует");
        } else {
            System.out.println("Пользователь " + name + " имеет очков: " + num);
        }

    }
}
