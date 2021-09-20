package ru.mirea.task2.exe2;

public class TestBall {
    public static void main(String[] args){
        Ball ball = new Ball(40, "circle", "red");
        System.out.println(ball.toString());
        System.out.println("\n" + ball.getSize() + " " + ball.getShape() + " " + ball.getColor());
    }
}
