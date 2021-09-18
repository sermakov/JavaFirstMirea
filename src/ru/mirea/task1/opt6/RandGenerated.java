package ru.mirea.task1.opt6;

import java.util.Random;

public class RandGenerated {
    public static void main(String[] args)  {
        int max = 100, min = -50;
        int[] arr = new int[10];
        int i;

        for (i = 0; i< arr.length; i++) {
            arr[i] = (int)(Math.random()* ++max) + min;
        }

        showArr(arr);
        sortAndShowArr(arr);

        /* USING RANDOM CLASS */

        Random rand = new Random();

        for (i = 0; i< arr.length; i++) {
            arr[i] = rand.nextInt(++max) + min;
        }

        showArr(arr);
        sortAndShowArr(arr);
    }

    public static void showArr(int[] arr)    {
        System.out.println("Элементы массива: ");
        for (int i = 0; i < arr.length; i++)    {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static  void sortAndShowArr(int[] arr)  {
        for (int i = 0; i < arr.length; i++)    {
            for (int j = 0; j < arr.length - 1; j++)    {
                if (arr[j] > arr[j+1])  {
                    arr[j+1] = arr[j+1] + arr[j];
                    arr[j] = arr[j+1] - arr[j];
                    arr[j+1] = arr[j+1] - arr[j];
                }
            }
        }
        showArr(arr);
    }
}
