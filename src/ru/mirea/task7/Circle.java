package ru.mirea.task7;
import java.lang.*;
public abstract class Circle extends Shape {
    protected double radius;
    public void Circle(){};
    public void Circle(double radius){this.radius= radius;}
    public void Circle (double radius, String color, Boolean filled){
        this.radius = radius;
        this.color = color;
        this.filled = filled;
    }
    public double getRadius(){return this.radius;}
    public void setRadius(double radius){this.radius = radius;}
    public double getArea(){return Math.PI*radius*radius;}
    public double getPerimeter(){return 2*Math.PI*radius;}
    public String toString(){return "This" +this.color +" circle with radius:"+this.radius+" Area="+this.getArea()+" and Perimeter = "+getPerimeter();}
}
