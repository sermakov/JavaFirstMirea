package ru.mirea.task4.names;

public class Boy implements Namebale {
    private String name;
    private int age;
    private int grade;
    private String section;
    Boy(String name, int age, int grade, String section) {
        this.name = name;
        this.age = age;
        this.grade = grade;
        this.section = section;
    }
    public void getName() {
        System.out.println("Имя мальчика: " + name + ", его возраст: " + age + " и класс: " + grade);
        System.out.print("Секция для мальчика: " + section);
    }
}
