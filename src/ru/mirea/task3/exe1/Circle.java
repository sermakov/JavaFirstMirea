package ru.mirea.task3.exe1;

public class Circle {
    private double rad;
    private double square;
    private double length;

    Circle(double rad){
        this.rad = rad;
    }

    public double getRad(){
        return rad;
    }

    public double getSquare(){
        return square;
    }

    public void setRad(double rad){
        this.rad = rad;
    }

    public double getLength(){
        return length;
    }

    @Override
    public String toString(){
        return "Radius: " + rad + " Length: " + length + " Square: " + square;
    }

    public void calcSquare(){
        square = Math.atan(1) * 4 * rad * rad;
    }

    public void calcLength(){
        length = Math.atan(1) * 4 * rad * 2;
    }
}
