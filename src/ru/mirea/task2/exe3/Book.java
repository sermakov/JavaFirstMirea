package ru.mirea.task2.exe3;

public class Book {
    private String name;
    private int countOfPages;
    private String author;

    Book(int countOfPages, String name, String author){
        this.name = name;
        this.countOfPages = countOfPages;
        this.author = author;
    }

    public String getAuthor(){
        return author;
    }

    public void setAuthor(String author){
        this.author = author;
    }

    public int getCountOfPages(){
        return countOfPages;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setCountOfPages(int countOfPages){
        this.countOfPages = countOfPages;
    }
    @Override
    public String toString(){
        return "countOfPages " + countOfPages + " name: " + name + " author: " + author;
    }
}

