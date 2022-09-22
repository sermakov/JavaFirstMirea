package ru.mirea.task17;
//НОВОВВЕДЕНИЕ: предметы из инвентаря теперь не String, а enum Item; прохождение снизу
import java.io.IOException;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args) throws IOException
    {
        int scenes = 4;

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

        action[3] = new String[4];
        action[3][0] = "осмотреться";
        action[3][1] = "идти назад";
        action[3][2] = "взять камень";
        action[3][3] = "съесть камень";
        response[3] = new int[4];
        response[3][0] = 10000001;
        response[3][1] = 20000000;
        response[3][2] = 30000001;
        response[3][3] = 90000000;
        scene[3] = new Scene("./AMOGUS II/sample.png", action[3], response[3]);

        G.scene = scene;

        G.act("осмотреться");
        Scanner in = new Scanner(System.in);
        String input;
        while (true)
        {
            input = in.nextLine();
            G.act(input);
        }
    }
}

/*
ПРОХОЖДЕНИЕ
взять ключ
осмотреться
использовать ключ на дверь
осмотреться
идти вперёд
взять камень
съесть камень
 */