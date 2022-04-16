package ru.mirea.task1;

public class Sum
{
    public static void main(String[] args)
    {
        int a[] = new int[]{1,2,3,4,5,6,7,8,9,10};
        int sum = 0, sum1 = 0, sum2 = 0;

        for (int i = 0; i < a.length; i++)
        {
            sum += a[i];
        }

        int i = 0;
        while (i < a.length)
        {
            sum1 += a[i];
            i++;
        }
        i = 0;

        do
        {
            sum2 += a[i];
            i++;
        }
        while (i < a.length);

        System.out.println("Сумма по циклу for: " + sum);
        System.out.println("Сумма по циклу while: " + sum1);
        System.out.println("Сумма по циклу do-while: " + sum2);
    }
}
