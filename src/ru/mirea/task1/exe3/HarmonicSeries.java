package ru.mirea.task1.exe3;

public class HarmonicSeries {
    public static void main(String[] args) {
        double sum = 0;
        for (int i = 1; i < 11; ++i) {
            sum += 1.0 / i;
        }
        System.out.println("sum : " + sum);
    }
}
