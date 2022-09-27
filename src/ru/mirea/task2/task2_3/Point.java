package ru.mirea.task2.task2_3;

//        Создать класс точка Point, описывающий точку на плоскости. Создать
//        Circle класс, в котором одно поле представляет точку – центр окружности, и
//        добавить другие свойства, позволяющие задать точку на плоскости. Создать
//        третий класс Tester который использует для хранения объектов массив объектов
//        Circle и второе поле количество элементов в массиве.

public class Point {
    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
}


