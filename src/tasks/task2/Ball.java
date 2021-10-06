package tasks.task2;

public class Ball
{
    private double diameter;
    private String material;

    public Ball(double d, String m)
    {
        diameter = d;
        material = m;
    }

    public Ball(double d)
    {
        diameter = d;
        material = "Rubber";
    }

    public void setDiameter(double d)
    {
        diameter = d;
    }

    public void setMaterial(String m)
    {
        material = m;
    }

    public double getDiameter()
    {
        return(diameter);
    }

    public String getMaterial()
    {
        return(material);
    }

    public String toString()
    {
        return("A " + diameter + " centimeters diameter " + material + " ball");
    }

    public void volume()
    {
        System.out.println("The volume of this ball is " + (Math.PI * diameter * diameter / 4) + " square centimeters");
    }
}