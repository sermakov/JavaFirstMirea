package ru.mirea.task13.lab7.ex1;

import java.sql.Array;
import java.util.ArrayList;

public class TestArray {
    public static void run() {
        System.out.println("\nTestArray");
        int size = 10;
        ArrayList<Item> ar = new ArrayList<>(size);

        Item itemForRemove = new Item();

        for (int i = 0; i < size; ++i) {
            Item item = new Item(i, Math.random() * 10);
            ar.add(item);
            itemForRemove = item;
        }
        ar.remove(itemForRemove);

        for (Item item : ar) {
            System.out.println(item);
        }

        System.out.println(ar.get(2));
    }
}