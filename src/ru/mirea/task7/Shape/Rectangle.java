package ru.mirea.task7.Shape;

class Rectangle extends Shape {
    protected double Width;
    protected  double Length;
    public Rectangle () {
        Color = "Yellow";
        Filled = false;
        Width = 3.4;
        Length = 2;
    }
    public Rectangle (double width, double length) {
        Color = "Blue";
        Filled = false;
        Width = width;
        Length = length;
    }
    public Rectangle (String color, boolean filled, double width, double length) {
        super(color, filled);
        Width = width;
        Length = length;
    }
    public void setLength (double length) {
        Length = length;
    }
    public void setWidth (double width) {
        Width = width;
    }
    public double getWidth () {
        return Width;
    }
    public double getLength () {
        return Length;
    }
    public double getArea () {
        return Length*Width;
    }
    public double detPerimeter () {
        return 2*(Width+Length);
    }
    public String toString () {
        return "Shape: circle, color: " + Color + ", width: " + Width + ", length: " + Length;
    }
}
