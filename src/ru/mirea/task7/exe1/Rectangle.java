package ru.mirea.task7.exe1;

public class Rectangle extends Shape{
    protected double width;
    protected double length;

    Rectangle(){
        this.width = 0;
        this.length = 0;
        this.color = "";
        this.filled = false;
    }

    Rectangle(double width, double length){
        this.width = width;
        this.length = length;
        this.color = "";
        this.filled = true;
    }

    Rectangle(double width, double length, String color, boolean filled){
        this.width  = width;
        this.length = length;
        this.color = color;
        this.filled = filled;
    }

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public double getArea() {
        return length * width;
    }

    @Override
    public double getPerimeter() {
        return 2 * length + width * 2;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", length=" + length +
                "}";
    }
}
