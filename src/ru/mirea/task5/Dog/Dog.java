package ru.mirea.task5.Dog;

public abstract class Dog {
    private String name;
    private int age;
    public String sex;
    public Dog(String name, int age, String sex) {
        this.age = age;
        this.name = name;
        this.sex = sex;
    }
    public String getName () {
        return name;
    }
    public int getAge () {
        return age;
    }
    public String getSex () {
        return sex;
    }
    public abstract void displayInfo ();
}
