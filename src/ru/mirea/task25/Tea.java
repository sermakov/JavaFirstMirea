package ru.mirea.task25;

public class Tea implements Decorator {
    private String label;
    private double price;

    public Tea(String label, double price) {
        this.label = label;
        this.price = price;
    }

    public double getPrice() {
        return this.price;
    }

    public String getLabel() {
        return this.label;
    }
}