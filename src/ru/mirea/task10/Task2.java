package ru.mirea.task10;

public class Task2
{
    public static void row(int i, int n)
    {
        if (i > n)
            return;
        System.out.print(i + " ");
        row(i + 1, n);
    }

    public static void main(String[] args)
    {
        row(5, 7);
    }
}