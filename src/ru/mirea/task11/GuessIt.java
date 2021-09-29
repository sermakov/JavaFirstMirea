package ru.mirea.task11;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GuessIt extends JFrame {
    public GuessIt() {
        int attempt=3;
        int rand = Rand();
        JFrame frame = new JFrame("GuessIt");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBackground(Color.BLUE);
        frame.setSize(800, 600);
        JButton but1 = new JButton("Guess");
        but1.setBounds(325, 500, 150, 30);
        frame.setLayout(null);
        frame.add(but1);
        JLabel labelTry = new JLabel("Attempts left:");
        labelTry.setBounds(325, 100, 150, 150);
        frame.add(labelTry);
        JLabel labelHelper = new JLabel("");
        labelHelper.setBounds(325, 150, 150, 150);
        frame.add(labelHelper);
        JTextField Input = new JTextField(10);
        Input.setBounds(325,400,150,30);
        frame.add(Input);
        frame.setVisible(true);
        but1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                try {
                    int x1 = Integer.parseInt(Input.getText().trim());
                    if(attempt == 0){
                        JOptionPane.showMessageDialog(null, "Attempts is end !", "alert", JOptionPane.WARNING_MESSAGE);
                    }
                    if(x1>rand){
                        labelHelper.setText("Yor number " + x1 + " is greater");
                    }
                    if(x1<rand){
                        labelHelper.setText("Yor number " + x1 + " is lesser");
                    }
                    if(x1==rand){
                        JOptionPane.showMessageDialog(null, "You Win !", "Congratulation", JOptionPane.INFORMATION_MESSAGE);
                    }
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Error in Numbers !", "alert", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

    }
    public int Rand(){
        return (int) (Math.random()*20);
    }
    public static void main (String[]args)
    {
        GuessIt frame = new GuessIt();
    }
}