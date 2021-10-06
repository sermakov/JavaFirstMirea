package tasks.task7;

public class Square extends Rectangle
{
    public Square()
    {
        super();
    }

    public Square(double side)
    {
        super(side, side);
    }

    public Square(double side, String color, boolean filled)
    {
        super(side, side, color, filled);
    }

    public double getSide()
    {
        return width;
    }

    public void setSide(double side)
    {
        width = side;
        length = side;
    }

    public void setWidth(double side)
    {
        width = side;
        length = side;
    }

    public void setLength(double side)
    {
        width = side;
        length = side;
    }

    public String toString()
    {
        if (filled)
            return("a " + width + " by " + length + " filled " + color + " square");
        else
            return("a " + width + " by " + length + " not filled " + color + " square");
    }

    protected double width;
    protected double length;
}