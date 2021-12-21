package ru.mirea.task32;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.*;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Scanner;

//НОВОВВЕДЕНИЯ: проект завершён
enum type
{
    T,
    NT
}

public class Main
{
    public static LinkedList<String> actual = new LinkedList<>();

    public static Item ItemFactory(type tp, String name, HashMap<String, Integer> iactResp)
    {
        Item product = null;
        switch (tp)
        {
            case T:
            {
                product = new Takeable(name, iactResp);
                break;
            }
            case NT:
            {
                product = new NonTakeable(name, iactResp);
                break;
            }
        }
        return(product);
    }

    public static void main(String[] args) throws Exception
    {
        int scenes = 3;

        AttemptCounter attempt = null;
        try
        {
            FileInputStream fileInputStream = new FileInputStream("./AMOGUS II/attempt.txt");
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            attempt = (AttemptCounter) objectInputStream.readObject();
        }
        catch (Exception e)
        {
            attempt = new AttemptCounter();
        }
        attempt.number++;
        FileOutputStream outputStream = new FileOutputStream("./AMOGUS II/attempt.txt");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
        objectOutputStream.writeObject(attempt);
        objectOutputStream.close();

        Game G = new Game(attempt.number);
        Scene[] scene = new Scene[scenes];
        LinkedList<Item>[] inventory = new LinkedList[scenes];
        for (int i = 0; i < scenes; i++)
            inventory[i] = new LinkedList<>();

        HashMap<String, Integer> actResp0 = new HashMap<>();
        actResp0.put("D", 0);
        actResp0.put("осмотреться", 10000000);
        actResp0.put("идти вперёд", 20000001);

        HashMap<String, Integer> iactResp1 = new HashMap<>();
        iactResp1.put("D", 0);
        iactResp1.put("осмотреть ключ", 40000001);
        iactResp1.put("использовать ключ на себя", 50000001);
        iactResp1.put("использовать ключ на дверь", 50002001);
        iactResp1.put("ударить ключ", 60000001);
        inventory[0].add(ItemFactory(type.T, "ключ", iactResp1));

        HashMap<String, Integer> iactResp2 = new HashMap<>();
        iactResp2.put("D", 0);
        iactResp2.put("осмотреть дверь", 40000002);
        iactResp2.put("использовать дверь", 50000002);
        iactResp2.put("ударить дверь", 60000002);
        scene[0] = new Scene("./AMOGUS II/sample.png", actResp0, inventory[0]);
        inventory[0].add(ItemFactory(type.NT, "дверь", iactResp2));

        HashMap<String, Integer> actResp1 = new HashMap<>();
        actResp1.put("D", 0);
        actResp1.put("осмотреться", 10000001);
        actResp1.put("идти назад", 20000000);

        HashMap<String, Integer> iactResp3 = new HashMap<>();
        iactResp3.put("D", 0);
        iactResp3.put("осмотреть камень", 40000003);
        iactResp3.put("использовать камень на себя", 50000003);
        iactResp3.put("использовать камень на дробитель", 50004003);
        iactResp3.put("ударить камень", 60000003);

        inventory[1].add(ItemFactory(type.T, "камень", iactResp3));

        HashMap<String, Integer> iactResp4 = new HashMap<>();
        iactResp4.put("D", 0);
        iactResp4.put("осмотреть дробитель", 40000004);
        iactResp4.put("использовать дробитель", 50000004);
        iactResp4.put("ударить дробитель", 60000004);

        inventory[1].add(ItemFactory(type.NT, "дробитель", iactResp4));
        scene[1] = new Scene("./AMOGUS II/sample.png", actResp1, inventory[1]);

        HashMap<String, Integer> actResp2 = new HashMap<>();
        actResp2.put("осмотреться", 1);
        actResp2.put("идти назад", 90000000);
        scene[2] = new Scene("./AMOGUS II/sample.png", actResp2, inventory[2]);

        G.scene = scene;
        Scanner in = new Scanner(System.in);
        String input;

        JFrame inFrame = new JFrame("ДУ ИТ");
        inFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JTextField textField = new JTextField(20);
        Font font = new Font("Times new roman", Font.BOLD, 50);
        textField.setFont(font);
        textField.addKeyListener(new KeyAdapter()
        {
            public void keyPressed(KeyEvent e)
            {
                if (e.getKeyCode() == KeyEvent.VK_ENTER)
                {
                    try
                    {
                        String got = textField.getText();
                        textField.setText("");
                        G.act(got);
                    }
                    catch (Exception ex)
                    {
                        G.textArea.setText("Вам не удалось найти\n" + ex.getMessage() + ".");
                    }
                    textField.setText("");
                }
            }
        });
        inFrame.getContentPane().add(textField);
        inFrame.pack();
        inFrame.setLocation(0, 205);
        inFrame.setSize(836,100);
        inFrame.setVisible(true);

        while (true) {}
    }
}