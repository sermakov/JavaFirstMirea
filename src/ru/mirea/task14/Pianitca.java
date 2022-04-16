import java.util.*;

public class Pianitca {

    public static void main(String[] args) {
        int count_move = 0;
        boolean victory = false;
        Scanner sc = new Scanner(System.in);
        Deque<Integer> first = new ArrayDeque<Integer>();
        Deque<Integer> second = new ArrayDeque<Integer>();

        System.out.println("Введите каты первого игрока: ");
        for (int i = 0; i < 5; ++i)
            first.addLast(sc.nextInt());

        System.out.println("Введите каты второго игрока: ");
        for (int i = 0; i < 5; ++i)
            second.addLast(sc.nextInt());

        System.out.println("Рука первого: " + first);
        System.out.println("Рука второго: " + second);
        for (int i = 0, firstCard, secondCard; i < 106; ++i)
        {
            firstCard = first.pop();
            secondCard = second.pop();
            if ((firstCard > secondCard) && (firstCard != 9 && secondCard == 0) || (firstCard == 0 && secondCard == 9))
            {
                first.addLast(firstCard);
                first.addLast(secondCard);
            }
            else
            {
                second.addLast(secondCard);
                second.addLast(firstCard);
            }

            if (first.isEmpty())
            {
                System.out.println("second");
                System.out.println("Количество ходов: " + Integer.toString(count_move + 1));
                victory = true;
                break;
            }
            else if (second.isEmpty())
            {
                System.out.println("first");
                System.out.println("Количество ходов: " + Integer.toString(count_move + (int)1));
                victory = true;
                break;
            }
            count_move++;
        }

        if (!victory)
        {
            System.out.println("botva");
            System.out.println("Количество ходов: " + count_move);
        }
    }
}
