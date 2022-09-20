package ru.mirea.task1;

import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;

public class MainPrak1 {

//    №7
    public static int factorial(int k){
        int res = 1;
        for (int i = 1; i <= k; i++){
            res *= i;
        }
        return res;
    }



    public static void main(String[] args) {

//        №3
        int[] mass = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int a = 0;
        int i = 0;
        for (i = 0; i < mass.length; i++) {
            a = a + mass[i];
        }
        System.out.println("3.1) Сумма по for = " + a);

        a = 0;
        i = 0;
        while (i < mass.length) {
            a = a + mass[i];
            i++;
        }
        System.out.println("3.2) Сумма по while = " + a);

        a = 0;
        i = 0;
        do {
            a = a + mass[i];
            i++;
        }
        while (i < mass.length);
        System.out.println("3.3) Сумма по do while = " + a);

//        №4
        for (i = 0; i < args.length; i++) {
            System.out.println(args[i]);
        }

//        №5
        System.out.println("5) Гармонический ряд: ");
        for (i = 1; i <= 10; i++) {
            System.out.format("1/%d\n", i);
        }

//        №6
        System.out.println("6.1) Не отсортированный массив класса math: ");
        int[] massRand = new int[10];
        for (i = 0; i < massRand.length; i++) {
            massRand[i] = (int) (Math.random() * 11);
            System.out.print(massRand[i] + " ");
        }

        System.out.println();

        System.out.println("6.2) Отсортированный массив класса math: ");
        Arrays.sort(massRand);
        for (i = 0; i < massRand.length; i++) {
            System.out.print(massRand[i] + " ");
        }

        System.out.println();

        System.out.println("6.3) Не отсортированный массив класса random: ");
        Random rand = new Random();
        for (i = 0; i < massRand.length; i++) {
            massRand[i] = rand.nextInt(11);
            System.out.print(massRand[i] + " ");
        }

        System.out.println();

        System.out.println("6.4) Отсортированный массив класса random: ");
        Arrays.sort(massRand);
        for (i = 0; i < massRand.length; i++) {
            System.out.print(massRand[i] + " ");
        }

        System.out.println();

//        №7
        i = 10;
        System.out.format("7) Факториал %d = %d", i, factorial(i));










    }
}