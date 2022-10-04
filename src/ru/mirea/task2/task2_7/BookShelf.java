package ru.mirea.task2.task2_7;

import java.util.Arrays;
import java.util.Comparator;

public class BookShelf {
    private Book[] books;
    private int numOfBooks;

    public BookShelf(Book[] books, int numOfBooks) {
        this.books = books;
        this.numOfBooks = numOfBooks;
    }

    public Book getBookWithEarliestPublicationYear() {
        Book res = books[0];
        for (int i = 1; i < books.length; i++) {
            if (books[i].getPublicationYear() < res.getPublicationYear()) {
                res = books[i];
            }
        }
        return res;
    }

    public Book getBookWithLatestPublicationYear() {
        Book res = books[0];
        for (int i = 1; i < books.length; i++) {
            if (books[i].getPublicationYear() > res.getPublicationYear()) {
                res = books[i];
            }
        }
        return res;
    }

    public void sortByPublicationYear() {
        Arrays.sort(books, new Comparator<Book>() {
            public int compare(Book obj1, Book obj2) {
                return obj1.getPublicationYear() - obj2.getPublicationYear();
            }
        });
    }

    public String toString() {
        return "BookShelf {" + "books = " + Arrays.toString(books) + ", numOfBooks = " + numOfBooks + '}';
    }

}
