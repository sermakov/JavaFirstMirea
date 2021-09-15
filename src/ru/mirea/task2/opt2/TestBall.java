package ru.mirea.task2.opt2;

public class TestBall {
    public static void main(String[] argc) {
        Ball myBall = new Ball("Black and White");
        myBall.setLocation(3.0, -3.5);
        myBall.motion(0.0, -0.5);
        myBall.setWeight(0.5);
        System.out.print(myBall);
    }
}
