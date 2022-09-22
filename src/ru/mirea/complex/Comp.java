package ru.mirea.complex;

public class Comp
{
    public double x;
    public double y;

    public Comp(double x_, double y_)
    {
        x = x_;
        y = y_;
    }

    @Override
    public String toString()
    {
        return(x + " + " + y + 'i');
    }

    public static Comp add(Comp A, Comp B)
    {
        return(new Comp(A.x + B.x, A.y + B.y));
    }
}
