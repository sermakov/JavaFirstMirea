package ru.mirea.task5.opt2;

public abstract class Dog {
    protected String name;
    protected int age;
    public Dog() {
        name = "Pup";
        age = 0;
    }
    public Dog(String name) {
        this.name = name;
        age = 0;
    }
    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public abstract void setAge(int age);
    public abstract void setName(String name);
    public abstract int getAge();
    public abstract String getName();
    public void intoHumanAge() {
        System.out.println(name+"'s age in human years is "+age*7+" years");
    }
    public String toString() {
        return this.name+", age "+this.age;
    }
}
