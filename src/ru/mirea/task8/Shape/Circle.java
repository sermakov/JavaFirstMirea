package ru.mirea.task8.Shape;
import java.awt.*;
import java.awt.geom.Ellipse2D;

class Circle extends Shape {
    private final double radius;

    public Circle(double x, double y, Color color, double radius) {
        super(x, y, color);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    void draw(Graphics graphics) {
        Graphics2D graphics2D = (Graphics2D) graphics;
        Ellipse2D.Double circle = new Ellipse2D.Double(x, y, radius, radius);
        graphics2D.setColor(color);
        graphics2D.fill(circle);
    }
}