package ru.mirea.task8.exe3;

import javafx.scene.paint.Color;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Shape;
import javafx.scene.transform.Rotate;
import ru.mirea.task8.exe1.Shape2d;

public class Triangle2d extends Shape2d {
    Triangle2d(int baseX, int baseY, int size, int strokeWidth, Color borderColor, Color fillColor){
        this.baseX = baseX;
        this.baseY = baseY;
        this.size = size;
        this.strokeWidth = strokeWidth;
        this.borderColor = borderColor;
        this.fillColor = fillColor;
    }

    @Override
    public Shape getFxShape() {
        Polygon triangle = new Polygon();
        triangle.getPoints().addAll(new Double[] {
                (double) baseX - size, (double) baseY,
                (double) baseX + size / 2, (double) baseY - ( size * Math.sqrt(3) / 2),
                (double) baseX + size / 2, (double) baseY + ( size * Math.sqrt(3) / 2),
        });
        triangle.setStroke(borderColor); // цвет контура
        triangle.setStrokeWidth(strokeWidth); // Контур, толщина 5
        triangle.setFill(fillColor);
        //triangle.getTransforms().add(new Rotate(-30, baseX, baseY));
        return triangle;
    }
}
