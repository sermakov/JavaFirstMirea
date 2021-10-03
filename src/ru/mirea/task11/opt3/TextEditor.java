package ru.mirea.task11.opt3;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class TextEditor extends JFrame {
    public TextEditor(){
        JFrame frame = new JFrame("TextEditor");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setBackground(Color.white);
        frame.setSize(800, 600);
        frame.setLayout(null);
        JTextField Input = new JTextField(10);
        Input.setBounds(325,400,150,30);
        frame.add(Input);
        JMenuBar bar = new JMenuBar();
        frame.setJMenuBar(bar);
        JMenu color = new JMenu("Color");
        bar.add(color);
        JMenu font = new JMenu("Font");
        bar.add(font);
        frame.setVisible(true);
    }
    public static void main (String[]args)
    {
        TextEditor frame = new TextEditor();
    }
}
