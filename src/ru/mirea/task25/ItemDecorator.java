package ru.mirea.task25;

public class ItemDecorator implements Item
{
    Item item;
    public boolean takeability;

    //НОВОВВЕДЕНИЯ: переделан механизм создания предметов - теперь создаваемые объекты "декорируются подбираемостью"
    public ItemDecorator(Item item, type T)
    {
        this.item = item;
        if (T == type.T)
            takeability = true;
        else
            takeability = false;
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
        return takeability;
    }
}
