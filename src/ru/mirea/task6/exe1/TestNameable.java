package ru.mirea.task6.exe1;

public class TestNameable {

    public static void main(String[] args) {
        Planet planet = new Planet("dwarf planet", "Pluto");
        Car car = new Car(20000000,"Volkswagen Golf Beetle");
        Animal animal = new Animal("Mammalia", "Baleonoptera musculus");

        System.out.println("Planet: " + '\t' + planet.getName() + '\n');
        System.out.println("Car: " + '\t' + car.getName() + '\n');
        System.out.println("Animal: " + '\t' + animal.getName() + '\n');
    }
}
