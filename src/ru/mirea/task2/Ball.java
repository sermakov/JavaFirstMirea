package ru.mirea.task2;
import java.lang.*;
public class Ball {
    private String name;
    private int radius;
    public Ball(String name, int radius){
        this.name = name;
        this.radius =radius;
    }
    public void setname(String name) {
        this.name = name;
    }
    public void setRadius(int radius) {
        this.radius =radius;
    }
    public String getname(){
        return name;
    }
    public int getRadius() {
        return radius;
    }
    public String toString(){
        return "name: "+this.name+"Radius: "+this.radius;
    }
}
