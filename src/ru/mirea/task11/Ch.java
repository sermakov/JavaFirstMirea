import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.Random;

public class Ch extends JFrame {
    final Random random = new Random();

    JTextArea area = new JTextArea("Lorem ipsum dolor sit amet consectetur adipisicing elit.");
    JButton btn1 = new JButton();
    Font fnt1 = new Font("Times new roman", Font.BOLD, 15);
    Font fnt2 = new Font("Sans Serif", Font.BOLD, 15);
    Font fnt3 = new Font("Courier New", Font.BOLD, 15);
    JRadioButton r1 = new JRadioButton("Font: Times");
    JRadioButton r2 = new JRadioButton("Font: Sans");
    JRadioButton r3 = new JRadioButton("Font: Courier");
    JRadioButton r4 = new JRadioButton("Color: Blue");
    JRadioButton r5 = new JRadioButton("Color: Red");
    JRadioButton r6 = new JRadioButton("Color: Black");

    Ch() {
        super("Choose options");

        JFrame frame = new JFrame();
        JPanel panel = new JPanel();

        panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 30));
        panel.setLayout(new GridLayout(2, 0, 8, 12));
        // r1.setBounds(75, 50, 100, 1);
        // r2.setBounds(75, 75, 100, 10);
        ButtonGroup bg1 = new ButtonGroup();
        bg1.add(r1);
        bg1.add(r2);
        bg1.add(r3);
        ButtonGroup bg2 = new ButtonGroup();
        bg2.add(r4);
        bg2.add(r5);
        bg2.add(r6);

        panel.add(area);
        panel.add(r1);
        panel.add(r2);
        panel.add(r3);
        panel.add(r4);
        panel.add(r5);
        panel.add(r6);
        panel.add(btn1);

        frame.setSize(1000, 400);
        frame.setLocationRelativeTo(null);
        frame.add(panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        btn1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                try {
                    if (r1.isSelected()) {
                        area.setFont(fnt1);
                    }
                    if (r2.isSelected()) {
                        area.setFont(fnt2);
                    }
                    if (r3.isSelected()) {
                        area.setFont(fnt3);
                    }
                    if (r4.isSelected()) {
                        area.setForeground(Color.BLUE);
                    }
                    if (r5.isSelected()) {
                        area.setForeground(Color.RED);
                    }
                    if (r6.isSelected()) {
                        area.setForeground(Color.BLACK);
                    }
                }
                catch(Exception e) {
                    JOptionPane.showMessageDialog(null, "nah", "alert", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
    }
    // public void actionPerformed(ActionEvent e){
    //     if(rb1.isSelected()){
    //     JOptionPane.showMessageDialog(this,"You are Male.");
    //     }
    //     if(rb2.isSelected()){
    //     JOptionPane.showMessageDialog(this,"You are Female.");
    //     }
    // }
    public static void main(String[]args) {
        new Ch();
    }
}