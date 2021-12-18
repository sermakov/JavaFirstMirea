package ru.mirea.task26;

public class ItemDecorator implements Item
{
    Item item;
    TakeStrategy takeStrategy;

    public ItemDecorator(Item item, type T)
    {
        this.item = item;
        if (T == type.T)
            takeStrategy = new YesTakeStrategy();
        else
            takeStrategy = new NoTakeStrategy();
    }

    public String getName()
    {
        return(item.getName());
    }

    public String[] getAction()
    {
        return(item.getAction());
    }

    public int[] getResponse()
    {
        return(item.getResponse());
    }

    public boolean take()
    {
        return(takeStrategy.take());
    }
}
