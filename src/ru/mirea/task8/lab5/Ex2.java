package ru.mirea.task8.lab5;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;

public class Ex2 {
    static BufferedImage image;

    public static void run(String[] args) {
        JFrame frame = new JFrame("Image app");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        try {
            File f = new File("src/ru/mirea/task8/lab5/"+args[0]);
            image = ImageIO.read(f);
        } catch (Exception e) {
            System.out.println("Bad file");
            return;
        }

        JPanel panel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.drawImage(image, 0, 0, this);
            }

            @Override
            public Dimension getPreferredSize() {
                return new Dimension(image.getWidth(), image.getHeight());
            }
        };
        frame.add(panel, BorderLayout.CENTER);

        frame.pack();
        frame.setVisible(true);
    }
}
