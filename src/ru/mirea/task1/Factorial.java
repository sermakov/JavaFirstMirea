package ru.mirea.task1;
import java.util.Scanner;
import static java.lang.Math.*;
public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите число: ");
        int a = sc.nextInt();
        if (a<0) {
            System.out.print("Факториал у отрицательного числа не возможен");
            System.exit(0);
        }
        if (a==0) {
            System.out.print("Факториал числа(0): 1");
            System.exit(0);
        }
        Factorial fc = new Factorial();
        fc.getFactorial(a);
    }
    public void getFactorial(int a) {
        int f = 1;
        for (int i=1; i<=a; i++) {
             f = f*i;
        }
        System.out.print("Факториал числа(" + a + "): " + f);
    }
}
