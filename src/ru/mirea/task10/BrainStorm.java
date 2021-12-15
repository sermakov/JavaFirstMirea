package ru.mirea.task10;
import java.util.Scanner;

public class BrainStorm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Какое? ");
        int number = sc.nextInt();
        BrainStorm bs = new BrainStorm();
        switch (number) {
            case (9) -> bs.type9();
            case (10) -> bs.type10();
            case (11) -> bs.type11();
            case (12) -> bs.type12();
            case (13) -> bs.type13();
        }
    }
    public void type9() {
        Scanner sc9 = new Scanner(System.in);
        System.out.print("Введите кол-во 0: ");
        int n0 = sc9.nextInt();
        System.out.print("Введите кол-во 1: ");
        int n1 = sc9.nextInt();
        BrainStorm bs9 = new BrainStorm();
        System.out.print(bs9.diferent(n0,n1));
    }
    public int diferent(int n0, int n1) {
        if(n0==0)
            return 1;
        if(n1==0 && n0>1)
            return 0;
        if(n0==1 && n1==0)
            return 1;
        return diferent(n0, n1-1)+diferent(n0-1,n1-1);
    }
    public void type10() {
        try (Scanner sc10 = new Scanner(System.in)) {
            System.out.print("Введите число: ");
            System.out.println("Число наизнанку: " + conversely(String.valueOf(sc10.nextInt())));
        }
    }
    public static String conversely(String str) {
        return str.isEmpty() ? "" : conversely(str.substring(1)) + str.charAt(0);
    }
    public void type11() {
        System.out.print("Вводите числа: ");
        BrainStorm bs11 = new BrainStorm();
        int[] a = new int[100];
        bs11.one(a);
    }
    public void one(int[] a) {
        Scanner sc12 = new Scanner(System.in);
        int n = sc12.nextInt();
        int i = 0;
        if (n==0) {
            n = sc12.nextInt();
            if (n==0) {
                System.out.print("Кол-во единиц: ");
                while (a[i] != 0) {
                    i++;
                }
                System.out.print(i);
                System.exit(0);
            } else {
                while (a[i] != 0) {
                    i++;
                }
                if (n==1) {
                    a[i]=n;
                }
                one(a);
            }
        }
        while (a[i] != 0) {
            i++;
        }
        if (n==1) {
            a[i]=n;
        }
        one(a);
    }
    public void type12() {
        System.out.print("Вводите числа: ");
        BrainStorm bs12 = new BrainStorm();
        int[] a = new int[100];
        bs12.two(a);
    }
    public void two(int[] a) {
        Scanner sc12 = new Scanner(System.in);
        int n = sc12.nextInt();
        int i = 0;
        if (n==0) {
            if (a[0] == 0) {
                System.out.print("Нечетных чисел нет");
            } else {
                System.out.print("Нечетных числа: ");
            }
            while (a[i] != 0) {
                System.out.print(a[i] + " ");
                i++;
            }
            System.exit(0);
        }
        while (a[i] != 0) {
            i++;
        }
        if (Math.abs(n%2)==1) {
            a[i]=n;
        }
        two(a);
    }
    public void type13() {
        System.out.print("Вводите числа: ");
        BrainStorm bs13 = new BrainStorm();
        int[] a = new int[100];
        bs13.nechet(a);
    }
    public void nechet(int[] a) {
        Scanner sc12 = new Scanner(System.in);
        int n = sc12.nextInt();
        int i = 0;
        if (n==0) {
            System.out.print("Числа идущий под нечетным числом: ");
            i=1;
            while (a[i] != 0) {
                System.out.print(a[i] + " ");
                i= i+2;
            }
            System.exit(0);
        }
        while (a[i] != 0) {
            i++;
        }
        a[i]=n;
        nechet(a);
    }
}