package ru.mirea.task2.task2_3;

import ru.mirea.task2.task2_3.CircleOld;

import java.lang.*;
import java.util.Scanner;

public class TesterOld {

    public static void main(String[] args) {
        double r;
        CircleOld k1 = new CircleOld(3.1, 4.1, 5.1, "red");
        System.out.println("Длина окружности = " + k1.getLength() + " см\n");
        Scanner source = new Scanner(System.in);
        System.out.println("Введите радиус ");
        r = source.nextDouble();
        k1.setR(r);
        System.out.println("\nДлина окружности = " + k1.getLength() + "см");
    }
}
