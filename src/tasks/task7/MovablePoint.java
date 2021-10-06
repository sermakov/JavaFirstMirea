package tasks.task7;

public class MovablePoint implements Movable
{
    public MovablePoint(int x, int y, int xSpeed, int ySpeed)
    {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public void moveUp()
    {
        y = y + ySpeed;
    }

    public void moveDown()
    {
        y = y - ySpeed;
    }

    public void moveRight()
    {
        x = x + xSpeed;
    }

    public void moveLeft()
    {
        x = x - xSpeed;
    }

    public String toString()
    {
        return ("(" + x + "; " + y + "; " + xSpeed + "; " + ySpeed + ")");
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getX() {
        return x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getY() {
        return y;
    }

    public void setxSpeed(int xSpeed) {
        this.xSpeed = xSpeed;
    }

    public int getxSpeed() {
        return xSpeed;
    }

    public void setySpeed(int ySpeed) {
        this.ySpeed = ySpeed;
    }

    public int getySpeed() {
        return ySpeed;
    }

    private int x;
    private int y;
    private int xSpeed;
    private int ySpeed;
}
