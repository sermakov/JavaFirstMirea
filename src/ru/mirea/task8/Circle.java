import java.awt.*;

public class Circle extends Shape
{
    protected int width;
    protected int height;

    public Circle(Color color, int x, int y, int width, int height)
    {
        super(color, x, y);
        this.width = width;
        this.height = height;
    }

    Circle()
    {
        super(Color.white,0,0);
        this.width = 0;
        this.height = 0;
    }

    @Override
    protected void draw(Graphics g)
    {
        g.setColor(color);
        g.fillOval(x, y, width, height);
    }
}
