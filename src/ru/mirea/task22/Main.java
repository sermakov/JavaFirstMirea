package ru.mirea.task22;
//НОВОВВЕДЕНИЯ: система предметов переработана так, чтобы предмет был одним из двух классов наследников класса item
//создание предмета происходит посредством соответствующей фабрики
//в связи с этим изменены системы регистрации и поиска предметов, например, сцена теперь тоже имеет инвентарь
//действия с предметами в инвентаре теперь могут быть не связаны со сценой полноценно и выполняться в любом месте
import java.util.LinkedList;
import java.util.Scanner;

enum type
{
    T,
    NT
}

public class Main
{
    public static Item ItemFactory(type tp, String name, String[] action, int[] response)
    {
        Item product = null;
        switch (tp)
        {
            case T:
            {
                product = new Takeable(name, action, response);
                break;
            }
            case NT:
            {
                product = new NonTakeable(name, action, response);
                break;
            }
        }
        return(product);
    }

    public static void main(String[] args) throws Exception
    {
        int scenes = 3;
        int items = 5;

        Game G = new Game();
        Scene[] scene = new Scene[scenes];
        String[][] action = new String[scenes][];
        int[][] response = new int[scenes][];
        String[] name = new String[items];
        String[][] iaction = new String[items][];
        int[][] iresponse = new int[items][];
        LinkedList<Item>[] inventory = new LinkedList[scenes];
        for (int i = 0; i < scenes; i++)
            inventory[i] = new LinkedList<>();

        iaction[0] = new String[4];
        iaction[0][0] = "D";
        iaction[0][1] = "осмотреть себя";
        iaction[0][2] = "использовать себя";
        iaction[0][3] = "ударить себя";
        iresponse[0] = new int[4];
        iresponse[0][0] = 0;
        iresponse[0][1] = 40000000;
        iresponse[0][2] = 50000000;
        iresponse[0][3] = 60000000;
        G.inventory.add(ItemFactory(type.NT, "себя", iaction[0], iresponse[0]));

        action[0] = new String[5];
        action[0][0] = "D";
        action[0][1] = "осмотреться";
        action[0][2] = "идти вперёд";
        response[0] = new int[5];
        response[0][0] = 0;
        response[0][1] = 10000000;
        response[0][2] = 20000001;
        iaction[1] = new String[5];
        iaction[1][0] = "D";
        iaction[1][1] = "осмотреть ключ";
        iaction[1][2] = "использовать ключ на себя";
        iaction[1][3] = "использовать ключ на дверь";
        iaction[1][4] = "ударить ключ";
        iresponse[1] = new int[5];
        iresponse[1][0] = 0;
        iresponse[1][1] = 40000001;
        iresponse[1][2] = 50000001;
        iresponse[1][3] = 50002001;
        iresponse[1][4] = 60000001;
        inventory[0].add(ItemFactory(type.T, "ключ", iaction[1], iresponse[1]));
        iaction[2] = new String[4];
        iaction[2][0] = "D";
        iaction[2][1] = "осмотреть дверь";
        iaction[2][2] = "использовать дверь";
        iaction[2][3] = "ударить дверь";
        iresponse[2] = new int[4];
        iresponse[2][0] = 0;
        iresponse[2][1] = 40000002;
        iresponse[2][2] = 50000002;
        iresponse[2][3] = 60000002;
        inventory[0].add(ItemFactory(type.NT, "дверь", iaction[2], iresponse[2]));
        scene[0] = new Scene("./AMOGUS II/sample.png", action[0], response[0], inventory[0]);

        action[1] = new String[7];
        action[1][0] = "D";
        action[1][1] = "осмотреться";
        action[1][2] = "идти назад";
        response[1] = new int[7];
        response[1][0] = 0;
        response[1][1] = 10000001;
        response[1][2] = 20000000;
        iaction[3] = new String[5];
        iaction[3][0] = "D";
        iaction[3][1] = "осмотреть камень";
        iaction[3][2] = "использовать камень на себя";
        iaction[3][3] = "использовать камень на дробитель";
        iaction[3][4] = "ударить камень";
        iresponse[3] = new int[5];
        iresponse[3][0] = 0;
        iresponse[3][1] = 40000003;
        iresponse[3][2] = 50000003;
        iresponse[3][3] = 50004003;
        iresponse[3][4] = 60000003;
        inventory[1].add(ItemFactory(type.T, "камень", iaction[3], iresponse[3]));
        iaction[4] = new String[4];
        iaction[4][0] = "D";
        iaction[4][1] = "осмотреть дробитель";
        iaction[4][2] = "использовать дробитель";
        iaction[4][3] = "ударить дробитель";
        iresponse[4] = new int[4];
        iresponse[4][0] = 0;
        iresponse[4][1] = 40000004;
        iresponse[4][2] = 50000004;
        iresponse[4][3] = 60000004;
        inventory[1].add(ItemFactory(type.NT, "дробитель", iaction[4], iresponse[4]));
        scene[1] = new Scene("./AMOGUS II/sample.png", action[1], response[1], inventory[1]);

        action[2] = new String[2];
        action[2][0] = "D";
        action[2][1] = "идти назад";
        response[2] = new int[2];
        response[2][0] = 1;
        response[2][1] = 90000000;
        scene[2] = new Scene("./AMOGUS II/sample.png", action[2], response[2], inventory[2]);

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
                System.out.println("Вам не удалось найти " + e.getMessage() + ".\n\n");
            }
        }
    }
}