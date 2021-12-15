package ru.mirea.task3.exe1;

public class TestCircle {

    public static void main(String[] args){
        Circle circle = new Circle(4);
        circle.calcSquare();
        circle.calcLength();
        System.out.println(circle.toString());
    }
}
