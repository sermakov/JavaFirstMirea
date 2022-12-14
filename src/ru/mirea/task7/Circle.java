package ru.mirea.task7;

public class Circle extends Shape
{
    protected double radius;
    public Circle(){}

    public Circle (double radius)
    {
        this.radius = radius;
    }

    public Circle (double radius, String color, boolean filled)
    {
        this.radius = radius;
        this.color = color;
        this.filled = filled;
    }

    public double getRadius()
    {
        return radius;
    }

    public void setRadius(double radius)
    {
        this.radius = radius;
    }

    public double getArea()
    {
        return Math.PI * radius * radius;
    }

    public double getPerimeter()
    {
        return 2 * Math.PI *radius;
    }

    @Override
    public String toString()
    {
        return "Площадь круга равна: " + getArea() + "\nПериметр круга равен: " + getPerimeter() + "\nЦвет круга:" + getColor() + "\nЗаполненость круга:" + isFilled();
    }
}
