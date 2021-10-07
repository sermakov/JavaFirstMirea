package ru.mirea.task1;

import java.util.Random;

public class Rand
{
    public static void sort(int arr[])
    {
        int b;
        for (int i = 0; i < arr.length; i++)
        {
            for (int j = 0 ; j < arr.length - 1; j++)
            {
                if (arr[j] > arr[j + 1])
                {
                    b = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = b;
                }
            }
        }
    }
    public static void main(String[] args)
    {
        Random Rand = new Random();
        int  min = 0, max = 40;
	    int a[] = new int[10];
        int c[] = new int[8];

        for (int i = 0; i < a.length; i++)
        {
            a[i] = (int) (Math.random() * max);
        }

        sort(a);

        System.out.println("Значения массива, запоненого MathRand: ");
        System.out.println();
        for (int i = 0; i < a.length; i++)
        {
            System.out.println(i + 1 + "-е значение: " + a[i]);
        }
        System.out.println();

        for (int i = 0; i < c.length; i++)
        {
            c[i] = Rand.nextInt(max-min) + min ;
        }

        sort(c);

        System.out.println("Значения массива, заполненого Random: ");
        System.out.println();
        for (int i = 0; i < c.length; i++)
        {
            System.out.println(i + 1 + "-е значение: " + c[i]);
        }

    }
}
