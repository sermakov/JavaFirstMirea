package ru.mirea.task5.Furniture;

public class FurnitureShop {
    public static void main(String[] args) {
        Chair c1 = new Chair("Hope", 12000, "Italy");
        Table t1 = new Table("Love", 100000, "for coffee");
        c1.displayInfo();
        t1.displayInfo();
        System.out.print("Faith is missing");
    }
}
