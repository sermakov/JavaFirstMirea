package ru.mirea.task3.op2;

public class Hand extends Human {
    int length;
    boolean exist;
    public Hand(int age, String name, char gend, int length, boolean exist){
        super(age, name, gend);
        this.length=length;
        this.exist=exist;
    }
    public String toString(){
        return "Length of hand "+this.length+" exist? "+this.exist;
    }
}
