package org.labs.lab4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Lab4 {
    //Напишите программу, которая выводит на консоль нечетные числа от 1 до 99
    public static void printEvenNumber() {
        for (int i = 1; i < 100 ; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }

    //Напишите программу, которая выводит числа от 1 до 100, которые делятся на 3, 5 и на то и другое
    public static void printDivThreeFive() {
        String divideBy3By5 = "";
        String divideBy3 = "";
        String divideBy5 = "";
        for (int i = 0; i < 100; i++) {
            if ((i % 3 == 0) && (i % 5 == 0)) {
                divideBy3By5 += i + " ";
            } else if (i % 3 == 0) {
                divideBy3 += i + " ";
            } else if (i % 5 == 0) {
                divideBy5 += i + " ";
            }
        }
        System.out.println("Делятся на 3 и 5: " + divideBy3By5);
        System.out.println("Делятся на 3: " + divideBy3);
        System.out.println("Делятся на 5: " + divideBy5);
    }

    //Напишите программу, чтобы вычислить сумму двух целых чисел и вернуть true,
    // если сумма равна третьему целому числу
    public static boolean compareNumbers(int a, int b, int c) {
        boolean result = a + b == c;
        System.out.println("Результат: " + result);
        return result;
    }

    //Напишите программу, которая принимает от пользователя три целых числа и возвращает true,
    // если второе число больше первого числа, а третье число больше второго числа.
    public static boolean compareNumbersFromUser(int a, int b, int c) {
        return (a < b) && (b < c);
    }

    //Напишите программу, чтобы проверить, появляется ли число 3 как первый или последний
    // элемент массива целых чисел
    public static boolean compareWith3 (int[] array) {
        System.out.println("Результат проверки: ");
        if (array[0] == 3 || array[array.length-1] == 3) {
            System.out.println(true);
            return true;
        }
        System.out.println(false);
        return  false;
    }

    //Напишите программу, чтобы проверить, что массив содержит число 1 или 3
    public static boolean findNum1Num3(int[] array) {
        boolean result = false;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 1 || array[i] == 3) {
                result = true;
            }
        }
        return result;
    }

    //Напишите программу, которая проверяет отсортирован ли массив по возрастанию. Если он отсортирован
    // по возрастанию то выводится “OK”, если нет, то будет выводиться текст “Please, try again”
    public static void checkArray(int[] array) {
        boolean result = true;
        int element = array[0];
        for (int i = 1; i < array.length; i++) {
            if (element > array[i]) {
                result = false;
                break;
            }
            element = array[i];
        }
//        System.out.println(result ? "OK" : "Please try again");

        if (result) {
            System.out.println("OK");
        } else {
            System.out.println("Please try again");
        }
    }

    //Напишите программу, которая считывает с клавиатуры длину массива
    public static int[] printArray() {
        System.out.println("Введите размер массива: ");
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] array = new int[size];
        System.out.println("Введите " + size + " элементов массива: ");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        System.out.println("Вы ввели массив элементов:" + Arrays.toString(array));
        return array;
    }

    //Напишите метод, который меняет местами первый и последний элемент массива
    public static void changePlace(int[] array) {
        System.out.println(Arrays.toString(array));
        int temp = array[0];
        array[0] = array[array.length-1];
        array[array.length-1] = temp;
        System.out.println(Arrays.toString(array));
    }

    //Дан массив чисел. Найдите первое уникальное в этом массиве число
    public static void findUniq(int[] array) {
        for (int i = 0; i < array.length; i++) {
            boolean isUniq = true;
            for (int j = 0; j < array.length; j++) {
                if (array[i] == array[j] && i != j) {
                    isUniq = false;
                    break;
                }
            }
            if (isUniq) {
                System.out.println("Unique number is found: " + array[i]);
                break;
            }
        }
    }

    //Заполните массив случайным числами и отсортируйте его. Используйте сортировку слиянием
    public static void fillArray (){
    int[] array = printArray();
    int[] result = Lab4SortArray.mergeSort(array);
        System.out.println(Arrays.toString(result));
    }
}
