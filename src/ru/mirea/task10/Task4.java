package ru.mirea.task10;

public class Task4
{
    public static int sum(int n, int s)
    {
        if (n == 0)
            return(s);
        return(sum(n / 10, s + n % 10));
    }

    public static void ks(int k, int s, int i, int n, int q)
    {
        if (n == 0)
        {
            ks(k, s, (int) (Math.pow(10, k - 1)), (int) (Math.pow(10, k)), 0);
            return;
        }
        if (i == n)
        {
            System.out.println(q);
            return;
        }
        if (sum(i,0) == s)
            q++;
        ks(k, s, i + 1, n, q);
    }

    public static void main(String[] args)
    {
        ks(2, 5, 0, 0, 0);
    }
}