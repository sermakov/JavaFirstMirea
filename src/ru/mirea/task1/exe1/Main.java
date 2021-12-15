package ru.mirea.task1.exe1;

public class Main {

    public static void main(String[] args) {
        int ar[] = new int [10];
        int i = 0;
        while ( i < 10)
        {
            ar[i] = i;
            ++i;
        }
        i = 0;
        int sum = 0;

        while (i < 10)
        {
            sum += ar[i];
            ++i;
        }

        System.out.println("sum: " + sum);
        sum = 0;

        for (int j = 0; j < 10; ++j)
        {
            sum  += ar[j];
        }
        System.out.println("sum: " + sum);

        i = 0;
        sum = 0;
        do
        {
            sum  += ar[i];
            ++i;
        } while (i != 10);

        System.out.println("sum: " + sum);
    }

    private static void SystemOut(String s, int sum) {
    }


}
