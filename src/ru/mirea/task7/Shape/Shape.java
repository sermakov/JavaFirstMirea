package ru.mirea.task7.Shape;

public abstract class Shape {
    protected String Color;
    protected boolean Filled;
    public Shape () {
        Color = "Green";
        Filled = true;
    }
    public Shape (String color, boolean filled) {
        Color = color;
        Filled = filled;
    }
    public void setColor (String color) {
        Color = color;
    }
    public void setFilled (boolean filled) {
        Filled = filled;
    }
    public boolean isFilled () {
        return Filled;
    }
    public String getColor () {
        return Color;
    }
    public abstract double getArea ();
    public abstract double detPerimeter ();
    public abstract String toString ();
}
