package ru.mirea.task8.Shape;
import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class TestShape {
    private static final int width = 200;
    private static final int height = 200;
    public static void main(String[]args) {
        JFrame frame = new JFrame("Shapes");
        frame.add(new Panel(width, height));
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setSize(1000, 500);
        frame.setVisible(true);
    }
}
