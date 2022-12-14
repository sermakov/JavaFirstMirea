package ru.mirea.task10.exe2;

import java.util.Scanner;

public class Recursia {
    public static void main(String[] args){
        ru.mirea.task10.exe1.Recursia recur = new ru.mirea.task10.exe1.Recursia();
        Recursia recursia = new Recursia();
        int max = recursia.maxItem();
        System.out.println("max: " + max + "\n");
    }

    public int maxItem() {
        Scanner in = new Scanner(System.in);
        System.out.println("Print number");
        int next;
        next = in.nextInt();
        int max = 0;

        if (next == 0)
            return max;
        else
            if (next > max)
                return Math.max(max = next, maxItem());
            return max;
    }
}
