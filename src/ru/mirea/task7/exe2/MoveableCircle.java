package ru.mirea.task7.exe2;

public class MoveableCircle implements Moveable {
    private int radius;
    private MoveablePoint center;

    MoveableCircle(int x, int y, int xSpeed, int ySpeed, int radius){
        this.radius = radius;
        center = new MoveablePoint(x, y, xSpeed, ySpeed);
    }

    @Override
    public String toString() {
        return "MoveableCircle{" +
                "radius=" + radius +
                ", center=" + center +
                '}';
    }

    @Override
    public void moveUp() {
        center.moveUp();
    }

    @Override
    public void moveDown() {
        center.moveDown();
    }

    @Override
    public void moveLeft() {
        center.moveLeft();
    }

    @Override
    public void moveRight() {
        center.moveRight();
    }
}
