package ru.mirea.task14;

import java.util.Scanner;
import java.util.Stack;

public class Task5
{
    public static void cloneStack(Stack<Integer> one, Stack<Integer> two)
    {
        int a;
        Stack<Integer> three = new Stack<>();
        while (!one.isEmpty())
            three.push(one.pop());
        while (!three.isEmpty())
        {
            a = three.pop();
            one.push(a);
            two.push(a);
        }
    }

    public static int max(int a, int b, int c, int d)
    {
        int max = 0;
        if ((a >= b) & (a >= c) & (a >=d))
            max = a;
        if ((b >= a) & (b >= c) & (b >=d))
            max = b;
        if ((c >= b) & (c >= a) & (c >=d))
            max = c;
        if ((d >= b) & (d >= c) & (d >=a))
            max = d;
        return(max);
    }

    public static void main(String[] args)
    {
        System.out.println("Стеки в возможностях добавления, чтения и удаления элемента ограничены только головным элементом.");
        System.out.println("В связи с этим нельзя просто так положить карты в конец колоды, реализованной на стеке.");
        System.out.println("Однако, если последовательно 'перекладывать' элементы из одного стека в другой, получится инвертированный стек.");
        System.out.println("Поэтому дадим каждому игроку 'вторую руку', которая перевернётся и встанет на место первой, когда в первой закончатся карты.");
        System.out.println("В эту руку сначала кладётся карта первого игрока сверху, а затем карта второго игрока кладётся на неё.");
        System.out.println("Игрок проигрывает, если карты кончаются в обоих руках.");
        System.out.println("Для наглядности первый игрок будет играть 'правой' рукой, а рукой сброса будет 'левая', а у второго игрока наоборот.");
        System.out.println("Введите начальные руки игроков строкой чисел (слева - верхняя карта играющей руки).");
        Stack<Integer> Deck1 = new Stack<>();
        Stack<Integer> Deck2 = new Stack<>();
        Stack<Integer> Hand1 = new Stack<>();
        Stack<Integer> Hand2 = new Stack<>();
        Scanner SC = new Scanner(System.in);
        System.out.println("Первый игрок: ");
        String S1 = SC.nextLine();
        System.out.println("Второй игрок: ");
        String S2 = SC.nextLine();
        for (int i = 8; i > -1; i = i - 2)
        {
            Deck1.push(S1.charAt(i) - '0');
            Deck2.push(S2.charAt(i) - '0');
        }
        int a;
        int b;
        int m;
        for (int i = 0; i < 107; i++)
        {
            Stack<Integer> Deck1C = new Stack<>();
            Stack<Integer> Deck2C = new Stack<>();
            Stack<Integer> Hand1C = new Stack<>();
            Stack<Integer> Hand2C = new Stack<>();
            cloneStack(Deck1, Deck1C);
            cloneStack(Deck2, Deck2C);
            cloneStack(Hand1, Hand1C);
            cloneStack(Hand2, Hand2C);
            if (i == 0)
            {
                System.out.println("ВЫВОДИТСЯ СОСТОЯНИЕ РУК НА МОМЕНТ КОНЦА КАЖДОГО ХОДА");
                System.out.println("НАЖМИТЕ ENTER, ЧТОБЫ НАЧАТЬ ИГРУ...");
                S1 = SC.nextLine();
                for (int k = 0; k < 15; k++)
                    System.out.println();
                System.out.println("\n  НАЧАЛО ИГРЫ");
            }
            else
                if (i < 10)
                    System.out.println("     ХОД " + i);
                else
                    System.out.println("    ХОД " + i);
            System.out.println("ПЕРВЫЙ   ВТОРОЙ");
            m = max(Hand1C.size(), Deck1C.size(), Deck2C.size(), Hand2C.size());
            for (int j = m; j > 0; j--)
            {
                if (Hand1C.size() == j)
                    System.out.print(Hand1C.pop() + "    ");
                else
                    System.out.print("     ");
                if (Deck1C.size() == j)
                    System.out.print(Deck1C.pop() + "   ");
                else
                    System.out.print("    ");
                if (Deck2C.size() == j)
                    System.out.print(Deck2C.pop() + "    ");
                else
                    System.out.print("     ");
                if (Hand2C.size() == j)
                    System.out.print(Hand2C.pop() + "\n");
                else
                    System.out.print("\n");
            }
            System.out.println("НАЖМИТЕ ENTER, ЧТОБЫ ПЕРЕЙТИ К СЛЕДУЮЩЕМУ ХОДУ...");
            S1 = SC.nextLine();
            for (int k = 0; k < 15; k++)
                System.out.println();
            if (Deck1.isEmpty())
                if (Hand1.isEmpty())
                {
                    System.out.println("Игрок 2 победил на ходу №" + i);
                    return;
                }
                else
                    while (!Hand1.isEmpty())
                        Deck1.push(Hand1.pop());
            if (Deck2.isEmpty())
                if (Hand2.isEmpty())
                {
                    System.out.println("Игрок 1 победил на ходу № " + i);
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
        System.out.println("Игра длилась слишком долго. Ботва!");
    }
}
