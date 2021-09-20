package ru.mirea.task5.exe3;


public class Chaire extends Furniture{
    private double size;
    private String name;
    private double price;
    private String sheating;

    public Chaire(double size, String name, double price, String sheating){
        this.sheating = sheating;
        this.name = name;
        this.price = price;
        this.size = size;
    }

    @Override
    public String getName(){
        return name;
    }

    @Override
    public double getPrice(){
        return price;
    }

    @Override
    public double getSize(){
        return size;
    }

    @Override
    public String toString(){
        return "name " + name + " sheating " + sheating + " size " + size + " price " + price + '\n';
    }

    @Override
    public String getSheating(){
        return sheating;
    }

    public void setSize(double size){
        this.size = size;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setPrice(double price){
        this.price = price;
    }

    public void setSheating(String sheating){
        this.sheating = sheating;
    }
}
