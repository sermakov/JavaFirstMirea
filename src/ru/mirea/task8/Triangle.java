import java.awt.*;

public class Triangle extends Shape
{
    protected int x2, x3, y2, y3;

    Triangle(Color color, int x1, int x2, int x3, int y1, int y2, int y3)
    {
        super(color, x1, y1);
        this.x2 = x2;
        this.y2 = y2;
        this.x3 = x3;
        this.y3 = y3;
    }

    Triangle()
    {
        super(Color.white, 0, 0);
        this.x2 = 0;
        this.y2 = 0;
        this.x3 = 0;
        this.y3 = 0;
    }


    @Override
    protected void draw(Graphics g)
    {
        g.setColor(color);
        g.fillPolygon(new int[] {x,x2,x3}, new int[]{y, y2, y3}, 3);
    }
}
