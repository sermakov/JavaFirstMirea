package ru.mirea.task4.Ball;

public class Ball {
    private double X = 0.0;
    private double Y = 0.0;
    public Ball () {}
    public Ball (double x) {
        X = x;
    }
    public  Ball (double x, double y) {
        X = x;
        Y = y;
    }
    public void setX (double X) {
        this.X = X;
    }
    public void setY (double Y) {
        this.Y = Y;
    }
    public void setXY (double X, double Y) {
        this.X = X;
        this.Y = Y;
    }
    public double getX () {
        return X;
    }
    public double getY () {
        return Y;
    }
    public void move (double xMove, double yMove) {
        X+=xMove;
        Y+=yMove;
    }
    public String toString () {
        return "Ball (x: " + X + "; y: " + Y + ")";
    }
}
