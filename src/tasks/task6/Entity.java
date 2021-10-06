package tasks.task6;

public abstract class Entity
{
    public Entity(String name, int price)
    {
        this.name = name;
        this.price = price;
    }

    protected String name;
    protected int price;
}