package ru.mirea.task6;

import java.lang.*;
public class TestNameable {
    public static void main(String[] args){
        read(new Planet("Luna"));
        read(new Car("ЯПОНЦЫ ДЕЛАЮТ ВЕЩИ"));
        read(new Animal("chihua-hua"));
    }
    static void read (Nameable n){
        n.getName();
    }
}
