package ru.mirea.task10.exe4;

public class Recursia {
    public static void main(String[] args) {
        Recursia recursia = new Recursia();
        recursia.printN(5);
    }

    public void printN(int n){
        if (n == 0)
            return;
        printN(n - 1);
        System.out.println(n);
    }
}
