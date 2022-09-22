package ru.mirea.task26;

public class Takeable extends ItemDecorator implements Item
{
    public Takeable(String name, String[] action, int[] response)
    {
        super(new Prop(name, action, response), type.T);
    }
}
