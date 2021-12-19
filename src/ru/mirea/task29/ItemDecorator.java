package ru.mirea.task29;

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

    public boolean take()
    {
        return(takeStrategy.take());
    }
}
