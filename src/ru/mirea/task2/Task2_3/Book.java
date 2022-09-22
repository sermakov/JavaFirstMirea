package ru.mirea.task2.Task2_3;

public class Book {
    private String bookName = "Book";

    public Book(String bookName) {
        this.bookName = bookName;
    }

    public String getName() {
        return bookName;
    }

    public void setName(String bookName) {
        this.bookName = bookName;
    }

    public String toString() {
        return "Book: " + getName();
    }
}
