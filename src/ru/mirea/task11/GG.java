import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.Random;

public class GG extends JFrame {
    final Random random = new Random();

    int EnteredNum = 0;
    int MainNum = random.nextInt(1);
    int count = 3;
    JLabel label1 = new JLabel("Угадайте число от 0 до 20");
    JButton btn1 = new JButton("Enter");
    JTextField text = new JTextField();

    Font fnt = new Font("Times new roman", Font.BOLD,20);

    GG() {
        super("Example");

        JFrame frame = new JFrame();
        JPanel panel = new JPanel();

        panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 30));
        panel.setLayout(new GridLayout(0,1));

        panel.add(label1);
        panel.add(text);
        panel.add(btn1);

        frame.setSize(400, 500);
        frame.setLocationRelativeTo(null);
        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        btn1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                try {
                    String textFieldValue = text.getText();
                    EnteredNum = Integer.parseInt(textFieldValue);
                    if (EnteredNum == MainNum) {
                        btn1.setEnabled(false);
                        label1.setText("Вы угадали! Загаданное число - "+MainNum);
                        JOptionPane.showMessageDialog(null, "Вы выиграли!", "alert", JOptionPane.INFORMATION_MESSAGE);
                        frame.dispose();
                    }
                    else if (EnteredNum > MainNum) {
                        count--;
                        label1.setText("Число больше загаданного, у вас осталось "+count+" попытки");
                    }
                    else if (EnteredNum < MainNum) {
                        count--;
                        label1.setText("Число меньше загаданного, у вас осталось "+count+" попытки");
                    }
                    if (count == 0) {
                        JOptionPane.showMessageDialog(null, "Вы проиграли", "alert", JOptionPane.ERROR_MESSAGE);
                        btn1.setEnabled(false);
                        frame.dispose();
                    }
                }
                catch(Exception e) {
                    JOptionPane.showMessageDialog(null, "nah", "alert", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
    }

    public static void main(String[]args) {
        new GG();
    }
}
