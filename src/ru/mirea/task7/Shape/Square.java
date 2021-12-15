package ru.mirea.task7.Shape;

class Square extends Rectangle {
    public Square () {
        Color = "Yellow";
        Filled = false;
        Width = 2;
    }
    public Square (double side) {
        Color = "Blue";
        Filled = false;
        Width = side;
    }
    public Square (String color, boolean filled, double side) {
        Color = color;
        Filled = filled;
        Width = side;
    }
    public void setSide (double side) {
        Width = side;
    }
    public double getSide () {
        return Width;
    }
    public double getArea () {
        return Width*Width;
    }
    public double detPerimeter () {
        return 4*Width;
    }
    public String toString () {
        return "Shape: circle, color: " + Color + ", filled: " + Filled + ", side: " + Width;
    }
}
