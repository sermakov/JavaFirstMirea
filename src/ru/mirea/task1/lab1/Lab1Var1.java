package ru.mirea.task1.lab1;

import org.jetbrains.annotations.NotNull;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Lab1Var1 {

    public static void main(String[] args) {
	// write your code hereСгенерировать массив целых чисел случайным образом, вывести
        //его на экран, отсортировать его, и снова вывести на экран
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        fillArrByRandom(arr);
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    private static void fillArrByRandom(@NotNull int[] arr) {
        Random rand = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt()%1001;
        }
    }
}
