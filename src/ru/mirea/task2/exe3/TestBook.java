package ru.mirea.task2.exe3;

public class TestBook {
    public static void main(String[] args){
        Book book = new Book(40, "Easy English", "J.Rolling");
        System.out.println(book.toString());
        book.setAuthor("K.Fasford");
        book.setName("How");
        book.setCountOfPages(456);
        System.out.println("\n" + book.getCountOfPages() + " " + book.getName() + " " + book.getAuthor());
    }
}

