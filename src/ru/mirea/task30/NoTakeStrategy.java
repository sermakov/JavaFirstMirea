package ru.mirea.task30;

public class NoTakeStrategy implements TakeStrategy
{
    public boolean take()
    {
        return(false);
    }
}