package ru.mirea.task2;

import java.lang.*;
public class Shape {
    private String color;
    private String type;
    public Shape(String color,String type){
        this.color = color;
        this.type =type;
    }
    public void setname(String name) {
        this.color = color;
    }
    public void setRadius(String type) {
        this.type =type;
    }
    public String getname(){
        return color;
    }
    public String getRadius() {
        return type;
    }
    public String toString(){
        return "Color: "+this.color+" Type: "+this.type;
    }
}
