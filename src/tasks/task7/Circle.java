package tasks.task7;

public class Circle extends Shape
{
    public Circle()
    {
        radius = 0;
        color = "";
        filled = false;
    }

    public Circle(double radius)
    {
        this.radius = radius;
        color = "";
        filled = false;
    }

    public Circle(double radius, String color, boolean filled)
    {
        this.radius = radius;
        this.color = color;
        this.filled = filled;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea()
    {
        return(Math.PI * radius * radius);
    }

    public double getPerimeter()
    {
        return(2 * Math.PI * radius);
    }

    public String toString()
    {
        if (filled)
            return("a " + radius + " filled " + color + " circle");
        else
            return("a " + radius + " not filled " + color + " circle");
    }

    protected double radius;
}