package tasks.task7;

public class Rectangle extends Shape
{
    public Rectangle()
    {
        width = 0;
        length = 0;
        color = "";
        filled = false;
    }

    public Rectangle(double width, double length)
    {
        this.width = width;
        this.length = length;
        color = "";
        filled = false;
    }

    public Rectangle(double width, double length, String color, boolean filled)
    {
        this.width = width;
        this.length = length;
        this.color = color;
        this.filled = filled;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getArea()
    {
        return(width*length);
    }

    public double getPerimeter()
    {
        return(2*(width+length));
    }

    public String toString()
    {
        if (filled)
            return("a " + width + " by " + length + " filled " + color + " rectangle");
        else
            return("a " + width + " by " + length + " not filled " + color + " rectangle");
    }

    protected double width;
    protected double length;
}