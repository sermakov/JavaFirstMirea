package ru.mirea.task7;

public class Rectangle extends Shape
{
    protected double width;
    protected double length;

    public Rectangle(){}

    public Rectangle(double width, double length)
    {
        this.width = width;
        this.length = length;
    }

    public Rectangle(double width, double length, String color, boolean filled)
    {
        this.width = width;
        this.length = length;
        this.color = color;
        this.filled = filled;
    }

    public double getWidth()
    {
        return width;
    }

    public void setWidth(double width)
    {
        this.width = width;
    }

    public double getLength()
    {
        return length;
    }

    public void setLength(double length)
    {
        this.length = length;
    }

    @Override
    public double getArea()
    {
        return (width * length);
    }

    @Override
    public double getPerimeter()
    {
        return width + length;
    }

    @Override
    public String toString()
    {
        return "Площадь прямоугольника равна: " + getArea() + "\nПериметр прямоугольника равен: " + getPerimeter() + "\nЦвет прямоугольника:" + getColor() + "\nЗаполненость прямоугольника:" + isFilled();
    }
}
