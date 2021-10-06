package tasks.task3;

public class Circle
{
    private double radius;

    public Circle(double r)
    {
        radius = r;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double getArea()
    {
        return(Math.PI * radius * radius);
    }

    public double getCircumference()
    {
        return(2 * Math.PI * radius);
    }
}
