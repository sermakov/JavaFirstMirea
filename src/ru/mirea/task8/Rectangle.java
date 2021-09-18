package ru.mirea.task8;

import java.awt.*;

public class Rectangle extends Fig
{
    protected void paintShape(Graphics g) {
        int r = (int) (Math.random() * 255);
        int gr = (int) (Math.random() * 255);
        int b = (int) (Math.random() * 255);
        g.setColor(new Color(r,gr,b));
        g.drawRect(5, 5, getWidth() - 10, getHeight() - 10);
    }
}
