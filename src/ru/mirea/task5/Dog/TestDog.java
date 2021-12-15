package ru.mirea.task5.Dog;

public class TestDog {
    public static void main(String[] args) {
        Mops d1 = new Mops("Chapa", 6, "man",  2);
        BorderCollie d2 = new BorderCollie("Lyla", 4,"woman", "thoroughbred");
        d1.displayInfo();
        d2.displayInfo();
    }}
