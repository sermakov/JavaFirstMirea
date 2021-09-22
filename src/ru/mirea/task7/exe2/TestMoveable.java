package ru.mirea.task7.exe2;

public class TestMoveable {
    public static void main(String[] args) {
        MoveableRectangle rect1 = new MoveableRectangle(0, 2, 1, 0, 1,1);
        MoveableCircle circle = new MoveableCircle(0,0,1,1,2);

        System.out.println(rect1);
        rect1.moveDown();
        System.out.println(rect1);
        rect1.moveLeft();
        System.out.println(rect1);
        rect1.moveRight();
        System.out.println(rect1);
        rect1.moveUp();
        System.out.println(rect1);

        System.out.println("\n");

        System.out.println(circle);
        circle.moveDown();
        System.out.println(circle);
        circle.moveLeft();
        System.out.println(circle);
        circle.moveRight();
        System.out.println(circle);
        circle.moveUp();
        System.out.println(circle);

    }
}
