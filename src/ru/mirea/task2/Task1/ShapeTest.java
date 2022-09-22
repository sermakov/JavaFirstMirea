package ru.mirea.task2.Task1;

import ru.mirea.task2.Task1.Shape;

public class ShapeTest {
    public static void main(String []args) {

        Shape shape = new Shape("Cube");
        System.out.println(shape.toString());

        shape.setShapeName("Sphere");
        System.out.println(shape.toString());
    }
}