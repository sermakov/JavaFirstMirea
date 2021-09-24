package ru.mirea.task5.lab3.furniture;

public class FurnitureTest {
    public static void test() {
        FurnitureShop fs = new FurnitureShop();
        Sofa sofa = new Sofa("Софа чёрная", 5, 2, 3, 250, 4);
        Cabinet cabinet = new Cabinet("Тумбочка жёлтая", 2, 2, 2, 100, 2);
        fs.sellFurniture(sofa, 8900000);
        fs.sellFurniture(cabinet, 4500000);
    }
}
