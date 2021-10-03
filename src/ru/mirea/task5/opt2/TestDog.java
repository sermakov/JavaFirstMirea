package ru.mirea.task5.opt2;

public class TestDog {
    public static void main(String[] args) {
        Bulldog h1 = new Bulldog("Michael", 2);
        System.out.println(h1);
        Shepherd p1 = new Shepherd("Sharik", 4);
        System.out.println(p1);
        System.out.println(h1.getAge());
        System.out.println(p1.getName());
    }
}
