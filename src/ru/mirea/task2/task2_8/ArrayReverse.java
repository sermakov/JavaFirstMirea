package ru.mirea.task2.task2_8;

import java.util.Arrays;

public class ArrayReverse {
    public static void main(String[] args) {
        String[] arr = "Good evening can I disturb your peace we apologize".split(" ");
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length / 2; i++) {
            String temp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = temp;
        }
        System.out.println("Result: " + Arrays.toString(arr));
    }
}
