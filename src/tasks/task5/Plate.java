package tasks.task5;

public class Plate extends Dish
{
    public Plate(double r)
    {
        radius = r;
    }
    public void setRadius(double radius){
        this.radius = radius;
    }
    public double getRadius()
    {
        return(radius);
    }
    public double getArea()
    {
        return(Math.PI * radius * radius);
    }
}

