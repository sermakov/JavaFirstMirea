package ru.mirea.task6.Name;

public class Girl implements Nameable {
    private String name;
    private int age;
    private int grace;
    Girl (String name, int age, int grace) {
        this.name = name;
        this.age = age;
        this.grace = grace;
    }
    public void getName() {
        System.out.println("Girl's name: " + name + ", her age: " + age + " and her grace: " + grace);
    }
}
