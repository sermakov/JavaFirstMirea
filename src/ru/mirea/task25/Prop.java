package ru.mirea.task25;

public class Prop implements Item
{
    public String name;
    public String[] action;
    public int[] response;

    public Prop(String name, String[] action, int[] response)
    {
        this.name = name;
        this.action = action;
        this.response = response;
    }

    public String getName()
    {
        return(name);
    }

    public String[] getAction()
    {
        return(action);
    }

    public int[] getResponse()
    {
        return(response);
    }

    public boolean take()
    {
        return false;
    }
}
