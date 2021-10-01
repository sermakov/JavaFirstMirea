package ru.mirea.task7.opt2;

public class MovablePoint implements Movable {
    int x = 0;
    int y;
    int xSpeed;
    int ySpeed;
    public MovablePoint() {
        x = 0;
        y =0;
        xSpeed=0;
        ySpeed=0;
    }
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
        this.y+=ySpeed;
    };
    public void moveDown(){
        this.y+=ySpeed;
    };
    public void moveLeft(){
        this.x+=xSpeed;
    };
    public void moveRight(){ this.x+=xSpeed; };
}
