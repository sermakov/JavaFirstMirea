package ru.mirea.task2.exe1;

public class TestShape {
    public static void main(String[] args){
        Shape shape = new Shape(40, "circle");
        System.out.println(shape.toString());
        shape.setSize(60);
        shape.setShape("square");
        System.out.println("\n" + "size " + shape.getSize() + " " + shape.getShape());
    }
}
