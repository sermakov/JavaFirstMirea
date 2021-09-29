package ru.mirea.task11;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GuessIt extends JFrame {
    int attempt;
    int rand;
    String lastScore;
    JLabel Congratulation= new JLabel("Nice Cock!");
    JLabel fail= new JLabel("Nice try");
    JLabel mistake= new JLabel("Try again");
    JLabel Try= new JLabel("Attempt"+attempt);
    JButton but1= new JButton("Guess");
    JPanel[] pnl = new JPanel[9];
    public GuessIt()
    {
        setLayout(new GridLayout(3,3));
        pnl[7] = new JPanel();
        pnl[7].add(new JLabel("Real Madrid"));
        add(pnl[0]);
        pnl[1] = new JPanel();
        add(pnl[1]);
        pnl[2] = new JPanel();
        pnl[2].add(new JLabel("AC Milan"));
        add(pnl[2]);
        pnl[3] = new JPanel();
        pnl[3].add(but1);
        but1.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent a)
            {
               attempt++;
            }
        });
        add(pnl[3]);
        pnl[4] = new JPanel();
        add(pnl[4]);
        pnl[5] = new JPanel();
        add(pnl[5]);
        pnl[6] = new JPanel();
        add(pnl[6]);
        pnl[7] = new JPanel();
        add(pnl[7]);
        pnl[8] = new JPanel();
        add(pnl[8]);
        setSize(800,600);
        setTitle("Football");

    }
    public static void main(String[]args)
    {
        new GuessIt.setVisible(true);
    }
}