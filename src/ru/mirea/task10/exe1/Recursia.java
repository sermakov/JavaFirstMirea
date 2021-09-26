package ru.mirea.task10.exe1;

import java.util.Scanner;

public class Recursia {
    public MaxItemCount countMax(MaxItemCount maxItemCount){
        Scanner in = new Scanner(System.in);
        System.out.println("Print number");
        int next;
        next = in.nextInt();

        if (next == 0) return maxItemCount;

        if (next > maxItemCount.max) {
            maxItemCount.max = next;
            maxItemCount.count = 1;
        }
        else if (next == maxItemCount.max)
            ++maxItemCount.count;

        return countMax(maxItemCount);
    }

    public static void main(String[] args){
        Recursia recur = new Recursia();
        MaxItemCount maxItemCount = new MaxItemCount();
        maxItemCount = recur.countMax(maxItemCount);

        System.out.println("maxItemCount.max: " + maxItemCount.max);
        System.out.println("maxItemCount.count: " + maxItemCount.count);
        for (int i = 0; i < maxItemCount.count; ++i)
            System.out.print(maxItemCount.max + " ");
    }
}