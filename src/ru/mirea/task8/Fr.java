import java.awt.*;
import javax.swing.*;
import java.util.Random;

public class Fr extends JFrame
{
    public Shape shape = null;
    final Random random = new Random();

    Fr()
    {
        super("Figure window");
        setSize(1000, 1000);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public Color RandomColor()
    {
        return new Color(random.nextInt(255),random.nextInt(255),random.nextInt(255));
    }

    @Override
    public void paint(Graphics g)
    {
        Rectangle first = new Rectangle();
        Circle second = new Circle();
        Triangle tri = new Triangle();
        Square four = new Square();

        for (int i = 0; i < 20; i++)
        {
            switch (random.nextInt(5) + 1)
            {
                case(1):
                    first = new Rectangle(RandomColor(), random.nextInt(1000) + 1, random.nextInt(1000), random.nextInt(1000), random.nextInt(1000));
                    first.draw(g);
                    break;
                case(2):
                    second = new Circle(RandomColor(), random.nextInt(1000), random.nextInt(1000), random.nextInt(1000), random.nextInt(1000));
                    second.draw(g);
                    break;
                case(3):
                    tri = new Triangle(RandomColor(), random.nextInt(1000), random.nextInt(1000), random.nextInt(1000), random.nextInt(1000), random.nextInt(1000), random.nextInt(1000));
                    tri.draw(g);
                    break;
                case(4):
                    four = new Square(RandomColor(), random.nextInt(1000), random.nextInt(1000), random.nextInt(1000));
                    four.draw(g);
                    break;
                default:
                    break;
            }
        }
    }

    public static void main(String[] args)
    {
        new Fr();
    }
}
