package ru.mirea.task2.exe2;

public class Ball {
    private String shape;
    private double size;
    private String color;

    Ball(double size, String shape, String color){
        this.shape = shape;
        this.size = size;
        this.color = color;
    }

    public String getColor(){
        return color;
    }

    public void setColor(String color){
        this.color = color;
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
        return "size: " + size  + " shape: " + shape + " color: " + color;
    }
}
