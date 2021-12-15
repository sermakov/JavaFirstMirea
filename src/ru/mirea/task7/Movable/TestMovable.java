package ru.mirea.task7.Movable;

public class TestMovable {
    public static void main(String[] args) {
        MovableRectangle rectangle = new MovableRectangle(10, 10, 40, 40, 5, 4);
        rectangle.moveDown();
        rectangle.moveLeft();
        System.out.println(rectangle);

        MovableCircle circle = new MovableCircle(40, 60, 3, 4, 10);
        circle.moveRight();
        circle.moveUp();
        System.out.println(circle);
    }
}
