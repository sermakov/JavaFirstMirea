package ru.mirea.task2;

import java.lang.*;
public class Book {
    private String name;
    private int pages;
    public Book(String name, int pages){
        this.name = name;
        this.pages =pages;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setRadius(int pages) {
        this.pages =pages;
    }
    public String getName(){
        return name;
    }
    public int getPages() {
        return pages;
    }
    public String toString(){
        return "name of this book: "+this.name+" This book have: "+this.pages+" pages";
    }
}
