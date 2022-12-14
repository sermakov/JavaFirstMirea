package ru.mirea.task13.exe2;

import ru.mirea.task13.exe1.Item;

import java.util.LinkedList;

public class TestList {
    public static void main(String[] args) {
        int size = 10;
        LinkedList<Item> ar = new LinkedList<Item>();

        Item itemForRemove = new Item();

        for (int i = 0; i < size; ++i) {
            Item item = new Item(i, Math.random() * 10);
            ar.add(item);
            itemForRemove = item;
        }
        ar.remove(itemForRemove);

        for (int i = 0; i < size; ++i){
            System.out.println(ar.get(i));
        }

        System.out.println(ar.get(2));
    }
}
