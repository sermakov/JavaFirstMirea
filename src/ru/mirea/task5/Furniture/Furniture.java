package ru.mirea.task5.Furniture;

public abstract class Furniture {
    private String company;
    protected int price;
    public Furniture(String company, int price) {
        this.price = price;
        this.company = company;
    }
    public String getCompany () {
        return company;
    }
    public int getPrice () {
        return price;
    }
    public abstract void displayInfo ();
}
