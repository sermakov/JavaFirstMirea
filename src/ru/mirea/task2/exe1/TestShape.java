package ru.mirea.task2.exe1;

public class TestShape {
    public static void main(String[] args){
        Shape shape = new Shape(40, "circle");
        System.out.println(shape);
        shape.setSize(60);
        System.out.println("size " + shape.getSize() + " " + shape.getShape());
        shape.setShape("square");
        System.out.println("size " + shape.getSize() + " " + shape.getShape());
    }
}
