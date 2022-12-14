package ru.mirea.task5.exe1;

public abstract class Dish {

    private double dishWeight;
    private String dishShape;
    private String colour;



    public abstract double getDishWeight();
    public abstract String getDishShape();
    public abstract void setDishShape(String dishShape);
    public abstract void setDishWeight(double dishWeight);

}
