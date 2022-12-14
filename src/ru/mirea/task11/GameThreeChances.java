package ru.mirea.task11;
import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class GameThreeChances extends JFrame {
    JButton b = new JButton("Попитка 1");
    JTextField tf = new JTextField(20);
    int n = (int) ((Math.random() * ((20) + 1)) + 0);
    int i;
    GameThreeChances() {
        super("Интерестнейшая игра");
        setLayout(new FlowLayout());
        setSize(250, 100);
        add(tf);
        add(b);
        i=2;
        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (i<4) {
                    int a = Integer.parseInt(tf.getText());
                    if (a==n) {
                        tf.setText("И вы выиграли авто...ничего)");
                        b.setText("Конец");
                        i=4;
                    } else {
                        if (a<n) {
                            b.setText("Попытка " + i + ". Попробуй больше");
                            tf.setText("");
                        } else {
                            b.setText("Попытка " + i + ". Попробуй меньше");
                            tf.setText("");
                        }
                    }
                } else {
                    tf.setText("Вы проиграли и это успех");
                    b.setText("Конец");
                }
                if (i==5) {
                    System.exit(0);
                }
                i++;
            }
        });
        setVisible(true);
    }
    public static void main(String[] args) {
        new GameThreeChances();
    }
}