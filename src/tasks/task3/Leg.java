package tasks.task3;

public class Leg
{
    private double length;

    public Leg(double l)
    {
        length = l;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getLength() {
        return length;
    }

    public void grow()
    {
        length++;
    }
}