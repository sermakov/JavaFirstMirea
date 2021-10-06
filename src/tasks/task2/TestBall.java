package tasks.task2;

import java.util.Scanner;

public class TestBall
{
    public static void main(String args[])
    {
        Scanner StringIn = new Scanner(System.in);
        Scanner DoubleIn = new Scanner(System.in);
        System.out.println("Enter the diameter (cm) of ball1: ");
        double d = DoubleIn.nextDouble();
        System.out.println("Enter the material of ball1: ");
        String m = StringIn.nextLine();
        Ball ball1 = new Ball(d, m);
        System.out.println("ball2 is a default rubber ball.\nEnter the diameter (cm) of ball2: ");
        Ball ball2 = new Ball(DoubleIn.nextDouble());
        System.out.println("Inflating ball1 by 5 cm...");
        ball1.setDiameter(ball1.getDiameter() + 5);
        System.out.println("ball1 is now " + ball1.getDiameter() + "cm and is made of " + ball1.getMaterial());
        System.out.println("Covering ball1 in Rubber...");
        ball1.setMaterial("Rubber");
        System.out.println("ball1 is now " + ball1.toString());
        System.out.println("Calculating volume of ball2...");
        ball2.volume();
    }
}