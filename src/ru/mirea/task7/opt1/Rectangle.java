package ru.mirea.task7.opt1;

import java.lang.*;
public class Rectangle extends Shape {
    protected double width;
    protected double length;
    public Rectangle(){
        super();
        this.width=1;
        this.length=1;
        this.color="Blue";
        this.filled=false;
    };
    public Rectangle(double width, double length) {
        super();
        this.color="Blue";
        this.filled=false;
        this.width = width;
        this.length = length;
    }
    public Rectangle (double width, double length,String color, Boolean filled){
        super();
        this.width = width;
        this.color = color;
        this.filled = filled;
        this.length = length;
    }
    public double getWidth(){return this.width;}
    public void setWidth(double width){this.width = width;}
    public double getLength(){return this.length;}
    public void setLength(double length){this.width = length;}
    public double getArea(){return width*length;}
    public double getPerimeter(){return 2*width*2*length;}
    public String toString(){return "This" +this.color +" Rectangle with width:"+this.width+ " and length="+this.length+" Area="+this.getArea()+" and Perimeter = "+getPerimeter();}
}
