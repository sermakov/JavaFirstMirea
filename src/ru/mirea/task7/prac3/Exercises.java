package ru.mirea.task7.prac3;

import static java.lang.Math.max;
import static java.lang.Math.min;

public class Exercises{
    public static void ex1() {

    }
    public static void ex2() {

    }
    public static void ex3() {

    }
    public static void ex4() {

    }
    public static void ex5() {

    }
}

abstract class Shape {
    protected String color;
    protected boolean filled;

    Shape(){
        color="black";
        filled = false;
    }

    Shape(String color, boolean filled){
        this.color=color;
        this.filled=filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public abstract double getArea();
    public abstract double getPerimeter();
    public abstract String toString();

}

class Circle extends Shape{
    private double radius;

    Circle(){
        super();
        this.radius = 0;
    }

    Circle(double radius){
        super();
        this.radius=radius;
    }

    Circle(double radius, String color, boolean filled){
        super(color, filled);
        this.radius=radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return 3.14*radius*radius;
    }

    @Override
    public double getPerimeter() {
        return 6.28*radius;
    }

    @Override
    public String toString() {
        return "Цвет: " + color + "\nЗаполнено: " + filled + "\nРадиус: " + radius;
    }
}

class Rectangle extends Shape{
    protected double width;
    protected double length;

    Rectangle(){
        super();
        this.width=0;
        this.length=0;
    }

    Rectangle(double width, double length){
        super();
        this.width=width;
        this.length=length;
    }

    Rectangle(double width, double length, String color, boolean filled){
        super(color, filled);
        this.width=width;
        this.length=length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public double getArea() {
        return width*length;
    }

    @Override
    public double getPerimeter() {
        return 2*(width+length);
    }

    @Override
    public String toString() {
        return "Цвет: " + color + "\nЗаполнено: " + filled + "\nДлина: " + length + "\nШирина: " + width;
    }
}

class Square extends Rectangle{
    Square(){
        super(0,0);
    }

    Square(double side){
        super(side, side);
    }

    Square(double size, String color, boolean filled){
        super(size,size,color,filled);
    }

    public void setSide(double side){
        this.length=side;
        this.width=side;
    }

    public double getSide(){
        return this.length;
    }

    @Override
    public String toString() {
        return "Цвет: " + color + "\nЗаполнено: " + filled + "\nДлина: " + length;
    }
}


class Test{
    static public void checkVelocity(MovablePoint p1, MovablePoint p2) {
        if (p1.xSpeed != p2.xSpeed) {
            p1.xSpeed = (p1.xSpeed+p2.xSpeed)/2;
            p2.xSpeed = p1.xSpeed;
        }
        if (p1.ySpeed != p2.ySpeed) {
            p1.ySpeed = (p1.ySpeed+p2.ySpeed)/2;
            p2.ySpeed = p1.ySpeed;
        }
    }
    static public void test(){
        Shape s1 = new Circle(5.5, "RED", false); // Upcast Circle to Shape
        System.out.println(s1); // which version?
        System.out.println(s1.getArea()); // which version?
        System.out.println(s1.getPerimeter()); // which version?
        System.out.println(s1.getColor());
        System.out.println(s1.isFilled());
        System.out.println(((Circle)s1).getRadius());

        Circle c1 = (Circle)s1; // Downcast back to Circle
        System.out.println(c1);
        System.out.println(c1.getArea());
        System.out.println(c1.getPerimeter());
        System.out.println(c1.getColor());
        System.out.println(c1.isFilled());
        System.out.println(c1.getRadius());

        //Shape s2 = new Shape(); //Нельзя создать экземпляр абстрактного класса


        Shape s3 = new Rectangle(1.0, 2.0, "RED", false); // Upcast
        System.out.println(s3);
        System.out.println(s3.getArea());
        System.out.println(s3.getPerimeter());
        System.out.println(s3.getColor());
        //System.out.println(s3.getLength()); //Не будет работать, т.к. класс Shape не видит дочернии функции

        Rectangle r1 = (Rectangle)s3; // downcast
        System.out.println(r1);
        System.out.println(r1.getArea());
        System.out.println(r1.getColor());
        System.out.println(r1.getLength());

        Shape s4 = new Square(6.6); // Upcast
        System.out.println(s4);
        System.out.println(s4.getArea());
        System.out.println(s4.getColor());
        //System.out.println(s4.getSide()); //Не будет работать, т.к. класс Shape не видит дочернии функции

// Take note that we downcast Shape s4 to Rectangle,
// which is a superclass of Square, instead of Square
        Rectangle r2 = (Rectangle)s4;
        System.out.println(r2);
        System.out.println(r2.getArea());
        System.out.println(r2.getColor());
        //System.out.println(r2.getSide()); //Не будет работать, т.к. нет такой функции в классе
        System.out.println(r2.getLength());

// Downcast Rectangle r2 to Square
        Square sq1 = (Square)r2;
        System.out.println(sq1);
        System.out.println(sq1.getArea());
        System.out.println(sq1.getColor());
        System.out.println(sq1.getSide());
        System.out.println(sq1.getLength());
    }
}

interface Movable {
    void moveUp();
    void moveDown();
    void moveLeft();
    void moveRight();
};

class MovablePoint implements Movable {
    int x;
    int y;
    int xSpeed;
    int ySpeed;

    MovablePoint(int x, int y, int xSpeed, int ySpeed){
        this.x=x;
        this.y=y;
        this.xSpeed=xSpeed;
        this.ySpeed=ySpeed;
    }

    @Override
    public String toString() {
        return "MovablePoint{" +
                "x=" + x +
                ", y=" + y +
                ", xSpeed=" + xSpeed +
                ", ySpeed=" + ySpeed +
                '}';
    }

    @Override
    public void moveUp() {
        this.y+=this.ySpeed;
    }

    @Override
    public void moveRight() {
        this.x+=this.xSpeed;
    }

    @Override
    public void moveLeft() {
        this.x-=this.xSpeed;
    }

    @Override
    public void moveDown() {
        this.y-=this.ySpeed;
    }
};

class MovableCircle implements Movable {
    private int radius;
    private MovablePoint center;

    public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius){
        center = new MovablePoint(x, y, xSpeed, ySpeed);
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "MovableCircle{" +
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

class MovableRectangle implements Movable {
    private MovablePoint topLeft;
    private MovablePoint bottomRight;

    public MovableRectangle(int x1, int y1, int x2, int y2, int xSpeed, int ySpeed) {
        int top = max(y1, y2);
        int right = max(x1, x2);
        int bottom = min(y1, y2);
        int left = min(x1, x2);
        topLeft = new MovablePoint(left, top, xSpeed, ySpeed);
        bottomRight = new MovablePoint(right, bottom, xSpeed, ySpeed);
    }

    @Override
    public String toString() {
        return "MovableRectangle{" +
                "topLeft=" + topLeft +
                ", bottomRight=" + bottomRight +
                '}';
    }

    @Override
    public void moveUp() {
        Test.checkVelocity(topLeft, bottomRight);
        topLeft.moveUp();
        bottomRight.moveUp();
    }

    @Override
    public void moveDown() {
        Test.checkVelocity(topLeft, bottomRight);
        topLeft.moveDown();
        bottomRight.moveDown();
    }

    @Override
    public void moveLeft() {
        Test.checkVelocity(topLeft, bottomRight);
        topLeft.moveLeft();
        bottomRight.moveLeft();
    }

    @Override
    public void moveRight() {
        Test.checkVelocity(topLeft, bottomRight);
        topLeft.moveRight();
        bottomRight.moveRight();
    }
}