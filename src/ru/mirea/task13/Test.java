package ru.mirea.task13;

import java.util.ArrayList;
import java.util.LinkedList;

public class Test
{
    public static void main(String[] args)
    {
        System.out.print("\nAL: ");
        ArrayList<String> A = new ArrayList<String>();
        A.add("1");
        for (String i : A)
            System.out.print(i + " ");
        System.out.print("\nAL: ");
        A.add(0, "2");
        A.add(0, "3");
        for (String i : A)
            System.out.print(i + " ");
        System.out.print("\nAL: ");
        A.remove(1);
        for (String i : A)
            System.out.print(i + " ");

        System.out.print("\nLL: ");
        LinkedList<String> B = new LinkedList<String>();
        B.add("1");
        for (String i : B)
            System.out.print(i + " ");
        System.out.print("\nLL: ");
        B.addFirst("2");
        B.addFirst("3");
        for (String i : B)
            System.out.print(i + " ");
        System.out.print("\nLL: ");
        B.removeFirst();
        for (String i : B)
            System.out.print(i + " ");

        System.out.print("\nVC: ");
        Vector<String> C = new Vector<String>();
        C.add("1");
        int size = C.size();
        for (int i = 0; i < size; i++)
            System.out.print(C.get(i) + " ");
        System.out.print("\nVC: ");
        C.add(0, "2");
        C.add(0, "3");
        size = C.size();
        for (int i = 0; i < size; i++)
            System.out.print(C.get(i) + " ");
        System.out.print("\nVC: ");
        C.remove(1);
        size = C.size();
        for (int i = 0; i < size; i++)
            System.out.print(C.get(i) + " ");
        System.out.print("\nVC: ");
        Vector<String> D = new Vector<String>();
        D.add("3");
        D.add("2");
        D.add("1");
        D.remove(0);
        size = D.size();
        for (int i = 0; i < size; i++)
            System.out.print(D.get(i) + " ");
    }
}
