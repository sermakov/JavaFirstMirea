package ru.mirea.task8.exe1;

import javafx.scene.paint.Color;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Shape;
import javafx.scene.transform.Rotate;

public class Hexagon2d extends Shape2d {
    Hexagon2d(int baseX, int baseY, int size, int strokeWidth, Color borderColor, Color fillColor){
        this.baseX = baseX;
        this.baseY = baseY;
        this.size = size;
        this.strokeWidth = strokeWidth;
        this.borderColor = borderColor;
        this.fillColor = fillColor;
    }

    @Override
    public Shape getFxShape() {
        Polygon hexagon = new Polygon();
        hexagon.getPoints().addAll(new Double[] {
                (double) baseX - size, (double) baseY,
                (double) baseX - size / 2, (double) baseY - ( size * Math.sqrt(3) / 2),
                (double) baseX + size / 2, (double) baseY - ( size * Math.sqrt(3) / 2),
                (double) baseX + size, (double) baseY,
                (double) baseX + size / 2, (double) baseY + ( size * Math.sqrt(3) / 2),
                (double) baseX - size / 2,(double)  baseY + ( size * Math.sqrt(3) / 2)
        });
        hexagon.setStroke(borderColor); // цвет контура
        hexagon.setStrokeWidth(strokeWidth); // Контур, толщина 5
        hexagon.setFill(fillColor); // Заливка - прозрачная
        hexagon.getTransforms().add(new Rotate(-30, baseX, baseY));
        return hexagon;
    }
}
