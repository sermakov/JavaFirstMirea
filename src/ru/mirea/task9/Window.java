package ru.mirea.task9;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Window extends JFrame {
    int milan=0;
    int madrid=0;
    String lastScore;
    JLabel score = new JLabel("Winner: Draw");
    JLabel last= new JLabel("Last Scorer: N/A");
    JButton but1= new JButton("Real Madrid");
    JButton but2= new JButton("End match");
    JButton but3= new JButton("AC Milan");
    JPanel[] pnl = new JPanel[9];
    public Window()
    {
        setLayout(new GridLayout(3,3));
        pnl[0] = new JPanel();
        pnl[0].add(new JLabel("Real Madrid"));
        add(pnl[0]);
        pnl[1] = new JPanel();
        pnl[1].add(score);
        add(pnl[1]);
        pnl[2] = new JPanel();
        pnl[2].add(new JLabel("AC Milan"));
        add(pnl[2]);
        pnl[3] = new JPanel();
        pnl[3].add(but1);
        but1.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent a)
            {
                madrid++;
                    score.setText(String.valueOf(madrid)+":"+String.valueOf(milan));
                    lastScore="Last scorer is Real Madrid";
            }
        });
        add(pnl[3]);
        pnl[4] = new JPanel();
        pnl[4].add(but2);
        but2.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent a)
            {
                if(madrid>milan)
                {
                    score.setText("Winner: Real Madrid");
                }else if (madrid<milan){
                    score.setText("Winner: AC Milan");
                }else{ score.setText("Draw");};
                milan=0;
                madrid=0;
                last.setText(lastScore);
            }
        });
        add(pnl[4]);
        pnl[5] = new JPanel();
        pnl[5].add(but3);
        but3.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent a)
            {
                milan++;
                    score.setText(String.valueOf(madrid) + ":" + String.valueOf(milan));
                    lastScore = "Last scorer is AC Milan";
            }
        });
        add(pnl[5]);
        pnl[6] = new JPanel();
        add(pnl[6]);
        pnl[7] = new JPanel();
        pnl[7].add(last);
        add(pnl[7]);
        pnl[8] = new JPanel();
        add(pnl[8]);
        setSize(800,600);
        setTitle("Football");
    }
    public static void main(String[]args)
    {
        new Window().setVisible(true);
    }
}