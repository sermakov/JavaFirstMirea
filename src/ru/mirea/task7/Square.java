package ru.mirea.task7;

import java.lang.*;
public abstract class Square extends Shape {
    protected double side;
    public void Square(){};
    public void Rectangle (double side){
        this.side = side;
    }
    public void Square(double side, String color, boolean filled) {
        this.side = side;
        this.color = color;
        this.filled = filled;
    }

    public double getSide(){return this.side;}
    public void setSide(double side){this.side = side;}
    public void setWidth(double side){this.side = side;}
    public void setLength(double side){this.side = side;}
    public String toString(){return "This" +this.color +" Square with side:"+this.side+ " length="+this.side + " and width "+this.side;}
}
