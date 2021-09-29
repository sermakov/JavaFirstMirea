package ru.mirea.task10.opt9;

public class DuoZero {
    public static int recursion(int a, int b) {
        if (a > b + 1) {
            return 0;
        }
        if (a == 0) {
            return 1;
        }
        if (b == 0 && a == 1) {
            return 1;
        }

        return recursion(a, b - 1) + recursion(a - 1, b - 1);
    }
    public static void main(String[] args) {
        System.out.println(recursion(1, 2));
    }
}