package ru.mirea.task11.opt2;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.*;
import java.awt.*;
public class MouseEntered extends JFrame{
    public MouseEntered() {
        JFrame frame = new JFrame("MouseEntered");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 350);
        frame.setResizable(false);
        Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (int) ((dimension.getWidth() - frame.getWidth()) / 2);
        int y = (int) ((dimension.getHeight() - frame.getHeight()) / 2);
        frame.setLocation(x, y);
        JLabel center = new JLabel("Center", SwingConstants.CENTER);
        JLabel north = new JLabel("North", SwingConstants.CENTER);
        JLabel south = new JLabel("South", SwingConstants.CENTER);
        JLabel east = new JLabel("East", SwingConstants.CENTER);
        JLabel west = new JLabel("West", SwingConstants.CENTER);
        frame.add(center, BorderLayout.CENTER);
        frame.add(north, BorderLayout.NORTH);
        frame.add(south, BorderLayout.SOUTH);
        frame.add(east, BorderLayout.EAST);
        frame.add(west, BorderLayout.WEST);
        frame.setVisible(true);

        center.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent evt) {
                frame.setTitle("You are in Center");
            }
        });

        north.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent evt) {
                frame.setTitle("You are in North");
            }
        });

        south.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent evt) {
                frame.setTitle("You are in South");
            }
        });

        east.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent evt) {
                frame.setTitle("You are in East");
            }
        });

        west.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent evt) {
                frame.setTitle("You are in West");
            }
        });
    }
}
