package ru.mirea.task5.lab3.furniture;

public class FurnitureShop {
    public void sellFurniture(Furniture f, int price) {
        System.out.println("Продажа "+f.getName() + " за "+price/100+"."+price%100+" рублей.");
    }
}
