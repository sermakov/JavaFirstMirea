package ru.mirea.task3.Circle;

public class TestCircle {
    public static void main(String[] args) {
        Circle c1 = new Circle(3, 18.84);
        Circle c2 = new Circle(6);
        Circle c3 = new Circle();
        c3.displayInfo();
        c3.setRadiusLength(4);
        c3.displayInfo();
        c3.Length();
        c1.displayInfo();
        c2.displayInfo();
        c3.displayInfo();
    }
}
