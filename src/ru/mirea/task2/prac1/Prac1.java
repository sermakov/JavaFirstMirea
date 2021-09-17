package ru.mirea.task2.prac1;

import ru.mirea.task2.prac1.ball.Ball;
import ru.mirea.task2.prac1.book.TestBook;
import ru.mirea.task2.prac1.dog.TestDog;
import ru.mirea.task2.prac1.shape.ShapeTester;

public class Prac1 {
    public static void main(String[] args) {
        //1
        ShapeTester.test();
        //2
        Ball b = new Ball();
        //3
        TestBook.test();
        //4
        TestDog.test();
    }
}
