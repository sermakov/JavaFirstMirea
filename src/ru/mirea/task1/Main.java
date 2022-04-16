package ru.mirea.task1;

import java.util.Scanner;

class Factor
{
    public static void factorial(int y)
    {
        int fac = 0;

        for (int i = 0; i <= y; i++)
        {
            fac += i;
        }

        System.out.println("Факториал данного числа равен: " + fac);
    }
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число: ");

        int num = in.nextInt();
        factorial(num);

    }
}
