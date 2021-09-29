package ru.mirea.task10.opt10;

public class Reverse {
    public static int reverse(int n, int a)
    {
        if (n==0)
        {
            return a;
        }else {
            return reverse(n/10,a*10+n%10);
        }
    }
    public static void main(String[]args)
    {
        System.out.println(reverse(12345,0));
    }
}