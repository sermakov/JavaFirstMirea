package ru.mirea.task32;

public class NoTakeStrategy implements TakeStrategy
{
    public boolean take()
    {
        return(false);
    }
}