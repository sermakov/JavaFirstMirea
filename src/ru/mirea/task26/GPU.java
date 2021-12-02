package ru.mirea.task26;

public class GPU {
    HashrateStrategy hashrateStrategy;

    public void turnOff() {
        System.out.println("Майнинг выключен");
    }

    public void turnOn() {
        System.out.println("Копаем монетки!");
    }

    public void hash() {
        hashrateStrategy.hashrate();
    }
}
