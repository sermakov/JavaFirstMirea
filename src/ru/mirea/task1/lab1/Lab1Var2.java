package ru.mirea.task1.lab1;

import org.jetbrains.annotations.NotNull;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Lab1Var2 {

    public static void main(String[] args) {
	    for (String arg : args) {
	        System.out.println(arg);
        }
    }
    private static void fillArrByRandom(@NotNull int[] arr) {
        Random rand = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt()%1001;
        }
    }
}
