package ru.mirea.task7.opt2;
import java.lang.*;
public class MovableCircle implements Movable {
    private int radius;
    MovablePoint center = new MovablePoint();
    public MovableCircle(int x,int y,int xSpeed,int ySpeed) {
        center.x = x;
        center.y = y;
        center.xSpeed = xSpeed;
        center.ySpeed = ySpeed;
    }

    @Override
    public String toString() { return "MovableCircle{" + "radius=" + radius + ", center=" + center + '}';
    }
    public void moveUp(){
        center.y+=center.ySpeed;
    };
    public void moveDown(){
        center.y+=center.ySpeed;
    };
    public void moveLeft(){
        center.x+=center.xSpeed;
    };
    public void moveRight(){
        center.x+=center.xSpeed;
    };
}
