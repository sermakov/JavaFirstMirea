package ru.mirea.task7.opt1;

import java.lang.*;
public class Square extends Rectangle {
    protected double side;
    public Square(){
        super();
        this.side=1;
        this.color="Blue";
        this.filled=false;
    };
    public Square (double side){
        super();
        this.color="Blue";
        this.filled=false;
        this.side = side;
    }
    public Square(double side, String color, boolean filled) {
        super();
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
