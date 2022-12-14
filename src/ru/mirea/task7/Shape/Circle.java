package ru.mirea.task7.Shape;

class Circle extends Shape {
    private double Radius;
    public Circle () {
        Color = "Yellow";
        Filled = false;
        Radius = 2.4;
    }
    public Circle (double radius) {
        Color = "Blue";
        Filled = false;
        Radius = 4;
    }
    public Circle (String color, boolean filled, double radius) {
        super(color, filled);
        Radius = radius;
    }
    public void setRadius (double radius) {
        Radius = radius;
    }
    public double getRadius () {
        return Radius;
    }
    public double getArea () {
        return Math.PI*Radius*Radius;
    }
    public double detPerimeter () {
        return 2*Math.PI*Radius;
    }
    public String toString () {
        return "Shape: circle, color: " + Color + ", filled: " + Filled + ", radius: " + Radius;
    }
}
