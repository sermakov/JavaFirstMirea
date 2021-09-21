package ru.mirea.task6.exe1;

public class Car implements Nameable {
    private double price;
    private String name;

    Car(double price, String name)
    {
        this.price = price;
        this.name = name;
    }

    public String getName(){ return name;}
    public double getPrice() {return price;}
}
