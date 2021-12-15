package ru.mirea.task7.exe2;

public class MoveableRectangle implements Moveable{
    private MoveablePoint topLeft;
    private MoveablePoint bottomRight;

    MoveableRectangle(int x1, int y1, int x2, int y2, int xSpeed, int ySpeed){
        topLeft = new MoveablePoint(x1, y1, xSpeed, ySpeed);
        bottomRight = new MoveablePoint(x2, y2, xSpeed, ySpeed);
    }

    @Override
    public String toString() {
        return "MoveableRectangle{" +
                "topLeft=" + topLeft +
                ", bottomRight=" + bottomRight +
                '}';
    }

    @Override
    public void moveUp() {
        topLeft.moveUp();
        bottomRight.moveUp();
    }

    @Override
    public void moveDown() {
        topLeft.moveDown();
        bottomRight.moveDown();
    }

    @Override
    public void moveLeft() {
        topLeft.moveLeft();
        bottomRight.moveLeft();
    }

    @Override
    public void moveRight() {
        topLeft.moveRight();
        bottomRight.moveRight();
    }

}
