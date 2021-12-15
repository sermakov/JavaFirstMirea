package ru.mirea.task11;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Areas extends JFrame {
    JLabel north = new JLabel("На север");
    JLabel west = new JLabel("На запад");
    JLabel center = new JLabel("На центр");
    JLabel east = new JLabel("Нв восток");
    JLabel south = new JLabel("На юг");
    Areas() {
        super("Куда пойдешь?");
        Container container = getContentPane();
        setLayout(new BorderLayout());
        setSize(200, 200);
        north.setHorizontalAlignment(JLabel.CENTER);
        north.setBorder(BorderFactory.createLineBorder(Color.black));
        north.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                JOptionPane.showMessageDialog(north, "Точно нет");
            }
            @Override
            public void mousePressed(MouseEvent e) {}
            @Override
            public void mouseReleased(MouseEvent e) {}
            @Override
            public void mouseExited(MouseEvent e) {}
            public void mouseEntered(MouseEvent e) {
                JOptionPane.showMessageDialog(north, "К пингвинам попадешь. Или нет...");
            }
        });
        west.setHorizontalAlignment(JLabel.CENTER);
        west.setBorder(BorderFactory.createLineBorder(Color.black));
        west.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                JOptionPane.showMessageDialog(west, "Оно тебе надо?");
            }
            @Override
            public void mousePressed(MouseEvent e) {}
            @Override
            public void mouseReleased(MouseEvent e) {}
            @Override
            public void mouseExited(MouseEvent e) {}
            public void mouseEntered(MouseEvent e) {
                JOptionPane.showMessageDialog(west, "На толерантность наткнешься");
            }
        });
        center.setHorizontalAlignment(JLabel.CENTER);
        center.setBorder(BorderFactory.createLineBorder(Color.black));
        center.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {}
            @Override
            public void mousePressed(MouseEvent e) {}
            @Override
            public void mouseReleased(MouseEvent e) {}
            @Override
            public void mouseExited(MouseEvent e) {}
            public void mouseEntered(MouseEvent e) {
                JOptionPane.showMessageDialog(center, "Ну иди в свой ТЦ");
            }
        });
        east.setHorizontalAlignment(JLabel.CENTER);
        east.setBorder(BorderFactory.createLineBorder(Color.black));
        east.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {}
            @Override
            public void mousePressed(MouseEvent e) {}
            @Override
            public void mouseReleased(MouseEvent e) {}
            @Override
            public void mouseExited(MouseEvent e) {}
            public void mouseEntered(MouseEvent e) {
                JOptionPane.showMessageDialog(east, "Там сложно с личным пространством");
            }
        });
        south.setHorizontalAlignment(JLabel.CENTER);
        south.setBorder(BorderFactory.createLineBorder(Color.black));
        south.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {}
            @Override
            public void mousePressed(MouseEvent e) {}
            @Override
            public void mouseReleased(MouseEvent e) {}
            @Override
            public void mouseExited(MouseEvent e) {}
            public void mouseEntered(MouseEvent e) {
                JOptionPane.showMessageDialog(south, "Вот тут можно таки дойти до пингвинов");
            }
        });
        container.add(north, BorderLayout.NORTH);
        container.add(east, BorderLayout.EAST);
        container.add(south, BorderLayout.SOUTH);
        container.add(west, BorderLayout.WEST);
        container.add(center);
        setVisible(true);
    }
    public static void main(String[] args) {
        new Areas();
    }
}
