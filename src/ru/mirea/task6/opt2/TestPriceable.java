package ru.mirea.task6.opt2;
import java.lang.*;
public class TestPriceable {
        public static void main(String[] args){
            read(new Car(10000));
            read(new Dog(300));
            read(new PC(1000));
        }
        static void read (Priceable n){
            n.getPrice();
        }
    }
