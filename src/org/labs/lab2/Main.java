package org.labs.lab2;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        double sum = calculator.sum(4.0, 5.0);
        System.out.println(sum);
        long substr = calculator.subtraction(700000000L, 257000000L);
        System.out.println(substr);
        int mult = calculator.multiply(345, 21);
        System.out.println(mult);
        double div = calculator.divide(584.0,8.0);
        System.out.println(div);

        Book book = new Book();
        book.setBookName("Head first Java");
        book.setAuthorName("K.Sierra");
        book.setGenre(Genre.SCIENTIFIC_LITERATURE);
        System.out.println(book);

        String description = book.getGenre().getDescription();
        System.out.println(description);
    }


}
