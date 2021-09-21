package ru.mirea.task6.exe1;

public class Animal implements Nameable {
    private String type;
    private String name;

    Animal(String type, String name)
    {
        this.name = name;
        this.type = type;
    }

    public String getName(){ return name;}
    public String getType() {return type;}
}
