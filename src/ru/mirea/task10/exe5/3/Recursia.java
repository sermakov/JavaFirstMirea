package ru.mirea.task10.exe5;

public class Recursia {
    public static void main(String[] args) {
        Recursia recursia = new Recursia();
        recursia.fromAtoB(5,7);
        System.out.println();
        recursia.fromAtoB(8, 5);
        System.out.println();
        recursia.fromAtoB(8, 8);
    }

    public void fromAtoB(int A, int B){
        if (A > B)
            printFromMaxToMin(B, A);
        if (B > A)
            printFromMinToMax(A, B);
        if (A == B)
            System.out.println(A);
    }

    public void printFromMaxToMin(int minBorder, int maxBorder){
        int n = maxBorder;
        if (n == minBorder - 1) return;
        System.out.println(n);
        printFromMaxToMin(minBorder, maxBorder - 1);
    }

    public void printFromMinToMax(int minBorder, int maxBorder){
        int n = minBorder;
        if (n == maxBorder + 1) return;
        System.out.println(n);
        printFromMinToMax(minBorder + 1, maxBorder);
    }
}
