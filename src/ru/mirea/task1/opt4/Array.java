package ru.mirea.task1.opt4;

import java.util.Arrays;
import java.util.Random;

public class Array {
    public static void main(String[] args){
        Random rand = new Random();
        int[] Mas1 = new int[10];
        int[] Mas2 = new int[10];
        for (int i = 0; i < 10; i++) {
            Mas1[i]=rand.nextInt(200);
            Mas2[i]= (int) (Math.random()*100);
            System.out.println(Mas1[i]+"|"+Mas2[i]);
        }
        Arrays.sort(Mas1);
        Arrays.sort(Mas2);
        System.out.println("______________________");
        for (int i = 0; i < 10; i++) {
            System.out.println(Mas1[i]+"|"+Mas2[i]);
        }
    }
}