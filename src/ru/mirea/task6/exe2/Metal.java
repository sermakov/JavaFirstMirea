package ru.mirea.task6.exe2;

public class Metal implements Priceable{
    private double price;
    private String type;

    Metal(String type, double price)
    {
        this.price = price;
        this.type = type;
    }

    @Override
    public double getPrice() { return price;}
    public String getType() {return type;}
}
