package ru.mirea.task2.task2_2;

import ru.mirea.task2.task2_2.Ball;

import java.lang.*;

public class TestBall {
    public static void main(String[] args) {
        Ball ball1 = new Ball(1,1);
        Ball ball2 = new Ball();
        System.out.println("The X value of the first ball: " + ball1.getX());
        ball1.setX(2);
        System.out.println("Setting the X value of the first ball to 2");
        System.out.println("The Y value of the second ball: " + ball2.getY());
        ball2.setY(2);
        System.out.println("Setting the Y value of the second ball to 2");
        ball2.setXY(5,5);
        System.out.println("Setting the X and Y values of the second ball to 5 and 5");
        ball2.move(3,3);
        System.out.println("Moving the second ball by 3 on X and Y");
        System.out.println("ball1 = " + ball1.toString() + "; "+ "ball2 = " + ball2.toString());

    }
}
