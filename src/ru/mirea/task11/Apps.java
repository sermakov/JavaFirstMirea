import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Apps extends JFrame {
    JFrame frame = new JFrame("BorderLayout demo");
    JButton btn1 = new JButton("NORTH");
    JButton btn2 = new JButton("SOUTH");
    JButton btn3 = new JButton("CENTER");
    JButton btn4 = new JButton("WEST");
    JButton btn5 = new JButton("EAST");

    public Apps() {
        frame.setLayout(new BorderLayout());
        frame.add(btn1, BorderLayout.NORTH);
        frame.add(btn2, BorderLayout.SOUTH);
        frame.add(btn3, BorderLayout.CENTER);
        frame.add(btn4, BorderLayout.WEST);
        frame.add(btn5, BorderLayout.EAST);

        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(1000, 800);
        // frame.pack();
        frame.setVisible(true);
        btn1.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent event) {
                JOptionPane.showMessageDialog(null, "Добро пожаловать на Север", "alert", JOptionPane.INFORMATION_MESSAGE);
            }
        });
        btn2.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent event) {
                JOptionPane.showMessageDialog(null, "Добро пожаловать на Юг", "alert", JOptionPane.INFORMATION_MESSAGE);
            }
        });
        btn3.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent event) {
                JOptionPane.showMessageDialog(null, "Добро пожаловать в Центр", "alert", JOptionPane.INFORMATION_MESSAGE);
            }
        });
        btn4.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent event) {
                JOptionPane.showMessageDialog(null, "Добро пожаловать в Запад", "alert", JOptionPane.INFORMATION_MESSAGE);
            }
        });
        btn5.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent event) {
                JOptionPane.showMessageDialog(null, "Добро пожаловать на Восток", "alert", JOptionPane.INFORMATION_MESSAGE);
            }
        });
    }

    public static void main(String[] args) {
        new Apps();

    }

}
