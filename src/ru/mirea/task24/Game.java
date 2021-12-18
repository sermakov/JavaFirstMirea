package ru.mirea.task24;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedList;
import java.util.Objects;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Game
{
    public String getWord(String input, int i)
    {
        String s = "";
        int l = input.length();
        if (l < i)
            return(s);
        while (i != l)
        {
            if (input.charAt(i) == ' ')
                return(s);
            s = s + input.charAt(i);
            i++;
        }
        return(s);
    }

    public static int findRes(String input, String[] array)
    {
        int l = array.length;
        for (int i = 0; i < l; i++)
            if (Objects.equals(array[i], input))
                return(i);
        return(0);
    }

    public static int findByName(String name, LinkedList<Item> list)
    {
        int res = 0;
        for (Item i : list)
        {
            if (Objects.equals(i.name, name))
                return(res);
            res++;
        }
        return(-1);
    }

    public void act(String input) throws Exception
    {
        int resp = 0;
        boolean h = true;
        switch(input.hashCode())
        {
            case 501497002:
            {
                resp = 50000000;
                h = false;
                break;
            }
            case -610461674:
            {
                resp = 40000000;
                h = false;
                break;
            }
            case -2067318447:
            {
                resp = 60000000;
                h = false;
                break;
            }
            case 130341898:
            {
                resp = scene[sceneNum].response[1];
                h = false;
                break;
            }
            case -254139010:
            {
                System.out.println("MÜNCHHAUSEN MOMENT");
                System.out.print("\n\n");
                break;
            }
        }
        String s = input;
        if (h)
        {
            Pattern regex = Pattern.compile(".* .*", Pattern.CASE_INSENSITIVE);
            Matcher matcher = regex.matcher(input);
            if (!matcher.find())
                h = false;
            resp = 0;
        }
        if (h)
            s = getWord(s, 0);
        if (h)
        switch(s)
        {
            case "идти":
            {
                resp = scene[sceneNum].response[findRes(input, scene[sceneNum].action)];
                break;
            }
            case "использовать":
            {
                String w = getWord(input, 13);
                int i = findByName(w, inventory);
                if (i >= 0)
                {
                    resp = inventory.get(i).response[findRes(input, inventory.get(i).action)];
                    break;
                }
                i = findByName(w, scene[sceneNum].inventory);
                if (i >= 0)
                {
                    resp = scene[sceneNum].inventory.get(i).response[findRes(input, scene[sceneNum].inventory.get(i).action)];
                    break;
                }
                throw(new Exception(w));
            }
            case "осмотреть":
            {
                String w = getWord(input, 10);
                int i = findByName(w, inventory);
                if (i >= 0)
                {
                    resp = inventory.get(i).response[findRes(input, inventory.get(i).action)];
                    break;
                }
                i = findByName(w, scene[sceneNum].inventory);
                if (i >= 0)
                {
                    resp = scene[sceneNum].inventory.get(i).response[findRes(input, scene[sceneNum].inventory.get(i).action)];
                    break;
                }
                throw(new Exception(w));
            }
            case "ударить":
            {
                String w = getWord(input, 8);
                int i = findByName(w, inventory);
                if (i >= 0)
                {
                    resp = inventory.get(i).response[findRes(input, inventory.get(i).action)];
                    break;
                }
                i = findByName(w, scene[sceneNum].inventory);
                if (i >= 0)
                {
                    resp = scene[sceneNum].inventory.get(i).response[findRes(input, scene[sceneNum].inventory.get(i).action)];
                    break;
                }
                throw(new Exception(w));
            }
            case "взять":
            {
                String w = getWord(input, 6);
                int i = findByName(w, scene[sceneNum].inventory);
                if (i >= 0)
                {
                    if (scene[sceneNum].inventory.get(i).take())
                    {
                        System.out.println("Вы взяли " + w + ".");
                        System.out.print("\n\n");
                        inventory.add(scene[sceneNum].inventory.get(i));
                        scene[sceneNum].inventory.remove(i);
                    }
                    else
                    {
                        System.out.println("Вам не удалось взять " + w + ".");
                        System.out.print("\n\n");
                    }
                    resp = -1;
                    break;
                }
                throw(new Exception(w));
            }
            default:
            {
                resp = scene[sceneNum].response[0];
                break;
            }
        }
        switch(resp)
        {
            case -1:
            {
                break;
            }
            case 0:
            {
                System.out.println("Ни-чё не понимаю!");
                System.out.print("\n\n");
                break;
            }
            case 1:
            {
                if (new Date().getTime() < timerStart + 10000)
                {
                    System.out.println("НА ЭТО НЕТ ВРЕМЕНИ!");
                    System.out.print("\n\n");
                }
                else
                {
                    System.out.println("СЛИШКОМ ПОЗДНО!");
                    System.out.println("А вообще, взрыв - как укол. Быстро было. Больно не было.");
                    this.gameOver();
                }
                break;
            }
            case 10000000:
            {
                System.out.println("Вы находитесь в первой комнате.");
                if (findByName("дверь", scene[sceneNum].inventory) >= 0)
                    System.out.println("Спереди вы видите дверь.");
                else
                    System.out.println("Спереди вы видите проход.");
                if (findByName("ключ", scene[sceneNum].inventory) >= 0)
                    System.out.println("На двери спереди висит ключ.");
                System.out.print("\n\n");
                break;
            }
            case 10000001:
            {
                System.out.println("Вы находитесь во второй комнате.");
                System.out.println("На всю стену перед вами простирается Дробитель.");
                if (findByName("камень", scene[sceneNum].inventory) >= 0)
                    System.out.println("На полу лежит камень.");
                System.out.println("Сзади вы видите проход в первую комнату.");
                System.out.print("\n\n");
                break;
            }
            case 20000000:
            {
                System.out.println("Вы вошли в первую комнату.");
                System.out.print("\n\n");
                sceneNum = 0;
                break;
            }
            case 20000001:
            {
                if (findByName("дверь", scene[sceneNum].inventory) >= 0)
                    System.out.println("Дверь заперта.");
                else
                {
                    System.out.println("Вы вошли во вторую комнату.");
                    sceneNum = 1;
                }
                System.out.print("\n\n");
                break;
            }
            case 40000000:
            {
                System.out.println("Красавец!");
                System.out.print("\n\n");
                break;
            }
            case 40000001:
            {
                System.out.println("Ключ как ключ. Открывает двери.");
                System.out.print("\n\n");
                break;
            }
            case 40000002:
            {
                System.out.println("Закрытая дверь. Одна из многих, надо полагать.");
                System.out.print("\n\n");
                break;
            }
            case 40000003:
            {
                System.out.println("Камень с вкраплениями грязи. Довольно рыхлый.");
                System.out.print("\n\n");
                break;
            }
            case 40000004:
            {
                System.out.println("Стационарный Дробитель Настенный, Функциональный. Дроби считает.");
                System.out.println("Обладает невероятной точностью, в том числе из-за занимаемого собой объёма.");
                System.out.println("Перегрузится - стене не поздоровится.");
                System.out.print("\n\n");
                break;
            }
            case 50000000:
            {
                System.out.println("Эй, руки прочь от себя! Игрушка детская!");
                System.out.print("\n\n");
                break;
            }
            case 50000001:
            {
                System.out.println("Не надо вскры-ва-тьсяяяяяя!");
                System.out.print("\n\n");
                break;
            }
            case 50002001:
            {
                System.out.println("Вы открыли дверь ключом.");
                System.out.print("\n\n");
                scene[sceneNum].inventory.remove(findByName("дверь", scene[sceneNum].inventory));
                break;
            }
            case 50000002:
            {
                System.out.println("Дверь не поддаётся.");
                System.out.print("\n\n");
                break;
            }
            case 50000003:
            {
                System.out.println("Вы съели камень. Зачем?");
                System.out.print("\n\n");
                inventory.remove(findByName("камень", inventory));
                break;
            }
            case 50004003:
            {
                if (sceneNum != 1)
                    throw(new Exception("дробитель"));
                System.out.println("Не пробил! А вот камень раскололся.");
                System.out.print("\n\n");
                inventory.remove(findByName("камень", inventory));
                break;
            }
            case 50000004:
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
                        System.out.println("Не бывает таких дробей! Соберись и введи заново!");
                        System.out.print("\n\n");
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
                        System.out.println("Не бывает таких дробей! Соберись и введи заново!");
                        System.out.print("\n\n");
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
                    System.out.println("Ловко придумал! Число ответа на Дробителе стремительно увеличивается. Перегрузка неминуема. Беги!!!");
                    System.out.print("\n\n");
                    sceneNum = 2;
                    timerStart = new Date().getTime();
                    break;
                }
                System.out.println("\nЧастное: " + (double)a/(double)b);
                System.out.println("Приятного деления!\n");
                System.out.println("Вы не чувствуете удовлетворённость результатом.");
                System.out.print("\n\n");
                break;
            }
            case 60000000:
            {
                System.out.println("Садомазохизм не одобряем.");
                System.out.print("\n\n");
                break;
            }
            case 60000001:
            {
                System.out.println("Молитесь теперь, чтобы об этом не узнала вся его связка.");
                System.out.print("\n\n");
                break;
            }
            case 60000002:
            {
                System.out.println("Чтож, хорошая дверь. Прочная. А вы нет.");
                System.out.print("\n\n");
                break;
            }
            case 60000003:
            {
                System.out.println("Вам удалось самоутвердиться перед камнем. От удара он рассыпался.");
                System.out.println("Галька это запомнит.");
                System.out.print("\n\n");
                if (findByName("камень", inventory) >= 0)
                    inventory.remove(findByName("камень", inventory));
                else
                    scene[sceneNum].inventory.remove(findByName("камень", scene[sceneNum].inventory));
                break;
            }
            case 60000004:
            {
                System.out.println("Вы хорошенько зарядили по панели ввода Дробителя. Вам удалось вырвать несколько кнопок.");
                System.out.println("НЕВЕРОЯТНАЯ МОЩНОСТЬ!!!");
                System.out.println("Нажмите ENTER, чтобы продолжить...");
                Scanner cin = new Scanner(System.in);
                String S = cin.nextLine();
                System.out.print("\n\n\n");
                System.out.println("Подумали вы. Однако ваша рука попала на оголённые провода.");
                System.out.println("Дробитель хорошенько зарядил по вам в ответ. Технически, вы не ошиблись.");
                System.out.println("Мощность действительно была невероятной.");
                gameOver();
                break;
            }
            case 90000000:
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
                    gameOver();
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
    public LinkedList<Item> inventory = new LinkedList<>();
    public long timerStart;
}
