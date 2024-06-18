package org.labs.lab5;

public class Lab5 {
    public static String findLongest(String sentence) {
        if (sentence == null || sentence.isEmpty()) {
            return "";
        }
        String longestWord = "";
        String[] words = sentence.split(" ");
        for (String word : words) {
            if (longestWord.length() < word.length()) {
                longestWord = word;
            }
        }
        System.out.println(longestWord);
        return longestWord;
    }

    public static boolean checkPalindrom(String word) {
        char[] chars = word.toCharArray();
        int start = 0;
        int end = chars.length - 1;
        while (start <= end) {
            if (Character.toLowerCase(chars[start]) != Character.toLowerCase(chars[end])) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    public static String changeLetters(String text, String regex, String replacement ) {
        return text.replaceAll(regex, replacement);
    }

    public static int countOverlap(String text, String substring) {
        int count = 0;
        int length = substring.length();
        int lengthText = text.length();
        for (int i = 0; i < lengthText - length; i++) {
            String s = text.substring(i);
            if (s.startsWith(substring)) {
                count++;
            }
        }
        return count;
    }

    public static String doReverse(String text) {
        System.out.println("The given string is: " + text);
        String result = "";
        String[]  words = text.split(" ");
        for (String word : words) {
            result += new StringBuilder(word).reverse() + " ";
        }
        System.out.println("The string reversed word by word is: ");
        return result;
    }

}
