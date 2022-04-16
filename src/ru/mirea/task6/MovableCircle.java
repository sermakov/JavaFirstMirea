package ru.mirea.task6;

public abstract class MovableCircle extends MovablePoint
{
    private int radius;
    private MovablePoint center;

    public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius)
    {
        super(x, y, xSpeed, ySpeed);
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
        this.radius = radius;
    }

    @Override
    public String toString()
    {
        return "MovableCircle{" +
                "radius=" + radius +
                ", center=" + center +
                '}';
    }

    @Override
    public void moveUp()
    {
    }

    @Override
    public void moveDown() {}

    @Override
    public void moveRight() {}

    @Override
    public void moveLeft() {}
}
