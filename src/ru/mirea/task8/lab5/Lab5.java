package ru.mirea.task8.lab5;

import static java.lang.Thread.sleep;

public class Lab5{
    // запуск оконного приложения
    public static void main(String[] args) throws InterruptedException {
        Ex1.run();
        sleep(10000);
        Ex2.run();
        sleep(10000);
        Ex3.run();
    }

}