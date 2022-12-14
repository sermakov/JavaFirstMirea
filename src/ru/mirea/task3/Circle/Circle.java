package ru.mirea.task3.Circle;

public class Circle {
    private int radius;
    private double length;
    public Circle (int r, double l) {
        radius = r;
        length = l;
    }
    public Circle (int r) {
        radius = r;
        length = 6.28*r;
    }
    public Circle () {
        radius = 0;
        length = 0;
    }
    public void setRadiusLength(int radius) {
        this.radius = radius;
        this.length = 6.28*radius;
    }
    public void Length() {
        this.length = 6.28*radius;
    }
    public int getRadius() {
        return radius;
    }
    public double getLength() {
        return length;
    }
    public void displayInfo() {
        System.out.println("Окружность радиусом R=" + radius + " имеет длину: " + length);
    }
}
