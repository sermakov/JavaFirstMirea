package tasks.task7;

public class MovableCircle implements Movable
{
    public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius)
    {
        center = new MovablePoint(x, y, xSpeed, ySpeed);
        this.radius = radius;
    }

    public void moveUp()
    {
        center.setY(center.getY() + center.getySpeed());
    }

    public void moveDown()
    {
        center.setY(center.getY() - center.getySpeed());
    }

    public void moveRight()
    {
        center.setX(center.getX() + center.getxSpeed());
    }

    public void moveLeft()
    {
        center.setX(center.getX() - center.getxSpeed());
    }

    public String toString()
    {
        return ("(" + center.getX() + "; " + center.getY() + "; " + center.getxSpeed() + "; " + center.getySpeed() + "; " + radius + ")");
    }

    private MovablePoint center;
    private int radius;
}