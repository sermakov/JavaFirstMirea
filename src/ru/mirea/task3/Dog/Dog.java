package ru.mirea.task3.Dog;

public abstract class Dog {
    private String name;
    private int age;
    private String reward;
    public String getName() {return name;}
    public int getAge() {return age;}
    public String getReward() {return reward;}
    public Dog(String name, int age, String reward) {
        this.name = name;
        this.age = age;
        this.reward = reward;
    }
    public abstract void displayInfo();
}