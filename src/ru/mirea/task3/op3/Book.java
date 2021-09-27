package ru.mirea.task3.op3;
import java.lang.*;
public class Book {
    private String name;
    private int pages;
    private String AuthorName;
    private String releaseYear;
    public Book(String name, int pages, String AuthorName,String releaseYear){
        this.name = name;
        this.pages =pages;
        this.AuthorName = AuthorName;
        this.releaseYear = releaseYear;
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
    public void setAuthorName(String AuthorName){this.AuthorName = AuthorName;}
    public void setYear(String releaseYear){this.releaseYear = releaseYear;}
    public String toString(){
        return "name of this book: "+this.name+ " Author's name: " +this.AuthorName+ " This book have: "+this.pages+" pages "+" Release Year: "+this.releaseYear;
    }
}

