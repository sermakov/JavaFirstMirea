package tasks.task8;
import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class DrawShapes extends JPanel
{
    public DrawShapes(){};

    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        Shape shape = new Line(Color.BLACK, 0, 0);
        java.awt.Color color = Color.BLACK;
        Random random = new Random();
        int c;
        for (int i = 0; i < 20; i++)
        {
            c = random.nextInt(3-0);
            switch (c)
            {
                case 0:
                {
                    color = Color.RED;
                    break;
                }
                case 1:
                {
                    color = Color.GREEN;
                    break;
                }
                case 2:
                {
                    color = Color.BLUE;
                    break;
                }
            }
            c = random.nextInt(3-0);
            switch (c)
            {
                case 0:
                {
                    shape = new Line(color, 20 * i, 20 * i);
                    break;
                }
                case 1:
                {
                    shape = new Oval(color, 20 * i, 20 * i);
                    break;
                }
                case 2:
                {
                    shape = new Rectangle(color, 20 * i, 20 * i);
                    break;
                }
            }
            g.setColor(shape.color);
            String s = shape.getShape();
            switch (s)
            {
                case "Line":
                {
                    g.drawLine(shape.x, shape.y, shape.x + 20, shape.y + 20);
                    break;
                }
                case "Oval":
                {
                    g.drawOval(shape.x, shape.y, 20, 20);
                    break;
                }
                case "Rectangle":
                {
                    g.drawRect(shape.x, shape.y, 20, 20);
                    break;
                }
            }
        }
    }
}
