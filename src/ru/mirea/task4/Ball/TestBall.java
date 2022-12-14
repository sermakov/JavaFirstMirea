package ru.mirea.task4.Ball;

public class TestBall {
    public static void main(String[] args) {
        Ball b1 = new Ball(10,10);
        System.out.println(b1);
        b1.move(6,6);
        System.out.print(b1);
    }
}
