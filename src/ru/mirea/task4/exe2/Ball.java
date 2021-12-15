package ru.mirea.task4.exe2;

// Реализация полиморфизма (свойство ООП), в данном задании можно видеть
// на примере метода toString.
// Так как все классы в Java неявно наследуется от класса Object,
// то в дочерних классах можно изменить поведение методов родительского класса.
// Один из таких методов класса Object, toString(). Этот метод нужен для представления объекта в
// строковом виде. Класс Ball переопределяет поведение по умолчанию.
// Аннотация @Override служит
// для того, что бы компилятор проверял существование метода родительского класса.

public class Ball
{
    private double x = 0.0;
    private double y = 0.0;

    public Ball(){}

    public Ball(double x, double y)
    {
        this.x = x;
        this.y = y;
    }

    public double getX() {return x;}
    public double getY() {return y;}
    public void setX(double x) { this.x = x;}
    public void setY(double y) { this.y = y;}
    public void setXY(double x, double y)
    {
        this.x = x;
        this.y = y;
    }

    public void move(double xDisp, double yDisp)
    {
        this.x += xDisp;
        this.y += yDisp;
    }

    @Override
    public String toString()
    {
        return "Ball : ("+this.x+","+this.y+").";
    }

}

