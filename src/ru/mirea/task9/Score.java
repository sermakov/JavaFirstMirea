package ru.mirea.task9;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Score extends JFrame
{
    public Score()
    {
        super("Score");
        JPanel[] pnl = new JPanel[15];
        setSize(720, 300);
        setLayout(new GridLayout(3, 5));
        int[] score = new int[2];
        score[0] = 0;
        score[1] = 0;
        JLabel scoreLabel = new JLabel("         Result: " + score[0] +  " X " + score[1]);
        JLabel lastLabel = new JLabel("        Last Scorer: N/A");
        JLabel winnerLabel = new JLabel("         Winner: DRAW");
        JButton[] button = new JButton[2];
        button[0] = new JButton("AC Milan");
        button[1] = new JButton("Real Madrid");
        BorderLayout[] BL = new BorderLayout[15];
        for (int i = 0; i < pnl.length; i++)
        {
            pnl[i] = new JPanel();
            BL[i] = new BorderLayout();
            switch(i)
            {
                case 6:
                {
                    add(button[0]);
                    button[0].addActionListener(new ActionListener()
                    {
                        public void actionPerformed(ActionEvent e)
                        {
                            score[0]++;
                            scoreLabel.setText("         Result: " + score[0] +  " X " + score[1]);
                            lastLabel.setText("   Last Scorer: AC Milan");
                            if (score[0] > score[1])
                                winnerLabel.setText("       Winner: AC Milan");
                            if (score[0] == score[1])
                                winnerLabel.setText("         Winner: DRAW");
                            if (score[0] < score[1])
                                winnerLabel.setText("    Winner: Real Madrid");
                        }
                    });
                    break;
                }
                case 8:
                {
                    add(button[1]);
                    button[1].addActionListener(new ActionListener()
                    {
                        public void actionPerformed(ActionEvent e)
                        {
                            score[1]++;
                            scoreLabel.setText("         Result: " + score[0] +  " X " + score[1]);
                            lastLabel.setText("Last Scorer: Real Madrid");
                            if (score[0] > score[1])
                                winnerLabel.setText("       Winner: AC Milan");
                            if (score[0] == score[1])
                                winnerLabel.setText("         Winner: DRAW");
                            if (score[0] < score[1])
                                winnerLabel.setText("    Winner: Real Madrid");
                        }
                    });
                    break;
                }
                default:
                {
                    add(pnl[i]);
                    break;
                }
            }
        }

        pnl[2].setLayout(BL[2]);
        pnl[2].add(scoreLabel, BorderLayout.CENTER);

        pnl[7].setLayout(BL[7]);
        pnl[7].add(lastLabel, BorderLayout.CENTER);

        pnl[12].setLayout(BL[12]);
        pnl[12].add(winnerLabel, BorderLayout.CENTER);
    }

    public static void main(String[] args)
    {
        new Score().setVisible(true);
    }
}
