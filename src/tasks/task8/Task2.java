package tasks.task8;
import javax.swing.*;

public class Task2
{
    public static void main(String[] args)
    {
        JFrame frame = new JFrame("Task2");
        frame.setSize(500,523);
        ImageIcon icon = new ImageIcon("D:\\IntelliJ IDEA Community Edition 2021.2.1\\JavaFirstMirea\\src\\tasks\\task8\\img2.png");
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
