package ru.mirea.task8.Shape;
import java.awt.*;

public abstract class Shape {
    protected final Color color;
    protected final double x, y;

    public Shape(double x, double y, Color color){
        this.x = x;
        this.y = y;
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public double getY() {
        return y;
    }

    public double getX() {
        return x;
    }
    abstract void draw(Graphics g);
}
