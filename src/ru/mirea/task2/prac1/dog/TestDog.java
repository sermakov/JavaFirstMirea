package ru.mirea.task2.prac1.dog;

import java.util.Arrays;

public class TestDog {
    public static void test() {
        Dog[] dogs = new Dog[10];
        for (int i = 0; i < dogs.length; i++) {
            dogs[i] = new Dog((float) (Math.random()*21));
        }
        dogs[0].setAge(dogs[1].getAge()+1);
        System.out.println(Arrays.toString(dogs));
        System.out.printf("Возраст 1ый собаки(человеческий): %f", dogs[0].getHumanAge());
    }
}
