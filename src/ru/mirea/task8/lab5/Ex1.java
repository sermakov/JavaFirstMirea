package ru.mirea.task8.lab5;


import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Ex1 {
    private static final short WIDTH = 500;
    private static final short HEIGHT = 500;
    public static void run() {
        JFrame frame = new JFrame();
        frame.add(new ShapesPanel(WIDTH, HEIGHT));
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setSize(500, 500);
        frame.setVisible(true);
    }
}

abstract class Shape {
    protected final double x;
    protected final double y;
    protected final Color color;

    public Shape(double x, double y, Color color) {
        this.x = x;
        this.y = y;
        this.color = color;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public Color getColor() {
        return color;
    }

    abstract void draw(Graphics graphics);
}

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

class Square extends Shape {

    private final double sideLength;

    public Square(double x, double y, Color color, double sideLength) {
        super(x, y, color);
        this.sideLength = sideLength;
    }

    public double getSideLength() {
        return sideLength;
    }

    @Override
    void draw(Graphics graphics) {
        Graphics2D graphics2D = (Graphics2D) graphics;
        Rectangle2D.Double rectangle = new Rectangle2D.Double(x, y, sideLength, sideLength);
        graphics2D.setColor(color);
        graphics2D.fill(rectangle);
    }
}

class ShapesPanel extends JPanel {
    private static final byte NUMBER_OF_SHAPES = 20;
    private static final short MAX_COLOR = 255;
    private static final byte FIGURE_SIZE = 50;

    private final List<Object> shapes = new ArrayList<>();
    private final Random random = new Random();
    private final short maxX;
    private final short maxY;

    public ShapesPanel(short maxX, short maxY) {
        this.maxX = maxX;
        this.maxY = maxY;

        for (int i = 0; i < NUMBER_OF_SHAPES; ++i) {
            if (i % 2 == 0) {
                addSquare();
            } else {
                addCircle();
            }
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        for (Object obj: shapes) {
            if (obj instanceof Square) {
                ((Square) obj).draw(g);
            } else if (obj instanceof Circle) {
                ((Circle) obj).draw(g);
            }
        }
    }

    private void addSquare() {
        Color randomColor = new Color(random.nextInt(MAX_COLOR), random.nextInt(MAX_COLOR), random.nextInt(MAX_COLOR));
        shapes.add(new Square(
                random.nextInt(maxX - 2 * FIGURE_SIZE) + FIGURE_SIZE,
                random.nextInt(maxY - 2 * FIGURE_SIZE) + FIGURE_SIZE,
                randomColor,
                FIGURE_SIZE));
    }

    private void addCircle() {
        Color randomColor = new Color(random.nextInt(MAX_COLOR), random.nextInt(MAX_COLOR), random.nextInt(MAX_COLOR));
        shapes.add(new Circle(
                random.nextInt(maxX - 2 * FIGURE_SIZE) + FIGURE_SIZE,
                random.nextInt(maxY - 2 * FIGURE_SIZE) + FIGURE_SIZE,
                randomColor,
                FIGURE_SIZE));
    }
}