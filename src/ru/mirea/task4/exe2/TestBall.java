package ru.mirea.task4.exe2;

import ru.mirea.task4.exe2.Ball;

public class TestBall
{
    public static void main(String[] args) {
        Ball ball1 = new Ball(100, 150);
        System.out.println(ball1);
        ball1.move(20, -23);
        System.out.println(ball1);
    }
}
