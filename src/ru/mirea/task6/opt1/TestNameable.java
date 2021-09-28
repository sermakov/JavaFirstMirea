package ru.mirea.task6.opt1;

import java.lang.*;
public class TestNameable {
    public static void main(String[] args){
        read(new Planet("Earth"));
        read(new Car("GAC"));
        read(new Animal("Dog"));
    }
    static void read (Nameable n){
        n.getName();
    }
}
