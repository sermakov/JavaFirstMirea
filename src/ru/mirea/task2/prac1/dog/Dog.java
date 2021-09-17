package ru.mirea.task2.prac1.dog;

import java.util.Arrays;

public class Dog {
    private float age = 0;
    public Dog(float age) {
        this.age = age;
    }

    public float getAge() {
        return age;
    }

    public void setAge(float age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "age=" + age +
                '}';
    }

    public float getHumanAge() {
        return age*7;
    }
}

