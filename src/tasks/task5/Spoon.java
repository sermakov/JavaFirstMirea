package tasks.task5;

public class Spoon extends Dish
{
    public Spoon(double r, double l)
    {
        radius = r;
        length = l;
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
    public double getLength(){
        return(length);
    }
    public void setLength(double length){
        this.length = length;
    }
}
