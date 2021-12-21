package ru.mirea.task32;

public class Hasher
{
    public static void main(String[] args)
    {
        String[] s = new String[6];
        s[0] = "использовать себя";
        s[1] = "осмотреть себя";
        s[2] = "ударить себя";
        s[3] = "осмотреться";
        s[4] = "взять себя";
        for (String i: s)
            System.out.println(i + ": " + i.hashCode());
    }
}
