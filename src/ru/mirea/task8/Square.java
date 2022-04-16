import java.awt.*;

public class Square extends Shape
{
    protected int width;

    Square(Color color, int x, int y, int width)
    {
        super(color, x, y);
        this.width = width;
    }

    Square()
    {
        super(Color.white, 0, 0);
        this.width = 0;
    }


    @Override
    protected void draw(Graphics g)
    {
        g.setColor(color);
        g.fillRect(x, y, width, width);
    }
}
