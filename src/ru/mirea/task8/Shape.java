import java.awt.*;

public abstract class Shape
{
    public int x, y;
    public Color color;

    public Shape (Color color, int x, int y)
    {
        this.color = color;
        this.x = x;
        this.y = y;
    }

    public void paint (Graphics g)
    {
        g.setColor(color);
        draw(g);
    }

    protected abstract void draw(Graphics g);
}
