package ru.mirea.task1;

public class Arg
{
    public static void main (String[] args) {
        for (var i = 0; i < args.length; i++) { //аргументы командной строки
            System.out.println(String.format("Argument %d: %s", i, args[i]));
        }
    }
}
