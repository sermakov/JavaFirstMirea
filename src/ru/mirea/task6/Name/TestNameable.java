package ru.mirea.task6.Name;

public class TestNameable {
    public static void main(String[] args) {
        Nameable n1 = new Girl ("Sara", 12, 5);
        Nameable n2 = new Boy ("Sebastian", 16, 10, "basketball");
        n1.getName();
        n2.getName();
    }
}
