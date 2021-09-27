package ru.mirea.task3.op2;

public class Head extends Human{
    int radius;
    boolean bald;
    public Head(int age, String name, char gend, int radius, boolean bald) {
        super(age, name, gend);
        this.radius = radius;
        this.bald = bald;
    }
    public String toString(){
        return this.age+", name :"+this.name+" gender "+this.gend;
    }
}
