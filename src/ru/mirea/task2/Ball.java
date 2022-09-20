package ru.mirea.task2;

public class Ball {

    private double x = 0.0;
    private double y = 0.0;

    public Ball(double x, double y) {
        this.x = x;
        this.y = y;
        System.out.println("Created a first ball object with parameters!");
    }

    public Ball () {
        System.out.println("The second ball object has been created!");
    }

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

    public void setXY(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void move(double xDisp, double yDisp){
        x += xDisp;
        y += yDisp;
    }

    public String toString() {
        return String.format("(%f, %f)",x ,y);
    }
}
