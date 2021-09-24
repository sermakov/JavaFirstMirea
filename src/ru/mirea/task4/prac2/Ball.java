package ru.mirea.task4.prac2;

public class Ball {
    private double x = 0, y = 0;

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

    public Ball(double x, double y) {
        this.x = x;
        this.y = y;
    }
    public Ball() {}
    public void setXY(double x, double y) {
        this.x = x;
        this.y = y;
    }
    public void move(double xDisp, double yDisp) {
        x+=xDisp;
        y+=yDisp;
    }
    public String toString() {
        return "Ball{x="+x+", y="+y+"}";
    }
}

class TestBall {
    public static void test() {
        Ball b = new Ball(0, 0);
        System.out.println(b);
        b.setX(b.getY()+1);
        b.setY(b.getX()-1);
        System.out.println(b);
        b.setXY(-5, 5);
        System.out.println(b);
        b.move(5, -5);
        System.out.println(b);
    }
}
