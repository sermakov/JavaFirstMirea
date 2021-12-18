package ru.mirea.task23;

public class Item
{
    public Item(String name, String[] action, int[] response)
    {
        this.name = name;
        this.action = action;
        this.response = response;
    }

    public boolean take()
    {
        return false;
    }

    public String name;
    public String[] action;
    public int[] response;
}
