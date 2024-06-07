package org.labs.lab2;

import java.time.LocalDate;

public class Book {
    private String bookName;
    private String authorName;
    private LocalDate yearOfRelease;
    private int quantityOfPages;
    private Genre genre;

    public Book() {
    }

    public Book(String bookName, String authorName) {
        this.bookName = bookName;
        this.authorName = authorName;
    }

    public Book(String bookName, String authorName, LocalDate yearOfRelease, int quantityOfPages, Genre genre) {
        this.bookName = bookName;
        this.authorName = authorName;
        this.yearOfRelease = yearOfRelease;
        this.quantityOfPages = quantityOfPages;
        this.genre = genre;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public LocalDate getYearOfRelease() {
        return yearOfRelease;
    }

    public void setYearOfRelease(LocalDate yearOfRelease) {
        this.yearOfRelease = yearOfRelease;
    }

    public int getQuantityOfPages() {
        return quantityOfPages;
    }

    public void setQuantityOfPages(int quantityOfPages) {
        this.quantityOfPages = quantityOfPages;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookName = '" + bookName + '\'' +
                ", authorName = '" + authorName + '\'' +
                ", yearOfRelease = '" + yearOfRelease + '\'' +
                ", quantityOfPages = " + quantityOfPages +
                ", genre = " + genre +
                '}';
    }
}
