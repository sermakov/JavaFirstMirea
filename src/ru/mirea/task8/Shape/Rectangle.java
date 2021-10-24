package ru.mirea.task8.Shape;
import java.awt.*;
import java.awt.geom.Rectangle2D;

class Rectangle extends Shape {
    protected final double width;
    protected final double length;

    public Rectangle( double x, double y, Color color, double width, double length){
        super(x, y, color);
        this.width = width;
        this.length = length;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    @Override
    void draw(Graphics g) {
        Graphics2D graphics2D = (Graphics2D)  g;
        Rectangle2D.Double rec = new Rectangle2D.Double(x, y, length, width);
        graphics2D.setColor(color);
        graphics2D.fill(rec);
    }
}
