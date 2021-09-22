package ru.mirea.task7.opt2;

public class TestMovable {
    public static void main(String[] args){
        read(new MovableCircle(2,2,12,12));
        read(new MovablePoint(2,2,12,12));
        read(new MovableRectangle(2,2,2,2,2,2));

    }
    static void read(Movable cl){
        cl.moveUp();
        cl.moveDown();
        cl.moveLeft();
        cl.moveRight();
        System.out.println(cl);
    }
}
