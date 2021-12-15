package ru.mirea.task13.exe3;

public class TestArray {
    public static void main(String[] args) {
        int size = 10;
        Item item = new Item();
        ArrayB<Item> ar = new ArrayB<Item>(Item.class, size);

        for (int i = 0; i < size; ++i){
            Item item1 = new Item(i, Math.random());
            ar.add(item1);
            item = item1;
        }

        for (int i = 0; i < size; ++i)
            System.out.println(ar.get(i));
        ar.remove(item);
        System.out.println();
        for (int i = 0; i < size; ++i)
            System.out.println(ar.get(i));
    }
}
