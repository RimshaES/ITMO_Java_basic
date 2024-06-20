package org.labs.lab5;

public class Main {
    public static void main(String[] args) {
        Lab5.findLongest("Я собираюсь идти гулять.");
        System.out.println(Lab5.checkPalindrom("Довод"));
        System.out.println(Lab5.changeLetters("ты бяка и супербяка", "бяка", "[вырезано цензурой]"));
        System.out.println(Lab5.countOverlap("трава была зеленая трава была мокрая трава была вкусная",
        "трава"));
        System.out.println(Lab5.doReverse("This is a test string"));
    }
}
