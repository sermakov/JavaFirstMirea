package ru.mirea.task5.opt1;

import java.lang.*;
public abstract class Dish {
    private String name;

    public String getName() {return name;}
    public abstract void displayInfo();
    public Dish(String name){this.name = name;};
}

class Fork extends Dish{
    private int forkTeeth;
    public Fork(String name,int forkTeeth){
        super(name);
        this.forkTeeth=forkTeeth;
    }
    public void displayInfo(){
        System.out.println("Fork "+super.getName()+" here! I've " +forkTeeth+ " Teeth");
    }
}

class Cup extends Dish{
    private int depth;
    public Cup(String name,int depth){
        super(name);
        this.depth=depth;
    }
    public void displayInfo(){
        System.out.println("Cup "+super.getName()+" here! I'm " +depth+ " depth");
    }
}

class Plate extends Dish {
    private int diameter;
    String color;

    public Plate(String name, int diameter, String color) {
        super(name);
        this.diameter = diameter;
        this.color = color;
    }

    public void displayInfo() {
        System.out.println("Plate "+super.getName()+" here! I'm " + color + " color and " + diameter + " diameter");
    }
}

