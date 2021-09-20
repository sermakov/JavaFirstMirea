package ru.mirea.task5.exe1;

public class Jug extends Dish
{
    private double dishWeight;
    private  String dishShape;
    private String colour;

    Jug(double dishWeight, String dishShape, String colour)
    {
        this.dishWeight = dishWeight;
        this.dishShape = dishShape;
        this.colour = colour;
    }

    public void setColour(String colour){
        this.colour = colour;
    }

    @Override
    public void setDishShape(String dishShape){
        this.dishShape = dishShape;
    }
    @Override
    public void setDishWeight(double dishWeight){
        this.dishWeight = dishWeight;
    }
    @Override
    public String getDishShape() { return dishShape;}
    @Override
    public double getDishWeight() {return dishWeight;}
    public String DishColour() { return colour;}
}
