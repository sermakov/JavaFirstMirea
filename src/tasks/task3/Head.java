package tasks.task3;

public class Head
{
    private double radius;

    public Head(double r)
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
        return(4 * Math.PI * radius * radius);
    }

    public double getVolume()
    {
        return(4/3 * Math.PI * radius * radius * radius);
    }

    public void think()
    {
        System.out.println("h m m");
    }

    public void grow()
    {
        radius++;
    }
}