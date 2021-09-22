package ru.mirea.task9;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Window {
    public static void main(String[] args){
        JFrame frame=new JFrame("Football");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBackground(Color.green);
        frame.setSize(800,600);
        JButton but1=new JButton("AC Milan");
        JButton but2=new JButton("Real Madrid");
        JButton but3=new JButton("Reset");
        but1.setBounds(310,250,150,30);
        but2.setBounds(310,250,150,30);
        but3.setBounds(750,500,150,30);
        frame.setVisible(true);
    }
}