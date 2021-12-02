package ru.mirea.task25;

public class Main {
    public static void main(String[] args) {
        double cost = 0;
        Decorator tea = new Tea("Earl Gray", 130);
        Decorator choc = new Chocolate("Chocolate", 80);
        Decorator sugar = new Sugar(tea);
        Decorator extra = new ExtraSize(choc);
        cost += sugar.getPrice();
        cost += extra.getPrice();
        System.out.println(cost);
    }
}
