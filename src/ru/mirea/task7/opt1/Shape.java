package ru.mirea.task7.opt1;

public abstract class Shape {
    protected String color;
    protected Boolean filled;
    public void  Shape(){};
    public void Shape(String color, Boolean filled){
        this.color = color;
        this.filled = filled;
    }
    public void setColor(String color){this.color = color;}
    public String getColor(){return this.color;}
    public void setFilled(Boolean filled){this.filled = filled;}
    public Boolean isFilled(){return this.filled;}
    public abstract double getArea();
    public abstract double getPerimeter();
    public abstract String toString ();
}