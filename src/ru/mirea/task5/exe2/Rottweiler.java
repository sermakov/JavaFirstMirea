package ru.mirea.task5.exe2;

public class Rottweiler extends Dog
{
    private double weight;
    private double height;
    private String colour;

    Rottweiler(double weight, double height, String colour)
    {
        this.weight = weight;
        this.height = height;
        this.colour = colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public double getDogWeight() { return weight;}
    @Override
    public double getDogHeight() { return height;}
    public String getDogColour() { return colour;}
}
