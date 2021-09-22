package ru.mirea.task7.opt2;
import java.lang.*;
public class MovableRectangle implements Movable {
    MovablePoint topLeft = new MovablePoint();
    MovablePoint bottomRight = new MovablePoint();
    public MovableRectangle(int x1,int x2,int y1,int y2,int xSpeed,int ySpeed) {
        topLeft.x = x1;
        topLeft.y = y1;
        bottomRight.x = x2;
        bottomRight.y = y2;
       topLeft.xSpeed = xSpeed;
       topLeft.ySpeed = ySpeed;
        bottomRight.xSpeed = xSpeed;
        bottomRight.ySpeed = ySpeed;
    }

    @Override
    public String toString() {
       return "MovableRectangle{" + "topLeft=" + topLeft + ", bottomRight=" + bottomRight + '}';
    }
    public void moveUp(){
        topLeft.y+=topLeft.ySpeed;
        bottomRight.y+=bottomRight.ySpeed;
    };
    public void moveDown(){
        topLeft.y+=topLeft.xSpeed;
        bottomRight.y+=bottomRight.ySpeed;
    };
    public void moveLeft(){
        topLeft.x+=topLeft.xSpeed;
        bottomRight.x+=bottomRight.xSpeed;
    };
    public void moveRight(){
       topLeft.x+=topLeft.xSpeed;
       bottomRight.x+=bottomRight.xSpeed;
    };
}
