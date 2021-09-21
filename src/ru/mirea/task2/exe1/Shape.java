package ru.mirea.task2.exe1;

public class Shape {
    private String shape;
    private double size;

    Shape(double size, String shape){
        this.shape = shape;
        this.size = size;
    }

    public double getSize(){
        return size;
    }

    public String getShape(){
        return shape;
    }

    public void setShape(String shape){
        this.shape = shape;
    }

    public void setSize(double size){
        this.size = size;
    }

    @Override
    public String toString(){
        return "size " + size  + " " + shape;
    }
}
