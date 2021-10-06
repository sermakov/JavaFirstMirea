package tasks.task8;
import javax.swing.*;
import java.awt.*;

public class Task1
{
    public static void main(String[] args)
    {
        JFrame frame = new JFrame("Task1");
        Line l = new Line(Color.RED, 0,0);
        Oval o = new Oval(Color.GREEN, 20, 20);
        Rectangle r = new Rectangle(Color.BLUE, 40, 40);
        JPanel render = new DrawShapes();
        frame.setSize(420, 443);
        frame.add(render);
        frame.setVisible(true);
    }
}
