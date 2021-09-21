package ru.mirea.task7.opt1;
import java.lang.*;
public  class Circle extends Shape {
    protected double radius;
    public Circle(){
        super();
        this.radius=1;
        this.color="Blue";
        this.filled=false;
    }
    public Circle(double radius){
        super();
        this.radius= radius;
        this.color="Blue";
        this.filled=false;
    }
    public Circle (double radius, String color, Boolean filled){
        super();
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
