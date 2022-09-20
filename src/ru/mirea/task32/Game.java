package ru.mirea.task32;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
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
    MusicPlayer Primary;
    MusicPlayer Secondary;
    public JTextArea textArea;
    public JTextArea inventoryArea;

    public Game(int attempt) throws Exception
    {
        JFrame outFrame = new JFrame("ЧТО-КАК");
        outFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        textArea = new JTextArea(3,20);
        Font font = new Font("Times new roman", Font.BOLD, 50);
        textArea.setFont(font);
        textArea.setEditable(false);
        textArea.setText("Попытка\n№" + attempt + "\nУдачи!");
        outFrame.getContentPane().add(textArea);
        outFrame.pack();
        outFrame.setVisible(true);

        JFrame inventoryFrame = new JFrame("ИНВЕНТАРЬ");
        inventoryFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        inventoryArea = new JTextArea(8,10);
        Font font1 = new Font("Times new roman", Font.BOLD, 50);
        inventoryArea.setFont(font1);
        inventoryArea.setEditable(false);
        inventoryArea.setText("пусто");
        inventoryFrame.getContentPane().add(inventoryArea);
        inventoryFrame.pack();
        inventoryFrame.setLocation(820, 0);
        inventoryFrame.setSize(400,550);
        inventoryFrame.setVisible(true);

        Primary = new MusicPlayer();
        Primary.play("./AMOGUS II/room1.wav", true, 0);
    }

    public void inventoryToWindow()
    {
        if (inventory.size() == 0)
            inventoryArea.setText("пусто");
        else
            inventoryArea.setText("");
        for (Item i : inventory)
            inventoryArea.append(i.getName() + "\n");
    }

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

    public static int findByName(String name, LinkedList<Item> list)
    {
        int res = 0;
        for (Item i : list)
        {
            if (Objects.equals(i.getName(), name))
                return(res);
            res++;
        }
        return(-1);
    }

    public void act(String input) throws Exception
    {
        int resp = 0;
        boolean h = true;
        if (condition != 0)
        {
            resp = condition;
            h = false;
        }
        if (h)
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
                resp = scene[sceneNum].getResponse("осмотреться");
                h = false;
                break;
            }
            case -254139010:
            {
                textArea.setText("MÜNCHHAUSEN MOMENT");
                return;
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
                resp = scene[sceneNum].getResponse(input);
                if (resp == -1)
                {
                    textArea.setText("Вам не удалось пойти " + getWord(input,5) + ".");
                    return;
                }
                break;
            }
            case "использовать":
            {
                String w = getWord(input, 13);
                int i = findByName(w, inventory);
                if (i >= 0)
                {
                    if (inventory.get(i).containsKey(input))
                        resp = inventory.get(i).getResponse(input);
                    break;
                }
                i = findByName(w, scene[sceneNum].inventory);
                if (i >= 0)
                {
                    if (scene[sceneNum].inventory.get(i).containsKey(input))
                        resp = scene[sceneNum].inventory.get(i).getResponse(input);
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
                    if (inventory.get(i).containsKey(input))
                        resp = inventory.get(i).getResponse(input);
                    break;
                }
                i = findByName(w, scene[sceneNum].inventory);
                if (i >= 0)
                {
                    if (scene[sceneNum].inventory.get(i).containsKey(input))
                        resp = scene[sceneNum].inventory.get(i).getResponse(input);
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
                    if (inventory.get(i).containsKey(input))
                        resp = inventory.get(i).getResponse(input);
                    break;
                }
                i = findByName(w, scene[sceneNum].inventory);
                if (i >= 0)
                {
                    if (scene[sceneNum].inventory.get(i).containsKey(input))
                        resp = scene[sceneNum].inventory.get(i).getResponse(input);
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
                        textArea.setText("Вы взяли " + w + ".");
                        inventory.add(scene[sceneNum].inventory.get(i));
                        scene[sceneNum].inventory.remove(i);
                        inventoryToWindow();
                    }
                    else
                    {
                        textArea.setText("Вам не удалось взять\n" + w + ".");
                    }
                    resp = -1;
                    break;
                }
                throw(new Exception(w));
            }
            default:
            {
                resp = scene[sceneNum].getResponse("D");
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
                textArea.setText("Ни-чё не понимаю!");
                break;
            }
            case 1:
            {
                if (new Date().getTime() < timerStart + 10000)
                {
                    textArea.setText("НА ЭТО НЕТ ВРЕМЕНИ!");
                }
                else
                {
                    Primary.stop();
                    Secondary.play("./AMOGUS II/boom.wav", false, 2500);
                    Secondary.play("./AMOGUS II/gameover.wav", false, 0);
                    textArea.setText("СЛИШКОМ ПОЗДНО!\nА вообще, взрыв - как укол.\nБыстро было. Больно не было.");
                    condition = -1;
                    this.gameOver();
                }
                break;
            }
            case 10000000:
            {
                textArea.setText("Вы находитесь в первой комнате.");
                if (findByName("дверь", scene[sceneNum].inventory) >= 0)
                    textArea.append("\nСпереди вы видите дверь.");
                else
                    textArea.append("\nСпереди вы видите проход.");
                if (findByName("ключ", scene[sceneNum].inventory) >= 0)
                    textArea.append("\nНа двери спереди висит ключ.");
                break;
            }
            case 10000001:
            {
                textArea.setText("Вы находитесь во второй комнате.");
                textArea.append("\nНа всю стену перед вами\nпростирается Дробитель...");
                condition = 11000001;
                break;
            }
            case 11000001:
            {
                textArea.setText("");
                if (findByName("камень", scene[sceneNum].inventory) >= 0)
                    textArea.append("На полу лежит камень.\n");
                textArea.append("Сзади вы видите проход в первую\nкомнату.");
                condition = 0;
                break;
            }
            case 20000000:
            {
                Primary.stop();
                Secondary.play("./AMOGUS II/switch.wav", false, 700);
                Secondary.stop();
                textArea.setText("Вы вошли в первую комнату.");
                sceneNum = 0;
                Primary.play("./AMOGUS II/room1.wav", true, 0);
                break;
            }
            case 20000001:
            {
                if (findByName("дверь", scene[sceneNum].inventory) >= 0)
                    textArea.setText("Дверь заперта.");
                else
                {
                    Primary.stop();
                    Secondary.play("./AMOGUS II/switch.wav", false, 700);
                    Secondary.stop();
                    textArea.setText("Вы вошли во вторую комнату.");
                    sceneNum = 1;
                    Primary.play("./AMOGUS II/room2.wav", true, 0);
                }
                break;
            }
            case 40000000:
            {
                textArea.setText("Красавец!");
                break;
            }
            case 40000001:
            {
                textArea.setText("Ключ как ключ.\nОткрывает двери.");
                break;
            }
            case 40000002:
            {
                textArea.setText("Закрытая дверь.\nОдна из многих, надо полагать.");
                break;
            }
            case 40000003:
            {
                textArea.setText("Камень с вкраплениями грязи.\nДовольно рыхлый.");
                break;
            }
            case 40000004:
            {
                textArea.setText("СДНФ - Стационарный Дробитель\nНастенный, Функциональный.\nДроби считает...");
                condition = 41000004;
                break;
            }
            case 41000004:
            {
                textArea.setText("Обладает невероятной точностью\nв том числе из-за занимаемого\nсобой объёма...");
                condition = 42000004;
                break;
            }
            case 42000004:
            {
                textArea.setText("Перегрузится - стене не\nпоздоровится.");
                condition = 0;
                break;
            }
            case 50000000:
            {
                textArea.setText("Эй, руки прочь от себя!\nИгрушка детская!");
                break;
            }
            case 50000001:
            {
                textArea.setText("Не надо вскры-ва-тьсяяяяяя!");
                break;
            }
            case 50002001:
            {
                textArea.setText("Вы открыли дверь ключом.");
                if (findByName("ключ", inventory) > -1)
                {
                    inventory.remove(findByName("ключ", inventory));
                    inventoryToWindow();
                }
                else
                    scene[sceneNum].inventory.remove(findByName("ключ", scene[sceneNum].inventory));
                scene[sceneNum].inventory.remove(findByName("дверь", scene[sceneNum].inventory));
                break;
            }
            case 50000002:
            {
                textArea.setText("Дверь не поддаётся.");
                break;
            }
            case 50000003:
            {
                textArea.setText("Вы съели камень. Зачем?");
                /*
                if (findByName("камень", inventory) > -1)
                {
                    inventory.remove(findByName("камень", inventory));
                    inventoryToWindow();
                }
                else
                    scene[sceneNum].inventory.remove(findByName("камень", scene[sceneNum].inventory));
                 */
                break;
            }
            case 50004003:
            {
                if (sceneNum != 1)
                throw(new Exception("дробитель"));
                textArea.setText("Не пробил!\nА вот камень раскололся.");
                /*
                if (findByName("камень", inventory) > -1)
                {
                    inventory.remove(findByName("камень", inventory));
                    inventoryToWindow();
                }
                else
                    scene[sceneNum].inventory.remove(findByName("камень", scene[sceneNum].inventory));
                 */
                break;
            }
            case 50000004:
            {
                Scanner cin = new Scanner(System.in);
                textArea.setText("Вы встали за панель Дробителя.\nПеред вами набор цифр.");
                textArea.append("\nОн запрашивает числитель.");
                condition = 51000004;
                break;
            }
            case 51000004:
            {
                while (true)
                {
                    //try
                    //{
                        a = Integer.parseInt(input);
                        condition = 52000004;
                        textArea.setText("Теперь он просит знаменатель.\nХмм...");
                        break;
                    /*}
                    catch (NumberFormatException e)
                    {
                        textArea.setText("Не бывает таких дробей!\nСоберись и введи заново!");
                        condition = 0;
                        return;
                    }
                     */
                }
                break;
            }
            case 52000004:
            {
                int b = 0;
                while (true)
                {
                    //try
                    //{
                        b = Integer.parseInt(input);
                        break;
                    /*}
                    catch (NumberFormatException e)
                    {
                        textArea.setText("Не бывает таких дробей!\nСоберись и введи заново!");
                        condition = 0;
                        return;
                    }
                     */
                }
                try
                {
                    int d = a/b;
                }
                catch (ArithmeticException e)
                {
                    textArea.setText("Ловко придумал! Дробитель\nуходит в бесконечность.\nПерегрузка неминуема. Беги!!!");
                    sceneNum = 2;
                    timerStart = new Date().getTime();
                    condition = 0;
                    break;
                }
                textArea.setText("Частное:\n" + (double)a/(double)b);
                textArea.append("\nПриятного деления!...");
                condition = 53000004;
                break;
            }
            case 53000004:
            {
                textArea.setText("Вы не чувствуете\nудовлетворённость результатом.");
                condition = 0;
                break;
            }
            case 60000000:
            {
                textArea.setText("Садомазохизм не одобряем.");
                break;
            }
            case 60000001:
            {
                textArea.setText("Молитесь теперь, чтобы об этом\nне узнала вся его связка.");
                break;
            }
            case 60000002:
            {
                textArea.setText("Чтож, хорошая дверь. Прочная.\nА вы нет.");
                break;
            }
            case 60000003:
            {
                textArea.setText("Вам удалось самоутвердиться перед\nкамнем. От удара он рассыпался.");
                textArea.append("\nГалька это запомнит.");
                /*
                if (findByName("камень", inventory) >= 0)
                {
                    inventory.remove(findByName("камень", inventory));
                    inventoryToWindow();
                }
                else
                    scene[sceneNum].inventory.remove(findByName("камень", scene[sceneNum].inventory));
                 */
                break;
            }
            case 60000004:
            {
                textArea.setText("Вы хорошенько зарядили по панели\nввода Дробителя. Вам удалось\nвырвать несколько кнопок...");
                condition = 61000004;
                break;
            }
            case 61000004:
            {
                textArea.setText("НЕВЕРОЯТНАЯ МОЩНОСТЬ!!!...");
                condition = 62000004;
                break;
            }
            case 62000004:
            {
                textArea.setText("Подумали вы. Однако ваша рука\nпопала на оголённые провода...");
                condition = 63000004;
                break;
            }
            case 63000004:
            {
                textArea.setText("Дробитель хорошенько зарядил по\nвам в ответ. Технически,\nвы не ошиблись...");
                condition = 64000004;
                break;
            }
            case 64000004:
            {
                textArea.setText("Мощность действительно\nбыла невероятной.");
                Primary.stop();
                Secondary.play("./AMOGUS II/gameover.wav", false, 0);
                condition = -1;
                gameOver();
                break;
            }
            case 90000000:
            {
                Primary.stop();
                Secondary.play("./AMOGUS II/boom.wav", false, 2500);
                if (new Date().getTime() < timerStart + 10000)
                {
                    Secondary.play("./AMOGUS II/switch.wav", false, 700);
                    textArea.setText("Вам удаётся выбраться из\nкомнаты прежде, чем\nпрогремел взрыв!..");
                    condition = 91000000;
                    break;
                }
                else
                {
                    textArea.setText("СЛИШКОМ ПОЗДНО!");
                    textArea.append("\nА вообще, взрыв - как укол.\nБыстро было. Больно не было.");
                    condition = -1;
                    Secondary.play("./AMOGUS II/gameover.wav", false, 0);
                    gameOver();
                    break;
                }
            }
            case 91000000:
            {
                textArea.setText("Оборачиваясь, вы видите, что\nстены больше нет. Есть\nтолько путь на свободу...");
                condition = 92000000;
                break;
            }
            case 92000000:
            {
                textArea.setText("Победа!");
                Secondary.play("./AMOGUS II/win.wav", false, 0);
                condition = -1;
                break;
            }
        }
    }

    public void gameOver()
    {
        DateFormat DF = new SimpleDateFormat("dd-MM-yyyy");
        String date = DF.format(new Date());
        inventoryArea.setText(" ______________");
        inventoryArea.append("\n/                           " + (char)92);
        inventoryArea.append("\n|   HERE  LIES   |");
        inventoryArea.append("\n|     AMOGUS     |");
        inventoryArea.append("\n|  XX-XX-XXXX |");
        inventoryArea.append("\n|             --            |");
        inventoryArea.append("\n|     " + date + "    |");
        inventoryArea.append("\n|______________|");
    }

    public int sceneNum = 0;
    public Scene scene[];
    public LinkedList<Item> inventory = new LinkedList<>();
    public long timerStart;
    public int condition = 0;
    public int a = 0;
}
