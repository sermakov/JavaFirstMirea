package ru.mirea.complex;

public class Main
{
    public static void main(String args[])
    {
        Comp A = new Comp(0.1, 0.2);
        Comp B = new Comp(0.3, 0.4);
        System.out.println(Comp.add(Comp.add(A, B), new Comp(0.5, 0.6)));
    }
}
