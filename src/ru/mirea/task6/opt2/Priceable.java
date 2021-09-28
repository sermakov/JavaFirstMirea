package ru.mirea.task6.opt2;

import java.lang.*;
public interface Priceable {
    void getPrice();
}
class Car implements Priceable {
    private int price;
    Car(int price) {
        this.price = price;
    }
    public void getPrice(){
        System.out.printf("Класс машина, Цена объекта $: %s\n",price);
    }
}

class Dog implements Priceable{
    private int price;
    Dog(int price) {
        this.price = price;
    }
    public void getPrice(){
        System.out.printf("Класс собака, Цена объекта $: %s\n",price);
    }
}

class PC implements Priceable{
    private int price;
    PC(int price) {
        this.price = price;
    }
    public void getPrice(){
        System.out.printf("Класс компьютер, Цена объекта $: %s\n",price);
    }
}
