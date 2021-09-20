package ru.mirea.task3.exe3;

public class Book {
    private String author;
    private int year;
    private String name;

    Book(String author, int year, String name){
        this.author = author;
        this.year = year;
        this.name = name;
    }

    public String getAuthor(){
        return author;
    }

    public void setYear(int year){
        this.year = year;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getYear(){
        return year;
    }

    public void setAuthor(String author){
        this.author = author;
    }

    public String getName(){
        return name;
    }

    public String toString(){
        return "Author: " + author + " Name: " + name + " year: " + year;
    }
}

