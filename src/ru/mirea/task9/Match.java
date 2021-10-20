package ru.mirea.task9;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Match extends JFrame {
    JButton b1 = new JButton("AC Milan");
    JButton b2 = new JButton("Real Madrid");
    JLabel result = new JLabel();
    JLabel lastScore = new JLabel();
    JLabel winner = new JLabel();
    int c1, c2 = 0;
    Match () {
        super("Account");
        setLayout(new FlowLayout());
        setSize(250,150);
        add(b1);
        add(b2);
        add(result);
        add(lastScore);
        add(winner);
        result.setText("Result: 0 X 0");
        lastScore.setText("Last score: N/A");
        winner.setText("Winner: DRAW");
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                c1++;
                result.setText("Result: " + c1 + " X " + c2);
                lastScore.setText("Last score: " + b1.getText());
                if (c1 > c2) {
                    winner.setText("Winner: AC Milan");
                } else {
                    if (c2 > c1) {
                        winner.setText("Winner: Real Madrid");
                    } else {
                        winner.setText("Winner: no one");
                    }
                }
            }
        });
        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                c2++;
                result.setText("Result: " + c1 + " X " + c2);
                lastScore.setText("Last score: " + b2.getText());
                if (c1 > c2) {
                    winner.setText("Winner: AC Milan");
                } else {
                    if (c2 > c1) {
                        winner.setText("Winner: Real Madrid");
                    } else {
                        winner.setText("Winner: no one");
                    }
                }
            }
        });
        setVisible(true);
    }

    public static void main(String[] args) {
        new Match();
    }
}