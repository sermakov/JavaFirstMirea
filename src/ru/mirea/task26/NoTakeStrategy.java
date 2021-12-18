package ru.mirea.task26;

public class NoTakeStrategy implements TakeStrategy
{
    public boolean take()
    {
        return(false);
    }
}