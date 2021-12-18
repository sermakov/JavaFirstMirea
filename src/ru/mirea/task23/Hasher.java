package ru.mirea.task23;

public class Hasher
{
    public static void main(String[] args)
    {
        String[] s = new String[5];
        s[0] = "использовать себя";
        s[1] = "осмотреть себя";
        s[2] = "ударить себя";
        s[3] = "осмотреться";
        s[4] = "взять себя";
        for (String i: s)
            System.out.println(i + ": " + i.hashCode());
    }
}
