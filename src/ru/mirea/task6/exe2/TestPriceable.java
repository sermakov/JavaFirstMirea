package ru.mirea.task6.exe2;

public class TestPriceable {
    public static void main(String[] args) {
        Priceable item1 = new Metal("gold(100g)", 453639);
        Priceable item2 = new Car(2000000,"Volkswagen Golf Beetle");
        Priceable item3 = new Notebook("Huawei MateBook D 15 Bod-WFH9C", 64000);

        System.out.println("Planet: " + '\t' + item1.getPrice() + '\n');
        System.out.println("Car: " + '\t' + item2.getPrice() + '\n');
        System.out.println("Animal: " + '\t' + item3.getPrice() + '\n');
    }
}
