package ru.mirea.task26;

public class Main {
    public static void main(String[] args) {
        A100 A100 = new A100();
        RTX2080 RTX2080 = new RTX2080();
        RTX3090 RTX3090 = new RTX3090();

        A100.turnOn();
        A100.hash();
        RTX2080.turnOn();
        RTX2080.hash();
        RTX3090.turnOff();
    }
}
