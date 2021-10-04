package ru.mirea.task11.opt3;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

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
        Font font1 = new Font("Times Roman", Font.BOLD,30);
        JRadioButtonMenuItem item1 = new JRadioButtonMenuItem("Times new Roman");
        font.add(item1);
        Font font2 = new Font("Calibri", Font.ITALIC,30);
        JRadioButtonMenuItem item2 = new JRadioButtonMenuItem("Calibri");
        font.add(item2);
        Font font3 = new Font("Courier new", Font.PLAIN,30);
        JRadioButtonMenuItem item3 = new JRadioButtonMenuItem("Courier new");
        font.add(item3);
        JRadioButtonMenuItem color1 = new JRadioButtonMenuItem("Red");
        color.add(color1);
        JRadioButtonMenuItem color2 = new JRadioButtonMenuItem("Blue");
        color.add(color2);
        JRadioButtonMenuItem color3 = new JRadioButtonMenuItem("Pink");
        color.add(color3);
        frame.setVisible(true);
        item1.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if (item1.isSelected()==true) {
                    item2.setSelected(false);
                    item3.setSelected(false);
                }
                Input.setFont(font1);
            }
        });
        item2.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if (item2.isSelected()==true) {
                    item1.setSelected(false);
                    item3.setSelected(false);
                }
                Input.setFont(font2);
            }
        });
        item3.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if (item3.isSelected()==true) {
                    item1.setSelected(false);
                    item2.setSelected(false);
                }
                Input.setFont(font3);
            }
        });
        color1.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if (color1.isSelected()==true) {
                    color2.setSelected(false);
                    color3.setSelected(false);
                }
                Input.setForeground(Color.red);
            }
        });
        color2.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if (color2.isSelected()==true) {
                    color1.setSelected(false);
                    color3.setSelected(false);
                }
                Input.setForeground(Color.blue);
            }
        });
        color3.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if (color3.isSelected()==true) {
                    color1.setSelected(false);
                    color2.setSelected(false);
                }
                Input.setForeground(Color.pink);
            }
        });
    }
    public static void main (String[]args)
    {
        TextEditor frame = new TextEditor();
    }
}