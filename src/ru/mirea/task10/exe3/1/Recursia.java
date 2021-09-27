package ru.mirea.task10.exe3;

public class Recursia {
    public static void main(String[] args) {
        Recursia recursia = new Recursia();
        recursia.printNumbers(6);
    }

    public void printNumbers(int n){
        if (n == 0)
            return;
        printNumbers(n - 1);
        for (int i = 1; i <= n; ++i) {
            System.out.print(n + " ");
        }
        System.out.println();

    }
}
