package ru.mirea.task8.exe1;

import javafx.scene.paint.Color;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Shape;
import javafx.scene.transform.Rotate;

public class Square2d extends Shape2d {
    Square2d(int baseX, int baseY, int size, int strokeWidth, Color borderColor, Color fillColor){
        this.baseX = baseX;
        this.baseY = baseY;
        this.size = size;
        this.borderColor = borderColor;
        this.fillColor = fillColor;
        this.strokeWidth = strokeWidth;
    }

    @Override
    public Shape getFxShape() {
        Polygon square = new Polygon();
        square.getPoints().addAll(new Double[] {
                (double) baseX - size, (double) baseY,
                (double) baseX,(double)  baseY - size,
                (double) baseX + size, (double) baseY, //-
                (double) baseX, (double) baseY  + size
        });
        square.setStroke(borderColor); // цвет контура
        square.setStrokeWidth(strokeWidth); // Контур, толщина 5
        square.setFill(fillColor); // Заливка - прозрачная
        square.getTransforms().add(new Rotate(45, baseX, baseY));
        return square;
    }
}
