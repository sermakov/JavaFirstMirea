package ru.mirea.task2.Task1;

public class Shape {
    private String shapeName = "Shape";

    public Shape(String shapeName) {
        this.shapeName = shapeName;
    }

    public String getShapeName() {
        return shapeName;
    }

    public void setShapeName(String shapeName) {
        this.shapeName = shapeName;
    }

    public String toString() {
        return "Shape: " + getShapeName();
    }
}
