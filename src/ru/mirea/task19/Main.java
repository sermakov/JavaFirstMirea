package ru.mirea.task19;
//НОВОВВЕДЕНИЕ: все ситуации отсутствия предметов в инвентаре обрабатываются перехватом пользовательского исключения; прохождение снизу
import java.io.IOException;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args) throws Exception
    {
        int scenes = 5;

        Game G = new Game();
        Scene[] scene = new Scene[scenes];
        String[][] action = new String[scenes][];
        int[][] response = new int[scenes][];

        action[0] = new String[4];
        action[0][0] = "осмотреться";
        action[0][1] = "идти вперёд";
        action[0][2] = "съесть камень";
        action[0][3] = "взять ключ";
        response[0] = new int[4];
        response[0][0] = 10000000;
        response[0][1] = -20000001;
        response[0][2] = 90000000;
        response[0][3] = 30000000;
        scene[0] = new Scene("./AMOGUS II/sample.png", action[0], response[0]);

        action[1] = new String[4];
        action[1][0] = "осмотреться";
        action[1][1] = "идти вперёд";
        action[1][2] = "съесть камень";
        action[1][3] = "использовать ключ на дверь";
        response[1] = new int[4];
        response[1][0] = 10000002;
        response[1][1] = -20000001;
        response[1][2] = 90000000;
        response[1][3] = 40000000;
        scene[1] = new Scene("./AMOGUS II/sample.png", action[1], response[1]);

        action[2] = new String[3];
        action[2][0] = "осмотреться";
        action[2][1] = "идти вперёд";
        action[2][2] = "съесть камень";
        response[2] = new int[3];
        response[2][0] = 10000003;
        response[2][1] = 20000001;
        response[2][2] = 90000000;
        scene[2] = new Scene("./AMOGUS II/sample.png", action[2], response[2]);

        action[3] = new String[6];
        action[3][0] = "осмотреться";
        action[3][1] = "идти назад";
        action[3][2] = "взять камень";
        action[3][3] = "съесть камень";
        action[3][4] = "использовать камень на дробитель";
        action[3][5] = "использовать дробитель";
        response[3] = new int[6];
        response[3][0] = 10000001;
        response[3][1] = 20000000;
        response[3][2] = 30000001;
        response[3][3] = 90000000;
        response[3][4] = 40000001;
        response[3][5] = 40000002;
        scene[3] = new Scene("./AMOGUS II/sample.png", action[3], response[3]);

        action[4] = new String[2];
        action[4][0] = "осмотреться";
        action[4][1] = "идти назад";
        response[4] = new int[2];
        response[4][0] = 10000004;
        response[4][1] = 90000001;
        scene[4] = new Scene("./AMOGUS II/sample.png", action[4], response[4]);

        G.scene = scene;
        G.act("осмотреться");
        Scanner in = new Scanner(System.in);
        String input;
        while (true)
        {
            input = in.nextLine();
            try
            {
                G.act(input);
            }
            catch (Exception e)
            {
                System.out.println("Вы не можете найти у себя " + e.getMessage() + ".\n\n");
            }
        }
    }
}

/*
ПРОХОЖДЕНИЕ
С точки зрения пользователя ничего не изменилось.
Можно попробовать поесть камни без камней в инвентаре, чтобы убедиться, что перехват исключений работает.
 */