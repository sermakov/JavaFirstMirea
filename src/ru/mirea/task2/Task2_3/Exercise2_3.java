package ru.mirea.task2.Task2_3;

import ru.mirea.task2.Task2_3.Ball;
import ru.mirea.task2.Task2_3.Book;

public class Exercise2_3 {
    public static void main(String []args) {
        Ball ball = new Ball("Ball");
        Book book = new Book("Book");

        book.setName("newBook");

        System.out.println(book.toString());
        System.out.println(ball.toString());
    }
}

