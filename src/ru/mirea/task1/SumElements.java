package ru.mirea.task1;
import java.util.Scanner;
public class SumElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите длину массива: ");
        int l = sc.nextInt();
        if (l<=0) {
            System.out.print("Вы думаете, что длина массива может быть отрицательная?!");
            System.exit(0);
        }
        System.out.print("Введите элементы массива: ");
        int[] a = new  int[l];
        int s = 0;
        for (int i=0; i<l; i++) {
            a[i] = sc.nextInt();
            s = s + a[i];
        }
        System.out.print("Сумма элементов: " + s);
    }
}
