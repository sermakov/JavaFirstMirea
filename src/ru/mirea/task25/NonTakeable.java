package ru.mirea.task25;

public class NonTakeable extends ItemDecorator implements Item
{
    public NonTakeable(String name, String[] action, int[] response)
    {
        super(new Prop(name, action, response), type.NT);
    }
}
