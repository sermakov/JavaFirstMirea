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

    public static int digitSum(int n) {
        if (n == 0) return 0;

        return digitSum(n / 10) + n % 10;
    }

    public static void ex5() {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        System.out.println(digitSum(n));

    }
    public static void main(String[] args) {
        System.out.println(simple(23));
    }

    private static boolean simple(int digit){
        if (digit==1){return true;}
        return simple(digit, digit-1);
    }

    public static boolean simple(int digit, int div){
        if (div==1){
            return true;
        }
        if (digit%div==0){
            return false;
        }
        else{
            return simple(digit, div-1);
        }
    }
    public static int count1() {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt(), cnt = 0;

        if (n == 1) cnt++;

        int m = scanner.nextInt();

        if (n == 0 && m == 0) return 0;

        if (m == 1) cnt++;

        return cnt + count1();
    }

    public static void ex11() {
        System.out.println(count1());
    }

    public static void printSeries12() {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        if (n == 0) return;

        if (n % 2 == 1) System.out.println(n);

        printSeries12();
    }

    public static void ex12() {
        printSeries12();
    }

    public static void printSeries13() {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        System.out.print(n + " ");

        if (n == 0) return;

        n = scanner.nextInt();

        if (n == 0) return;

        printSeries13();
    }

    public static void ex13() {
        printSeries13();
    }

    public static void printDigits14(int n) {
        if (n <= 0) return;

        printDigits14(n / 10);
        System.out.print(n % 10 + " ");
    }

    public static void ex14() {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        printDigits14(n);
    }
    public static void printDigits15(int n) {
        if (n <= 0) return;

        System.out.print(n % 10 + " ");
        printDigits15(n / 10);
    }

    public static void ex15() {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        printDigits15(n);

    }

    public static void rec(int i, int max){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (num == 0) System.out.println(i);
        else if (num > max) rec(1, num);
        else if (num == max) rec(i+1, max);
        else rec(i,max);
    }

    public static void ex16() {
        rec(0, 0);
    }
}
