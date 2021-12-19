package ru.mirea.task29;

public class NoTakeStrategy implements TakeStrategy
{
    public boolean take()
    {
        return(false);
    }
}