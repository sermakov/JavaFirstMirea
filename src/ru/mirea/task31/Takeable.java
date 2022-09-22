package ru.mirea.task31;

import java.util.HashMap;

public class Takeable extends ItemDecorator implements Item
{
    public Takeable(String name, HashMap<String, Integer> iactResp)
    {
        super(new Prop(name, iactResp), type.T);
    }
}
