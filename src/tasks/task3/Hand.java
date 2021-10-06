package tasks.task3;

public class Hand
{
    private double length;
    private boolean up = false;

    public Hand(double l)
    {
        length = l;
    }

    public void raise()
    {
        up = true;
    }

    public void lower()
    {
        up = true;
    }

    public void getPosition()
    {
        if (up)
            System.out.println("The hand is up.");
        else
            System.out.println("The hand is down.");
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