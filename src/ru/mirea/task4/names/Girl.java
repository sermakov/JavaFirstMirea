package ru.mirea.task4.names;

public class Girl implements Namebale {
    private String name;
    private int age;
    private int grade;
    Girl(String name, int age, int grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }
    public void getName() {
        System.out.println("Имя девочки: " + name + ", её возраст: " + age + " и класс: " + grade);
    }
}
