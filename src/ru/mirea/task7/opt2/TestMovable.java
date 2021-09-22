package ru.mirea.task7.opt2;

public class TestMovable {
    public static void main(String[] args){
        read(new MovableCircle(2,2,12,12));
        read(new MovablePoint(2,2,12,12));
        read(new MovableRectangle(2,2,2,2,2,2));
    }
    static void read(Movable cl){
        System.out.println(cl);
        cl.moveDown();
        cl.moveLeft();
        System.out.println(cl);
    }
}
