package ru.mirea.task2.Book;

public class Book {
    private String author;
    private String name;
    private int countPage;
    public Book (String a, String  n, int cP) {
        author = a;
        name = n;
        countPage = cP;
    }
    public Book (String a, String n) {
        author = a;
        name = n;
        countPage = 0;
    }
    public Book (String a) {
        author = a;
        name = "<...>";
        countPage = 0;
    }
    public Book () {
        author = "Jack London";
        name = "<Martin Iden>";
        countPage = 367;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public void setCountPage(int countPage) {
        this.countPage = countPage;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getAuthor() {
        return author;
    }
    public String getName() {
        return name;
    }
    public int getCountPage() {
        return countPage;
    }
    public String toString() {
        return this.name + " was written by " + this.author + " and has " + this.countPage + "pages.";
    }
    public void interestingBook() {
        System.out.println("Author: " + author + ", book: " + name);
    }
}
