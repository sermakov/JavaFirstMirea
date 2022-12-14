import java.awt.*;

public class Rectangle extends Shape
{
    protected int width;
    protected int height;

    Rectangle(Color color, int x, int y, int width, int height)
    {
        super(color, x, y);
        this.width = width;
        this.height = height;
    }

    Rectangle()
    {
        super(Color.white, 0, 0);
        this.width = 0;
        this.height = 0;
    }


    @Override
    protected void draw(Graphics g)
    {
        g.setColor(color);
        g.fillRect(x, y, width, height);
    }
}
