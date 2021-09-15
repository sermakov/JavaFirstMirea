package ru.mirea.task3.Dog;

public class TestDog {
    public static void main(String[] args) {
        BorderKolly bk1 = new BorderKolly("Voland", 4, "Best of the best", "thoroughbred");
        bk1.displayInfo();
        Mops m1 = new Mops("Pops", 2, "no", 2);
        m1.displayInfo();
    }
}
