package ru.mirea.task13.exe1;

import java.sql.Array;
import java.util.ArrayList;

public class TestArray {
    public static void main(String[] args) {
        int size = 10;
        ArrayList<Item> ar = new ArrayList<Item>(size);

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
