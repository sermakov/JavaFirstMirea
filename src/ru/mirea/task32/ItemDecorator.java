package ru.mirea.task32;

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

    public Integer getResponse(String action)
    {
        return(item.getResponse(action));
    }

    public boolean containsKey(String key)
    {
        return(item.containsKey(key));
    }

    public boolean take()
    {
        return(takeStrategy.take());
    }
}
