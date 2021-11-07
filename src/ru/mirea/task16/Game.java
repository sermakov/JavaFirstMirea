package ru.mirea.task16;

import java.util.LinkedList;
import java.util.Objects;

public class Game
{
    public void act(String input)
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
                System.out.println("Спереди вы видите проход.\n\n");
                break;
            }
            case 10000001:
            {
                System.out.println("Вы находитесь во второй комнате.");
                System.out.println("Сзади вы видите проход.\n\n");
                break;
            }
            case 20000000:
            {
                System.out.println("Вы перешли в первую комнату.\n\n");
                sceneNum = 1;
                break;
            }
            case 20000001:
            {
                System.out.println("Вы перешли во вторую комнату.\n\n");
                sceneNum = 1;
                break;
            }
            case 30000001:
            {
                System.out.println("Вы подобрали камень.\n\n");
                inventory.add("камень");
                break;
            }
            case 90000000:
            {
                for (String i : inventory)
                {
                    if (i == "камень")
                    {
                        System.out.println("Вы съели камень. Победа!\n\n");
                        while (true){}
                    }
                }
                System.out.println("Вы не можете найти у себя камень.\n\n");
                break;
            }
        }
    }

    public int sceneNum = 0;
    public Scene scene[];
    public LinkedList<String> inventory = new LinkedList<>();
}
