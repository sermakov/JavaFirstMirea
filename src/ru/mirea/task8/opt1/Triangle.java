package ru.mirea.task8.opt1;

import java.awt.*;
public class Triangle extends Fig
{
    protected void paintShape(Graphics g) {
        int r = (int) (Math.random() * 255);
        int gr = (int) (Math.random() * 255);
        int b = (int) (Math.random() * 255);
        g.setColor(new Color(r,gr,b));
        g.drawLine(5, getHeight() - 10, getWidth() / 2 - 5, 5);
        g.drawLine(getWidth() / 2 - 5, 5, getWidth() - 10, getHeight() - 10);
        g.drawLine(getWidth() - 10, getHeight() - 10, 5, getHeight() - 10);


    }
}
