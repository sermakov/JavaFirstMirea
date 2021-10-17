package ru.mirea.task13.opt3;

public class Main {
    public static void main(String[] args) {
        MyCollection<Integer> ints = new MyCollection<>();
        for(int i = 0; i<20;i++)
            ints.add(i);
        System.out.println(ints);
        for(int i = 5; i < 13; i++)
            ints.remove(i);
        System.out.println(ints);
        System.out.println(ints.get(5));
        System.out.println();

        MyCollection<String> strs = new MyCollection<>();
        System.out.println(strs);
        for (int i = 0; i < 10; i++) {
            strs.add("String number " + (i+1));
        }
        System.out.println(strs);
        System.out.println();

        MyCollection<String> strs2 = new MyCollection<>();
        System.out.println(strs2);
        strs2.remove(5);
        System.out.println(strs2.get(5));
        System.out.println(strs.get(5));
        System.out.println(strs2);
        System.out.println(strs2);
    }
}
