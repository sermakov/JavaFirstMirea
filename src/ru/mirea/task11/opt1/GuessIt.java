package ru.mirea.task11.opt1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GuessIt extends JFrame {
    int attempt = 3;
    int rand = Rand();
    public GuessIt() {
        JFrame frame = new JFrame("GuessIt");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setBackground(Color.GRAY);
        frame.setSize(800, 600);
        JButton but1 = new JButton("Guess");
        but1.setBounds(325, 500, 150, 30);
        frame.setLayout(null);
        frame.add(but1);
        JLabel labelTry = new JLabel("Attempts left: 3");
        labelTry.setBounds(325, 100, 150, 150);
        frame.add(labelTry);
        JLabel labelHelper = new JLabel("");
        labelHelper.setBounds(325, 150, 150, 150);
        frame.add(labelHelper);
        JTextField Input = new JTextField(10);
        Input.setBounds(325,400,150,30);
        frame.add(Input);
        JButton but2 = new JButton("Restart game");
        but2.setBounds(50, 50, 150, 30);
        frame.add(but2);
        frame.setVisible(true);
        but1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                try {
                    int x1 = Integer.parseInt(Input.getText().trim());
                    Input.setText(null);
                    if(x1>rand){
                        attempt--;
                        labelHelper.setText("Yor number " + x1 + " is greater");
                        labelTry.setText("Attempts left: " + attempt);
                        but1.setBackground(Color.yellow);
                    }
                    else if(x1<rand){
                        attempt--;
                        labelHelper.setText("Yor number " + x1 + " is lesser");
                        labelTry.setText("Attempts left: " + attempt);
                        but1.setBackground(Color.yellow);
                    }
                    else {
                        JOptionPane.showMessageDialog(null, "You Win!", "Congratulation", JOptionPane.INFORMATION_MESSAGE);
                        attempt=3;
                        rand=Rand();
                        labelTry.setText("Attempts left: " + attempt);
                        labelHelper.setText("");
                        but1.setBackground(Color.green);
                    }
                    if(attempt == 0){
                        but1.setBackground(Color.red);
                        JOptionPane.showMessageDialog(null, "Attempts is end!", "Alert", JOptionPane.ERROR_MESSAGE);
                        but1.setBackground(Color.white);
                        attempt=3;
                        rand=Rand();
                        labelTry.setText("Attempts left: " + attempt);
                        labelHelper.setText("");
                    }
                } catch (Exception e) {
                    but1.setBackground(Color.red);
                    JOptionPane.showMessageDialog(null, "Error in Numbers!", "Alert", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        but2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent a) {
                    attempt = 3;
                    rand = Rand();
                    Input.setText(null);
                    labelTry.setText("Attempts left: 3");
                    labelHelper.setText("");
                    but1.setBackground(Color.white);
                }
        });
    }
    public int Rand()
    {
        return (int) (Math.random()*20);
    }
    public static void main (String[]args)
    {
        GuessIt frame = new GuessIt();
    }
}