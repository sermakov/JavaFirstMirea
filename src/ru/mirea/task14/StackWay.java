package ru.mirea.task14;

import java.util.Scanner;
import java.util.Stack;

public class StackWay
{
    public static void main(String[] args)
    {
        Stack<Integer> Deck1 = new Stack<>();
        Stack<Integer> Deck2 = new Stack<>();
        Stack<Integer> Hand1 = new Stack<>();
        Stack<Integer> Hand2 = new Stack<>();
        Scanner SC = new Scanner(System.in);
        String S1 = SC.nextLine();
        String S2 = SC.nextLine();
        for (int i = 8; i > -1; i = i - 2)
        {
            Deck1.push(S1.charAt(i) - '0');
            Deck2.push(S2.charAt(i) - '0');
        }
        int a;
        int b;
        for (int i = 0; i < 107; i++)
        {
            if (Deck1.isEmpty())
                if (Hand1.isEmpty())
                {
                    System.out.println("second " + i);
                    return;
                }
                else
                    while (!Hand1.isEmpty())
                        Deck1.push(Hand1.pop());
            if (Deck2.isEmpty())
                if (Hand2.isEmpty())
                {
                    System.out.println("first " + i);
                    return;
                }
                else
                    while (!Hand2.isEmpty())
                        Deck2.push(Hand2.pop());
            a = Deck1.pop();
            b = Deck2.pop();
            if ((a == 0) & (b == 9))
            {
                Hand1.push(a);
                Hand1.push(b);
            }
            else
                if ((a == 9) & (b == 0))
                {
                    Hand2.push(a);
                    Hand2.push(b);
                }
                else
                    if (a > b)
                    {
                        Hand1.push(a);
                        Hand1.push(b);
                    }
                    else
                    {
                        Hand2.push(a);
                        Hand2.push(b);
                    }
        }
        System.out.println("botva");
    }
}