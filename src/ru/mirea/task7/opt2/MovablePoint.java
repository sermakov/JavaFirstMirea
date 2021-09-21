package ru.mirea.task7.opt2;

public class MovablePoint implements Movable {
    int x;
    int y;
    int xSpeed;
    int ySpeed;
    public MovablePoint(int x,int y,int xSpeed,int ySpeed){
        this.x=x;
        this.y=y;
        this.xSpeed=xSpeed;
        this.ySpeed=ySpeed;
    }

    @Override
    public String toString() {
        return "MovablePoint{" + "x=" + x + ", y=" + y + ", xSpeed=" + xSpeed + ", ySpeed=" + ySpeed + '}';
    }
    public void moveUp(){
        this.y+=xSpeed;
    };
    public void moveDown(){
        this.y+=xSpeed;
    };
    public void moveLeft(){
        this.x+=xSpeed;
    };
    public void moveRight(){
        this.x+=xSpeed;
    };

}
