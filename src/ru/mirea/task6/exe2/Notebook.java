package ru.mirea.task6.exe2;

public class Notebook {
    private String model;
    private double price;

    Notebook(String model, double price)
    {
        this.price = price;
        this.model = model;
    }

    public double getPrice(){ return price;}
    public String getModel() {return model;}
}
