package ru.mirea.task2;

//№1

import java.lang.*;
import java.util.Scanner;

public class TestAuthor {
    public static void main(String[] args) {
        String newMail;
        Scanner scan = new Scanner(System.in);
        Author obj1 = new Author("Maxim", "kallkae@mail.ru", 'M');
        System.out.println("Author's name: " + obj1.getName());
        System.out.println("Author's email: " + obj1.getEmail());
        System.out.println("Installing a new author's email: ");
        newMail = scan.nextLine();
        obj1.setEmail(newMail);
        System.out.println("The author's new email: " + obj1.getEmail());
        System.out.println("Author's gender: " + obj1.getGender());
        System.out.println("Information about the author: " + obj1.toString());
    }
}
