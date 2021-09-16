package ru.mirea.task1;

import java.util.Scanner;

public class Lab1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите длину массива: ");
        int l = sc.nextInt();
        System.out.print("Введите массив: ");
        int[] a = new int[l];
        int s = 0;
        for (int i=0; i<l; i++) {
            a[i] = sc.nextInt();
            s = s + a[i];
        }
        System.out.print("Сумма чисел массива: ");
        System.out.print(s);
    }
}
