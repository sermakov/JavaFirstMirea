package ru.mirea.task3.op2;

public class Leg extends Human{
    int length;
    boolean exist;
    public Leg(int age, String name, char gend, int length, boolean exist) {
        super(age, name, gend);
        this.length = length;
        this.exist = exist;
    }
    public String toString(){
        return "Length of leg "+this.length+" exist? "+this.exist;
    }
}
