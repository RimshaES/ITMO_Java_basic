package org.labs.lab4;

public class Main {
    public static void main(String[] args) {
        Lab4.printEvenNumber();
        Lab4.printDivThreeFive();
        Lab4.compareNumbers(5, 6,10);
        System.out.println("Результат: " + Lab4.compareNumbersFromUser(34,6,9));
        Lab4.compareWith3(new int[] {9,3,7,8});
        System.out.println(Lab4.findNum1Num3(new int[] {4,1,3,5,65}));
        Lab4.checkArray(new int[]{1, 5, 56, 10});
        Lab4.printArray();
        Lab4.changePlace(new int[]{3, 5, 7, 8});
        Lab4.findUniq(new int[] {7, 7, 7, 3, 9});
        Lab4.fillArray();
    }
}
