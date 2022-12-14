package ru.mirea.task2.exe4;

public class Dog {
    private String name;
    private int years;

    Dog(String name, int years){
        this.name = name;
        this.years = years;
    }

    public int getYears(){
        return years;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setYears(int years){
        this.years = years;
    }

    @Override
    public String toString(){
        return "years: " + years + " name: " + name;
    }

    public int ConvertYears(){
        return years * 7;
    }
}
