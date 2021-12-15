package ru.mirea.task6.Name;

public class Boy implements Nameable {
    private String name;
    private int age;
    private int grace;
    private String section;
    Boy (String name, int age, int grace, String section) {
        this.name = name;
        this.age = age;
        this.grace = grace;
        this.section = section;
    }
    public void getName() {
        System.out.println("Boy's name: " + name + ", his age: " + age + " and his grace: " + grace);
        System.out.print(name + "'s section: " + section);
    }
}
