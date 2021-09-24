package ru.mirea.task6.lab4;

import javax.naming.Name;

public class Lab4 {
    public static void main(String[] args) {
        test();
    }
    public static void test() {
        class T1 implements Nameable {

            @Override
            public String getName() {
                return "Лошадь";
            }
        }
        class T2 implements Priceable {

            @Override
            public int getPrice() {
                return 50;
            }
        }
        T1 t1 = new T1();
        T2 t2 = new T2();
        System.out.println(t1.getName());
        System.out.println(t2.getPrice());
    }

}

interface Nameable {
    public String getName();
}

interface Priceable {
    public int getPrice();
}