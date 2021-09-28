package ru.mirea.task8.opt1;

import java.awt.GridLayout;
import javax.swing.JFrame;

public class Form extends JFrame
{
    public Form() {
        setLayout(new GridLayout(4, 5));
        setTitle("Application");
        for (int i = 0; i < 20; i++){
            double n = (int) (Math.random() * 255) ;
            if ((n > 0) && (n < 100)) add(new Circle());
            if ((n>=100) && (n<179)) add(new Rectangle());
            if ((n >= 179) && (n <= 255)) add(new Triangle());
        }
        setBounds(200, 200, 450, 350);
    }
}
