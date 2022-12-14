package ru.mirea.task1;

import java.util.Arrays;
import java.util.Scanner;

public class Random {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите длинну массива: ");
        int l = sc.nextInt();
        int[] a = new  int[l];
        for (int i=0; i<l; i++) {
            a[i] = (int)  (Math.random() * 100);
            System.out.print(a[i] + " ");
        }
        System.out.println("");
        Arrays.sort(a);
        for (int i=0; i<l; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
