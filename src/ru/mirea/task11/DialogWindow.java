package ru.mirea.task11;

import javax.swing.*;

public class DialogWindow extends JFrame
{
    public DialogWindow(String S)
    {
        super("Добро пожаловать в " + S + "!");
        setLocation(0,490);
        setSize(500, 10);
    }
}
