package ru.mirea.task11.lab6;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;

public class SecondApp {

    private static final int STANDARD_WIDTH = 300;
    private static final int STANDARD_HEIGHT = 300;

    private static final JPanel centerPanel = new JPanel();
    private static final JPanel northPanel = new JPanel();
    private static final JPanel southPanel = new JPanel();
    private static final JPanel westPanel = new JPanel();
    private static final JPanel eastPanel = new JPanel();

    public static void run() {
        JFrame frame = new JFrame("Border Layout App");
        JPanel panel = new JPanel(new BorderLayout());

        initialisePanels();

        panel.add(centerPanel, BorderLayout.CENTER);
        panel.add(northPanel, BorderLayout.NORTH);
        panel.add(southPanel, BorderLayout.SOUTH);
        panel.add(westPanel, BorderLayout.WEST);
        panel.add(eastPanel, BorderLayout.EAST);


        frame.add(panel);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    private static void initialisePanels() {
        setMouseListener(centerPanel, "CENTER");
        setMouseListener(northPanel, "NORTH");
        setMouseListener(southPanel, "SOUTH");
        setMouseListener(westPanel, "WEST");
        setMouseListener(eastPanel, "EAST");

        centerPanel.setPreferredSize(new Dimension(STANDARD_WIDTH, STANDARD_HEIGHT));
        northPanel.setPreferredSize(new Dimension(STANDARD_WIDTH, STANDARD_HEIGHT / 2));
        southPanel.setPreferredSize(new Dimension(STANDARD_WIDTH, STANDARD_HEIGHT / 2));
        westPanel.setPreferredSize(new Dimension(STANDARD_WIDTH / 2, STANDARD_HEIGHT));
        eastPanel.setPreferredSize(new Dimension(STANDARD_WIDTH / 2, STANDARD_HEIGHT));

        centerPanel.setBackground(Color.CYAN);
        northPanel.setBackground(Color.BLUE);
        southPanel.setBackground(Color.YELLOW);
        westPanel.setBackground(Color.GREEN);
        eastPanel.setBackground(Color.ORANGE);
    }

    private static void setMouseListener(JPanel panel, String text) {
        panel.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent mouseEvent) {
            }

            @Override
            public void mousePressed(MouseEvent mouseEvent) {
            }

            @Override
            public void mouseReleased(MouseEvent mouseEvent) {
            }

            @Override
            public void mouseEntered(MouseEvent mouseEvent) {
                JOptionPane.showMessageDialog(panel, "Добро пожаловать в " + text);
            }

            @Override
            public void mouseExited(MouseEvent mouseEvent) {
            }
        });
    }
}
