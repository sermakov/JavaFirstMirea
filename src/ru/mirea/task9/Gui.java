import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class Gui extends JFrame {

    int Milan = 0;
    int Madrid = 0;

    JLabel label1 = new JLabel("Result: " +Milan+ "x" +Madrid);
    JLabel label2 = new JLabel("Last Scorer: N/A");
    JLabel label3 = new JLabel("Winner: Draw");
    JButton btn1 = new JButton("AC Milan");
    JButton btn2 = new JButton("Real Madrid");
    JButton btn3 = new JButton("Restart");

    Font fnt = new Font("Times new roman", Font.BOLD,20);

    Gui() {
        super("Example");

        JFrame frame = new JFrame();
        JPanel panel = new JPanel();

        panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 30));
        panel.setLayout(new GridLayout(0,1));
        panel.add(btn1);
        panel.add(btn2);
        panel.add(label1);
        panel.add(label2);
        panel.add(label3);

        frame.setSize(200, 300);
        frame.setLocationRelativeTo(null);
        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // frame.pack();
        frame.setVisible(true);

        btn1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                try {
                    Milan++;
                    label1.setText("Result: " +Milan+ "x" +Madrid);
                    label2.setText("Last Scorer: Milan");
                    if (Milan == 5) {
                        label3.setText("Winner: AC Milan");
                        btn1.setEnabled(false);
                        btn2.setEnabled(false);
                    }
                }
                catch(Exception e) {
                    JOptionPane.showMessageDialog(null, "nah","alert" , JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        btn2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                try {
                    Madrid++;
                    label1.setText("Result: " +Milan+ "x" +Madrid);
                    label2.setText("Last Scorer: Madrid");
                    if (Madrid == 5) {
                        label3.setText("Winner: Madrid");
                        btn1.setEnabled(false);
                        btn2.setEnabled(false);
                    }
                }
                catch(Exception e) {
                    JOptionPane.showMessageDialog(null, "nah","alert" , JOptionPane.ERROR_MESSAGE);
                }
            }
        });
    }

    public static void main(String[]args) {
        new Gui();
    }
}
