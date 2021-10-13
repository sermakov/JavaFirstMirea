package ru.mirea.task14.opt5;

import ru.mirea.task14.opt1.Game;
import javax.swing.*;
import java.awt.*;

public class GameInterface extends JFrame {

    public GameInterface(){
        super("Пьяница");
        setSize(480, 140);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        JLabel firstStart = new JLabel(),
                secondStart = new JLabel(),
                curAdd = new JLabel("0");
        JPanel p = new JPanel();
        BoxLayout b = new BoxLayout(p, BoxLayout.Y_AXIS);
        p.setLayout(b);

        JButton addFirst = new JButton("Первому!"),
                addSecond = new JButton("Второму!"),
                playButton = new JButton("Играть");
        p.add(addFirst);
        p.add(addSecond);

        JPanel p1 = new JPanel();
        p1.add(new JLabel("Первый игрок:"));
        p1.add(firstStart);

        JPanel p2 = new JPanel();
        p2.add(new JLabel("Второй игрок:"));
        p2.add(secondStart);

        JPanel p3 = new JPanel();
        p3.add( new JLabel("Добавить номер: "));
        p3.add(curAdd);

        getContentPane().add(p1, BorderLayout.NORTH);
        getContentPane().add(p2, BorderLayout.SOUTH);
        getContentPane().add(p3, BorderLayout.CENTER);
        getContentPane().add(p, BorderLayout.EAST);
        getContentPane().add(playButton, BorderLayout.WEST);

        playButton.setEnabled(false);


        addFirst.addActionListener(e->{
            firstStart.setText(firstStart.getText()+curAdd.getText());
            curAdd.setText((new Integer(Integer.parseInt(curAdd.getText())+1)).toString());
            if(firstStart.getText().length() == 5) {
                addFirst.setEnabled(false);
                if(secondStart.getText().length() == 5){
                    playButton.setEnabled(true);
                }
            }
        });
        addSecond.addActionListener(e->{
            secondStart.setText(secondStart.getText()+curAdd.getText());
            curAdd.setText((new Integer(Integer.parseInt(curAdd.getText())+1)).toString());
            if(secondStart.getText().length() == 5) {
                addSecond.setEnabled(false);
                if(firstStart.getText().length() == 5){
                    playButton.setEnabled(true);
                }
            }
        });

        playButton.addActionListener(e->{
            JOptionPane.showMessageDialog(this, new Game(firstStart.getText(), secondStart.getText()).play());
            firstStart.setText("");
            secondStart.setText("");
            curAdd.setText("0");
            addFirst.setEnabled(true);
            addSecond.setEnabled(true);
            playButton.setEnabled(false);
        });

    }

    public static void main(String[] args) {
        new GameInterface().setVisible(true);
    }
}
