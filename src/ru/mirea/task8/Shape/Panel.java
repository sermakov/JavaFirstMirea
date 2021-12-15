package ru.mirea.task8.Shape;
import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Panel extends JPanel {
    private static final int num = 2;
    private static final int color = 255;
    private static final int size = 50;

    private final List<Object> shapes = new ArrayList<>();
    private final Random random = new Random();
    private final int maxX;
    private final int maxY;

    public Panel(int maxX, int maxY) {
        this.maxX = maxX;
        this.maxY = maxY;

        for (int i = 0; i < num; ++i) {
            int k = random.nextInt(10);
            if (k % 2 == 0) {
                addRectangle();
            } else {
                addCircle();
            }
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        for (Object obj: shapes) {
            if (obj instanceof Rectangle) {
                ((Rectangle) obj).draw(g);
            } else if (obj instanceof Circle) {
                ((Circle) obj).draw(g);
            }
        }
    }

    private void addRectangle() {
        Color randomColor = new Color(random.nextInt(color), random.nextInt(color), random.nextInt(color));
        shapes.add(new Rectangle(random.nextInt(maxX - 2 * size) + size, random.nextInt(maxX - 2 * size) + size, randomColor, size*1.5, size));
    }

    private void addCircle() {
        Color randomColor = new Color(random.nextInt(color), random.nextInt(color), random.nextInt(color));
        shapes.add(new Circle(random.nextInt(maxX - 2 * size) + size, random.nextInt(maxY - 2 * size) + size, randomColor, size));
    }
}
