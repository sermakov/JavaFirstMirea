package ru.mirea.task8.exe1;

import javafx.application.Application;
import javafx.scene.shape.Shape;
import javafx.scene.paint.Color;


public abstract class Shape2d {
    protected int baseX;
    protected int baseY;
    protected Color borderColor;
    protected Color fillColor;
    protected int size;
    protected int strokeWidth;

    public abstract Shape getFxShape();
}
