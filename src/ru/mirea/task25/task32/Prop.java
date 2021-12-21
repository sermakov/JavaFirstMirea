package ru.mirea.task25.task32;

import java.util.HashMap;

public class Prop implements Item
{
    public String name;
    public HashMap<String, Integer> iactResp;

    public Prop(String name, HashMap<String, Integer> iactResp)
    {
        this.name = name;
        this.iactResp = iactResp;
    }

    public String getName()
    {
        return(name);
    }

    public Integer getResponse(String action)
    {
        return(iactResp.get(action));
    }

    public boolean take()
    {
        return false;
    }
}
