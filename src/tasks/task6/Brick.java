package tasks.task6;

public class Brick extends Entity implements Nameable, Priceable
{
    public Brick(String name, int price)
    {
        super(name, price);
    }

    public String getName()
    {
        return(name);
    }

    public int getPrice()
    {
        return(price);
    }
}
