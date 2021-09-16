package ru.mirea.task4.names;

public class Test {
    public static void main(String[] args) {
        Namebale g1 = new Girl("Sara", 12, 5);
        g1.getName();
        Namebale b1 = new Boy("Sebastian", 16, 10, "basketball");
        b1.getName();
    }
}
