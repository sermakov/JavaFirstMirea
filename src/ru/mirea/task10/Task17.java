package ru.mirea.task10;
import java.util.Scanner;

public class Task17
{
    public static int max()
    {
        Scanner IntIn = new Scanner(System.in);
        int x = IntIn.nextInt();
        if (x == 0)
            return(0);
        else
        {
            int y = max();
            if (x > y)
                return(x);
            else
                return(y);
        }
    }
//
    public static void main(String[] args)
    {
        System.out.println(max());
    }
}