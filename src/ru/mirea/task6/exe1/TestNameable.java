package ru.mirea.task6.exe1;

public class TestNameable {

    public static void main(String[] args) {
        Nameable item1 = new Planet("dwarf planet", "Pluto");
        Nameable item2 = new Car(20000000,"Volkswagen Golf Beetle");
        Nameable item3 = new Animal("Mammalia", "Baleonoptera musculus");

        System.out.println("Planet: " + '\t' + item1.getName() + '\n');
        System.out.println("Car: " + '\t' + item2.getName() + '\n');
        System.out.println("Animal: " + '\t' + item3.getName() + '\n');
    }
}
