package ru.mirea.task6.exe2;

public class TestPriceable {
    public static void main(String[] args) {
        Metal metal = new Metal("gold(100g)", 453639);
        Car car = new Car(2000000,"Volkswagen Golf Beetle");
        Notebook notebook = new Notebook("Huawei MateBook D 15 Bod-WFH9C", 64000);

        System.out.println("Planet: " + '\t' + metal.getPrice() + '\n');
        System.out.println("Car: " + '\t' + car.getPrice() + '\n');
        System.out.println("Animal: " + '\t' + notebook.getPrice() + '\n');
    }
}
