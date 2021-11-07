package ru.mirea.task16;
//тест базовых механик, без графики
import java.io.IOException;
import java.util.Scanner;
import java.io.File;

public class Main
{
    public static void main(String[] args) throws IOException
    {
        int scenes = 2;

        Game G = new Game();
        Scene[] scene = new Scene[scenes];
        String[][] action = new String[scenes][];
        int[][] response = new int[scenes][];

        action[0] = new String[3];
        action[0][0] = "осмотреться";
        action[0][1] = "идти вперёд";
        action[0][2] = "съесть камень";
        response[0] = new int[3];
        response[0][0] = 10000000;
        response[0][1] = 20000001;
        response[0][2] = 90000000;

        action[1] = new String[4];
        action[1][0] = "осмотреться";
        action[1][1] = "идти назад";
        action[1][2] = "взять камень";
        action[1][3] = "съесть камень";
        response[1] = new int[4];
        response[1][0] = 10000001;
        response[1][1] = 20000000;
        response[1][2] = 30000001;
        response[1][3] = 90000000;

        System.out.println(new File("").getAbsolutePath());

        scene[0] = new Scene("./AMOGUS II/sample.png", action[0], response[0]);
        scene[1] = new Scene("./AMOGUS II/sample.png", action[1], response[1]);
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