package ru.mirea.task4.opt2;

public class Ball2 {
    private double x = 0.0, y = 0.0;

    Ball2(double x, double y)   {
        this.setXY(x, y);
    }

    Ball2() {}

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void setXY(double x, double y)   {
        this.x = x;
        this.y = y;
    }

    public void move(double x, double y)    {
        this.x += x;
        this.y += y;
    }

    @Override
    public String toString()    {
        return ("Ball2 @ (" + this.x + " , " + this.y + ").");
    }
}
