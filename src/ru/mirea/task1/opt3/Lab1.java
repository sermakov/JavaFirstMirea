package ru.mirea.task1.opt3;

import java.util.Scanner;

public class Lab1 {
    public static void main(String[] args)  {
        System.out.print("Enter the size of the array: ");
        Scanner scn = new Scanner(System.in);
        int size1 = scn.nextInt();
        int[] arr1 = new int[size1];

        System.out.print("Enter the values for the elements: ");
        int sum = 0;
        for (int i = 0; i < arr1.length; i++)    {
            arr1[i] = scn.nextInt();
            sum += arr1[i];
        }

        System.out.println("The summary of the elements of the array: " + sum);

        /* NEXT ARRAY  */

        System.out.print("Enter the size of the array: ");
        int size2 = scn.nextInt();
        int[] arr2 = new int[size2];

        System.out.print("Enter the values for the elements: ");
        sum = 0;
        int ind = 0;
        do    {
            arr2[ind] = scn.nextInt();
            sum += arr2[ind];
            ind ++;
        } while (ind < arr2.length);

        System.out.println("The summary of the elements of the array: " + sum);

        /* NEXT ARRAY */

        System.out.print("Enter the size of the array: ");
        int size3 = scn.nextInt();
        int[] arr3 = new int[size3];

        System.out.print("Enter the values for the elements: ");
        sum = 0;
        ind = 0;
        while (ind < arr3.length)    {
            arr3[ind] = scn.nextInt();
            sum += arr3[ind];
            ind++;
        }

        System.out.println("The summary of the elements of the array: " + sum);
    }
}
