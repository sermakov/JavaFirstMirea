package ru.mirea.task5.lab3.dog;

public abstract class Dog {
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

