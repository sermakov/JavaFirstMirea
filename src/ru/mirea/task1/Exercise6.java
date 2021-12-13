package ru.mirea.task1;

import java.util.Random;

public class Exercise6 {
    public static void main(String args[]){

        int[] array = new int[10];
        Random rand = new Random();

        for(int i = 0; i < array.length; i++)
            array[i] = (int)(Math.random() * 100);

        printArray(array);
        sortArray(array);

        System.out.println();

        for(int i = 0; i < array.length; i++)
            array[i] = rand.nextInt(100);

        printArray(array);
        sortArray(array);

    }

    public static void sortArray(int[] array){
        for(int i = array.length-1 ; i > 0 ; i--){
            for(int j = 0 ; j < i ; j++) {
                if (array[j] > array[j + 1]) {
                    int tmp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tmp;
                }
            }
        }
        printArray(array);
    }

    public static void printArray(int[] array){
        for(int i = 0; i < array.length; i++)
            System.out.print(array[i] + "  ");
        System.out.println();
    }
}
