package ru.mirea.task13.lab7.ex3;

public class TestCustomArray {
    public static void run() {
        System.out.println("\nTestCustomArray");
        int size = 10;
        Item item = new Item();
        ArrayB<Item> ar = new ArrayB<>(Item.class, size);

        for (int i = 0; i < size; ++i){
            Item item1 = new Item(i, Math.random());
            ar.add(item1);
            item = item1;
        }

        for (int i = 0; i < ar.getLength(); ++i)
            System.out.println(ar.get(i));
        ar.remove(item);
        System.out.println();
        for (int i = 0; i < ar.getLength(); ++i)
            System.out.println(ar.get(i));
    }
}