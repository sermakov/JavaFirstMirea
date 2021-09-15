package ru.mirea.task2.opt3;

import java.util.Scanner;

public class TestBook {
    public static void main(String[] args)  {
        Book book = new Book("Crime and Punishment", 672);
        book.open();

        System.out.print("Выберите страницу: ");
        Scanner sc = new Scanner(System.in);
        if (book.choosePage(sc.nextInt()))  {
            System.out.print("Сколько страниц вы будете читать? ");
            book.read(sc.nextInt());
        }
        else    {
            System.out.println("Вы ошиблись с вводом");
        }

        System.out.print(book);
        book.close();
    }
}
