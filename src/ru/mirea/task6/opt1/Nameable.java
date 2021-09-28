package ru.mirea.task6.opt1;

import java.lang.*;
public interface Nameable {
    void getName();
}

class Planet implements Nameable{
   private String name;
   Planet(String name) {
       this.name = name;
   }
   public void getName(){
       System.out.printf("Класс планеты, Имя объекта: %s\n",name);
   }
}

class Car implements Nameable{
    private String name;
    Car(String name) {
        this.name = name;
    }
    public void getName(){
        System.out.printf("Класс машины, Имя объекта: %s\n",name);
    }
}

class Animal implements Nameable{
    private String name;
    Animal(String name) {
        this.name = name;
    }
    public void getName(){
        System.out.printf("Класс животные, Имя объекта: %s\n",name);
    }
}