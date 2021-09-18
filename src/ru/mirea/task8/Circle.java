package ru.mirea.task8;

import java.awt.*;
public class Circle extends Fig
{
    protected void paintShape(Graphics g) {
        int r = (int) (Math.random() * 255);
        int gr = (int) (Math.random() * 255);
        int b = (int) (Math.random() * 255);
        g.setColor(new Color(r,gr,b));
        g.drawOval(5, 5, getWidth() - 10, getHeight() - 10);
        g.setColor(Color.green);
    }
}
