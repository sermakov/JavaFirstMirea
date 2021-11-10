package ru.mirea.task5;

public class Square extends Rectangle
{

    public Square(){}

    public Square(double side)
    {
        this.width = side;
        this.length = side;
    }

    public Square(double side, String color,boolean filled)
    {
        this.width = side;
        this.length = side;
        this.color = color;
        this.filled = filled;
    }

    public double getSide()
    {
        return width;
    }

    public void setSide(double side)
    {
        setWidth(side);
        setLength(side);
    }

    @Override
    public void setWidth(double side)
    {
        super.setWidth(side);
    }

    @Override
    public void setLength(double side)
    {
        super.setLength(side);
    }

    @Override
    public String toString()
    {
        return "Площадь квадрата равна: " + getArea() + "\nПериметр квадрата равен: " + getPerimeter() + "\nЦвет квадрата:" + getColor() + "\nЗаполненость квадрата:" + isFilled();
    }
}
