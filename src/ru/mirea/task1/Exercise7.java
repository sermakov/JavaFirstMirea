package ru.mirea.task1;

public class Exercise7 {

    public static void main(String[] args){
        factorial(4);
    }

    public static void factorial(int n){
        int factorial = 1;

        for (int i = 1; i <= n; i++){
            factorial = factorial * i;
        }

        System.out.println(factorial);
    }
}
