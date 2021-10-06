package tasks.task3;

import java.util.Scanner;

public class BookTest
{
    public static void main(String args[])
    {
        Scanner StringIn = new Scanner(System.in);
        Scanner IntIn = new Scanner(System.in);
        System.out.println("Enter the name of book1: ");
        String n = StringIn.nextLine();
        System.out.println("Enter the amount of pages of book1: ");
        int p = IntIn.nextInt();
        Book book1 = new Book(n, p);
        Book book2 = new Book();
        System.out.println("book2 is " + book2.toString());
        System.out.println("Name book2: ");
        book2.setName(StringIn.nextLine());
        System.out.println("Enter the amount of pages of book2: ");
        book2.setPages(IntIn.nextInt());
        System.out.println("Now book2 is " + book2.toString());
        System.out.println("book3 is a sequel to book1.");
        Book book3 = new Book(book1);
        System.out.println("book3 is " + book3.toString());
    }
}