package ru.mirea.task21;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedList;
import java.util.Objects;
import java.util.Scanner;

enum Item
{
    Камень,
    Ключ
}

public class Game
{
    public long timerStart;

    public void act(String input) throws Exception
    {
        int resp = 0;
        for (String i : scene[sceneNum].action)
        {
            if (Objects.equals(input, i))
            {
                resp = scene[sceneNum].response[resp];
                break;
            }
            resp++;
        }
        switch(resp)
        {
            case 10000000:
            {
                System.out.println("Вы находитесь в первой комнате.");
                System.out.println("Спереди вы видите дверь.");
                System.out.println("На двери спереди висит ключ.\n\n");
                break;
            }
            case 10000001:
            {
                System.out.println("Вы находитесь во второй комнате.");
                System.out.println("Перед вами творение первого слова техники - Стационарный Дробитель Настенный, Функциональный. Дроби считает.");
                System.out.println("Известен своей точностью, достигаемой чрезвычайной мощностью. Перегрузится - стене не поздоровится.");
                System.out.println("На полу лежат камни.");
                System.out.println("Сзади вы видите проход в первую комнату.\n\n");
                break;
            }
            case 10000002:
            {
                System.out.println("Вы находитесь в первой комнате.");
                System.out.println("Спереди вы видите дверь.\n\n");
                break;
            }
            case 10000003:
            {
                System.out.println("Вы находитесь в первой комнате.");
                System.out.println("Спереди вы видите проход.\n\n");
                break;
            }
            case 10000004:
            {
                if (new Date().getTime() < timerStart + 10000)
                    System.out.println("НА ЭТО НЕТ ВРЕМЕНИ!\n\n");
                else
                {
                    System.out.println("СЛИШКОМ ПОЗДНО!");
                    System.out.println("А вообще, взрыв - как укол. Быстро было. Больно не было.");
                    this.gameOver();
                }
                break;
            }
            case 20000000:
            {
                System.out.println("Вы вошли в первую комнату.\n\n");
                sceneNum = 2;
                break;
            }
            case -20000001:
            {
                System.out.println("Дверь заперта.\n\n");
                break;
            }
            case 20000001:
            {
                System.out.println("Вы вошли во вторую комнату.\n\n");
                sceneNum = 3;
                break;
            }
            case 30000000:
            {
                System.out.println("Вы подобрали ключ.\n\n");
                inventory.add(Item.Ключ);
                sceneNum = 1;
                break;
            }
            case 30000001:
            {
                System.out.println("Вы подобрали камень.\n\n");
                inventory.add(Item.Камень);
                break;
            }
            case 40000000:
            {
                System.out.println("Вы открыли дверь ключом.\n\n");
                inventory.remove(Item.Ключ);
                sceneNum = 2;
                break;
            }
            case 40000001:
            {
                if (inventory.contains(Item.Камень))
                {
                    inventory.remove(Item.Камень);
                    System.out.println("Не пробил! А вот камень раскололся.\n\n");
                }
                else
                    throw(new Exception("камень"));
                break;
            }
            case 40000002:
            {
                Scanner cin = new Scanner(System.in);
                System.out.println("Вы встали за панель Дробителя. Перед вами набор цифр.");
                System.out.println("Он запрашивает числитель.");
                int a = 0, b = 0;
                boolean c = true;
                while (true)
                {
                    try
                    {
                        a = cin.nextInt();
                        break;
                    }
                    catch (java.util.InputMismatchException e)
                    {
                        System.out.println("Не бывает таких дробей! Соберись и введи заново!\n\n");
                        c = false;
                        break;
                    }
                }
                if (!c)
                    return;
                System.out.println("Теперь он просит знаменатель. Хмм...");
                while (true)
                {
                    try
                    {
                        b = cin.nextInt();
                        break;
                    }
                    catch (java.util.InputMismatchException e)
                    {
                        System.out.println("Не бывает таких дробей! Соберись и введи заново!\n\n");
                        c = false;
                        break;
                    }
                }
                if (!c)
                    return;
                try
                {
                    int d = a/b;
                }
                catch (ArithmeticException e)
                {
                    System.out.println("Ловко придумал! Число ответа на Дробителе стремительно увеличивается. Перегрузка неминуема. Беги!!!\n\n");
                    sceneNum = 4;
                    timerStart = new Date().getTime();
                    break;
                }
                System.out.println("\nЧастное: " + (double)a/(double)b);
                System.out.println("Приятного деления!\n");
                System.out.println("Вы не чувствуете удовлетворённость результатом.\n\n");
                break;
            }
            case 90000000:
            {
                if (inventory.contains(Item.Камень))
                {
                    inventory.remove(Item.Камень);
                    System.out.println("Вы съели камень. Зачем?\n\n");
                }
                else
                    throw(new Exception("камень"));
                break;
            }
            case 90000001:
            {
                if (new Date().getTime() < timerStart + 10000)
                {
                    System.out.println("Вам удаётся выбраться из комнаты прежде, чем прогремел взрыв!");
                    System.out.println("Оборачиваясь, вы видите, что стены больше нет. Есть только путь на свободу.");
                    System.out.println("Победа!");
                    while (true) {;}
                }
                else
                {
                    System.out.println("СЛИШКОМ ПОЗДНО!");
                    System.out.println("А вообще, взрыв - как укол. Быстро было. Больно не было.");
                    this.gameOver();
                }
            }
        }
    }

    public void gameOver()
    {
        DateFormat DF = new SimpleDateFormat("dd-MM-yyyy");
        String date = DF.format(new Date());
        System.out.println(" ______________");
        System.out.println("/              " + (char)92);
        System.out.println("|  HERE  LIES  |");
        System.out.println("|    AMOGUS    |");
        System.out.println("|  XX-XX-XXXX  |");
        System.out.println("|      --      |");
        System.out.println("|  " + date + "  |");
        System.out.println("|______________|");
        while (true) {}
    }

    public int sceneNum = 0;
    public Scene scene[];
    public LinkedList<Item> inventory = new LinkedList<>(); //<--ДЖЕНЕРИК
}
