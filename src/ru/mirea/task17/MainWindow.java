package ru.mirea.task17;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.*;
public class MainWindow  extends JFrame {
    public MainWindow() {
        setTitle("Snake");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(915, 740);
        setResizable(false);
        setLocationRelativeTo(null);
        add(new SnakePanel(this));
    }

    public static void main(String[] args) {
        MainWindow window = new MainWindow();
    }
}