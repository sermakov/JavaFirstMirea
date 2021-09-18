package ru.mirea.task1.opt7;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.print("Введите число, факториал которого вы хотите получить: ");
        num = sc.nextInt();
        System.out.print("Факториал вашего числа: " + getFactorial(num));
    }

    public static int getFactorial(int num)
    {
        int numFactorial = 1;
        for (int i = 1; i <= num; i++)  {
            numFactorial*=i;
        }
        return numFactorial;
    }
}
