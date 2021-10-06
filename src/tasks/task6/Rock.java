package tasks.task6;

public class Rock extends Entity implements Nameable, Priceable
{
    public Rock(String name, int price)
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
