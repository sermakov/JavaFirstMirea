package ru.mirea.task25;

public class DecoratorOption implements Decorator {
    private Decorator decorator;
    private String label;
    private double price;

    public DecoratorOption(Decorator decorator, String label, double price) {
        this.decorator = decorator;
        this.label = label;
        this.price = price;
    }

    public double getPrice() {
        return this.price + decorator.getPrice();
    }

    public String getLabel() {
        return this.label + decorator.getLabel();
    }
}



