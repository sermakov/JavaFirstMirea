package ru.mirea.task4.opt2;

import java.util.Scanner;

public class TestBall2 {
    public static void main(String[] args)  {
        Ball2 materialPoint1 = new Ball2(3.0, 12.2);
        System.out.println("The first material point: " + materialPoint1);

        Ball2 materialPoint2 = new Ball2();
        materialPoint2.setX(-2.9);
        materialPoint2.move(2.2, 0);
        System.out.println("The second material point: " + materialPoint2);

        Scanner sc = new Scanner (System.in);
        System.out.print("Введите начальные координаты для 3-ей материальной точки: ");
        Ball2 materialPoint3 = new Ball2(sc.nextDouble(), sc.nextDouble());
        System.out.print("Установите новую ординату 3-ей материальной точки: ");
        materialPoint3.setY(sc.nextDouble());
        System.out.print("Установите смещение для 3-ей материальной точки: ");
        materialPoint3.move(sc.nextDouble(), sc.nextDouble());
        System.out.print("The third material point: " + materialPoint3);
    }
}
