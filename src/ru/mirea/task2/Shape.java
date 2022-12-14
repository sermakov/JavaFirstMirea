package ru.mirea.task2;
public class Shape
{
    double width = 2;
    double length = 5;

    @Override
    public String toString() {
        return "Shape: \n" +
                "width=" + width +
                "\nlength=" + length;
    }
}
