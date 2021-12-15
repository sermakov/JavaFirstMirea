package ru.mirea.task13;
import java.util.ArrayList;

public class AL {
    public static void main(String[] args) {
        ArrayList<String> book = new ArrayList<String>();
        book.add("Fahrenheit 451");
        book.add("Pride and prejudice");
        book.add("A lullaby for a cat");
        book.add("The man who laughs");
        book.add("The art of loving");
        book.add("Martin Iden");
        for (String b : book) {
            System.out.println(b);
        }
        System.out.println("\n"+"Modified list: ");
        book.set(2,"A fall");
        book.remove(book.size() - 1);
        book.add(4,"Singing in the thorn");
        Object[] objectBooks = book.toArray();
        for (Object oB : objectBooks){
            System.out.println(oB);
        }
        if (book.contains("Martin Iden")) {
            System.out.println("There is Martin Iden");
        } else {
            System.out.println("There isn`t Martin Iden");
        }
    }
}
