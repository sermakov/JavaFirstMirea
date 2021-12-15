package ru.mirea.task8.exe1;

import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Shape;
import javafx.stage.Stage;

public class Circle2d extends Shape2d {
    Circle2d(int baseX, int baseY, int size, int strokeWidth, Color borderColor, Color fillColor){
        this.baseX = baseX;
        this.baseY = baseY;
        this.size = size;
        this.borderColor = borderColor;
        this.fillColor = fillColor;
        this.strokeWidth = strokeWidth;
    }

    @Override
    public Shape getFxShape() {
        Circle circle = new Circle();
        circle.setCenterX(baseX);
        circle.setCenterY(baseY);
        circle.setRadius(size);
        circle.setStroke(borderColor); // цвет контура
        circle.setStrokeWidth(strokeWidth); // Контур, толщина 5
        circle.setFill(fillColor); // Заливка - прозрачная
        return circle;
    }
}
