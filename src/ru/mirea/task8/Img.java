import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Img
{
    public static void main(String[] args)
    {
        JFrame frame = new JFrame("Second Task");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 300);
        ImageIcon icon = new ImageIcon("nick-fewings-nbwmNehHvis.jpg");
        for (String arg : args)
        {
            icon = new ImageIcon(arg);
            break;
        }
        JLabel label = new JLabel(icon);
        frame.add(label);
        frame.setVisible(true);
    }
}