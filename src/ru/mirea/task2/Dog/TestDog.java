package ru.mirea.task2.Dog;

public class TestDog {
    public static void main(String[] args) {
        Dog d1 = new Dog("Jake", 4);
        Dog d2 = new Dog("Lisan", 3);
        Dog d3 = new Dog();
        System.out.println(d1);
        d1.intoHumanAge();
        d2.intoHumanAge();
        d3.intoHumanAge();
    }
}
