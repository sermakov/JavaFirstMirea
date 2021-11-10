package ru.mirea.task5;

public class Main
{
    public static void main(String[] args)
    {
	    Shape rec = new Rectangle(2.1d,4d, "Красный", true);
        System.out.println(rec.toString());
        System.out.println("\n");

        Circle circle = new Circle();
        circle.setRadius(4d);
        circle.setColor("Оранжевый");
        circle.setFilled(false);
        System.out.println(circle);
        System.out.println("\n");

        Square square = new Square(3d);
        square.setSide(4d);
        square.setColor("Розовый");
        square.setFilled(true);
        System.out.println(square);



    }
}
