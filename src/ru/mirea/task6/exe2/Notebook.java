package ru.mirea.task6.exe2;

public class Notebook implements Priceable{
    private String model;
    private double price;

    Notebook(String model, double price)
    {
        this.price = price;
        this.model = model;
    }

    @Override
    public double getPrice(){ return price;}
    public String getModel() {return model;}
}
