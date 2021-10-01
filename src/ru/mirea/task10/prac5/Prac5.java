package ru.mirea.task10.prac5;

import java.util.Scanner;

public class Prac5 {
    public static void main(String[] args) throws Exception {
        System.out.println(Exercises.ex17());
        Exercises.ex1();
        Exercises.ex2();
        Exercises.ex3();
        Exercises.ex4();
    }

}

class Exercises {
    public static int ex17() throws Exception {
        int max = 0;
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int x = sc.nextInt();
            if (x <= 0) break;
            if (x > max) max = x;
        }
        if (max == 0) throw new Exception();
        return max;
    }
    public static void ex1() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n <= 0) return;
        for (int k = 1, i = 1; n > 0; i++, n--) {
            System.out.print(k);
            if (i == k) {
                k++;
                i = 0;
            }
        }
        System.out.println();
    }
    public static void ex2() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            if (i != 1) System.out.print(" ");
            System.out.print(i);
        }
        System.out.println();
    }
    public static void ex3() {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (a < b) for (int i = a; i <= b; i++) System.out.print(i+" ");
        else for (int i = a; i >= b; i--) System.out.print(i+" ");
        System.out.println();
    }
    public static void ex4() {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int s = sc.nextInt();
        int c = 0;
        for (int i = (int) Math.pow(10, k-1); i < (int) Math.pow(10, k); i++) {
            int sum = 0;
            int x = i;
            while (x != 0) {
                sum += x%10;
                x/=10;
            }
            if (sum == s) {
                c++;
            }
        }
        System.out.println(c);
    }
}
