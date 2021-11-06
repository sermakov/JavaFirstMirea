package tasks.task14;
//среди существующих классов списков найти DoubleList не удалось, все найденные в интернете DoubleList'ы были из кастомных пакетов
//вместо DoubleList используется LinkedList
import java.util.LinkedList;
import java.util.Scanner;

public class DoubleListWay
{
    public static void main(String[] args)
    {
        LinkedList<Integer> Hand1 = new LinkedList<>();
        LinkedList<Integer> Hand2 = new LinkedList<>();
        Scanner SC = new Scanner(System.in);
        String S1 = SC.nextLine();
        String S2 = SC.nextLine();
        for (int i = 0; i < 5; i++)
        {
            Hand1.addFirst(S1.charAt(2*i) - '0');
            Hand2.addFirst(S2.charAt(2*i) - '0');
        }
        int a;
        int b;
        for (int i = 0; i < 107; i++)
        {
            if (!Hand1.isEmpty())
                a = Hand1.pollLast();
            else
            {
                System.out.println("second " + i);
                return;
            }
            if (!Hand2.isEmpty())
                b = Hand2.pollLast();
            else
            {
                System.out.println("first " + i);
                return;
            }
            if ((a == 0) & (b == 9))
            {
                Hand1.addFirst(a);
                Hand1.addFirst(b);
            }
            else
            if ((a == 9) & (b == 0))
            {
                Hand2.addFirst(a);
                Hand2.addFirst(b);
            }
            else
            if (a > b)
            {
                Hand1.addFirst(a);
                Hand1.addFirst(b);
            }
            else
            {
                Hand2.addFirst(a);
                Hand2.addFirst(b);
            }
        }
        System.out.println("botva");
    }
}
