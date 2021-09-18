package ru.mirea.task1.opt5;

import java.text.DecimalFormat;

public class HarmonicSeries {
    public static void main(String[] args)  {
        DecimalFormat decF = new DecimalFormat("0.0000000000");
        System.out.println("Первые 10 чисел гармонического ряда:");
        for (double n = 1; n <= 10; n++)   {
            System.out.println(decF.format(1.0d/n));
        }
    }
}
