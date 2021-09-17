package ru.mirea.task2.Book;

public class TestBook {
    public static void main(String[] args) {
        Book b1 = new Book("Victor Hugo", "<The human who laughs>", 613);
        Book b2 = new Book("Kurt Vonegut", "<Cat's cradle>");
        Book b3 = new Book();
        b2.setCountPage(283);
        System.out.println(b3);
        b1.interestingBook();
        b2.interestingBook();
        b3.interestingBook();
    }
}
