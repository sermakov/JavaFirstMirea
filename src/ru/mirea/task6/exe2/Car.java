package ru.mirea.task6.exe2;

public class Car {
    private double price;
    private String modelName;

    Car(double price, String name)
    {
        this.price = price;
        this.modelName = name;
    }


    public String getModelName(){ return modelName;}
    public double getPrice() {return price;}
}
