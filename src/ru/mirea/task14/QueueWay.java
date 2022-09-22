package ru.mirea.task14;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class QueueWay
{
    public static void main(String[] args)
    {
        Queue<Integer> Hand1 = new LinkedList<>();
        Queue<Integer> Hand2 = new LinkedList<>();
        Scanner SC = new Scanner(System.in);
        String S1 = SC.nextLine();
        String S2 = SC.nextLine();
        for (int i = 0; i < 5; i++)
        {
            Hand1.add(S1.charAt(2*i) - '0');
            Hand2.add(S2.charAt(2*i) - '0');
        }
        int a;
        int b;
        for (int i = 0; i < 107; i++)
        {
            if (!Hand1.isEmpty())
                a = Hand1.poll();
            else
            {
                System.out.println("second " + i);
                return;
            }
            if (!Hand2.isEmpty())
                b = Hand2.poll();
            else
            {
                System.out.println("first " + i);
                return;
            }
            if ((a == 0) & (b == 9))
            {
                Hand1.add(a);
                Hand1.add(b);
            }
            else
                if ((a == 9) & (b == 0))
                {
                    Hand2.add(a);
                    Hand2.add(b);
                }
                else
                    if (a > b)
                    {
                        Hand1.add(a);
                        Hand1.add(b);
                    }
                    else
                    {
                        Hand2.add(a);
                        Hand2.add(b);
                    }
        }
        System.out.println("botva");
    }
}