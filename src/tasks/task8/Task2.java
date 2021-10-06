package tasks.task8;
import javax.swing.*;

public class Task2
{
    public static void main(String[] args)
    {
        JFrame frame = new JFrame("Task2");
        frame.setSize(500,523);
        ImageIcon icon = new ImageIcon("");
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
