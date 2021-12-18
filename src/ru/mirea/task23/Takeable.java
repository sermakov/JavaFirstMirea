package ru.mirea.task23;

public class Takeable extends Item
{
    public Takeable(String name, String[] action, int[] response)
    {
        super(name, action, response);
    }

    public boolean take()
    {
        return true;
    }
}
