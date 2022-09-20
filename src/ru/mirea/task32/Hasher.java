package ru.mirea.task32;

public class Hasher
{
    public static void main(String[] args)
    {
        String[] s = new String[7];
        s[0] = "использовать себя";
        s[1] = "осмотреть себя";
        s[2] = "ударить себя";
        s[3] = "осмотреться";
        s[4] = "взять себя";
        s[5] = "Щ";
        s[6] = "jр!jЩ";
        System.out.println((char)106);
        System.out.println((char)1088);
        System.out.println((char)33);
        System.out.println((char)106);
        System.out.println((char)1065);
        for (String i: s)
            System.out.println(i + ": " + i.hashCode());
    }
}
