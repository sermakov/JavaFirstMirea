package ru.mirea.task7.exe1;

public class Circle extends Shape{
    protected double radius;

    Circle(){
        this.radius = 0;
        this.color = "";
        this.filled = false;
    }

    public Circle(double radius) {
        this.radius = radius;
        this.color = "";
        this.filled = true;
    }

    public Circle(double radius, String color, boolean filled){
        this.radius = radius;
        this.color = color;
        this.filled = filled;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return radius * radius * Math.atan(1) * 4;
    }

    @Override
    public double getPerimeter() {
        return 2 * radius * Math.atan(1) * 4;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
}
