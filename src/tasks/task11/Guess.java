package tasks.task11;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Guess extends JFrame
{
    public Guess()
    {
        super("Guess!");
        JMenuBar menuBar = new JMenuBar();
        menuBar.add(color());
        menuBar.add(font());
        setJMenuBar(menuBar);
        textField.setFont(new Font("TimesRoman", Font.PLAIN, 100));
        JPanel[] pnl = new JPanel[3];
        setSize(100, 300);
        setLayout(new GridLayout(3, 1));
        JLabel label = new JLabel("             Guess!");
        JButton button = new JButton("Guess!");
        BorderLayout[] BL = new BorderLayout[3];
        int number = (int)(20 * Math.random());
        int[] round = new int[1];
        round[0] = 0;
        boolean[] win = new boolean[1];
        win[0] = false;
        for (int i = 0; i < pnl.length; i++)
        {
            pnl[i] = new JPanel();
            BL[i] = new BorderLayout();
            switch(i)
            {
                case 0:
                {
                    add(pnl[i]);
                    pnl[i].setLayout(BL[i]);
                    pnl[i].add(label, BL[i].CENTER);
                    break;
                }
                case 1:
                {
                    add(textField);
                    break;
                }
                case 2:
                {
                    add(button);
                    button.addActionListener(new ActionListener() {
                        public void actionPerformed(ActionEvent e)
                        {
                            if (round[0] == 3)
                                return;
                            if (win[0] == true)
                                return;
                            int num = Integer.valueOf(textField.getText());
                            textField.setText("");
                            if (num == number)
                            {
                                label.setText("           You win!");
                                win[0] = true;
                                return;
                            }
                            if (num > number)
                                label.setText("              Less!");
                            if (num < number)
                                label.setText("              More!");
                            round[0]++;
                            if (round[0] == 3)
                                label.setText("         GAME OVER!");
                        }
                    });
                    break;
                }
                default:
                {
                    add(pnl[i]);
                    pnl[i].setLayout(BL[i]);
                    break;
                }
            }
        }
    }

    private JMenu color()
    {
        JMenu m = new JMenu("Цвет");
        JMenuItem r = new JMenuItem("Красный");
        JMenuItem bl = new JMenuItem("Чёрный");
        JMenuItem b = new JMenuItem("Синий");
        m.add(r);
        r.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                textField.setForeground(Color.red);
            }
        });
        m.addSeparator();
        m.add(bl);
        bl.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                textField.setForeground(Color.black);
            }
        });
        m.addSeparator();
        m.add(b);
        b.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                textField.setForeground(Color.blue);
            }
        });
        return m;
    }

    private JMenu font()
    {
        Font t = new Font("TimesRoman", Font.PLAIN, 100);
        Font c = new Font("TimesRoman", Font.BOLD, 100);
        Font d = new Font("TimesRoman", Font.ITALIC, 100);
        JMenu m = new JMenu("Шрифт");
        JMenuItem r = new JMenuItem("Обычный");
        JMenuItem bl = new JMenuItem("Жирный");
        JMenuItem b = new JMenuItem("Курсив");
        m.add(r);
        r.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                textField.setFont(t);
            }
        });
        m.addSeparator();
        m.add(bl);
        bl.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                textField.setFont(c);
            }
        });
        m.addSeparator();
        m.add(b);
        b.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                textField.setFont(d);
            }
        });
        return m;
    }

    private JTextField textField = new JTextField(2);

    public static void main(String[] args)
    {
        new Guess().setVisible(true);
    }
}