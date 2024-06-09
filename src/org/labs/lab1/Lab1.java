package org.labs.lab1;

import java.util.Scanner;

public class Lab1 {
    public static void main(String[] args) {
        print();
        calculate();
        divide();
        multiply();
        input();
        bExample();
    }

    public static void print() {
        System.out.println("Я\nхорошо\nзнаю\nJava");
    }

    public static void calculate() {
        double result = ( 46 + 10 ) * ( 10.0 / 3.0 );
        double result1 = 29.0 * 4.0 * (-15.0);
        System.out.println("( 46 + 10 ) * ( 10 / 3 ) = " + result);
        System.out.println("( 29 ) * ( 4 ) * (- 15 ) = " + result1 );

    }

    public static void divide() {
        int number = 10500;
        double result = ((double)number / 10) / 10 ;
        System.out.println(result);
    }

    public static void multiply() {
        double result = 3.6 * 4.1 * 5.9;
        System.out.println(result);
    }

    public static void input() {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        System.out.println(a);
        int b = scanner.nextInt();
        System.out.println(b);
        int c = scanner.nextInt();
        System.out.println(c);
    }

    public static void bExample() {
        Scanner scanner = new Scanner(System.in);
        int b = scanner.nextInt();
        if (b % 2 != 0) {
            System.out.println("Нечетное");
        } else if (b < 100) {
            System.out.println("Четное");
        } else {
            System.out.println("Выход за пределы диапазона");
        }
    }
}
