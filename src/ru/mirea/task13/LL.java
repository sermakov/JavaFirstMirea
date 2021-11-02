package ru.mirea.task13;
import java.util.ArrayList;
import java.util.LinkedList;

public class LL {
    public static void main(String[] args) {
        LinkedList<String> book = new LinkedList<String>();
        book.add("Fahrenheit 451");
        book.add("Pride and prejudice");
        book.add("A lullaby for a cat");
        book.add("The man who laughs");
        book.add("The art of loving");
        book.add("Martin Iden");
        for (String b : book) {
            System.out.println(b);
        }
        book.set(2,"A fall");
        book.remove(book.size() - 1);
        book.add(4,"Singing in the thorn");
        book.addLast("Martin Iden");
        book.addFirst("Nothing");
        System.out.println(book.getFirst());
    }
}
