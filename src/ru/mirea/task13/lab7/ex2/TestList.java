package ru.mirea.task13.lab7.ex2;

import java.util.LinkedList;

public class TestList {
    public static void run() {
        System.out.println("\nTestList");
        int size = 10;
        LinkedList<Item> ar = new LinkedList<>();

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