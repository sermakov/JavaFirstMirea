package tasks.task7;

public class MovableRectangle implements Movable
{
    public MovableRectangle(int x1, int y1, int x2, int y2, int xSpeed, int ySpeed)
    {
        topLeft = new MovablePoint(x1, y1, xSpeed, ySpeed);
        bottomRight = new MovablePoint(x1, y1, xSpeed, ySpeed);
    }

    public void moveUp()
    {
        topLeft.setY(topLeft.getY() + topLeft.getySpeed());
        bottomRight.setY(bottomRight.getY() + bottomRight.getySpeed());
    }

    public void moveDown()
    {
        topLeft.setY(topLeft.getY() - topLeft.getySpeed());
        bottomRight.setY(bottomRight.getY() - bottomRight.getySpeed());
    }

    public void moveRight()
    {
        topLeft.setX(topLeft.getX() + topLeft.getxSpeed());
        bottomRight.setX(bottomRight.getX() + bottomRight.getxSpeed());
    }

    public void moveLeft()
    {
        topLeft.setX(topLeft.getX() - topLeft.getxSpeed());
        bottomRight.setX(bottomRight.getX() - bottomRight.getxSpeed());
    }

    public String toString()
    {
        return ("(" + topLeft.getX() + "; " + topLeft.getY() + "; " + bottomRight.getX() + "; " + bottomRight.getY() + "; " + topLeft.getxSpeed() + "; " + topLeft.getySpeed() + ")");
    }

    private MovablePoint topLeft;
    private MovablePoint bottomRight;
}