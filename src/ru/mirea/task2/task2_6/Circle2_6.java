package ru.mirea.task2.task2_6;

public class Circle2_6 implements Comparable<Circle2_6> {

    private static final double PI = 3.14;
    private double radius;
    private String color;

    public Circle2_6(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getLength() {
        return 2 * PI * this.radius;
    }

    public double getArea() {
        return PI * this.radius * this.radius;
    }

    public int compareTo(Circle2_6 obj) {
        return Double.compare(this.radius, obj.getRadius());
    }

    public String toString() {
        return "Circle {" + "radius = " + radius + ", color = '" + color + '\'' + '}';
    }
}
